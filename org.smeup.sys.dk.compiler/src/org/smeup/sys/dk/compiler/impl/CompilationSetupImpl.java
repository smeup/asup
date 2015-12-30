/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.dk.compiler.EntryType;
import org.smeup.sys.dk.compiler.InternalType;
import org.smeup.sys.dk.compiler.OptimizationType;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.dk.compiler.impl.CompilationSetupImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.impl.CompilationSetupImpl#getEntryType <em>Entry Type</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.impl.CompilationSetupImpl#getOptimizationType <em>Optimization Type</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.impl.CompilationSetupImpl#getProcedureType <em>Procedure Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationSetupImpl extends MinimalEObjectImpl.Container implements QCompilationSetup {
	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryType() <em>Entry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryType()
	 * @generated
	 * @ordered
	 */
	protected static final EntryType ENTRY_TYPE_EDEFAULT = EntryType.MAIN;

	/**
	 * The cached value of the '{@link #getEntryType() <em>Entry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryType()
	 * @generated
	 * @ordered
	 */
	protected EntryType entryType = ENTRY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptimizationType() <em>Optimization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizationType()
	 * @generated
	 * @ordered
	 */
	protected static final OptimizationType OPTIMIZATION_TYPE_EDEFAULT = OptimizationType.NONE;

	/**
	 * The cached value of the '{@link #getOptimizationType() <em>Optimization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizationType()
	 * @generated
	 * @ordered
	 */
	protected OptimizationType optimizationType = OPTIMIZATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcedureType() <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureType()
	 * @generated
	 * @ordered
	 */
	protected static final InternalType PROCEDURE_TYPE_EDEFAULT = InternalType.INNER;

	/**
	 * The cached value of the '{@link #getProcedureType() <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureType()
	 * @generated
	 * @ordered
	 */
	protected InternalType procedureType = PROCEDURE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationSetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDevelopmentKitCompilerPackage.Literals.COMPILATION_SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitCompilerPackage.COMPILATION_SETUP__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType getEntryType() {
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryType(EntryType newEntryType) {
		EntryType oldEntryType = entryType;
		entryType = newEntryType == null ? ENTRY_TYPE_EDEFAULT : newEntryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitCompilerPackage.COMPILATION_SETUP__ENTRY_TYPE, oldEntryType, entryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationType getOptimizationType() {
		return optimizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimizationType(OptimizationType newOptimizationType) {
		OptimizationType oldOptimizationType = optimizationType;
		optimizationType = newOptimizationType == null ? OPTIMIZATION_TYPE_EDEFAULT : newOptimizationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitCompilerPackage.COMPILATION_SETUP__OPTIMIZATION_TYPE, oldOptimizationType, optimizationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalType getProcedureType() {
		return procedureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureType(InternalType newProcedureType) {
		InternalType oldProcedureType = procedureType;
		procedureType = newProcedureType == null ? PROCEDURE_TYPE_EDEFAULT : newProcedureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitCompilerPackage.COMPILATION_SETUP__PROCEDURE_TYPE, oldProcedureType, procedureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__BASE_PACKAGE:
				return getBasePackage();
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__ENTRY_TYPE:
				return getEntryType();
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__OPTIMIZATION_TYPE:
				return getOptimizationType();
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__PROCEDURE_TYPE:
				return getProcedureType();
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
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__ENTRY_TYPE:
				setEntryType((EntryType)newValue);
				return;
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__OPTIMIZATION_TYPE:
				setOptimizationType((OptimizationType)newValue);
				return;
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__PROCEDURE_TYPE:
				setProcedureType((InternalType)newValue);
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
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__ENTRY_TYPE:
				setEntryType(ENTRY_TYPE_EDEFAULT);
				return;
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__OPTIMIZATION_TYPE:
				setOptimizationType(OPTIMIZATION_TYPE_EDEFAULT);
				return;
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__PROCEDURE_TYPE:
				setProcedureType(PROCEDURE_TYPE_EDEFAULT);
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
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__ENTRY_TYPE:
				return entryType != ENTRY_TYPE_EDEFAULT;
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__OPTIMIZATION_TYPE:
				return optimizationType != OPTIMIZATION_TYPE_EDEFAULT;
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP__PROCEDURE_TYPE:
				return procedureType != PROCEDURE_TYPE_EDEFAULT;
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
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", entryType: ");
		result.append(entryType);
		result.append(", optimizationType: ");
		result.append(optimizationType);
		result.append(", procedureType: ");
		result.append(procedureType);
		result.append(')');
		return result.toString();
	}

} //CompilationSetupImpl
