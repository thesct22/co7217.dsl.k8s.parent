
package co7217.dsl.k8s.generator

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import co7217.dsl.k8s.DeploymentStandaloneSetup
import co7217.dsl.k8s.deployment.Model
import co7217.dsl.k8s.deployment.Hpa
import co7217.dsl.k8s.deployment.Dep
import co7217.dsl.k8s.deployment.Svc
import co7217.dsl.k8s.deployment.Label
import co7217.dsl.k8s.deployment.Metrice
import co7217.dsl.k8s.deployment.Container
import co7217.dsl.k8s.deployment.Port

import com.google.inject.Injector

import org.eclipse.emf.common.util.URI

class K8sDepGenerator {
	def static void main(String[] args) {
		
		Injector injector = new DeploymentStandaloneSetup()
			.createInjectorAndDoEMFRegistration();

		XtextResourceSet resourceSet = 
			injector.getInstance(XtextResourceSet.class);
		
			
		//first sample file
		Resource resource1 = resourceSet.getResource(
			URI.createFileURI("src/main/resources/dep1.dep"), true);
		
		//get the parsed EObject tree from the input file
		Model model1 = resource1.getContents().get(0)
		
		//calling function to iterate the EObject tree
		String text1 = toYaml(model1.Headers)
		
		File output1 = new File('src/main/resources/dep1.yaml')
		output1.createNewFile()
		output1 << text1
		
		
		//second sample file
		Resource resource2 = resourceSet.getResource(
			URI.createFileURI("src/main/resources/dep2.dep"), true);
		
		Model model2 = resource2.getContents().get(0)

		String text2 = toYaml(model2.Headers)
		
		File output2 = new File('src/main/resources/dep2.yaml')
		output2.createNewFile()
		output2 << text2
		
		
		//third sample file
		Resource resource3 = resourceSet.getResource(
			URI.createFileURI("src/main/resources/dep3.dep"), true);
		
		Model model3 = resource3.getContents().get(0)

		String text3 = toYaml(model3.Headers)
		
		File output3 = new File('src/main/resources/dep3.yaml')
		output3.createNewFile()
		output3 << text3
	}
	
	//process list of elements
	def static String toYaml(List<EObject> list) {
		String text = ''
		for (obj in list) {
			text += toYaml(obj)
		}
		text
	}
	
	//process individual elements in the list
	def static String toYaml(EObject obj) {
		String text = ""
		switch(obj) {
			
			
			
//------------------------------For Deployment definition-------------------------------------------//
			case Dep:
			
				//initial boilerplate of deployment in YAML
				text+="""
---
apiVersion: "apps/v1"
kind: "Deployment"
"""
				//make metadata like name and label
				text+=makeMetadata(obj)
				
				//specifications like replicas and containers
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
				//for defining all the containers in a list of containers to be added to the pod
				text+=toYaml(obj.Containers)
				break
	
						
			
//---------------------------For Horizontal Pod Autoscaler definition-----------------------------//
			case Hpa :
			
				//initial boilerplate for HPA
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

				
				
//-----------------------------------For Service definition------------------------------------//
			case Svc:
			
				//initial boilerplate for service
				text+="""
---
apiVersion: "v1"
kind: "Service"
"""
				//for writing metadata like name and labels
				text+=makeMetadata(obj)
				text+="""spec:
  ports:
"""
				text+=toYaml(obj.Ports)
				text+="""  selector:
    ${obj.targetLabel}: "${obj.targetName}"
"""
				text+="""  type: "${obj.type}"
"""
				//all this to check if Loadbalancer then print loadbalancerIP if IP is present
				//or if ClusterIP print clusterIP if IP present
				text+="""  ${obj.type=='LoadBalancer'?
					/LoadBalancerIP: ${obj.IP?"\"${obj.IP}\"":'""'}/
					:obj.type=='ClusterIP'?
					/ClusterIP: ${obj.IP?"\"${obj.IP}\"":'""'}/:''}
"""
				break
				
				
				
//------------------------------For defining containers in the pod------------------------------//
			case Container:
				text+="""      - name: "${obj.name}"
        image: "${obj.image}"
"""
				break
				
				
				
//----------------For defining all labels for deployments, HPAs and Services-------------------//
			case Label:
				text+="""    ${obj.name}: "${obj.value}"
"""
				break
				
				
				
//----------------------------For defining scaling metrices in HPA-----------------------------//
			case Metrice:
				text+="""  - type: "Resource"
    resource:
      name: "${obj.resource}"
      targetAverageUtilization: ${obj.limit}
"""
				break
				
				
				
//------------------------------For defining ports of the service------------------------------//
			case Port:
				text+="""  - name: "${obj.Name}"
    protocol: "${obj.Protocol}"
    port: ${obj.inport}
    targetPort: ${obj.targetport}
"""	
				break
			
				
		}
		text
	}
	
	
	
//-----------------------------Makes metadata for all sections--------------------------------//
	def static String makeMetadata(EObject obj) {
		String text ="""metadata:
  name: "${obj.Name}"
  namespace: "${!obj.Namespace?"default":obj.Namespace}"
  labels:
"""
		text+=toYaml(obj.Labels)
		text
	}
	
	
	
//-----------------------------Makes metrices subsection of HPA-------------------------------//
	def static String makeMetrices(EObject obj) {
		String text="""  metrics:
"""
		text+=toYaml(obj.Metrices)
		text
	}
}
