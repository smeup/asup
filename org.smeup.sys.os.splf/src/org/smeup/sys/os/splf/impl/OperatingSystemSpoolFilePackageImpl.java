/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.splf.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;

import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;

import org.smeup.sys.os.core.QOperatingSystemCorePackage;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;
import org.smeup.sys.os.splf.QOperatingSystemSpoolFileFactory;
import org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage;
import org.smeup.sys.os.splf.QSpoolFile;
import org.smeup.sys.os.splf.QSpoolFileData;
import org.smeup.sys.os.splf.QSpoolFileRow;
import org.smeup.sys.os.splf.QSpoolFileWriter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemSpoolFilePackageImpl extends EPackageImpl implements QOperatingSystemSpoolFilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spoolFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spoolFileRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spoolFileWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spoolFileDataEClass = null;

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
	 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemSpoolFilePackageImpl() {
		super(eNS_URI, QOperatingSystemSpoolFileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperatingSystemSpoolFilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemSpoolFilePackage init() {
		if (isInited) return (QOperatingSystemSpoolFilePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemSpoolFilePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemSpoolFilePackageImpl theOperatingSystemSpoolFilePackage = (OperatingSystemSpoolFilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemSpoolFilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemSpoolFilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QOperatingSystemCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemSpoolFilePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemSpoolFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemSpoolFilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemSpoolFilePackage.eNS_URI, theOperatingSystemSpoolFilePackage);
		return theOperatingSystemSpoolFilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpoolFile() {
		return spoolFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_FileName() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpoolFile_JobReference() {
		return (EReference)spoolFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_OutQueue() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpoolFile_Rows() {
		return (EReference)spoolFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_SpoolID() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFile_UserData() {
		return (EAttribute)spoolFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpoolFileRow() {
		return spoolFileRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpoolFileRow_SpoolFile() {
		return (EReference)spoolFileRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpoolFileRow_Content() {
		return (EAttribute)spoolFileRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpoolFileWriter() {
		return spoolFileWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpoolFileData() {
		return spoolFileDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemSpoolFileFactory getOperatingSystemSpoolFileFactory() {
		return (QOperatingSystemSpoolFileFactory)getEFactoryInstance();
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
		spoolFileEClass = createEClass(SPOOL_FILE);
		createEAttribute(spoolFileEClass, SPOOL_FILE__FILE_NAME);
		createEReference(spoolFileEClass, SPOOL_FILE__JOB_REFERENCE);
		createEAttribute(spoolFileEClass, SPOOL_FILE__OUT_QUEUE);
		createEReference(spoolFileEClass, SPOOL_FILE__ROWS);
		createEAttribute(spoolFileEClass, SPOOL_FILE__SPOOL_ID);
		createEAttribute(spoolFileEClass, SPOOL_FILE__USER_DATA);

		spoolFileRowEClass = createEClass(SPOOL_FILE_ROW);
		createEReference(spoolFileRowEClass, SPOOL_FILE_ROW__SPOOL_FILE);
		createEAttribute(spoolFileRowEClass, SPOOL_FILE_ROW__CONTENT);

		spoolFileWriterEClass = createEClass(SPOOL_FILE_WRITER);

		spoolFileDataEClass = createEClass(SPOOL_FILE_DATA);
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
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QIntegratedLanguageDataTermPackage theIntegratedLanguageDataTermPackage = (QIntegratedLanguageDataTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI);
		QIntegratedLanguageDataDefPackage theIntegratedLanguageDataDefPackage = (QIntegratedLanguageDataDefPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spoolFileEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		spoolFileRowEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		EGenericType g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		EGenericType g2 = createEGenericType(theIntegratedLanguageDataDefPackage.getBufferedDataDef());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		spoolFileDataEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(spoolFileEClass, QSpoolFile.class, "SpoolFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpoolFile_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpoolFile_JobReference(), theOperatingSystemJobsPackage.getJobReference(), null, "jobReference", null, 1, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFile_OutQueue(), ecorePackage.getEString(), "outQueue", null, 0, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpoolFile_Rows(), this.getSpoolFileRow(), this.getSpoolFileRow_SpoolFile(), "rows", null, 0, -1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFile_SpoolID(), ecorePackage.getEString(), "spoolID", null, 1, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFile_UserData(), ecorePackage.getEString(), "userData", null, 0, 1, QSpoolFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spoolFileRowEClass, QSpoolFileRow.class, "SpoolFileRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpoolFileRow_SpoolFile(), this.getSpoolFile(), this.getSpoolFile_Rows(), "spoolFile", null, 1, 1, QSpoolFileRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpoolFileRow_Content(), ecorePackage.getEString(), "content", null, 1, 1, QSpoolFileRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spoolFileWriterEClass, QSpoolFileWriter.class, "SpoolFileWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(spoolFileWriterEClass, null, "writeSpoolFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSpoolFile(), "spoolFile", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(spoolFileDataEClass, QSpoolFileData.class, "SpoolFileData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// il-data
		createIldataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>il-data</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIldataAnnotations() {
		String source = "il-data";	
		addAnnotation
		  (getSpoolFile_OutQueue(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getSpoolFile_SpoolID(), 
		   source, 
		   new String[] {
			 "length", "36"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getSpoolFile_UserData(), 
		   source, 
		   new String[] {
			 "length", "48"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });
	}

} //OperatingSystemSpoolFilePackageImpl
