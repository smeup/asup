/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.module.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.module.QModule;
import org.smeup.sys.os.module.QModuleContainer;
import org.smeup.sys.os.module.QModuleSource;
import org.smeup.sys.os.module.QOperatingSystemModuleFactory;
import org.smeup.sys.os.module.QOperatingSystemModulePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemModuleFactoryImpl extends EFactoryImpl implements QOperatingSystemModuleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemModuleFactory init() {
		try {
			QOperatingSystemModuleFactory theOperatingSystemModuleFactory = (QOperatingSystemModuleFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemModulePackage.eNS_URI);
			if (theOperatingSystemModuleFactory != null) {
				return theOperatingSystemModuleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemModuleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemModuleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemModulePackage.MODULE: return (EObject)createModule();
			case QOperatingSystemModulePackage.MODULE_SOURCE: return (EObject)createModuleSource();
			case QOperatingSystemModulePackage.MODULE_CONTAINER: return (EObject)createModuleContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QModule createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QModuleSource createModuleSource() {
		ModuleSourceImpl moduleSource = new ModuleSourceImpl();
		return moduleSource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QModuleContainer createModuleContainer() {
		ModuleContainerImpl moduleContainer = new ModuleContainerImpl();
		return moduleContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemModulePackage getOperatingSystemModulePackage() {
		return (QOperatingSystemModulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemModulePackage getPackage() {
		return QOperatingSystemModulePackage.eINSTANCE;
	}

} // OperatingSystemModuleFactoryImpl
