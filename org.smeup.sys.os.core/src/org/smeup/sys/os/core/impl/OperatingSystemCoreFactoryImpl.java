/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.core.QOperatingSystemCoreFactory;
import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemEvent;
import org.smeup.sys.os.core.SystemEventType;
import org.smeup.sys.os.core.SystemStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemCoreFactoryImpl extends EFactoryImpl implements QOperatingSystemCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemCoreFactory init() {
		try {
			QOperatingSystemCoreFactory theOperatingSystemCoreFactory = (QOperatingSystemCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemCorePackage.eNS_URI);
			if (theOperatingSystemCoreFactory != null) {
				return theOperatingSystemCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemCoreFactoryImpl() {
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
			case QOperatingSystemCorePackage.CREATION_INFO: return (EObject)createCreationInfo();
			case QOperatingSystemCorePackage.SYSTEM: return (EObject)createSystem();
			case QOperatingSystemCorePackage.SYSTEM_EVENT: return (EObject)createSystemEvent();
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
			case QOperatingSystemCorePackage.SYSTEM_EVENT_TYPE:
				return createSystemEventTypeFromString(eDataType, initialValue);
			case QOperatingSystemCorePackage.SYSTEM_STATUS:
				return createSystemStatusFromString(eDataType, initialValue);
			case QOperatingSystemCorePackage.MESSAGE_VARIABLE_LIST:
				return createMessageVariableListFromString(eDataType, initialValue);
			case QOperatingSystemCorePackage.MESSAGE_EXCEPTION:
				return createMessageExceptionFromString(eDataType, initialValue);
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
			case QOperatingSystemCorePackage.SYSTEM_EVENT_TYPE:
				return convertSystemEventTypeToString(eDataType, instanceValue);
			case QOperatingSystemCorePackage.SYSTEM_STATUS:
				return convertSystemStatusToString(eDataType, instanceValue);
			case QOperatingSystemCorePackage.MESSAGE_VARIABLE_LIST:
				return convertMessageVariableListToString(eDataType, instanceValue);
			case QOperatingSystemCorePackage.MESSAGE_EXCEPTION:
				return convertMessageExceptionToString(eDataType, instanceValue);
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
	public QCreationInfo createCreationInfo() {
		CreationInfoImpl creationInfo = new CreationInfoImpl();
		return creationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSystem createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSystemEvent createSystemEvent() {
		SystemEventImpl systemEvent = new SystemEventImpl();
		return systemEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemEventType createSystemEventTypeFromString(EDataType eDataType, String initialValue) {
		SystemEventType result = SystemEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStatus createSystemStatusFromString(EDataType eDataType, String initialValue) {
		SystemStatus result = SystemStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object[] createMessageVariableListFromString(EDataType eDataType, String initialValue) {
		return (Object[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageVariableListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemMessageException createMessageExceptionFromString(EDataType eDataType, String initialValue) {
		return (OperatingSystemMessageException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemCorePackage getOperatingSystemCorePackage() {
		return (QOperatingSystemCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemCorePackage getPackage() {
		return QOperatingSystemCorePackage.eINSTANCE;
	}

} //OperatingSystemCoreFactoryImpl
