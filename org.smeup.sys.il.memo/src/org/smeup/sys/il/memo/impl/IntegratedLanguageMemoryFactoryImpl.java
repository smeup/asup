/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.memo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageMemoryFactoryImpl extends EFactoryImpl implements QIntegratedLanguageMemoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageMemoryFactory init() {
		try {
			QIntegratedLanguageMemoryFactory theIntegratedLanguageMemoryFactory = (QIntegratedLanguageMemoryFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageMemoryPackage.eNS_URI);
			if (theIntegratedLanguageMemoryFactory != null) {
				return theIntegratedLanguageMemoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageMemoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageMemoryFactoryImpl() {
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
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT: return (EObject)createResourceEvent();
			case QIntegratedLanguageMemoryPackage.RESOURCE_NOTIFIER: return (EObject)createResourceNotifier();
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
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT_TYPE:
				return createResourceEventTypeFromString(eDataType, initialValue);
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
			case QIntegratedLanguageMemoryPackage.RESOURCE_EVENT_TYPE:
				return convertResourceEventTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends QObjectNameable> QResourceEvent<T> createResourceEvent() {
		ResourceEventImpl<T> resourceEvent = new ResourceEventImpl<T>();
		return resourceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends QObjectNameable> QResourceNotifier<T> createResourceNotifier() {
		ResourceNotifierImpl<T> resourceNotifier = new ResourceNotifierImpl<T>();
		return resourceNotifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEventType createResourceEventTypeFromString(EDataType eDataType, String initialValue) {
		ResourceEventType result = ResourceEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageMemoryPackage getIntegratedLanguageMemoryPackage() {
		return (QIntegratedLanguageMemoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageMemoryPackage getPackage() {
		return QIntegratedLanguageMemoryPackage.eINSTANCE;
	}

} //IntegratedLanguageMemoryFactoryImpl
