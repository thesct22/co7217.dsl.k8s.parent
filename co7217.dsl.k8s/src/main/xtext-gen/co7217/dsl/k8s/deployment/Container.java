/**
 * generated by Xtext 2.25.0
 */
package co7217.dsl.k8s.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.dsl.k8s.deployment.Container#getName <em>Name</em>}</li>
 *   <li>{@link co7217.dsl.k8s.deployment.Container#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see co7217.dsl.k8s.deployment.DeploymentPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co7217.dsl.k8s.deployment.DeploymentPackage#getContainer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co7217.dsl.k8s.deployment.Container#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' attribute.
   * @see #setImage(String)
   * @see co7217.dsl.k8s.deployment.DeploymentPackage#getContainer_Image()
   * @model
   * @generated
   */
  String getImage();

  /**
   * Sets the value of the '{@link co7217.dsl.k8s.deployment.Container#getImage <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' attribute.
   * @see #getImage()
   * @generated
   */
  void setImage(String value);

} // Container
