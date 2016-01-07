/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.mi.core.util.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.mi.core.util.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MachineInterfaceCoreUtilFactoryImpl extends EFactoryImpl implements QMachineInterfaceCoreUtilFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QMachineInterfaceCoreUtilFactory init() {
		try {
			QMachineInterfaceCoreUtilFactory theMachineInterfaceCoreUtilFactory = (QMachineInterfaceCoreUtilFactory)EPackage.Registry.INSTANCE.getEFactory(QMachineInterfaceCoreUtilPackage.eNS_URI);
			if (theMachineInterfaceCoreUtilFactory != null) {
				return theMachineInterfaceCoreUtilFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MachineInterfaceCoreUtilFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineInterfaceCoreUtilFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMachineInterfaceCoreUtilPackage getMachineInterfaceCoreUtilPackage() {
		return (QMachineInterfaceCoreUtilPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QMachineInterfaceCoreUtilPackage getPackage() {
		return QMachineInterfaceCoreUtilPackage.eINSTANCE;
	}

} //MachineInterfaceCoreUtilFactoryImpl
