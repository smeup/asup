/**
 */
package org.smeup.sys.os.scde.cron.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.il.core.impl.ObjectImpl;

import org.smeup.sys.os.scde.cron.QCronSchedulerConfig;
import org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cron Scheduler Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl#getWsip <em>Wsip</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl#getWsport <em>Wsport</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.cron.impl.CronSchedulerConfigImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CronSchedulerConfigImpl extends ObjectImpl implements QCronSchedulerConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getWsip() <em>Wsip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsip()
	 * @generated
	 * @ordered
	 */
	protected static final String WSIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsip() <em>Wsip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsip()
	 * @generated
	 * @ordered
	 */
	protected String wsip = WSIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsport() <em>Wsport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsport()
	 * @generated
	 * @ordered
	 */
	protected static final String WSPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsport() <em>Wsport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsport()
	 * @generated
	 * @ordered
	 */
	protected String wsport = WSPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected String system = SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CronSchedulerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperativeSystemCronScheduleEntryPackage.Literals.CRON_SCHEDULER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsip() {
		return wsip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsip(String newWsip) {
		String oldWsip = wsip;
		wsip = newWsip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSIP, oldWsip, wsip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsport() {
		return wsport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsport(String newWsport) {
		String oldWsport = wsport;
		wsport = newWsport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSPORT, oldWsport, wsport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(String newSystem) {
		String oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSIP:
				return getWsip();
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSPORT:
				return getWsport();
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__SYSTEM:
				return getSystem();
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__USER:
				return getUser();
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__PASSWORD:
				return getPassword();
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__ENVIRONMENT:
				return getEnvironment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSIP:
				setWsip((String)newValue);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSPORT:
				setWsport((String)newValue);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__SYSTEM:
				setSystem((String)newValue);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__USER:
				setUser((String)newValue);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__PASSWORD:
				setPassword((String)newValue);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__ENVIRONMENT:
				setEnvironment((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSIP:
				setWsip(WSIP_EDEFAULT);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSPORT:
				setWsport(WSPORT_EDEFAULT);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__USER:
				setUser(USER_EDEFAULT);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSIP:
				return WSIP_EDEFAULT == null ? wsip != null : !WSIP_EDEFAULT.equals(wsip);
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__WSPORT:
				return WSPORT_EDEFAULT == null ? wsport != null : !WSPORT_EDEFAULT.equals(wsport);
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (wsip: ");
		result.append(wsip);
		result.append(", wsport: ");
		result.append(wsport);
		result.append(", system: ");
		result.append(system);
		result.append(", user: ");
		result.append(user);
		result.append(", password: ");
		result.append(password);
		result.append(", environment: ");
		result.append(environment);
		result.append(')');
		return result.toString();
	}

} //CronSchedulerConfigImpl
