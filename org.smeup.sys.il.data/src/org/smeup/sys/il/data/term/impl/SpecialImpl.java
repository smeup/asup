/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.term.impl;

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
import org.smeup.sys.il.core.meta.impl.FacetImpl;
import org.smeup.sys.il.data.term.QSpecial;
import org.smeup.sys.il.data.term.QSpecialElement;
import org.smeup.sys.il.data.term.QTermPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Special</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.term.impl.SpecialImpl#getClassDelegate <em>Class Delegate</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.impl.SpecialImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialImpl extends FacetImpl implements QSpecial {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getClassDelegate() <em>Class Delegate</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getClassDelegate()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_DELEGATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassDelegate() <em>Class Delegate</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getClassDelegate()
	 * @generated
	 * @ordered
	 */
	protected String classDelegate = CLASS_DELEGATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<QSpecialElement> elements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QTermPackage.Literals.SPECIAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassDelegate() {
		return classDelegate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassDelegate(String newClassDelegate) {
		String oldClassDelegate = classDelegate;
		classDelegate = newClassDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QTermPackage.SPECIAL__CLASS_DELEGATE, oldClassDelegate, classDelegate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QSpecialElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<QSpecialElement>(QSpecialElement.class, this, QTermPackage.SPECIAL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QTermPackage.SPECIAL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case QTermPackage.SPECIAL__CLASS_DELEGATE:
				return getClassDelegate();
			case QTermPackage.SPECIAL__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QTermPackage.SPECIAL__CLASS_DELEGATE:
				setClassDelegate((String)newValue);
				return;
			case QTermPackage.SPECIAL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends QSpecialElement>)newValue);
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
			case QTermPackage.SPECIAL__CLASS_DELEGATE:
				setClassDelegate(CLASS_DELEGATE_EDEFAULT);
				return;
			case QTermPackage.SPECIAL__ELEMENTS:
				getElements().clear();
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
			case QTermPackage.SPECIAL__CLASS_DELEGATE:
				return CLASS_DELEGATE_EDEFAULT == null ? classDelegate != null : !CLASS_DELEGATE_EDEFAULT.equals(classDelegate);
			case QTermPackage.SPECIAL__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (classDelegate: ");
		result.append(classDelegate);
		result.append(')');
		return result.toString();
	}

} // SpecialImpl
