/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.env.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.os.core.env.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemEnvironmentFactoryImpl extends EFactoryImpl implements QOperatingSystemEnvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemEnvironmentFactory init() {
		try {
			QOperatingSystemEnvironmentFactory theOperatingSystemEnvironmentFactory = (QOperatingSystemEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemEnvironmentPackage.eNS_URI);
			if (theOperatingSystemEnvironmentFactory != null) {
				return theOperatingSystemEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemEnvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemEnvironmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemEnvironmentPackage.ENVIRONMENT_VARIABLE: return (EObject)createEnvironmentVariable();
			case QOperatingSystemEnvironmentPackage.ENVIRONMENT_VARIABLE_CONTAINER: return (EObject)createEnvironmentVariableContainer();
			case QOperatingSystemEnvironmentPackage.ENVIRONMENT_VARIABLE_MANAGER: return (EObject)createEnvironmentVariableManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemEnvironmentPackage.ENVIRONMENT_LEVEL:
				return createEnvironmentLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemEnvironmentPackage.ENVIRONMENT_LEVEL:
				return convertEnvironmentLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QEnvironmentVariable createEnvironmentVariable() {
		EnvironmentVariableImpl environmentVariable = new EnvironmentVariableImpl();
		return environmentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QEnvironmentVariableContainer createEnvironmentVariableContainer() {
		EnvironmentVariableContainerImpl environmentVariableContainer = new EnvironmentVariableContainerImpl();
		return environmentVariableContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QEnvironmentVariableManager createEnvironmentVariableManager() {
		EnvironmentVariableManagerImpl environmentVariableManager = new EnvironmentVariableManagerImpl();
		return environmentVariableManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentLevel createEnvironmentLevelFromString(EDataType eDataType, String initialValue) {
		EnvironmentLevel result = EnvironmentLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvironmentLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemEnvironmentPackage getOperatingSystemEnvironmentPackage() {
		return (QOperatingSystemEnvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemEnvironmentPackage getPackage() {
		return QOperatingSystemEnvironmentPackage.eINSTANCE;
	}

} //OperatingSystemEnvironmentFactoryImpl
