/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

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
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Compound Data Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.smeup.sys.il.data.def.impl.CompoundDataDefImpl#getClassDelegator
 * <em>Class Delegator</em>}</li>
 * <li>{@link org.smeup.sys.il.data.def.impl.CompoundDataDefImpl#getElements
 * <em>Elements</em>}</li>
 * <li>{@link org.smeup.sys.il.data.def.impl.CompoundDataDefImpl#getPrefix <em>
 * Prefix</em>}</li>
 * <li>{@link org.smeup.sys.il.data.def.impl.CompoundDataDefImpl#isQualified
 * <em>Qualified</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CompoundDataDefImpl<D extends QStruct<?>, E extends QDataTerm<?>>
extends DataDefImpl<D> implements QCompoundDataDef<D, E> {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getClassDelegator()
	 * <em>Class Delegator</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getClassDelegator()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_DELEGATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassDelegator()
	 * <em>Class Delegator</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getClassDelegator()
	 * @generated
	 * @ordered
	 */
	protected String classDelegator = CLASS_DELEGATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<E> elements;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isQualified() <em>Qualified</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isQualified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUALIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQualified() <em>Qualified</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isQualified()
	 * @generated
	 * @ordered
	 */
	protected boolean qualified = QUALIFIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected CompoundDataDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.COMPOUND_DATA_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getClassDelegator() {
		return classDelegator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setClassDelegator(String newClassDelegator) {
		String oldClassDelegator = classDelegator;
		classDelegator = newClassDelegator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR,
					oldClassDelegator, classDelegator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<E> getElements() {
		if (elements == null)
			elements = new EObjectContainmentEList<E>(
					QDataTerm.class,
					this,
					QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS);
		return elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX,
					oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isQualified() {
		return qualified;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setQualified(boolean newQualified) {
		boolean oldQualified = qualified;
		qualified = newQualified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED,
					oldQualified, qualified));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR:
			return getClassDelegator();
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS:
			return getElements();
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX:
			return getPrefix();
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED:
			return isQualified();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR:
			setClassDelegator((String) newValue);
			return;
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends E>) newValue);
			return;
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX:
			setPrefix((String) newValue);
			return;
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED:
			setQualified((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR:
			setClassDelegator(CLASS_DELEGATOR_EDEFAULT);
			return;
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS:
			getElements().clear();
			return;
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX:
			setPrefix(PREFIX_EDEFAULT);
			return;
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED:
			setQualified(QUALIFIED_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR:
			return CLASS_DELEGATOR_EDEFAULT == null ? classDelegator != null
			: !CLASS_DELEGATOR_EDEFAULT.equals(classDelegator);
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX:
			return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT
			.equals(prefix);
		case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED:
			return qualified != QUALIFIED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (classDelegator: ");
		result.append(classDelegator);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", qualified: ");
		result.append(qualified);
		result.append(')');
		return result.toString();
	}

} // CompoundDataDefImpl
