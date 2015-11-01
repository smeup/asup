/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QDataAreaDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.QWrapperDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Area Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.impl.DataAreaDefImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.DataAreaDefImpl#getExternalName <em>External Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAreaDefImpl<D extends QBufferedData> extends UnaryAtomicBufferedDataDefImpl<D> implements QDataAreaDef<D> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected QBufferedDataDef<?> argument;

	/**
	 * The default value of the '{@link #getExternalName() <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExternalName() <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalName()
	 * @generated
	 * @ordered
	 */
	protected String externalName = EXTERNAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAreaDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.DATA_AREA_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBufferedDataDef<?> getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument(QBufferedDataDef<?> newArgument, NotificationChain msgs) {
		QBufferedDataDef<?> oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT, oldArgument, newArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(QBufferedDataDef<?> newArgument) {
		if (newArgument != argument) {
			NotificationChain msgs = null;
			if (argument != null)
				msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT, null, msgs);
			if (newArgument != null)
				msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT, null, msgs);
			msgs = basicSetArgument(newArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT, newArgument, newArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalName() {
		return externalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalName(String newExternalName) {
		String oldExternalName = externalName;
		externalName = newExternalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__EXTERNAL_NAME, oldExternalName, externalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT:
				return basicSetArgument(null, msgs);
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
			case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT:
				return getArgument();
			case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__EXTERNAL_NAME:
				return getExternalName();
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
			case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT:
				setArgument((QBufferedDataDef<?>)newValue);
				return;
			case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__EXTERNAL_NAME:
				setExternalName((String)newValue);
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
			case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT:
				setArgument((QBufferedDataDef<?>)null);
				return;
			case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__EXTERNAL_NAME:
				setExternalName(EXTERNAL_NAME_EDEFAULT);
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
			case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT:
				return argument != null;
			case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__EXTERNAL_NAME:
				return EXTERNAL_NAME_EDEFAULT == null ? externalName != null : !EXTERNAL_NAME_EDEFAULT.equals(externalName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QWrapperDef.class) {
			switch (derivedFeatureID) {
				case QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT: return QIntegratedLanguageDataDefPackage.WRAPPER_DEF__ARGUMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QWrapperDef.class) {
			switch (baseFeatureID) {
				case QIntegratedLanguageDataDefPackage.WRAPPER_DEF__ARGUMENT: return QIntegratedLanguageDataDefPackage.DATA_AREA_DEF__ARGUMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (externalName: ");
		result.append(externalName);
		result.append(')');
		return result.toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<D> getDataClass() {
		return (Class<D>) QDataArea.class;
	}

	@Override
	public Class<?> getJavaClass() {
		if(getArgument() != null)
			return getArgument().getJavaClass();
		else
			return null;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.WRAPPER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getLength() {
		return getArgument().getLength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getSize() {
		return getLength();
	}

} //DataAreaDefImpl
