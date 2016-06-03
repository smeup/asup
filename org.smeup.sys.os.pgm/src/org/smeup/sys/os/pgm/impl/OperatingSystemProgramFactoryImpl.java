/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.os.pgm.*;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;
import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramContainer;
import org.smeup.sys.os.pgm.QProgramSource;
import org.smeup.sys.os.pgm.QProgramStack;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemProgramFactoryImpl extends EFactoryImpl implements QOperatingSystemProgramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemProgramFactory init() {
		try {
			QOperatingSystemProgramFactory theOperatingSystemProgramFactory = (QOperatingSystemProgramFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemProgramPackage.eNS_URI);
			if (theOperatingSystemProgramFactory != null) {
				return theOperatingSystemProgramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemProgramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemProgramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemProgramPackage.ACTIVATION_GROUP: return (EObject)createActivationGroup();
			case QOperatingSystemProgramPackage.PROGRAM: return (EObject)createProgram();
			case QOperatingSystemProgramPackage.PROGRAM_CONTAINER: return (EObject)createProgramContainer();
			case QOperatingSystemProgramPackage.PROGRAM_INFO: return (EObject)createProgramInfo();
			case QOperatingSystemProgramPackage.PROGRAM_SOURCE: return (EObject)createProgramSource();
			case QOperatingSystemProgramPackage.PROGRAM_STACK: return (EObject)createProgramStack();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemProgramPackage.PROGRAM_STACK_ORDER:
				return createProgramStackOrderFromString(eDataType, initialValue);
			case QOperatingSystemProgramPackage.PARAMETER_LIST:
				return createParameterListFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QOperatingSystemProgramPackage.PROGRAM_STACK_ORDER:
				return convertProgramStackOrderToString(eDataType, instanceValue);
			case QOperatingSystemProgramPackage.PARAMETER_LIST:
				return convertParameterListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QActivationGroup createActivationGroup() {
		ActivationGroupImpl activationGroup = new ActivationGroupImpl();
		return activationGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QProgram createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QProgramContainer createProgramContainer() {
		ProgramContainerImpl programContainer = new ProgramContainerImpl();
		return programContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProgramInfo createProgramInfo() {
		ProgramInfoImpl programInfo = new ProgramInfoImpl();
		return programInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QProgramSource createProgramSource() {
		ProgramSourceImpl programSource = new ProgramSourceImpl();
		return programSource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QProgramStack createProgramStack() {
		ProgramStackImpl programStack = new ProgramStackImpl();
		return programStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramStackOrder createProgramStackOrderFromString(EDataType eDataType, String initialValue) {
		ProgramStackOrder result = ProgramStackOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgramStackOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QData[] createParameterListFromString(EDataType eDataType, String initialValue) {
		return (QData[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemProgramPackage getOperatingSystemProgramPackage() {
		return (QOperatingSystemProgramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemProgramPackage getPackage() {
		return QOperatingSystemProgramPackage.eINSTANCE;
	}

} // OSProgramCoreFactoryImpl
