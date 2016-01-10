/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.smeup.sys.il.flow.QCall;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.il.flow.QStatementVisitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Call</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.impl.CallImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.CallImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.CallImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.impl.CallImpl#getErrorHandling <em>Error Handling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallImpl extends InvokeImpl implements QCall {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProgram() <em>Program</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected String program = PROGRAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected String error = ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorHandling() <em>Error Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandling()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_HANDLING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorHandling() <em>Error Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandling()
	 * @generated
	 * @ordered
	 */
	protected String errorHandling = ERROR_HANDLING_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.CALL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(String newProgram) {
		String oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALL__PROGRAM, oldProgram, program));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeEList<String>(String.class, this, QIntegratedLanguageFlowPackage.CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(String newError) {
		String oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALL__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorHandling() {
		return errorHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorHandling(String newErrorHandling) {
		String oldErrorHandling = errorHandling;
		errorHandling = newErrorHandling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageFlowPackage.CALL__ERROR_HANDLING, oldErrorHandling, errorHandling));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageFlowPackage.CALL__PROGRAM:
				return getProgram();
			case QIntegratedLanguageFlowPackage.CALL__PARAMETERS:
				return getParameters();
			case QIntegratedLanguageFlowPackage.CALL__ERROR:
				return getError();
			case QIntegratedLanguageFlowPackage.CALL__ERROR_HANDLING:
				return getErrorHandling();
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
			case QIntegratedLanguageFlowPackage.CALL__PROGRAM:
				setProgram((String)newValue);
				return;
			case QIntegratedLanguageFlowPackage.CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case QIntegratedLanguageFlowPackage.CALL__ERROR:
				setError((String)newValue);
				return;
			case QIntegratedLanguageFlowPackage.CALL__ERROR_HANDLING:
				setErrorHandling((String)newValue);
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
			case QIntegratedLanguageFlowPackage.CALL__PROGRAM:
				setProgram(PROGRAM_EDEFAULT);
				return;
			case QIntegratedLanguageFlowPackage.CALL__PARAMETERS:
				getParameters().clear();
				return;
			case QIntegratedLanguageFlowPackage.CALL__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case QIntegratedLanguageFlowPackage.CALL__ERROR_HANDLING:
				setErrorHandling(ERROR_HANDLING_EDEFAULT);
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
			case QIntegratedLanguageFlowPackage.CALL__PROGRAM:
				return PROGRAM_EDEFAULT == null ? program != null : !PROGRAM_EDEFAULT.equals(program);
			case QIntegratedLanguageFlowPackage.CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case QIntegratedLanguageFlowPackage.CALL__ERROR:
				return ERROR_EDEFAULT == null ? error != null : !ERROR_EDEFAULT.equals(error);
			case QIntegratedLanguageFlowPackage.CALL__ERROR_HANDLING:
				return ERROR_HANDLING_EDEFAULT == null ? errorHandling != null : !ERROR_HANDLING_EDEFAULT.equals(errorHandling);
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
		result.append(" (program: ");
		result.append(program);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(", error: ");
		result.append(error);
		result.append(", errorHandling: ");
		result.append(errorHandling);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void accept(QStatementVisitor visitor) {
		visitor.visit(this);
	}
} // CallImpl
