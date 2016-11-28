/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.rt.core.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeCoreFactoryImpl extends EFactoryImpl implements QRuntimeCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QRuntimeCoreFactory init() {
		try {
			QRuntimeCoreFactory theRuntimeCoreFactory = (QRuntimeCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QRuntimeCorePackage.eNS_URI);
			if (theRuntimeCoreFactory != null) {
				return theRuntimeCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuntimeCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeCoreFactoryImpl() {
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
			case QRuntimeCorePackage.APPLICATION: return (EObject)createApplication();
			case QRuntimeCorePackage.APPLICATION_COMPONENT: return (EObject)createApplicationComponent();
			case QRuntimeCorePackage.APPLICATION_MODULE: return (EObject)createApplicationModule();
			case QRuntimeCorePackage.SERVICE_HOOK: return (EObject)createServiceHook();
			case QRuntimeCorePackage.SERVICE_EXECUTOR: return (EObject)createServiceExecutor();
			case QRuntimeCorePackage.SERVICE_REGISTRY: return (EObject)createServiceRegistry();
			case QRuntimeCorePackage.SERVICE_REGISTRY_ENTRY: return (EObject)createServiceRegistryEntry();
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
			case QRuntimeCorePackage.SERVICE_STATUS:
				return createServiceStatusFromString(eDataType, initialValue);
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
			case QRuntimeCorePackage.SERVICE_STATUS:
				return convertServiceStatusToString(eDataType, instanceValue);
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
	public QApplication createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QApplicationComponent createApplicationComponent() {
		ApplicationComponentImpl applicationComponent = new ApplicationComponentImpl();
		return applicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QApplicationModule createApplicationModule() {
		ApplicationModuleImpl applicationModule = new ApplicationModuleImpl();
		return applicationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QServiceHook createServiceHook() {
		ServiceHookImpl serviceHook = new ServiceHookImpl();
		return serviceHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServiceExecutor createServiceExecutor() {
		ServiceExecutorImpl serviceExecutor = new ServiceExecutorImpl();
		return serviceExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServiceRegistry createServiceRegistry() {
		ServiceRegistryImpl serviceRegistry = new ServiceRegistryImpl();
		return serviceRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QServiceRegistryEntry createServiceRegistryEntry() {
		ServiceRegistryEntryImpl serviceRegistryEntry = new ServiceRegistryEntryImpl();
		return serviceRegistryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceStatus createServiceStatusFromString(EDataType eDataType, String initialValue) {
		ServiceStatus result = ServiceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QRuntimeCorePackage getRuntimeCorePackage() {
		return (QRuntimeCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QRuntimeCorePackage getPackage() {
		return QRuntimeCorePackage.eINSTANCE;
	}

} //FrameworkCoreFactoryImpl
