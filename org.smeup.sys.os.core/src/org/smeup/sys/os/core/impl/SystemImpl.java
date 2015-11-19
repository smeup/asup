/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.lock.impl.ObjectLockableImpl;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.core.QEnvironmentVariable;
import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.SystemStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getCreationInfo <em>Creation Info</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getInstallPath <em>Install Path</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getLastJobNumber <em>Last Job Number</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getSystemLibrary <em>System Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getSystemUser <em>System User</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getTemporaryLibrary <em>Temporary Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.impl.SystemImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends ObjectLockableImpl implements QSystem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected QContext context;

	/**
	 * The cached value of the '{@link #getCreationInfo() <em>Creation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationInfo()
	 * @generated
	 * @ordered
	 */
	protected QCreationInfo creationInfo;

	/**
	 * The default value of the '{@link #getInstallPath() <em>Install Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallPath()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallPath() <em>Install Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallPath()
	 * @generated
	 * @ordered
	 */
	protected String installPath = INSTALL_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastJobNumber() <em>Last Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastJobNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_JOB_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLastJobNumber() <em>Last Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastJobNumber()
	 * @generated
	 * @ordered
	 */
	protected int lastJobNumber = LAST_JOB_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SystemStatus STATUS_EDEFAULT = SystemStatus.STOPPED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SystemStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemLibrary() <em>System Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemLibrary() <em>System Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemLibrary()
	 * @generated
	 * @ordered
	 */
	protected String systemLibrary = SYSTEM_LIBRARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemUser() <em>System User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUser()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemUser() <em>System User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUser()
	 * @generated
	 * @ordered
	 */
	protected String systemUser = SYSTEM_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemporaryLibrary() <em>Temporary Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporaryLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPORARY_LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemporaryLibrary() <em>Temporary Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporaryLibrary()
	 * @generated
	 * @ordered
	 */
	protected String temporaryLibrary = TEMPORARY_LIBRARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<QEnvironmentVariable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemCorePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(QContext newContext, NotificationChain msgs) {
		QContext oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(QContext newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCorePackage.SYSTEM__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCorePackage.SYSTEM__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCreationInfo getCreationInfo() {
		return creationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationInfo(QCreationInfo newCreationInfo, NotificationChain msgs) {
		QCreationInfo oldCreationInfo = creationInfo;
		creationInfo = newCreationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__CREATION_INFO, oldCreationInfo, newCreationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationInfo(QCreationInfo newCreationInfo) {
		if (newCreationInfo != creationInfo) {
			NotificationChain msgs = null;
			if (creationInfo != null)
				msgs = ((InternalEObject)creationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCorePackage.SYSTEM__CREATION_INFO, null, msgs);
			if (newCreationInfo != null)
				msgs = ((InternalEObject)newCreationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCorePackage.SYSTEM__CREATION_INFO, null, msgs);
			msgs = basicSetCreationInfo(newCreationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__CREATION_INFO, newCreationInfo, newCreationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstallPath() {
		return installPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstallPath(String newInstallPath) {
		String oldInstallPath = installPath;
		installPath = newInstallPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__INSTALL_PATH, oldInstallPath, installPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLastJobNumber() {
		return lastJobNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastJobNumber(int newLastJobNumber) {
		int oldLastJobNumber = lastJobNumber;
		lastJobNumber = newLastJobNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__LAST_JOB_NUMBER, oldLastJobNumber, lastJobNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(SystemStatus newStatus) {
		SystemStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemLibrary() {
		return systemLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemLibrary(String newSystemLibrary) {
		String oldSystemLibrary = systemLibrary;
		systemLibrary = newSystemLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__SYSTEM_LIBRARY, oldSystemLibrary, systemLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemUser() {
		return systemUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemUser(String newSystemUser) {
		String oldSystemUser = systemUser;
		systemUser = newSystemUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__SYSTEM_USER, oldSystemUser, systemUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemporaryLibrary() {
		return temporaryLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporaryLibrary(String newTemporaryLibrary) {
		String oldTemporaryLibrary = temporaryLibrary;
		temporaryLibrary = newTemporaryLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCorePackage.SYSTEM__TEMPORARY_LIBRARY, oldTemporaryLibrary, temporaryLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QEnvironmentVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<QEnvironmentVariable>(QEnvironmentVariable.class, this, QOperatingSystemCorePackage.SYSTEM__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemCorePackage.SYSTEM__CONTEXT:
				return basicSetContext(null, msgs);
			case QOperatingSystemCorePackage.SYSTEM__CREATION_INFO:
				return basicSetCreationInfo(null, msgs);
			case QOperatingSystemCorePackage.SYSTEM__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemCorePackage.SYSTEM__CONTEXT:
				return getContext();
			case QOperatingSystemCorePackage.SYSTEM__CREATION_INFO:
				return getCreationInfo();
			case QOperatingSystemCorePackage.SYSTEM__INSTALL_PATH:
				return getInstallPath();
			case QOperatingSystemCorePackage.SYSTEM__LAST_JOB_NUMBER:
				return getLastJobNumber();
			case QOperatingSystemCorePackage.SYSTEM__NAME:
				return getName();
			case QOperatingSystemCorePackage.SYSTEM__STATUS:
				return getStatus();
			case QOperatingSystemCorePackage.SYSTEM__SYSTEM_LIBRARY:
				return getSystemLibrary();
			case QOperatingSystemCorePackage.SYSTEM__SYSTEM_USER:
				return getSystemUser();
			case QOperatingSystemCorePackage.SYSTEM__TEMPORARY_LIBRARY:
				return getTemporaryLibrary();
			case QOperatingSystemCorePackage.SYSTEM__VARIABLES:
				return getVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemCorePackage.SYSTEM__CONTEXT:
				setContext((QContext)newValue);
				return;
			case QOperatingSystemCorePackage.SYSTEM__CREATION_INFO:
				setCreationInfo((QCreationInfo)newValue);
				return;
			case QOperatingSystemCorePackage.SYSTEM__INSTALL_PATH:
				setInstallPath((String)newValue);
				return;
			case QOperatingSystemCorePackage.SYSTEM__LAST_JOB_NUMBER:
				setLastJobNumber((Integer)newValue);
				return;
			case QOperatingSystemCorePackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case QOperatingSystemCorePackage.SYSTEM__STATUS:
				setStatus((SystemStatus)newValue);
				return;
			case QOperatingSystemCorePackage.SYSTEM__SYSTEM_LIBRARY:
				setSystemLibrary((String)newValue);
				return;
			case QOperatingSystemCorePackage.SYSTEM__SYSTEM_USER:
				setSystemUser((String)newValue);
				return;
			case QOperatingSystemCorePackage.SYSTEM__TEMPORARY_LIBRARY:
				setTemporaryLibrary((String)newValue);
				return;
			case QOperatingSystemCorePackage.SYSTEM__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends QEnvironmentVariable>)newValue);
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
			case QOperatingSystemCorePackage.SYSTEM__CONTEXT:
				setContext((QContext)null);
				return;
			case QOperatingSystemCorePackage.SYSTEM__CREATION_INFO:
				setCreationInfo((QCreationInfo)null);
				return;
			case QOperatingSystemCorePackage.SYSTEM__INSTALL_PATH:
				setInstallPath(INSTALL_PATH_EDEFAULT);
				return;
			case QOperatingSystemCorePackage.SYSTEM__LAST_JOB_NUMBER:
				setLastJobNumber(LAST_JOB_NUMBER_EDEFAULT);
				return;
			case QOperatingSystemCorePackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QOperatingSystemCorePackage.SYSTEM__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case QOperatingSystemCorePackage.SYSTEM__SYSTEM_LIBRARY:
				setSystemLibrary(SYSTEM_LIBRARY_EDEFAULT);
				return;
			case QOperatingSystemCorePackage.SYSTEM__SYSTEM_USER:
				setSystemUser(SYSTEM_USER_EDEFAULT);
				return;
			case QOperatingSystemCorePackage.SYSTEM__TEMPORARY_LIBRARY:
				setTemporaryLibrary(TEMPORARY_LIBRARY_EDEFAULT);
				return;
			case QOperatingSystemCorePackage.SYSTEM__VARIABLES:
				getVariables().clear();
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
			case QOperatingSystemCorePackage.SYSTEM__CONTEXT:
				return context != null;
			case QOperatingSystemCorePackage.SYSTEM__CREATION_INFO:
				return creationInfo != null;
			case QOperatingSystemCorePackage.SYSTEM__INSTALL_PATH:
				return INSTALL_PATH_EDEFAULT == null ? installPath != null : !INSTALL_PATH_EDEFAULT.equals(installPath);
			case QOperatingSystemCorePackage.SYSTEM__LAST_JOB_NUMBER:
				return lastJobNumber != LAST_JOB_NUMBER_EDEFAULT;
			case QOperatingSystemCorePackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QOperatingSystemCorePackage.SYSTEM__STATUS:
				return status != STATUS_EDEFAULT;
			case QOperatingSystemCorePackage.SYSTEM__SYSTEM_LIBRARY:
				return SYSTEM_LIBRARY_EDEFAULT == null ? systemLibrary != null : !SYSTEM_LIBRARY_EDEFAULT.equals(systemLibrary);
			case QOperatingSystemCorePackage.SYSTEM__SYSTEM_USER:
				return SYSTEM_USER_EDEFAULT == null ? systemUser != null : !SYSTEM_USER_EDEFAULT.equals(systemUser);
			case QOperatingSystemCorePackage.SYSTEM__TEMPORARY_LIBRARY:
				return TEMPORARY_LIBRARY_EDEFAULT == null ? temporaryLibrary != null : !TEMPORARY_LIBRARY_EDEFAULT.equals(temporaryLibrary);
			case QOperatingSystemCorePackage.SYSTEM__VARIABLES:
				return variables != null && !variables.isEmpty();
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
		result.append(" (installPath: ");
		result.append(installPath);
		result.append(", lastJobNumber: ");
		result.append(lastJobNumber);
		result.append(", name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", systemLibrary: ");
		result.append(systemLibrary);
		result.append(", systemUser: ");
		result.append(systemUser);
		result.append(", temporaryLibrary: ");
		result.append(temporaryLibrary);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
