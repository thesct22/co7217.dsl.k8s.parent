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
class DeploymentParsingTest2 {
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
name="dsl-example",
namespace="xyz",
label{
    app="dsl-example"
},

replicas=3,
container{
    name= "busybox",
    image= "gcr.io/google-containers/busybox:latest"
},
container{
    name="defaultbackend",
    image="gcr.io/google-containers/defaultbackend:latest"
}
}
---
hpa
---
{
name="hpa",
namespace ="xyz",
label{
    app="dsl-example"
},
target="dsl-example",   
minimum=1,
maximum=5,
metrices{
    cpu=80
}
}


---
service
---
{
name="service",
namespace ="xyz",
label{
    app="dsl-example"
},
port{
    name="busybox-expose",
    protocol=TCP,
    inport=80,
    targetport=80
},
port{
    name="backend-expose",
    protocol=TCP,
    inport=8080,
    targetport=8080
},
targetLabel="app",
targetName="dsl-example",
type=LoadBalancer,
IP="192.168.19.18"
}
""")
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), 
			"""Unexpected errors: ${errors.join(", ")}""")
	}
}