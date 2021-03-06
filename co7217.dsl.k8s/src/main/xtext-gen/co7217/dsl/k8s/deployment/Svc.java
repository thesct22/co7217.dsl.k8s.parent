/**
 * generated by Xtext 2.25.0
 */
package co7217.dsl.k8s.deployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Svc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.dsl.k8s.deployment.Svc#getPorts <em>Ports</em>}</li>
 *   <li>{@link co7217.dsl.k8s.deployment.Svc#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link co7217.dsl.k8s.deployment.Svc#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link co7217.dsl.k8s.deployment.Svc#getType <em>Type</em>}</li>
 *   <li>{@link co7217.dsl.k8s.deployment.Svc#getIP <em>IP</em>}</li>
 * </ul>
 *
 * @see co7217.dsl.k8s.deployment.DeploymentPackage#getSvc()
 * @model
 * @generated
 */
public interface Svc extends Header
{
  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link co7217.dsl.k8s.deployment.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see co7217.dsl.k8s.deployment.DeploymentPackage#getSvc_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Label</em>' attribute.
   * @see #setTargetLabel(String)
   * @see co7217.dsl.k8s.deployment.DeploymentPackage#getSvc_TargetLabel()
   * @model
   * @generated
   */
  String getTargetLabel();

  /**
   * Sets the value of the '{@link co7217.dsl.k8s.deployment.Svc#getTargetLabel <em>Target Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Label</em>' attribute.
   * @see #getTargetLabel()
   * @generated
   */
  void setTargetLabel(String value);

  /**
   * Returns the value of the '<em><b>Target Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Name</em>' attribute.
   * @see #setTargetName(String)
   * @see co7217.dsl.k8s.deployment.DeploymentPackage#getSvc_TargetName()
   * @model
   * @generated
   */
  String getTargetName();

  /**
   * Sets the value of the '{@link co7217.dsl.k8s.deployment.Svc#getTargetName <em>Target Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Name</em>' attribute.
   * @see #getTargetName()
   * @generated
   */
  void setTargetName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see co7217.dsl.k8s.deployment.DeploymentPackage#getSvc_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link co7217.dsl.k8s.deployment.Svc#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>IP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>IP</em>' attribute.
   * @see #setIP(String)
   * @see co7217.dsl.k8s.deployment.DeploymentPackage#getSvc_IP()
   * @model
   * @generated
   */
  String getIP();

  /**
   * Sets the value of the '{@link co7217.dsl.k8s.deployment.Svc#getIP <em>IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IP</em>' attribute.
   * @see #getIP()
   * @generated
   */
  void setIP(String value);

} // Svc
