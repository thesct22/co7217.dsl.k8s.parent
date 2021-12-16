/*
 * generated by Xtext 2.25.0
 */
package co7217.dsl.k8s.ide;

import co7217.dsl.k8s.DeploymentRuntimeModule;
import co7217.dsl.k8s.DeploymentStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class DeploymentIdeSetup extends DeploymentStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DeploymentRuntimeModule(), new DeploymentIdeModule()));
	}
	
}
