/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.osgi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.co.osgi.QCommunicationManager;
import org.smeup.sys.co.osgi.QConnectorOSGIFactory;
import org.smeup.sys.co.osgi.QConnectorOSGIPackage;
import org.smeup.sys.co.osgi.QEndPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorOSGIPackageImpl extends EPackageImpl implements QConnectorOSGIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationManagerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endPointEClass = null;

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
	 * @see org.smeup.sys.co.osgi.QConnectorOSGIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConnectorOSGIPackageImpl() {
		super(eNS_URI, QConnectorOSGIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QConnectorOSGIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QConnectorOSGIPackage init() {
		if (isInited) return (QConnectorOSGIPackage)EPackage.Registry.INSTANCE.getEPackage(QConnectorOSGIPackage.eNS_URI);

		// Obtain or create and register package
		ConnectorOSGIPackageImpl theConnectorOSGIPackage = (ConnectorOSGIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConnectorOSGIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConnectorOSGIPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConnectorOSGIPackage.createPackageContents();

		// Initialize created meta-data
		theConnectorOSGIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConnectorOSGIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QConnectorOSGIPackage.eNS_URI, theConnectorOSGIPackage);
		return theConnectorOSGIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationManager() {
		return communicationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndPoint() {
		return endPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectorOSGIFactory getConnectorOSGIFactory() {
		return (QConnectorOSGIFactory)getEFactoryInstance();
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
		communicationManagerEClass = createEClass(COMMUNICATION_MANAGER);

		endPointEClass = createEClass(END_POINT);
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
		initEClass(communicationManagerEClass, QCommunicationManager.class, "CommunicationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(communicationManagerEClass, this.getEndPoint(), "find", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(communicationManagerEClass, this.getEndPoint(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endPointID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(endPointEClass, QEndPoint.class, "EndPoint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(endPointEClass, ecorePackage.getEString(), "getApplicationID", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endPointEClass, ecorePackage.getEString(), "getEndPointID", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endPointEClass, ecorePackage.getEString(), "getInterfaces", 1, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endPointEClass, ecorePackage.getEStringToStringMapEntry(), "getProperties", 1, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endPointEClass, ecorePackage.getELong(), "getServiceID", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConnectorOSGIPackageImpl
