/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QIntegratedLanguageLockFactory;
import org.smeup.sys.il.lock.QIntegratedLanguageLockPackage;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QLockRead;
import org.smeup.sys.il.lock.QLockWrite;
import org.smeup.sys.il.lock.QObjectLockable;
import org.smeup.sys.il.lock.QObjectLocker;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class IntegratedLanguageLockPackageImpl extends EPackageImpl implements QIntegratedLanguageLockPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lockManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lockReadEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lockWriteEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass objectLockableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass objectLockerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum lockTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.il.lock.QIntegratedLanguageLockPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageLockPackageImpl() {
		super(eNS_URI, QIntegratedLanguageLockFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize
	 * {@link QIntegratedLanguageLockPackage#eINSTANCE} when that field is
	 * accessed. Clients should not invoke it directly. Instead, they should
	 * simply access that field to obtain the package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageLockPackage init() {
		if (isInited)
			return (QIntegratedLanguageLockPackage) EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageLockPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageLockPackageImpl theIntegratedLanguageLockPackage = (IntegratedLanguageLockPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageLockPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new IntegratedLanguageLockPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntegratedLanguageLockPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageLockPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageLockPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageLockPackage.eNS_URI, theIntegratedLanguageLockPackage);
		return theIntegratedLanguageLockPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getLockManager() {
		return lockManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getLockRead() {
		return lockReadEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getLockWrite() {
		return lockWriteEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getObjectLockable() {
		return objectLockableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getObjectLockable_LockRead() {
		return (EReference) objectLockableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getObjectLockable_LockWrite() {
		return (EReference) objectLockableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getObjectLocker() {
		return objectLockerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getLockType() {
		return lockTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QIntegratedLanguageLockFactory getIntegratedLanguageLockFactory() {
		return (QIntegratedLanguageLockFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		lockManagerEClass = createEClass(LOCK_MANAGER);

		lockReadEClass = createEClass(LOCK_READ);

		lockWriteEClass = createEClass(LOCK_WRITE);

		objectLockableEClass = createEClass(OBJECT_LOCKABLE);
		createEReference(objectLockableEClass, OBJECT_LOCKABLE__LOCK_READ);
		createEReference(objectLockableEClass, OBJECT_LOCKABLE__LOCK_WRITE);

		objectLockerEClass = createEClass(OBJECT_LOCKER);

		// Create enums
		lockTypeEEnum = createEEnum(LOCK_TYPE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage) EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage) EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter objectLockerEClass_T = addETypeParameter(objectLockerEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getObjectLockable());
		objectLockerEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		lockReadEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		lockWriteEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		objectLockableEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(lockManagerEClass, QLockManager.class, "LockManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(lockManagerEClass, null, "getLocker", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getObjectLockable());
		t1.getEBounds().add(g1);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "object", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getObjectLocker());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(lockReadEClass, QLockRead.class, "LockRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lockWriteEClass, QLockWrite.class, "LockWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectLockableEClass, QObjectLockable.class, "ObjectLockable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectLockable_LockRead(), this.getLockRead(), null, "lockRead", null, 1, 1, QObjectLockable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectLockable_LockWrite(), this.getLockWrite(), null, "lockWrite", null, 1, 1, QObjectLockable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectLockerEClass, QObjectLocker.class, "ObjectLocker", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(objectLockerEClass, null, "lock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectLockerEClass, ecorePackage.getEBoolean(), "tryLock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectLockerEClass, null, "unlock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectLockerEClass, ecorePackage.getEBoolean(), "isLocked", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectLockerEClass, ecorePackage.getEBoolean(), "isLockedByOther", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectLockerEClass, null, "getObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(objectLockerEClass_T);
		initEOperation(op, g1);

		// Initialize enums and add enum literals
		initEEnum(lockTypeEEnum, LockType.class, "LockType");
		addEEnumLiteral(lockTypeEEnum, LockType.READ);
		addEEnumLiteral(lockTypeEEnum, LockType.WRITE);

		// Create resource
		createResource(eNS_URI);
	}

} // IntegratedLanguageLockPackageImpl
