/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;
import org.smeup.sys.os.pgm.QProgram;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Callable Program</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.impl.CallableProgramImpl#getQActivationGroup <em>QActivation Group</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.impl.CallableProgramImpl#getQProgram <em>QProgram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CallableProgramImpl extends ObjectImpl implements QCallableProgram {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getQProgram() <em>QProgram</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQProgram()
	 * @generated
	 * @ordered
	 */
	protected QProgram qProgram;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemProgramPackage.Literals.CALLABLE_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QActivationGroup getQActivationGroup() {
		if (eContainerFeatureID() != QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP) return null;
		return (QActivationGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQActivationGroup(QActivationGroup newQActivationGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQActivationGroup, QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQActivationGroup(QActivationGroup newQActivationGroup) {
		if (newQActivationGroup != eInternalContainer() || (eContainerFeatureID() != QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP && newQActivationGroup != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newQActivationGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQActivationGroup != null)
				msgs = ((InternalEObject)newQActivationGroup).eInverseAdd(this, QOperatingSystemProgramPackage.ACTIVATION_GROUP__PROGRAMS, QActivationGroup.class, msgs);
			msgs = basicSetQActivationGroup(newQActivationGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP, newQActivationGroup, newQActivationGroup));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QProgram getQProgram() {
		return qProgram;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQProgram(QProgram newQProgram) {
		QProgram oldQProgram = qProgram;
		qProgram = newQProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QPROGRAM, oldQProgram, qProgram));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void close() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QData[] getEntry() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRawProgram() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isOpen() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isStateless() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void open() throws OperatingSystemRuntimeException {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQActivationGroup((QActivationGroup)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP:
				return basicSetQActivationGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP:
				return eInternalContainer().eInverseRemove(this, QOperatingSystemProgramPackage.ACTIVATION_GROUP__PROGRAMS, QActivationGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP:
				return getQActivationGroup();
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QPROGRAM:
				return getQProgram();
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
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP:
				setQActivationGroup((QActivationGroup)newValue);
				return;
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QPROGRAM:
				setQProgram((QProgram)newValue);
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
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP:
				setQActivationGroup((QActivationGroup)null);
				return;
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QPROGRAM:
				setQProgram((QProgram)null);
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
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QACTIVATION_GROUP:
				return getQActivationGroup() != null;
			case QOperatingSystemProgramPackage.CALLABLE_PROGRAM__QPROGRAM:
				return qProgram != null;
		}
		return super.eIsSet(featureID);
	}

} // CallableProgramImpl