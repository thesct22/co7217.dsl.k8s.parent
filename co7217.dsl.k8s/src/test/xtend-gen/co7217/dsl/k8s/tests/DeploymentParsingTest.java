/**
 * generated by Xtext 2.25.0
 */
package co7217.dsl.k8s.tests;

import co7217.dsl.k8s.deployment.Model;
import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(DeploymentInjectorProvider.class)
@SuppressWarnings("all")
public class DeploymentParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void loadModel() {
  }
}
