/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.il.data.def.QUnaryCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Unary Compound Data Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.impl.UnaryCompoundDataDefImpl#getClassDelegator <em>Class Delegator</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.UnaryCompoundDataDefImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.UnaryCompoundDataDefImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.UnaryCompoundDataDefImpl#isQualified <em>Qualified</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.UnaryCompoundDataDefImpl#isInitialized <em>Initialized</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnaryCompoundDataDefImpl<D extends QStruct<?>, E extends QDataTerm<?>> extends UnaryDataDefImpl<D> implements QUnaryCompoundDataDef<D, E> {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getClassDelegator() <em>Class Delegator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getClassDelegator()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_DELEGATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassDelegator() <em>Class Delegator</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getClassDelegator()
	 * @generated
	 * @ordered
	 */
	protected String classDelegator = CLASS_DELEGATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<E> elements;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isQualified() <em>Qualified</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isQualified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUALIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQualified() <em>Qualified</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isQualified()
	 * @generated
	 * @ordered
	 */
	protected boolean qualified = QUALIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryCompoundDataDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.UNARY_COMPOUND_DATA_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassDelegator() {
		return classDelegator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassDelegator(String newClassDelegator) {
		String oldClassDelegator = classDelegator;
		classDelegator = newClassDelegator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR, oldClassDelegator, classDelegator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<E> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<E>(QDataTerm.class, this, QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isQualified() {
		return qualified;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualified(boolean newQualified) {
		boolean oldQualified = qualified;
		qualified = newQualified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__QUALIFIED, oldQualified, qualified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS:
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
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR:
				return getClassDelegator();
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS:
				return getElements();
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__PREFIX:
				return getPrefix();
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__QUALIFIED:
				return isQualified();
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__INITIALIZED:
				return isInitialized();
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
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR:
				setClassDelegator((String)newValue);
				return;
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends E>)newValue);
				return;
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__PREFIX:
				setPrefix((String)newValue);
				return;
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__QUALIFIED:
				setQualified((Boolean)newValue);
				return;
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__INITIALIZED:
				setInitialized((Boolean)newValue);
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
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR:
				setClassDelegator(CLASS_DELEGATOR_EDEFAULT);
				return;
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS:
				getElements().clear();
				return;
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__QUALIFIED:
				setQualified(QUALIFIED_EDEFAULT);
				return;
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
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
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR:
				return CLASS_DELEGATOR_EDEFAULT == null ? classDelegator != null : !CLASS_DELEGATOR_EDEFAULT.equals(classDelegator);
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__QUALIFIED:
				return qualified != QUALIFIED_EDEFAULT;
			case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QCompoundDataDef.class) {
			switch (derivedFeatureID) {
				case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR: return QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR;
				case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS: return QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS;
				case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__PREFIX: return QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX;
				case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__QUALIFIED: return QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED;
				case QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__INITIALIZED: return QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__INITIALIZED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QCompoundDataDef.class) {
			switch (baseFeatureID) {
				case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR: return QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR;
				case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS: return QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__ELEMENTS;
				case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX: return QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__PREFIX;
				case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED: return QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__QUALIFIED;
				case QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__INITIALIZED: return QIntegratedLanguageDataDefPackage.UNARY_COMPOUND_DATA_DEF__INITIALIZED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (classDelegator: ");
		result.append(classDelegator);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", qualified: ");
		result.append(qualified);
		result.append(", initialized: ");
		result.append(initialized);
		result.append(')');
		return result.toString();
	}

} // UnaryCompoundDataDefImpl
