/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.cdo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.cdo.CDOSystemConfig;
import org.smeup.sys.os.core.cdo.CDOSystemCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>CDO System Config</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.cdo.impl.CDOSystemConfigImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDOSystemConfigImpl extends MinimalEObjectImpl.Container implements CDOSystemConfig {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected QSystem system;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CDOSystemConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOSystemCorePackage.Literals.CDO_SYSTEM_CONFIG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSystem getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(QSystem newSystem, NotificationChain msgs) {
		QSystem oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_SYSTEM_CONFIG__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem(QSystem newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDOSystemCorePackage.CDO_SYSTEM_CONFIG__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDOSystemCorePackage.CDO_SYSTEM_CONFIG__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDOSystemCorePackage.CDO_SYSTEM_CONFIG__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDOSystemCorePackage.CDO_SYSTEM_CONFIG__SYSTEM:
				return basicSetSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDOSystemCorePackage.CDO_SYSTEM_CONFIG__SYSTEM:
				return getSystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDOSystemCorePackage.CDO_SYSTEM_CONFIG__SYSTEM:
				setSystem((QSystem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CDOSystemCorePackage.CDO_SYSTEM_CONFIG__SYSTEM:
				setSystem((QSystem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDOSystemCorePackage.CDO_SYSTEM_CONFIG__SYSTEM:
				return system != null;
		}
		return super.eIsSet(featureID);
	}

} // CDOSystemConfigImpl
