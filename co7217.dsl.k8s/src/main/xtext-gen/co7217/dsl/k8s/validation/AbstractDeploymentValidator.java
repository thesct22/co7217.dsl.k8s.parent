/*
 * generated by Xtext 2.25.0
 */
package co7217.dsl.k8s.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDeploymentValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(co7217.dsl.k8s.deployment.DeploymentPackage.eINSTANCE);
		return result;
	}
}
