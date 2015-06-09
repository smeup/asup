/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.osgi.ecf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.co.osgi.ecf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ECFConnectorOSGIFactoryImpl extends EFactoryImpl implements ECFConnectorOSGIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECFConnectorOSGIFactory init() {
		try {
			ECFConnectorOSGIFactory theECFConnectorOSGIFactory = (ECFConnectorOSGIFactory)EPackage.Registry.INSTANCE.getEFactory(ECFConnectorOSGIPackage.eNS_URI);
			if (theECFConnectorOSGIFactory != null) {
				return theECFConnectorOSGIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ECFConnectorOSGIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECFConnectorOSGIFactoryImpl() {
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
			case ECFConnectorOSGIPackage.ECF_SERVER_CONTAINER_CONFIG: return (EObject)createECFServerContainerConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECFServerContainerConfig createECFServerContainerConfig() {
		ECFServerContainerConfigImpl ecfServerContainerConfig = new ECFServerContainerConfigImpl();
		return ecfServerContainerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECFConnectorOSGIPackage getECFConnectorOSGIPackage() {
		return (ECFConnectorOSGIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ECFConnectorOSGIPackage getPackage() {
		return ECFConnectorOSGIPackage.eINSTANCE;
	}

} //ECFConnectorOSGIFactoryImpl
