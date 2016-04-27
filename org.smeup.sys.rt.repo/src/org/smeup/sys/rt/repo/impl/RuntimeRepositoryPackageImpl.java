/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.repo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;
import org.smeup.sys.rt.core.QRuntimeCorePackage;

import org.smeup.sys.rt.repo.QRepositoryManager;
import org.smeup.sys.rt.repo.QRuntimeRepositoryFactory;
import org.smeup.sys.rt.repo.QRuntimeRepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeRepositoryPackageImpl extends EPackageImpl implements QRuntimeRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryManagerEClass = null;

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
	 * @see org.smeup.sys.rt.repo.QRuntimeRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimeRepositoryPackageImpl() {
		super(eNS_URI, QRuntimeRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QRuntimeRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QRuntimeRepositoryPackage init() {
		if (isInited) return (QRuntimeRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(QRuntimeRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		RuntimeRepositoryPackageImpl theRuntimeRepositoryPackage = (RuntimeRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimeRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimeRepositoryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QRuntimeCorePackage.eINSTANCE.eClass();
		QIntegratedLanguageDataDefPackage.eINSTANCE.eClass();
		QIntegratedLanguageDataTermPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRuntimeRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theRuntimeRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimeRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QRuntimeRepositoryPackage.eNS_URI, theRuntimeRepositoryPackage);
		return theRuntimeRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryManager() {
		return repositoryManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRepositoryManager__CheckUpdates__String() {
		return repositoryManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRepositoryManager__Update__String() {
		return repositoryManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRuntimeRepositoryFactory getRuntimeRepositoryFactory() {
		return (QRuntimeRepositoryFactory)getEFactoryInstance();
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
		repositoryManagerEClass = createEClass(REPOSITORY_MANAGER);
		createEOperation(repositoryManagerEClass, REPOSITORY_MANAGER___CHECK_UPDATES__STRING);
		createEOperation(repositoryManagerEClass, REPOSITORY_MANAGER___UPDATE__STRING);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(repositoryManagerEClass, QRepositoryManager.class, "RepositoryManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getRepositoryManager__CheckUpdates__String(), ecorePackage.getEBoolean(), "checkUpdates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "repositoryLocation", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRepositoryManager__Update__String(), ecorePackage.getEBoolean(), "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "repositoryLocation", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RuntimeRepositoryPackageImpl
