/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryFactory
 * @model kind="package"
 * @generated
 */
public interface QOperativeSystemScheduleEntryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scde";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/scde";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-scde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperativeSystemScheduleEntryPackage eINSTANCE = org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.scde.impl.ScheduledEntryImpl <em>Scheduled Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.scde.impl.ScheduledEntryImpl
	 * @see org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl#getScheduledEntry()
	 * @generated
	 */
	int SCHEDULED_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Scheduled Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ENTRY__SCHEDULED_DATE = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduled Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ENTRY__SCHEDULED_TIME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ENTRY__DESCRIPTION = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Command To Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ENTRY__COMMAND_TO_RUN = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ENTRY__USER = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Scheduled Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_ENTRY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.scde.QScheduledEntry <em>Scheduled Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Entry</em>'.
	 * @see org.smeup.sys.os.scde.QScheduledEntry
	 * @generated
	 */
	EClass getScheduledEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduledEntry#getScheduledDate <em>Scheduled Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Date</em>'.
	 * @see org.smeup.sys.os.scde.QScheduledEntry#getScheduledDate()
	 * @see #getScheduledEntry()
	 * @generated
	 */
	EAttribute getScheduledEntry_ScheduledDate();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduledEntry#getScheduledTime <em>Scheduled Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Time</em>'.
	 * @see org.smeup.sys.os.scde.QScheduledEntry#getScheduledTime()
	 * @see #getScheduledEntry()
	 * @generated
	 */
	EAttribute getScheduledEntry_ScheduledTime();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduledEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.smeup.sys.os.scde.QScheduledEntry#getDescription()
	 * @see #getScheduledEntry()
	 * @generated
	 */
	EAttribute getScheduledEntry_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduledEntry#getCommandToRun <em>Command To Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command To Run</em>'.
	 * @see org.smeup.sys.os.scde.QScheduledEntry#getCommandToRun()
	 * @see #getScheduledEntry()
	 * @generated
	 */
	EAttribute getScheduledEntry_CommandToRun();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.scde.QScheduledEntry#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.smeup.sys.os.scde.QScheduledEntry#getUser()
	 * @see #getScheduledEntry()
	 * @generated
	 */
	EAttribute getScheduledEntry_User();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperativeSystemScheduleEntryFactory getOperativeSystemScheduleEntryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.scde.impl.ScheduledEntryImpl <em>Scheduled Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.scde.impl.ScheduledEntryImpl
		 * @see org.smeup.sys.os.scde.impl.OperativeSystemScheduleEntryPackageImpl#getScheduledEntry()
		 * @generated
		 */
		EClass SCHEDULED_ENTRY = eINSTANCE.getScheduledEntry();

		/**
		 * The meta object literal for the '<em><b>Scheduled Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_ENTRY__SCHEDULED_DATE = eINSTANCE.getScheduledEntry_ScheduledDate();

		/**
		 * The meta object literal for the '<em><b>Scheduled Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_ENTRY__SCHEDULED_TIME = eINSTANCE.getScheduledEntry_ScheduledTime();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_ENTRY__DESCRIPTION = eINSTANCE.getScheduledEntry_Description();

		/**
		 * The meta object literal for the '<em><b>Command To Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_ENTRY__COMMAND_TO_RUN = eINSTANCE.getScheduledEntry_CommandToRun();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_ENTRY__USER = eINSTANCE.getScheduledEntry_User();

	}

} //QOperativeSystemScheduleEntryPackage
