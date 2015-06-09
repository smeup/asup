/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.osgi.ecf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.co.osgi.QConnectorOSGIPackage;
import org.smeup.sys.co.osgi.ecf.ECFConnectorOSGIFactory;
import org.smeup.sys.co.osgi.ecf.ECFConnectorOSGIPackage;
import org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ECFConnectorOSGIPackageImpl extends EPackageImpl implements ECFConnectorOSGIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecfServerContainerConfigEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.co.osgi.ecf.ECFConnectorOSGIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ECFConnectorOSGIPackageImpl() {
		super(eNS_URI, ECFConnectorOSGIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ECFConnectorOSGIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ECFConnectorOSGIPackage init() {
		if (isInited) return (ECFConnectorOSGIPackage)EPackage.Registry.INSTANCE.getEPackage(ECFConnectorOSGIPackage.eNS_URI);

		// Obtain or create and register package
		ECFConnectorOSGIPackageImpl theECFConnectorOSGIPackage = (ECFConnectorOSGIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ECFConnectorOSGIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ECFConnectorOSGIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QConnectorOSGIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theECFConnectorOSGIPackage.createPackageContents();

		// Initialize created meta-data
		theECFConnectorOSGIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theECFConnectorOSGIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ECFConnectorOSGIPackage.eNS_URI, theECFConnectorOSGIPackage);
		return theECFConnectorOSGIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECFServerContainerConfig() {
		return ecfServerContainerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECFServerContainerConfig_ServerContainerType() {
		return (EAttribute)ecfServerContainerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECFServerContainerConfig_ContainerId() {
		return (EAttribute)ecfServerContainerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECFConnectorOSGIFactory getECFConnectorOSGIFactory() {
		return (ECFConnectorOSGIFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ecfServerContainerConfigEClass = createEClass(ECF_SERVER_CONTAINER_CONFIG);
		createEAttribute(ecfServerContainerConfigEClass, ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE);
		createEAttribute(ecfServerContainerConfigEClass, ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(ecfServerContainerConfigEClass, ECFServerContainerConfig.class, "ECFServerContainerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECFServerContainerConfig_ServerContainerType(), ecorePackage.getEString(), "serverContainerType", null, 1, 1, ECFServerContainerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECFServerContainerConfig_ContainerId(), ecorePackage.getEString(), "containerId", null, 1, 1, ECFServerContainerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ECFConnectorOSGIPackageImpl
