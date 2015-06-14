/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.resources.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.resources.QOperatingSystemResourcesFactory;
import org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage;
import org.smeup.sys.os.core.resources.QResourceEvent;
import org.smeup.sys.os.core.resources.QResourceNotifier;
import org.smeup.sys.os.core.resources.ResourceEventType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemResourcesFactoryImpl extends EFactoryImpl implements QOperatingSystemResourcesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemResourcesFactory init() {
		try {
			QOperatingSystemResourcesFactory theOperatingSystemResourcesFactory = (QOperatingSystemResourcesFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemResourcesPackage.eNS_URI);
			if (theOperatingSystemResourcesFactory != null) {
				return theOperatingSystemResourcesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemResourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemResourcesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemResourcesPackage.RESOURCE_EVENT: return (EObject)createResourceEvent();
			case QOperatingSystemResourcesPackage.RESOURCE_NOTIFIER: return (EObject)createResourceNotifier();
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
			case QOperatingSystemResourcesPackage.RESOURCE_EVENT_TYPE:
				return createResourceEventTypeFromString(eDataType, initialValue);
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
			case QOperatingSystemResourcesPackage.RESOURCE_EVENT_TYPE:
				return convertResourceEventTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends QObjectNameable> QResourceEvent<T> createResourceEvent() {
		ResourceEventImpl<T> resourceEvent = new ResourceEventImpl<T>();
		return resourceEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends QObjectNameable> QResourceNotifier<T> createResourceNotifier() {
		ResourceNotifierImpl<T> resourceNotifier = new ResourceNotifierImpl<T>();
		return resourceNotifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEventType createResourceEventTypeFromString(EDataType eDataType, String initialValue) {
		ResourceEventType result = ResourceEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemResourcesPackage getOperatingSystemResourcesPackage() {
		return (QOperatingSystemResourcesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemResourcesPackage getPackage() {
		return QOperatingSystemResourcesPackage.eINSTANCE;
	}

} // OSCoreResourceFactoryImpl
