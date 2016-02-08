/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QDataSection;
import org.smeup.sys.il.flow.QFileSection;
import org.smeup.sys.il.flow.QFlowSection;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.il.flow.QSetupSection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Callable Unit</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.impl.CallableUnitImpl#getSetupSection <em>Setup Section</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.CallableUnitImpl#getDataSection <em>Data Section</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.CallableUnitImpl#getFileSection <em>File Section</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.CallableUnitImpl#getFlowSection <em>Flow Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallableUnitImpl extends UnitImpl implements QCallableUnit {
	/**
	 * The cached value of the '{@link #getSetupSection() <em>Setup Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupSection()
	 * @generated
	 * @ordered
	 */
	protected QSetupSection setupSection;
	/**
	 * The cached value of the '{@link #getDataSection() <em>Data Section</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataSection()
	 * @generated
	 * @ordered
	 */
	protected QDataSection dataSection;
	/**
	 * The cached value of the '{@link #getFileSection() <em>File Section</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileSection()
	 * @generated
	 * @ordered
	 */
	protected QFileSection fileSection;
	/**
	 * The cached value of the '{@link #getFlowSection() <em>Flow Section</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFlowSection()
	 * @generated
	 * @ordered
	 */
	protected QFlowSection flowSection;
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.CALLABLE_UNIT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDataSection getDataSection() {
		return dataSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSection(QDataSection newDataSection, NotificationChain msgs) {
		QDataSection oldDataSection = dataSection;
		dataSection = newDataSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALLABLE_UNIT__DATA_SECTION, oldDataSection, newDataSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSection(QDataSection newDataSection) {
		if (newDataSection != dataSection) {
			NotificationChain msgs = null;
			if (dataSection != null)
				msgs = ((InternalEObject)dataSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.CALLABLE_UNIT__DATA_SECTION, null, msgs);
			if (newDataSection != null)
				msgs = ((InternalEObject)newDataSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.CALLABLE_UNIT__DATA_SECTION, null, msgs);
			msgs = basicSetDataSection(newDataSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALLABLE_UNIT__DATA_SECTION, newDataSection, newDataSection));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFileSection getFileSection() {
		return fileSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSection(QFileSection newFileSection, NotificationChain msgs) {
		QFileSection oldFileSection = fileSection;
		fileSection = newFileSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FILE_SECTION, oldFileSection, newFileSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSection(QFileSection newFileSection) {
		if (newFileSection != fileSection) {
			NotificationChain msgs = null;
			if (fileSection != null)
				msgs = ((InternalEObject)fileSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FILE_SECTION, null, msgs);
			if (newFileSection != null)
				msgs = ((InternalEObject)newFileSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FILE_SECTION, null, msgs);
			msgs = basicSetFileSection(newFileSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FILE_SECTION, newFileSection, newFileSection));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFlowSection getFlowSection() {
		return flowSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowSection(QFlowSection newFlowSection, NotificationChain msgs) {
		QFlowSection oldFlowSection = flowSection;
		flowSection = newFlowSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FLOW_SECTION, oldFlowSection, newFlowSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowSection(QFlowSection newFlowSection) {
		if (newFlowSection != flowSection) {
			NotificationChain msgs = null;
			if (flowSection != null)
				msgs = ((InternalEObject)flowSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FLOW_SECTION, null, msgs);
			if (newFlowSection != null)
				msgs = ((InternalEObject)newFlowSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FLOW_SECTION, null, msgs);
			msgs = basicSetFlowSection(newFlowSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FLOW_SECTION, newFlowSection, newFlowSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasRoutines() {
		
		if(getFlowSection() == null)
			return false;

		return !getFlowSection().getRoutines().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSetupSection getSetupSection() {
		return setupSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetupSection(QSetupSection newSetupSection, NotificationChain msgs) {
		QSetupSection oldSetupSection = setupSection;
		setupSection = newSetupSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALLABLE_UNIT__SETUP_SECTION, oldSetupSection, newSetupSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetupSection(QSetupSection newSetupSection) {
		if (newSetupSection != setupSection) {
			NotificationChain msgs = null;
			if (setupSection != null)
				msgs = ((InternalEObject)setupSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.CALLABLE_UNIT__SETUP_SECTION, null, msgs);
			if (newSetupSection != null)
				msgs = ((InternalEObject)newSetupSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageFlowPackage.CALLABLE_UNIT__SETUP_SECTION, null, msgs);
			msgs = basicSetSetupSection(newSetupSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALLABLE_UNIT__SETUP_SECTION, newSetupSection, newSetupSection));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__SETUP_SECTION:
				return basicSetSetupSection(null, msgs);
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__DATA_SECTION:
				return basicSetDataSection(null, msgs);
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FILE_SECTION:
				return basicSetFileSection(null, msgs);
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FLOW_SECTION:
				return basicSetFlowSection(null, msgs);
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
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__SETUP_SECTION:
				return getSetupSection();
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__DATA_SECTION:
				return getDataSection();
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FILE_SECTION:
				return getFileSection();
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FLOW_SECTION:
				return getFlowSection();
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
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__SETUP_SECTION:
				setSetupSection((QSetupSection)newValue);
				return;
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__DATA_SECTION:
				setDataSection((QDataSection)newValue);
				return;
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FILE_SECTION:
				setFileSection((QFileSection)newValue);
				return;
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FLOW_SECTION:
				setFlowSection((QFlowSection)newValue);
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
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__SETUP_SECTION:
				setSetupSection((QSetupSection)null);
				return;
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__DATA_SECTION:
				setDataSection((QDataSection)null);
				return;
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FILE_SECTION:
				setFileSection((QFileSection)null);
				return;
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FLOW_SECTION:
				setFlowSection((QFlowSection)null);
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
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__SETUP_SECTION:
				return setupSection != null;
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__DATA_SECTION:
				return dataSection != null;
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FILE_SECTION:
				return fileSection != null;
			case QIntegratedLanguageFlowPackage.CALLABLE_UNIT__FLOW_SECTION:
				return flowSection != null;
		}
		return super.eIsSet(featureID);
	}

} // CallableUnitImpl
