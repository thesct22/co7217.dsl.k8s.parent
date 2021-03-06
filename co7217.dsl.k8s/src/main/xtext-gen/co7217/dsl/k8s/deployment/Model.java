/**
 * generated by Xtext 2.25.0
 */
package co7217.dsl.k8s.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.dsl.k8s.deployment.Model#getHeaders <em>Headers</em>}</li>
 * </ul>
 *
 * @see co7217.dsl.k8s.deployment.DeploymentPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
   * The list contents are of type {@link co7217.dsl.k8s.deployment.Header}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headers</em>' containment reference list.
   * @see co7217.dsl.k8s.deployment.DeploymentPackage#getModel_Headers()
   * @model containment="true"
   * @generated
   */
  EList<Header> getHeaders();

} // Model
