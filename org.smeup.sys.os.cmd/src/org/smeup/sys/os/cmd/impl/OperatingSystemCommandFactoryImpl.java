/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.cmd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.cmd.*;
import org.smeup.sys.os.cmd.CommandOrder;
import org.smeup.sys.os.cmd.CommandParameterOrder;
import org.smeup.sys.os.cmd.CommandStatus;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandContainer;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.cmd.QCommandSource;
import org.smeup.sys.os.cmd.QOperatingSystemCommandFactory;
import org.smeup.sys.os.cmd.QOperatingSystemCommandPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemCommandFactoryImpl extends EFactoryImpl implements QOperatingSystemCommandFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemCommandFactory init() {
		try {
			QOperatingSystemCommandFactory theOperatingSystemCommandFactory = (QOperatingSystemCommandFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemCommandPackage.eNS_URI);
			if (theOperatingSystemCommandFactory != null) {
				return theOperatingSystemCommandFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemCommandFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemCommandFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND: return (EObject)createCallableCommand();
			case QOperatingSystemCommandPackage.COMMAND: return (EObject)createCommand();
			case QOperatingSystemCommandPackage.COMMAND_CONTAINER: return (EObject)createCommandContainer();
			case QOperatingSystemCommandPackage.COMMAND_DATA: return (EObject)createCommandData();
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER: return (EObject)createCommandParameter();
			case QOperatingSystemCommandPackage.COMMAND_SOURCE: return (EObject)createCommandSource();
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
			case QOperatingSystemCommandPackage.COMMAND_STATUS:
				return createCommandStatusFromString(eDataType, initialValue);
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER_ORDER:
				return createCommandParameterOrderFromString(eDataType, initialValue);
			case QOperatingSystemCommandPackage.COMMAND_ORDER:
				return createCommandOrderFromString(eDataType, initialValue);
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
			case QOperatingSystemCommandPackage.COMMAND_STATUS:
				return convertCommandStatusToString(eDataType, instanceValue);
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER_ORDER:
				return convertCommandParameterOrderToString(eDataType, instanceValue);
			case QOperatingSystemCommandPackage.COMMAND_ORDER:
				return convertCommandOrderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCallableCommand createCallableCommand() {
		CallableCommandImpl callableCommand = new CallableCommandImpl();
		return callableCommand;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCommand createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCommandContainer createCommandContainer() {
		CommandContainerImpl commandContainer = new CommandContainerImpl();
		return commandContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCommandData createCommandData() {
		CommandDataImpl commandData = new CommandDataImpl();
		return commandData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCommandParameter createCommandParameter() {
		CommandParameterImpl commandParameter = new CommandParameterImpl();
		return commandParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCommandSource createCommandSource() {
		CommandSourceImpl commandSource = new CommandSourceImpl();
		return commandSource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CommandStatus createCommandStatusFromString(EDataType eDataType, String initialValue) {
		CommandStatus result = CommandStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CommandParameterOrder createCommandParameterOrderFromString(EDataType eDataType, String initialValue) {
		CommandParameterOrder result = CommandParameterOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandParameterOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CommandOrder createCommandOrderFromString(EDataType eDataType, String initialValue) {
		CommandOrder result = CommandOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemCommandPackage getOperatingSystemCommandPackage() {
		return (QOperatingSystemCommandPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemCommandPackage getPackage() {
		return QOperatingSystemCommandPackage.eINSTANCE;
	}

} // OSCommandCoreFactoryImpl
