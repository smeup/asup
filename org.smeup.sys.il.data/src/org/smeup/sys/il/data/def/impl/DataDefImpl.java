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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.impl.DataDefImpl#getFormulas <em>Formulas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataDefImpl<D extends QData> extends ObjectImpl implements QDataDef<D> {
	/**
	 * The cached value of the '{@link #getFormulas() <em>Formulas</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFormulas()
	 * @generated
	 * @ordered
	 */
	protected EList<String> formulas;
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.DATA_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFormulas() {
		if (formulas == null) {
			formulas = new EDataTypeUniqueEList<String>(String.class, this, QIntegratedLanguageDataDefPackage.DATA_DEF__FORMULAS);
		}
		return formulas;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public abstract Class<D> getDataClass();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public abstract Class<?> getJavaClass();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public abstract DataDefType getDataDefType();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.DATA_DEF__FORMULAS:
				return getFormulas();
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
			case QIntegratedLanguageDataDefPackage.DATA_DEF__FORMULAS:
				getFormulas().clear();
				getFormulas().addAll((Collection<? extends String>)newValue);
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
			case QIntegratedLanguageDataDefPackage.DATA_DEF__FORMULAS:
				getFormulas().clear();
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
			case QIntegratedLanguageDataDefPackage.DATA_DEF__FORMULAS:
				return formulas != null && !formulas.isEmpty();
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
		result.append(" (formulas: ");
		result.append(formulas);
		result.append(')');
		return result.toString();
	}

} // DataDefImpl
