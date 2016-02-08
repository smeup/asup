/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl#getOccurences <em>Occurences</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl#getStatements <em>Statements</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #getOccurences() <em>Occurences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurences()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCURENCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccurences() <em>Occurences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurences()
	 * @generated
	 * @ordered
	 */
	protected int occurences = OCCURENCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> statements;

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
	public int getOccurences() {
		return occurences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurences(int newOccurences) {
		int oldOccurences = occurences;
		occurences = newOccurences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCURENCES, oldOccurences, occurences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getStatements() {
		if (statements == null) {
			statements = new EDataTypeUniqueEList<String>(String.class, this, QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__STATEMENTS);
		}
		return statements;
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
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCURENCES:
				return getOccurences();
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__STATEMENTS:
				return getStatements();
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
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCURENCES:
				setOccurences((Integer)newValue);
				return;
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends String>)newValue);
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
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCURENCES:
				setOccurences(OCCURENCES_EDEFAULT);
				return;
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__STATEMENTS:
				getStatements().clear();
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
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__OCCURENCES:
				return occurences != OCCURENCES_EDEFAULT;
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF__STATEMENTS:
				return statements != null && !statements.isEmpty();
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
		result.append(", occurences: ");
		result.append(occurences);
		result.append(", statements: ");
		result.append(statements);
		result.append(')');
		return result.toString();
	}

} //VariableRefImpl
