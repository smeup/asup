/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.anz.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage;
import org.smeup.sys.dk.compiler.anz.QVariableRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl#getOccourence <em>Occourence</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableRefImpl extends MinimalEObjectImpl.Container implements QVariableRef {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccourence() <em>Occourence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccourence()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCOURENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccourence() <em>Occourence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccourence()
	 * @generated
	 * @ordered
	 */
	protected int occourence = OCCOURENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> methods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDevelopmentKitCompilerAnalyzerPackage.Literals.VARIABLE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOccourence() {
		return occourence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccourence(int newOccourence) {
		int oldOccourence = occourence;
		occourence = newOccourence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCOURENCE, oldOccourence, occourence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getMethods() {
		if (methods == null) {
			methods = new EDataTypeUniqueEList<String>(String.class, this, QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__VARIABLE_NAME:
				return getVariableName();
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCOURENCE:
				return getOccourence();
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__METHODS:
				return getMethods();
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
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCOURENCE:
				setOccourence((Integer)newValue);
				return;
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends String>)newValue);
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
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCOURENCE:
				setOccourence(OCCOURENCE_EDEFAULT);
				return;
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__METHODS:
				getMethods().clear();
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
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCOURENCE:
				return occourence != OCCOURENCE_EDEFAULT;
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__METHODS:
				return methods != null && !methods.isEmpty();
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
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(", occourence: ");
		result.append(occourence);
		result.append(", methods: ");
		result.append(methods);
		result.append(')');
		return result.toString();
	}

} //VariableRefImpl
