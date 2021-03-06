/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.co.core.QCommunicationCoreFactory;
import org.smeup.sys.co.core.QCommunicationCorePackage;
import org.smeup.sys.co.core.QCommunicationManager;
import org.smeup.sys.co.core.QEndPoint;
import org.smeup.sys.co.core.QOutputWrapper;
import org.smeup.sys.co.core.QServerSocket;
import org.smeup.sys.co.core.QServerSocketConfig;
import org.smeup.sys.co.core.QServerSocketManager;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationCorePackageImpl extends EPackageImpl implements QCommunicationCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSocketConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSocketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSocketManagerEClass = null;

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
	 * @see org.smeup.sys.co.core.QCommunicationCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationCorePackageImpl() {
		super(eNS_URI, QCommunicationCoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QCommunicationCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QCommunicationCorePackage init() {
		if (isInited) return (QCommunicationCorePackage)EPackage.Registry.INSTANCE.getEPackage(QCommunicationCorePackage.eNS_URI);

		// Obtain or create and register package
		CommunicationCorePackageImpl theCommunicationCorePackage = (CommunicationCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommunicationCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommunicationCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommunicationCorePackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QCommunicationCorePackage.eNS_URI, theCommunicationCorePackage);
		return theCommunicationCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputWrapper() {
		return outputWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerSocketConfig() {
		return serverSocketConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSocketConfig_Address() {
		return (EAttribute)serverSocketConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSocketConfig_Port() {
		return (EAttribute)serverSocketConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerSocket() {
		return serverSocketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerSocketManager() {
		return serverSocketManagerEClass;
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
	public QCommunicationCoreFactory getCommunicationCoreFactory() {
		return (QCommunicationCoreFactory)getEFactoryInstance();
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

		outputWrapperEClass = createEClass(OUTPUT_WRAPPER);

		serverSocketConfigEClass = createEClass(SERVER_SOCKET_CONFIG);
		createEAttribute(serverSocketConfigEClass, SERVER_SOCKET_CONFIG__ADDRESS);
		createEAttribute(serverSocketConfigEClass, SERVER_SOCKET_CONFIG__PORT);

		serverSocketEClass = createEClass(SERVER_SOCKET);

		serverSocketManagerEClass = createEClass(SERVER_SOCKET_MANAGER);
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

		// Obtain other dependent packages
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serverSocketConfigEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(communicationManagerEClass, QCommunicationManager.class, "CommunicationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(communicationManagerEClass, this.getEndPoint(), "find", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(communicationManagerEClass, this.getEndPoint(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextID", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "endPointID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(communicationManagerEClass, theOperatingSystemJobsPackage.getJobCapability(), "connect", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getIdentity());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "identity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(communicationManagerEClass, null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(communicationManagerEClass, null, "locate", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "S");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(endPointEClass, QEndPoint.class, "EndPoint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(endPointEClass, ecorePackage.getEString(), "getApplicationID", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endPointEClass, ecorePackage.getEString(), "getEndPointID", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endPointEClass, ecorePackage.getEString(), "getInterfaces", 1, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endPointEClass, ecorePackage.getEStringToStringMapEntry(), "getProperties", 1, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endPointEClass, ecorePackage.getELong(), "getServiceID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputWrapperEClass, QOutputWrapper.class, "OutputWrapper", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(outputWrapperEClass, ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputWrapperEClass, null, "flush", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theMachineInterfaceCorePackage.getJavaIOException());

		op = addEOperation(outputWrapperEClass, null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaWriter(), "writer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputWrapperEClass, null, "unregister", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(outputWrapperEClass, null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJobCapability(), "capability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "content", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theMachineInterfaceCorePackage.getJavaIOException());

		initEClass(serverSocketConfigEClass, QServerSocketConfig.class, "ServerSocketConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerSocketConfig_Address(), ecorePackage.getEString(), "address", null, 1, 1, QServerSocketConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSocketConfig_Port(), ecorePackage.getEInt(), "port", null, 1, 1, QServerSocketConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverSocketEClass, QServerSocket.class, "ServerSocket", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverSocketManagerEClass, QServerSocketManager.class, "ServerSocketManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(serverSocketManagerEClass, null, "startServerSocket", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getServerSocketConfig(), "config", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CommunicationCorePackageImpl
