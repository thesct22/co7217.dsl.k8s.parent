
package co7217.dsl.k8s.generator

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import co7217.dsl.k8s.DeploymentStandaloneSetup
import co7217.dsl.k8s.deployment.Model
import co7217.dsl.k8s.deployment.Hpa
import co7217.dsl.k8s.deployment.Dep
import co7217.dsl.k8s.deployment.Label
import co7217.dsl.k8s.deployment.Metrice
import co7217.dsl.k8s.deployment.Container

import com.google.inject.Injector

import org.eclipse.emf.common.util.URI

class K8sDepGenerator {
	def static void main(String[] args) {
		
		Injector injector = new DeploymentStandaloneSetup()
			.createInjectorAndDoEMFRegistration();

		XtextResourceSet resourceSet = 
			injector.getInstance(XtextResourceSet.class);

		Resource resource = resourceSet.getResource(
			URI.createFileURI("src/main/resources/dep1.dep"), true);                
		
		Model model = resource.getContents().get(0)

		
		String text = toYaml(model.Headers)
		
		//println(model.Headers.Metrices.toString())
		println text
//		File output = newFile('src/main/resources/output.yaml')
//		output.createNewFile()
//		output << text
	}
	def static String toYaml(List<EObject> list) {
		String text = ''
		for (obj in list) {
			text += toYaml(obj)
		}
		text
	}
	
	def static String toYaml(EObject obj) {
		String text = ""
		switch(obj) {
			
			//for Deployment definition
			case Dep:
				text+="""
---
apiVersion: "apps/v1"
kind: "Deployment"
"""
				text+=makeMetadata(obj)
				text+="""spec:
  replicas: ${obj.Replicas}
  selector:
    matchLabels:
      ${obj.Labels.get(0).Name}: "${obj.Labels.get(0).Value}"
  template:
    metadata:
      labels:
        ${obj.Labels.get(0).Name}: "${obj.Labels.get(0).Value}"
"""
				text+="""    spec:
      containers:
"""
				text+=toYaml(obj.Containers)
				break
			
			
			//for Horizontal Pod Autoscaler definition
			case Hpa :
				text+="""
---
apiVersion: "autoscaling/v2beta1"
kind: "HorizontalPodAutoscaler"
"""
				//for writing metadata like name and labels
				text+=makeMetadata(obj)
				text+="""spec:
  scaleTargetRef:
    kind: "Deployment"
    name: "${obj.target}"
    apiVersion: "apps/v1"
  minReplicas: ${obj.minimum}
  maxReplicas: ${obj.maximum}
"""
				//writing metrices that determines when to scale
				text+=makeMetrices(obj)
				break

//			case svc:
//				text+="""
//---
//apiVersion: "v1"
//kind: "Service"
//"""
//				break
				
			//for defining containers in the pod
			case Container:
				text+="""      - name: "${obj.name}"
        image: "${obj.image}"
"""
				break
				
			//for defining all labels for deployments, HPAs and Services
			case Label:
				text+="""    ${obj.name}: "${obj.value}"
"""
				break
				
			//for defining scaling metrices in HPA
			case Metrice:
				text+="""  - type: "Resource"
    resource:
      name: "${obj.resource}"
      targetAverageUtilization: ${obj.limit}
"""
				break
		}
		text
	}
	
	//makes metadata for all sections
	def static String makeMetadata(EObject obj) {
		String text ="""metadata:
  name: "${obj.Name}"
  namespace: "${!obj.Namespace?"default":obj.Namespace}"
  labels:
"""
		text+=toYaml(obj.Labels)
		text
	}
	
	//makes metrices subsection of HPA
	def static String makeMetrices(EObject obj) {
		String text="""  metrics:
"""
		text+=toYaml(obj.Metrices)
		text
	}
}
