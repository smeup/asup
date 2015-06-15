/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.splf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;

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
 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFileFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemSpoolFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "splf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/splf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-splf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemSpoolFilePackage eINSTANCE = org.smeup.sys.os.splf.impl.OperatingSystemSpoolFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.splf.impl.SpoolFileImpl <em>Spool File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.splf.impl.SpoolFileImpl
	 * @see org.smeup.sys.os.splf.impl.OperatingSystemSpoolFilePackageImpl#getSpoolFile()
	 * @generated
	 */
	int SPOOL_FILE = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE__FILE_NAME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE__JOB_NAME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE__JOB_NUMBER = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Job User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE__JOB_USER = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE__OUT_QUEUE = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE__ROWS = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Spool ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE__SPOOL_ID = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>User Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE__USER_DATA = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Spool File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.splf.impl.SpoolFileRowImpl <em>Spool File Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.splf.impl.SpoolFileRowImpl
	 * @see org.smeup.sys.os.splf.impl.OperatingSystemSpoolFilePackageImpl#getSpoolFileRow()
	 * @generated
	 */
	int SPOOL_FILE_ROW = 1;

	/**
	 * The feature id for the '<em><b>Spool File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_ROW__SPOOL_FILE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_ROW__CONTENT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spool File Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_ROW_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.splf.QSpoolFileWriter <em>Spool File Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.splf.QSpoolFileWriter
	 * @see org.smeup.sys.os.splf.impl.OperatingSystemSpoolFilePackageImpl#getSpoolFileWriter()
	 * @generated
	 */
	int SPOOL_FILE_WRITER = 2;

	/**
	 * The number of structural features of the '<em>Spool File Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_WRITER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.splf.impl.SpoolFileDataImpl <em>Spool File Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.splf.impl.SpoolFileDataImpl
	 * @see org.smeup.sys.os.splf.impl.OperatingSystemSpoolFilePackageImpl#getSpoolFileData()
	 * @generated
	 */
	int SPOOL_FILE_DATA = 3;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__FACETS = QIntegratedLanguageDataTermPackage.DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__CONSTANT = QIntegratedLanguageDataTermPackage.DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__DEFAULT = QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__DEFINITION = QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__INITIALIZED = QIntegratedLanguageDataTermPackage.DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__LIKE = QIntegratedLanguageDataTermPackage.DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__NAME = QIntegratedLanguageDataTermPackage.DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__MANDATORY = QIntegratedLanguageDataTermPackage.DATA_TERM__MANDATORY;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__RESTRICTED = QIntegratedLanguageDataTermPackage.DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA__TEXT = QIntegratedLanguageDataTermPackage.DATA_TERM__TEXT;

	/**
	 * The number of structural features of the '<em>Spool File Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOOL_FILE_DATA_FEATURE_COUNT = QIntegratedLanguageDataTermPackage.DATA_TERM_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.splf.QSpoolFile <em>Spool File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spool File</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFile
	 * @generated
	 */
	EClass getSpoolFile();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.splf.QSpoolFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFile#getFileName()
	 * @see #getSpoolFile()
	 * @generated
	 */
	EAttribute getSpoolFile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.splf.QSpoolFile#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFile#getJobName()
	 * @see #getSpoolFile()
	 * @generated
	 */
	EAttribute getSpoolFile_JobName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.splf.QSpoolFile#getJobNumber <em>Job Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Number</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFile#getJobNumber()
	 * @see #getSpoolFile()
	 * @generated
	 */
	EAttribute getSpoolFile_JobNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.splf.QSpoolFile#getJobUser <em>Job User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job User</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFile#getJobUser()
	 * @see #getSpoolFile()
	 * @generated
	 */
	EAttribute getSpoolFile_JobUser();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.splf.QSpoolFile#getOutQueue <em>Out Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Queue</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFile#getOutQueue()
	 * @see #getSpoolFile()
	 * @generated
	 */
	EAttribute getSpoolFile_OutQueue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.os.splf.QSpoolFile#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFile#getRows()
	 * @see #getSpoolFile()
	 * @generated
	 */
	EReference getSpoolFile_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.splf.QSpoolFile#getSpoolID <em>Spool ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spool ID</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFile#getSpoolID()
	 * @see #getSpoolFile()
	 * @generated
	 */
	EAttribute getSpoolFile_SpoolID();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.splf.QSpoolFile#getUserData <em>User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFile#getUserData()
	 * @see #getSpoolFile()
	 * @generated
	 */
	EAttribute getSpoolFile_UserData();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.splf.QSpoolFileRow <em>Spool File Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spool File Row</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFileRow
	 * @generated
	 */
	EClass getSpoolFileRow();

	/**
	 * Returns the meta object for the container reference '{@link org.smeup.sys.os.splf.QSpoolFileRow#getSpoolFile <em>Spool File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Spool File</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFileRow#getSpoolFile()
	 * @see #getSpoolFileRow()
	 * @generated
	 */
	EReference getSpoolFileRow_SpoolFile();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.splf.QSpoolFileRow#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFileRow#getContent()
	 * @see #getSpoolFileRow()
	 * @generated
	 */
	EAttribute getSpoolFileRow_Content();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.splf.QSpoolFileWriter <em>Spool File Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spool File Writer</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFileWriter
	 * @generated
	 */
	EClass getSpoolFileWriter();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.splf.QSpoolFileData <em>Spool File Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spool File Data</em>'.
	 * @see org.smeup.sys.os.splf.QSpoolFileData
	 * @generated
	 */
	EClass getSpoolFileData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemSpoolFileFactory getOperatingSystemSpoolFileFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.splf.impl.SpoolFileImpl <em>Spool File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.splf.impl.SpoolFileImpl
		 * @see org.smeup.sys.os.splf.impl.OperatingSystemSpoolFilePackageImpl#getSpoolFile()
		 * @generated
		 */
		EClass SPOOL_FILE = eINSTANCE.getSpoolFile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOOL_FILE__FILE_NAME = eINSTANCE.getSpoolFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOOL_FILE__JOB_NAME = eINSTANCE.getSpoolFile_JobName();

		/**
		 * The meta object literal for the '<em><b>Job Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOOL_FILE__JOB_NUMBER = eINSTANCE.getSpoolFile_JobNumber();

		/**
		 * The meta object literal for the '<em><b>Job User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOOL_FILE__JOB_USER = eINSTANCE.getSpoolFile_JobUser();

		/**
		 * The meta object literal for the '<em><b>Out Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOOL_FILE__OUT_QUEUE = eINSTANCE.getSpoolFile_OutQueue();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOOL_FILE__ROWS = eINSTANCE.getSpoolFile_Rows();

		/**
		 * The meta object literal for the '<em><b>Spool ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOOL_FILE__SPOOL_ID = eINSTANCE.getSpoolFile_SpoolID();

		/**
		 * The meta object literal for the '<em><b>User Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOOL_FILE__USER_DATA = eINSTANCE.getSpoolFile_UserData();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.splf.impl.SpoolFileRowImpl <em>Spool File Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.splf.impl.SpoolFileRowImpl
		 * @see org.smeup.sys.os.splf.impl.OperatingSystemSpoolFilePackageImpl#getSpoolFileRow()
		 * @generated
		 */
		EClass SPOOL_FILE_ROW = eINSTANCE.getSpoolFileRow();

		/**
		 * The meta object literal for the '<em><b>Spool File</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOOL_FILE_ROW__SPOOL_FILE = eINSTANCE.getSpoolFileRow_SpoolFile();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOOL_FILE_ROW__CONTENT = eINSTANCE.getSpoolFileRow_Content();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.splf.QSpoolFileWriter <em>Spool File Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.splf.QSpoolFileWriter
		 * @see org.smeup.sys.os.splf.impl.OperatingSystemSpoolFilePackageImpl#getSpoolFileWriter()
		 * @generated
		 */
		EClass SPOOL_FILE_WRITER = eINSTANCE.getSpoolFileWriter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.splf.impl.SpoolFileDataImpl <em>Spool File Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.splf.impl.SpoolFileDataImpl
		 * @see org.smeup.sys.os.splf.impl.OperatingSystemSpoolFilePackageImpl#getSpoolFileData()
		 * @generated
		 */
		EClass SPOOL_FILE_DATA = eINSTANCE.getSpoolFileData();

	}

} //QOperatingSystemSpoolFilePackage
