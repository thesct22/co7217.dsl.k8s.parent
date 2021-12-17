/**
 * generated by Xtext 2.25.0
 */
package co7217.dsl.k8s.deployment.impl;

import co7217.dsl.k8s.deployment.DeploymentPackage;
import co7217.dsl.k8s.deployment.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co7217.dsl.k8s.deployment.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link co7217.dsl.k8s.deployment.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link co7217.dsl.k8s.deployment.impl.PortImpl#getInport <em>Inport</em>}</li>
 *   <li>{@link co7217.dsl.k8s.deployment.impl.PortImpl#getTargetport <em>Targetport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected static final String PROTOCOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected String protocol = PROTOCOL_EDEFAULT;

  /**
   * The default value of the '{@link #getInport() <em>Inport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInport()
   * @generated
   * @ordered
   */
  protected static final int INPORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInport() <em>Inport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInport()
   * @generated
   * @ordered
   */
  protected int inport = INPORT_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetport() <em>Targetport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetport()
   * @generated
   * @ordered
   */
  protected static final int TARGETPORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTargetport() <em>Targetport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetport()
   * @generated
   * @ordered
   */
  protected int targetport = TARGETPORT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DeploymentPackage.Literals.PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PORT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProtocol(String newProtocol)
  {
    String oldProtocol = protocol;
    protocol = newProtocol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PORT__PROTOCOL, oldProtocol, protocol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getInport()
  {
    return inport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInport(int newInport)
  {
    int oldInport = inport;
    inport = newInport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PORT__INPORT, oldInport, inport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTargetport()
  {
    return targetport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTargetport(int newTargetport)
  {
    int oldTargetport = targetport;
    targetport = newTargetport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PORT__TARGETPORT, oldTargetport, targetport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DeploymentPackage.PORT__NAME:
        return getName();
      case DeploymentPackage.PORT__PROTOCOL:
        return getProtocol();
      case DeploymentPackage.PORT__INPORT:
        return getInport();
      case DeploymentPackage.PORT__TARGETPORT:
        return getTargetport();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeploymentPackage.PORT__NAME:
        setName((String)newValue);
        return;
      case DeploymentPackage.PORT__PROTOCOL:
        setProtocol((String)newValue);
        return;
      case DeploymentPackage.PORT__INPORT:
        setInport((Integer)newValue);
        return;
      case DeploymentPackage.PORT__TARGETPORT:
        setTargetport((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DeploymentPackage.PORT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeploymentPackage.PORT__PROTOCOL:
        setProtocol(PROTOCOL_EDEFAULT);
        return;
      case DeploymentPackage.PORT__INPORT:
        setInport(INPORT_EDEFAULT);
        return;
      case DeploymentPackage.PORT__TARGETPORT:
        setTargetport(TARGETPORT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DeploymentPackage.PORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeploymentPackage.PORT__PROTOCOL:
        return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
      case DeploymentPackage.PORT__INPORT:
        return inport != INPORT_EDEFAULT;
      case DeploymentPackage.PORT__TARGETPORT:
        return targetport != TARGETPORT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (Name: ");
    result.append(name);
    result.append(", Protocol: ");
    result.append(protocol);
    result.append(", inport: ");
    result.append(inport);
    result.append(", targetport: ");
    result.append(targetport);
    result.append(')');
    return result.toString();
  }

} //PortImpl
