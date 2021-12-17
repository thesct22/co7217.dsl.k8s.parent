package co7217.dsl.k8s.tests
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

import com.google.inject.Inject

import co7217.dsl.k8s.deployment.Model

@ExtendWith(InjectionExtension)
@InjectWith(DeploymentInjectorProvider)
class DeploymentParsingTest4 {
	@Inject
	// Model is the start symbol of the grammar,
	// update the name accordingly.
	ParseHelper<Model> parseHelper
	@Test
	void testBasic() {
		def result = parseHelper.parse("""
---
deployment
---
{
name="another-example",
label{
    alabel="make-this-same-for-svc-and-dep",
	label2="moreLabels"
},

replicas=9,
container{
    name= "busybox",
    image= "gcr.io/google-containers/busybox:latest"
}
}

---
service
---
{
name="service",


label{
    app    =       "dsl-example",
	label2="randomLabel"
},
port{
    name="busybox-expose",
    protocol=TCP,
    inport      =      80    ,
    targetport=80
},


targetLabel="alabel",
targetName="make-this-same-for-svc-and-dep",
type=LoadBalancer
}
""")
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(),
			"""Unexpected errors: ${errors.join(", ")}""")
	}
}