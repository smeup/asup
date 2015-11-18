/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;

import org.smeup.sys.os.scde.QOperativeSystemScheduleEntryFactory;
import org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage;
import org.smeup.sys.os.scde.QScheduledEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperativeSystemScheduleEntryPackageImpl extends EPackageImpl implements QOperativeSystemScheduleEntryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduledEntryEClass = null;

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
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperativeSystemScheduleEntryPackageImpl() {
		super(eNS_URI, QOperativeSystemScheduleEntryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QOperativeSystemScheduleEntryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperativeSystemScheduleEntryPackage init() {
		if (isInited) return (QOperativeSystemScheduleEntryPackage)EPackage.Registry.INSTANCE.getEPackage(QOperativeSystemScheduleEntryPackage.eNS_URI);

		// Obtain or create and register package
		OperativeSystemScheduleEntryPackageImpl theOperativeSystemScheduleEntryPackage = (OperativeSystemScheduleEntryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperativeSystemScheduleEntryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperativeSystemScheduleEntryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageDataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperativeSystemScheduleEntryPackage.createPackageContents();

		// Initialize created meta-data
		theOperativeSystemScheduleEntryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperativeSystemScheduleEntryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperativeSystemScheduleEntryPackage.eNS_URI, theOperativeSystemScheduleEntryPackage);
		return theOperativeSystemScheduleEntryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduledEntry() {
		return scheduledEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledEntry_ScheduledDate() {
		return (EAttribute)scheduledEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledEntry_ScheduledTime() {
		return (EAttribute)scheduledEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledEntry_Description() {
		return (EAttribute)scheduledEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledEntry_CommandToRun() {
		return (EAttribute)scheduledEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledEntry_User() {
		return (EAttribute)scheduledEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperativeSystemScheduleEntryFactory getOperativeSystemScheduleEntryFactory() {
		return (QOperativeSystemScheduleEntryFactory)getEFactoryInstance();
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
		scheduledEntryEClass = createEClass(SCHEDULED_ENTRY);
		createEAttribute(scheduledEntryEClass, SCHEDULED_ENTRY__SCHEDULED_DATE);
		createEAttribute(scheduledEntryEClass, SCHEDULED_ENTRY__SCHEDULED_TIME);
		createEAttribute(scheduledEntryEClass, SCHEDULED_ENTRY__DESCRIPTION);
		createEAttribute(scheduledEntryEClass, SCHEDULED_ENTRY__COMMAND_TO_RUN);
		createEAttribute(scheduledEntryEClass, SCHEDULED_ENTRY__USER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scheduledEntryEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());

		// Initialize classes and features; add operations and parameters
		initEClass(scheduledEntryEClass, QScheduledEntry.class, "ScheduledEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledEntry_ScheduledDate(), ecorePackage.getEString(), "scheduledDate", null, 1, 1, QScheduledEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledEntry_ScheduledTime(), ecorePackage.getEString(), "scheduledTime", null, 1, 1, QScheduledEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledEntry_Description(), ecorePackage.getEString(), "description", null, 0, 1, QScheduledEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledEntry_CommandToRun(), ecorePackage.getEString(), "commandToRun", null, 1, 1, QScheduledEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledEntry_User(), ecorePackage.getEString(), "user", null, 1, 1, QScheduledEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getScheduledEntry_ScheduledDate(), 
		   source, 
		   new String[] {
			 "length", "8"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getScheduledEntry_ScheduledTime(), 
		   source, 
		   new String[] {
			 "length", "8"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getScheduledEntry_Description(), 
		   source, 
		   new String[] {
			 "length", "50"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getScheduledEntry_CommandToRun(), 
		   source, 
		   new String[] {
			 "length", "256"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });	
		addAnnotation
		  (getScheduledEntry_User(), 
		   source, 
		   new String[] {
			 "length", "10"
		   },
		   new URI[] {
			 URI.createURI(QIntegratedLanguageDataPackage.eNS_URI).appendFragment("//def/CharacterDef")
		   });
	}

} //OperativeSystemScheduleEntryPackageImpl
