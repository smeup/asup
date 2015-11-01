/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.file.QOperatingSystemFileFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "file";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/file";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-file";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemFilePackage eINSTANCE = org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.FileImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 9;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The number of structural features of the '<em>File</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.os.file.impl.DatabaseFileImpl
	 * <em>Database File</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.os.file.impl.DatabaseFileImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDatabaseFile()
	 * @generated
	 */
	int DATABASE_FILE = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Database Format</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE__DATABASE_FORMAT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.DisplayFileImpl <em>Display File</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.DisplayFileImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDisplayFile()
	 * @generated
	 */
	int DISPLAY_FILE = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.FileFormatImpl <em>File Format</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.FileFormatImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileFormat()
	 * @generated
	 */
	int FILE_FORMAT = 10;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.DisplayFileFormatImpl <em>Display File Format</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.DisplayFileFormatImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDisplayFileFormat()
	 * @generated
	 */
	int DISPLAY_FILE_FORMAT = 6;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.QFileManager
	 * <em>File Manager</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.os.file.QFileManager
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileManager()
	 * @generated
	 */
	int FILE_MANAGER = 14;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.FileMemberImpl <em>File Member</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.FileMemberImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileMember()
	 * @generated
	 */
	int FILE_MEMBER = 15;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.QFileMemberManager <em>File Member Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.QFileMemberManager
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileMemberManager()
	 * @generated
	 */
	int FILE_MEMBER_MANAGER = 16;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.FileMemberRowImpl <em>File Member Row</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.FileMemberRowImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileMemberRow()
	 * @generated
	 */
	int FILE_MEMBER_ROW = 17;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.QFileMembered
	 * <em>File Membered</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.os.file.QFileMembered
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileMembered()
	 * @generated
	 */
	int FILE_MEMBERED = 18;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.LogicalFileImpl <em>Logical File</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.LogicalFileImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getLogicalFile()
	 * @generated
	 */
	int LOGICAL_FILE = 20;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.os.file.impl.PhysicalFileImpl
	 * <em>Physical File</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.os.file.impl.PhysicalFileImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPhysicalFile()
	 * @generated
	 */
	int PHYSICAL_FILE = 21;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.PrinterFileImpl <em>Printer File</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.PrinterFileImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPrinterFile()
	 * @generated
	 */
	int PRINTER_FILE = 22;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.os.file.impl.ExternalFileImpl
	 * <em>External File</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.os.file.impl.ExternalFileImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getExternalFile()
	 * @generated
	 */
	int EXTERNAL_FILE = 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.FileFormatFieldImpl <em>File Format Field</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.FileFormatFieldImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileFormatField()
	 * @generated
	 */
	int FILE_FORMAT_FIELD = 11;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__FACETS = QIntegratedLanguageDataTermPackage.DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__BASED = QIntegratedLanguageDataTermPackage.DATA_TERM__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__CARDINALITY = QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__CONSTANT = QIntegratedLanguageDataTermPackage.DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__DEFAULT = QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__DEFINITION = QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__INITIALIZED = QIntegratedLanguageDataTermPackage.DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__LIKE = QIntegratedLanguageDataTermPackage.DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__NAME = QIntegratedLanguageDataTermPackage.DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__RESTRICTED = QIntegratedLanguageDataTermPackage.DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD__TEXT = QIntegratedLanguageDataTermPackage.DATA_TERM__TEXT;

	/**
	 * The number of structural features of the '<em>File Format Field</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FIELD_FEATURE_COUNT = QIntegratedLanguageDataTermPackage.DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.DatabaseFileFieldImpl <em>Database File Field</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.DatabaseFileFieldImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileField()
	 * @generated
	 */
	int DATABASE_FILE_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__FACETS = FILE_FORMAT_FIELD__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__BASED = FILE_FORMAT_FIELD__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__CARDINALITY = FILE_FORMAT_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__CONSTANT = FILE_FORMAT_FIELD__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__DEFAULT = FILE_FORMAT_FIELD__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__DEFINITION = FILE_FORMAT_FIELD__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__INITIALIZED = FILE_FORMAT_FIELD__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__LIKE = FILE_FORMAT_FIELD__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__NAME = FILE_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__RESTRICTED = FILE_FORMAT_FIELD__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD__TEXT = FILE_FORMAT_FIELD__TEXT;

	/**
	 * The number of structural features of the '<em>Database File Field</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FIELD_FEATURE_COUNT = FILE_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__FACETS = QIntegratedLanguageDataTermPackage.DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__BASED = QIntegratedLanguageDataTermPackage.DATA_TERM__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__CARDINALITY = QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__CONSTANT = QIntegratedLanguageDataTermPackage.DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__DEFAULT = QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__DEFINITION = QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__INITIALIZED = QIntegratedLanguageDataTermPackage.DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__LIKE = QIntegratedLanguageDataTermPackage.DATA_TERM__LIKE;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.DisplayFileFieldImpl <em>Display File Field</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.DisplayFileFieldImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDisplayFileField()
	 * @generated
	 */
	int DISPLAY_FILE_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__NAME = QIntegratedLanguageDataTermPackage.DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__RESTRICTED = QIntegratedLanguageDataTermPackage.DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT__TEXT = QIntegratedLanguageDataTermPackage.DATA_TERM__TEXT;

	/**
	 * The number of structural features of the '<em>File Format</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_FEATURE_COUNT = QIntegratedLanguageDataTermPackage.DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.DatabaseFileFormatImpl <em>Database File Format</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.DatabaseFileFormatImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileFormat()
	 * @generated
	 */
	int DATABASE_FILE_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__FACETS = FILE_FORMAT__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__BASED = FILE_FORMAT__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__CARDINALITY = FILE_FORMAT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__CONSTANT = FILE_FORMAT__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__DEFAULT = FILE_FORMAT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__DEFINITION = FILE_FORMAT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__INITIALIZED = FILE_FORMAT__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__LIKE = FILE_FORMAT__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__NAME = FILE_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__RESTRICTED = FILE_FORMAT__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__TEXT = FILE_FORMAT__TEXT;

	/**
	 * The feature id for the '<em><b>Format Key</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT__FORMAT_KEY = FILE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database File Format</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT_FEATURE_COUNT = FILE_FORMAT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.DatabaseFileFormatDefImpl <em>Database File Format Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.DatabaseFileFormatDefImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileFormatDef()
	 * @generated
	 */
	int DATABASE_FILE_FORMAT_DEF = 3;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT_DEF__FORMULAS = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT_DEF__CLASS_DELEGATOR = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT_DEF__ELEMENTS = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT_DEF__PREFIX = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT_DEF__QUALIFIED = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED;

	/**
	 * The number of structural features of the '<em>Database File Format Def</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FILE_FORMAT_DEF_FEATURE_COUNT = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Display Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE__DISPLAY_FORMATS = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Display File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__FACETS = FILE_FORMAT_FIELD__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__BASED = FILE_FORMAT_FIELD__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__CARDINALITY = FILE_FORMAT_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__CONSTANT = FILE_FORMAT_FIELD__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__DEFAULT = FILE_FORMAT_FIELD__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__DEFINITION = FILE_FORMAT_FIELD__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__INITIALIZED = FILE_FORMAT_FIELD__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__LIKE = FILE_FORMAT_FIELD__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__NAME = FILE_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__RESTRICTED = FILE_FORMAT_FIELD__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD__TEXT = FILE_FORMAT_FIELD__TEXT;

	/**
	 * The number of structural features of the '<em>Display File Field</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FIELD_FEATURE_COUNT = FILE_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__FACETS = FILE_FORMAT__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__BASED = FILE_FORMAT__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__CARDINALITY = FILE_FORMAT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__CONSTANT = FILE_FORMAT__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__DEFAULT = FILE_FORMAT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__DEFINITION = FILE_FORMAT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__INITIALIZED = FILE_FORMAT__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__LIKE = FILE_FORMAT__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__NAME = FILE_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__RESTRICTED = FILE_FORMAT__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT__TEXT = FILE_FORMAT__TEXT;

	/**
	 * The number of structural features of the '<em>Display File Format</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT_FEATURE_COUNT = FILE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.DisplayFileFormatDefImpl <em>Display File Format Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.DisplayFileFormatDefImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDisplayFileFormatDef()
	 * @generated
	 */
	int DISPLAY_FILE_FORMAT_DEF = 7;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT_DEF__FORMULAS = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT_DEF__CLASS_DELEGATOR = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT_DEF__ELEMENTS = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT_DEF__PREFIX = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT_DEF__QUALIFIED = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED;

	/**
	 * The number of structural features of the '<em>Display File Format Def</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FILE_FORMAT_DEF_FEATURE_COUNT = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE__NAME = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE__FORMAT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE__RULE = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>External File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FILE_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.FileFormatKeyImpl <em>File Format Key</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.FileFormatKeyImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileFormatKey()
	 * @generated
	 */
	int FILE_FORMAT_KEY = 12;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_KEY__UNIQUE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_KEY__KEY_FIELDS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Format Key</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_KEY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.FileFormatKeyFieldImpl <em>File Format Key Field</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.FileFormatKeyFieldImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileFormatKeyField()
	 * @generated
	 */
	int FILE_FORMAT_KEY_FIELD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_KEY_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Descend</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_KEY_FIELD__DESCEND = 1;

	/**
	 * The number of structural features of the '<em>File Format Key Field</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FORMAT_KEY_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of structural features of the '<em>File Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__FILE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__ROWS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__TEXT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER__TYPE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>File Member</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>File Member Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW__SEQUENCE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW__DATE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW__CONTENT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Member</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW__FILE_MEMBER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File Member Row</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBER_ROW_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>File Membered</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MEMBERED_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.PrinterFileFormatImpl <em>Printer File Format</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.PrinterFileFormatImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPrinterFileFormat()
	 * @generated
	 */
	int PRINTER_FILE_FORMAT = 23;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.PrinterFileFormatDefImpl <em>Printer File Format Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.PrinterFileFormatDefImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPrinterFileFormatDef()
	 * @generated
	 */
	int PRINTER_FILE_FORMAT_DEF = 24;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.PrinterFileFieldImpl <em>Printer File Field</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.PrinterFileFieldImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPrinterFileField()
	 * @generated
	 */
	int PRINTER_FILE_FIELD = 25;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.file.impl.SourceFileImpl <em>Source File</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.file.impl.SourceFileImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 26;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.os.file.impl.FileOverrideImpl
	 * <em>File Override</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.os.file.impl.FileOverrideImpl
	 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileOverride()
	 * @generated
	 */
	int FILE_OVERRIDE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_OVERRIDE__NAME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File To</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_OVERRIDE__FILE_TO = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member To</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_OVERRIDE__MEMBER_TO = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File Override</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OVERRIDE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__APPLICATION = DATABASE_FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__LIBRARY = DATABASE_FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__NAME = DATABASE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__TEXT = DATABASE_FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__CREATION_INFO = DATABASE_FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Database Format</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__DATABASE_FORMAT = DATABASE_FILE__DATABASE_FORMAT;

	/**
	 * The feature id for the '<em><b>Creation Statement</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__CREATION_STATEMENT = DATABASE_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE__TABLES = DATABASE_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FILE_FEATURE_COUNT = DATABASE_FILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__APPLICATION = DATABASE_FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__LIBRARY = DATABASE_FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__NAME = DATABASE_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__TEXT = DATABASE_FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__CREATION_INFO = DATABASE_FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Database Format</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE__DATABASE_FORMAT = DATABASE_FILE__DATABASE_FORMAT;

	/**
	 * The number of structural features of the '<em>Physical File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FILE_FEATURE_COUNT = DATABASE_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Printer Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE__PRINTER_FORMATS = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Printer File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__FACETS = FILE_FORMAT__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__BASED = FILE_FORMAT__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__CARDINALITY = FILE_FORMAT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__CONSTANT = FILE_FORMAT__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__DEFAULT = FILE_FORMAT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__DEFINITION = FILE_FORMAT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__INITIALIZED = FILE_FORMAT__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__LIKE = FILE_FORMAT__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__NAME = FILE_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__RESTRICTED = FILE_FORMAT__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT__TEXT = FILE_FORMAT__TEXT;

	/**
	 * The number of structural features of the '<em>Printer File Format</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT_FEATURE_COUNT = FILE_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT_DEF__FORMULAS = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT_DEF__CLASS_DELEGATOR = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__CLASS_DELEGATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT_DEF__ELEMENTS = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT_DEF__PREFIX = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__PREFIX;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT_DEF__QUALIFIED = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF__QUALIFIED;

	/**
	 * The number of structural features of the '<em>Printer File Format Def</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FORMAT_DEF_FEATURE_COUNT = QIntegratedLanguageDataDefPackage.COMPOUND_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__FACETS = FILE_FORMAT_FIELD__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__BASED = FILE_FORMAT_FIELD__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__CARDINALITY = FILE_FORMAT_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__CONSTANT = FILE_FORMAT_FIELD__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__DEFAULT = FILE_FORMAT_FIELD__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__DEFINITION = FILE_FORMAT_FIELD__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__INITIALIZED = FILE_FORMAT_FIELD__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__LIKE = FILE_FORMAT_FIELD__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__NAME = FILE_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__RESTRICTED = FILE_FORMAT_FIELD__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD__TEXT = FILE_FORMAT_FIELD__TEXT;

	/**
	 * The number of structural features of the '<em>Printer File Field</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FILE_FIELD_FEATURE_COUNT = FILE_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__APPLICATION = FILE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__LIBRARY = FILE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__CREATION_INFO = FILE__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__FILE_TYPE = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QDatabaseFile <em>Database File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Database File</em>'.
	 * @see org.smeup.sys.os.file.QDatabaseFile
	 * @generated
	 */
	EClass getDatabaseFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.file.QDatabaseFile#getDatabaseFormat <em>Database Format</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database Format</em>'.
	 * @see org.smeup.sys.os.file.QDatabaseFile#getDatabaseFormat()
	 * @see #getDatabaseFile()
	 * @generated
	 */
	EReference getDatabaseFile_DatabaseFormat();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QDatabaseFileField
	 * <em>Database File Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Database File Field</em>'.
	 * @see org.smeup.sys.os.file.QDatabaseFileField
	 * @generated
	 */
	EClass getDatabaseFileField();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.file.QDatabaseFileFormat <em>Database File Format</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Database File Format</em>'.
	 * @see org.smeup.sys.os.file.QDatabaseFileFormat
	 * @generated
	 */
	EClass getDatabaseFileFormat();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.file.QDatabaseFileFormat#getFormatKey <em>Format Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format Key</em>'.
	 * @see org.smeup.sys.os.file.QDatabaseFileFormat#getFormatKey()
	 * @see #getDatabaseFileFormat()
	 * @generated
	 */
	EReference getDatabaseFileFormat_FormatKey();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.file.QDatabaseFileFormatDef <em>Database File Format Def</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Database File Format Def</em>'.
	 * @see org.smeup.sys.os.file.QDatabaseFileFormatDef
	 * @generated
	 */
	EClass getDatabaseFileFormatDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QDisplayFile <em>Display File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Display File</em>'.
	 * @see org.smeup.sys.os.file.QDisplayFile
	 * @generated
	 */
	EClass getDisplayFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.os.file.QDisplayFile#getDisplayFormats <em>Display Formats</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Formats</em>'.
	 * @see org.smeup.sys.os.file.QDisplayFile#getDisplayFormats()
	 * @see #getDisplayFile()
	 * @generated
	 */
	EReference getDisplayFile_DisplayFormats();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QDisplayFileField
	 * <em>Display File Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Display File Field</em>'.
	 * @see org.smeup.sys.os.file.QDisplayFileField
	 * @generated
	 */
	EClass getDisplayFileField();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QDisplayFileFormat
	 * <em>Display File Format</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Display File Format</em>'.
	 * @see org.smeup.sys.os.file.QDisplayFileFormat
	 * @generated
	 */
	EClass getDisplayFileFormat();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.file.QDisplayFileFormatDef <em>Display File Format Def</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Display File Format Def</em>'.
	 * @see org.smeup.sys.os.file.QDisplayFileFormatDef
	 * @generated
	 */
	EClass getDisplayFileFormatDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.file.QFile <em>File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.smeup.sys.os.file.QFile
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QFileFormat <em>File Format</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>File Format</em>'.
	 * @see org.smeup.sys.os.file.QFileFormat
	 * @generated
	 */
	EClass getFileFormat();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.file.QFileFormatField <em>File Format Field</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Format Field</em>'.
	 * @see org.smeup.sys.os.file.QFileFormatField
	 * @generated
	 */
	EClass getFileFormatField();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.file.QFileFormatKey <em>File Format Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Format Key</em>'.
	 * @see org.smeup.sys.os.file.QFileFormatKey
	 * @generated
	 */
	EClass getFileFormatKey();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.file.QFileFormatKey#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.smeup.sys.os.file.QFileFormatKey#isUnique()
	 * @see #getFileFormatKey()
	 * @generated
	 */
	EAttribute getFileFormatKey_Unique();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.os.file.QFileFormatKey#getKeyFields <em>Key Fields</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Fields</em>'.
	 * @see org.smeup.sys.os.file.QFileFormatKey#getKeyFields()
	 * @see #getFileFormatKey()
	 * @generated
	 */
	EReference getFileFormatKey_KeyFields();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.file.QFileFormatKeyField <em>File Format Key Field</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>File Format Key Field</em>'.
	 * @see org.smeup.sys.os.file.QFileFormatKeyField
	 * @generated
	 */
	EClass getFileFormatKeyField();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.file.QFileFormatKeyField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.file.QFileFormatKeyField#getName()
	 * @see #getFileFormatKeyField()
	 * @generated
	 */
	EAttribute getFileFormatKeyField_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.file.QFileFormatKeyField#isDescend <em>Descend</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descend</em>'.
	 * @see org.smeup.sys.os.file.QFileFormatKeyField#isDescend()
	 * @see #getFileFormatKeyField()
	 * @generated
	 */
	EAttribute getFileFormatKeyField_Descend();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QFileManager <em>File Manager</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>File Manager</em>'.
	 * @see org.smeup.sys.os.file.QFileManager
	 * @generated
	 */
	EClass getFileManager();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QFileMember <em>File Member</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>File Member</em>'.
	 * @see org.smeup.sys.os.file.QFileMember
	 * @generated
	 */
	EClass getFileMember();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.smeup.sys.os.file.QFileMember#getFile <em>File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see org.smeup.sys.os.file.QFileMember#getFile()
	 * @see #getFileMember()
	 * @generated
	 */
	EReference getFileMember_File();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.file.QFileMember#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.file.QFileMember#getName()
	 * @see #getFileMember()
	 * @generated
	 */
	EAttribute getFileMember_Name();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.smeup.sys.os.file.QFileMember#getRows <em>Rows</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Rows</em>
	 *         '.
	 * @see org.smeup.sys.os.file.QFileMember#getRows()
	 * @see #getFileMember()
	 * @generated
	 */
	EReference getFileMember_Rows();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.file.QFileMember#getText <em>Text</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.smeup.sys.os.file.QFileMember#getText()
	 * @see #getFileMember()
	 * @generated
	 */
	EAttribute getFileMember_Text();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.file.QFileMember#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.os.file.QFileMember#getType()
	 * @see #getFileMember()
	 * @generated
	 */
	EAttribute getFileMember_Type();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QFileMemberManager
	 * <em>File Member Manager</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>File Member Manager</em>'.
	 * @see org.smeup.sys.os.file.QFileMemberManager
	 * @generated
	 */
	EClass getFileMemberManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.file.QFileMemberRow <em>File Member Row</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Member Row</em>'.
	 * @see org.smeup.sys.os.file.QFileMemberRow
	 * @generated
	 */
	EClass getFileMemberRow();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.file.QFileMemberRow#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.smeup.sys.os.file.QFileMemberRow#getSequence()
	 * @see #getFileMemberRow()
	 * @generated
	 */
	EAttribute getFileMemberRow_Sequence();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.file.QFileMemberRow#getDate <em>Date</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.smeup.sys.os.file.QFileMemberRow#getDate()
	 * @see #getFileMemberRow()
	 * @generated
	 */
	EAttribute getFileMemberRow_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.file.QFileMemberRow#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.smeup.sys.os.file.QFileMemberRow#getContent()
	 * @see #getFileMemberRow()
	 * @generated
	 */
	EAttribute getFileMemberRow_Content();

	/**
	 * Returns the meta object for the container reference '{@link org.smeup.sys.os.file.QFileMemberRow#getFileMember <em>File Member</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>File Member</em>'.
	 * @see org.smeup.sys.os.file.QFileMemberRow#getFileMember()
	 * @see #getFileMemberRow()
	 * @generated
	 */
	EReference getFileMemberRow_FileMember();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QFileMembered <em>File Membered</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>File Membered</em>'.
	 * @see org.smeup.sys.os.file.QFileMembered
	 * @generated
	 */
	EClass getFileMembered();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QLogicalFile <em>Logical File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Logical File</em>'.
	 * @see org.smeup.sys.os.file.QLogicalFile
	 * @generated
	 */
	EClass getLogicalFile();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.file.QLogicalFile#getCreationStatement
	 * <em>Creation Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the attribute '<em>Creation Statement</em>'.
	 * @see org.smeup.sys.os.file.QLogicalFile#getCreationStatement()
	 * @see #getLogicalFile()
	 * @generated
	 */
	EAttribute getLogicalFile_CreationStatement();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.os.file.QLogicalFile#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tables</em>'.
	 * @see org.smeup.sys.os.file.QLogicalFile#getTables()
	 * @see #getLogicalFile()
	 * @generated
	 */
	EAttribute getLogicalFile_Tables();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QPhysicalFile <em>Physical File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Physical File</em>'.
	 * @see org.smeup.sys.os.file.QPhysicalFile
	 * @generated
	 */
	EClass getPhysicalFile();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QPrinterFile <em>Printer File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Printer File</em>'.
	 * @see org.smeup.sys.os.file.QPrinterFile
	 * @generated
	 */
	EClass getPrinterFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.os.file.QPrinterFile#getPrinterFormats <em>Printer Formats</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Printer Formats</em>'.
	 * @see org.smeup.sys.os.file.QPrinterFile#getPrinterFormats()
	 * @see #getPrinterFile()
	 * @generated
	 */
	EReference getPrinterFile_PrinterFormats();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QPrinterFileFormat
	 * <em>Printer File Format</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Printer File Format</em>'.
	 * @see org.smeup.sys.os.file.QPrinterFileFormat
	 * @generated
	 */
	EClass getPrinterFileFormat();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.file.QPrinterFileFormatDef <em>Printer File Format Def</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Printer File Format Def</em>'.
	 * @see org.smeup.sys.os.file.QPrinterFileFormatDef
	 * @generated
	 */
	EClass getPrinterFileFormatDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QPrinterFileField
	 * <em>Printer File Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Printer File Field</em>'.
	 * @see org.smeup.sys.os.file.QPrinterFileField
	 * @generated
	 */
	EClass getPrinterFileField();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QSourceFile <em>Source File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see org.smeup.sys.os.file.QSourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.file.QSourceFile#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Type</em>'.
	 * @see org.smeup.sys.os.file.QSourceFile#getFileType()
	 * @see #getSourceFile()
	 * @generated
	 */
	EAttribute getSourceFile_FileType();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QFileOverride <em>File Override</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>File Override</em>'.
	 * @see org.smeup.sys.os.file.QFileOverride
	 * @generated
	 */
	EClass getFileOverride();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.file.QFileOverride#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.file.QFileOverride#getName()
	 * @see #getFileOverride()
	 * @generated
	 */
	EAttribute getFileOverride_Name();

	/**
	 * Returns the meta object for the reference '{@link org.smeup.sys.os.file.QFileOverride#getFileTo <em>File To</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File To</em>'.
	 * @see org.smeup.sys.os.file.QFileOverride#getFileTo()
	 * @see #getFileOverride()
	 * @generated
	 */
	EReference getFileOverride_FileTo();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.file.QFileOverride#getMemberTo <em>Member To</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member To</em>'.
	 * @see org.smeup.sys.os.file.QFileOverride#getMemberTo()
	 * @see #getFileOverride()
	 * @generated
	 */
	EAttribute getFileOverride_MemberTo();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.file.QExternalFile <em>External File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>External File</em>'.
	 * @see org.smeup.sys.os.file.QExternalFile
	 * @generated
	 */
	EClass getExternalFile();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.file.QExternalFile#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.file.QExternalFile#getName()
	 * @see #getExternalFile()
	 * @generated
	 */
	EAttribute getExternalFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.file.QExternalFile#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.smeup.sys.os.file.QExternalFile#getFormat()
	 * @see #getExternalFile()
	 * @generated
	 */
	EAttribute getExternalFile_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.file.QExternalFile#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see org.smeup.sys.os.file.QExternalFile#getRule()
	 * @see #getExternalFile()
	 * @generated
	 */
	EAttribute getExternalFile_Rule();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemFileFactory getOperatingSystemFileFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.DatabaseFileImpl <em>Database File</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.DatabaseFileImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDatabaseFile()
		 * @generated
		 */
		EClass DATABASE_FILE = eINSTANCE.getDatabaseFile();

		/**
		 * The meta object literal for the '<em><b>Database Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_FILE__DATABASE_FORMAT = eINSTANCE.getDatabaseFile_DatabaseFormat();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.DatabaseFileFieldImpl <em>Database File Field</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.DatabaseFileFieldImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileField()
		 * @generated
		 */
		EClass DATABASE_FILE_FIELD = eINSTANCE.getDatabaseFileField();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.DatabaseFileFormatImpl <em>Database File Format</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.DatabaseFileFormatImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileFormat()
		 * @generated
		 */
		EClass DATABASE_FILE_FORMAT = eINSTANCE.getDatabaseFileFormat();

		/**
		 * The meta object literal for the '<em><b>Format Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_FILE_FORMAT__FORMAT_KEY = eINSTANCE.getDatabaseFileFormat_FormatKey();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.DatabaseFileFormatDefImpl <em>Database File Format Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.DatabaseFileFormatDefImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDatabaseFileFormatDef()
		 * @generated
		 */
		EClass DATABASE_FILE_FORMAT_DEF = eINSTANCE.getDatabaseFileFormatDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.DisplayFileImpl <em>Display File</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.DisplayFileImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDisplayFile()
		 * @generated
		 */
		EClass DISPLAY_FILE = eINSTANCE.getDisplayFile();

		/**
		 * The meta object literal for the '<em><b>Display Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_FILE__DISPLAY_FORMATS = eINSTANCE.getDisplayFile_DisplayFormats();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.DisplayFileFieldImpl <em>Display File Field</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.DisplayFileFieldImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDisplayFileField()
		 * @generated
		 */
		EClass DISPLAY_FILE_FIELD = eINSTANCE.getDisplayFileField();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.DisplayFileFormatImpl <em>Display File Format</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.DisplayFileFormatImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDisplayFileFormat()
		 * @generated
		 */
		EClass DISPLAY_FILE_FORMAT = eINSTANCE.getDisplayFileFormat();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.DisplayFileFormatDefImpl <em>Display File Format Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.DisplayFileFormatDefImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getDisplayFileFormatDef()
		 * @generated
		 */
		EClass DISPLAY_FILE_FORMAT_DEF = eINSTANCE.getDisplayFileFormatDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.FileImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.FileFormatImpl <em>File Format</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.FileFormatImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileFormat()
		 * @generated
		 */
		EClass FILE_FORMAT = eINSTANCE.getFileFormat();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.FileFormatFieldImpl <em>File Format Field</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.FileFormatFieldImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileFormatField()
		 * @generated
		 */
		EClass FILE_FORMAT_FIELD = eINSTANCE.getFileFormatField();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.FileFormatKeyImpl <em>File Format Key</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.FileFormatKeyImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileFormatKey()
		 * @generated
		 */
		EClass FILE_FORMAT_KEY = eINSTANCE.getFileFormatKey();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_FORMAT_KEY__UNIQUE = eINSTANCE.getFileFormatKey_Unique();

		/**
		 * The meta object literal for the '<em><b>Key Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILE_FORMAT_KEY__KEY_FIELDS = eINSTANCE.getFileFormatKey_KeyFields();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.FileFormatKeyFieldImpl <em>File Format Key Field</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.FileFormatKeyFieldImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileFormatKeyField()
		 * @generated
		 */
		EClass FILE_FORMAT_KEY_FIELD = eINSTANCE.getFileFormatKeyField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_FORMAT_KEY_FIELD__NAME = eINSTANCE.getFileFormatKeyField_Name();

		/**
		 * The meta object literal for the '<em><b>Descend</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_FORMAT_KEY_FIELD__DESCEND = eINSTANCE.getFileFormatKeyField_Descend();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.QFileManager <em>File Manager</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.file.QFileManager
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileManager()
		 * @generated
		 */
		EClass FILE_MANAGER = eINSTANCE.getFileManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.FileMemberImpl <em>File Member</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.FileMemberImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileMember()
		 * @generated
		 */
		EClass FILE_MEMBER = eINSTANCE.getFileMember();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_MEMBER__FILE = eINSTANCE.getFileMember_File();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER__NAME = eINSTANCE.getFileMember_Name();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_MEMBER__ROWS = eINSTANCE.getFileMember_Rows();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER__TEXT = eINSTANCE.getFileMember_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER__TYPE = eINSTANCE.getFileMember_Type();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.QFileMemberManager <em>File Member Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.QFileMemberManager
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileMemberManager()
		 * @generated
		 */
		EClass FILE_MEMBER_MANAGER = eINSTANCE.getFileMemberManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.FileMemberRowImpl <em>File Member Row</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.FileMemberRowImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileMemberRow()
		 * @generated
		 */
		EClass FILE_MEMBER_ROW = eINSTANCE.getFileMemberRow();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER_ROW__SEQUENCE = eINSTANCE.getFileMemberRow_Sequence();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER_ROW__DATE = eINSTANCE.getFileMemberRow_Date();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MEMBER_ROW__CONTENT = eINSTANCE.getFileMemberRow_Content();

		/**
		 * The meta object literal for the '<em><b>File Member</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FILE_MEMBER_ROW__FILE_MEMBER = eINSTANCE.getFileMemberRow_FileMember();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.QFileMembered <em>File Membered</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.os.file.QFileMembered
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileMembered()
		 * @generated
		 */
		EClass FILE_MEMBERED = eINSTANCE.getFileMembered();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.LogicalFileImpl <em>Logical File</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.LogicalFileImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getLogicalFile()
		 * @generated
		 */
		EClass LOGICAL_FILE = eINSTANCE.getLogicalFile();

		/**
		 * The meta object literal for the '<em><b>Creation Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_FILE__CREATION_STATEMENT = eINSTANCE.getLogicalFile_CreationStatement();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_FILE__TABLES = eINSTANCE.getLogicalFile_Tables();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.PhysicalFileImpl <em>Physical File</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.PhysicalFileImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPhysicalFile()
		 * @generated
		 */
		EClass PHYSICAL_FILE = eINSTANCE.getPhysicalFile();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.PrinterFileImpl <em>Printer File</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.PrinterFileImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPrinterFile()
		 * @generated
		 */
		EClass PRINTER_FILE = eINSTANCE.getPrinterFile();

		/**
		 * The meta object literal for the '<em><b>Printer Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PRINTER_FILE__PRINTER_FORMATS = eINSTANCE.getPrinterFile_PrinterFormats();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.PrinterFileFormatImpl <em>Printer File Format</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.PrinterFileFormatImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPrinterFileFormat()
		 * @generated
		 */
		EClass PRINTER_FILE_FORMAT = eINSTANCE.getPrinterFileFormat();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.PrinterFileFormatDefImpl <em>Printer File Format Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.PrinterFileFormatDefImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPrinterFileFormatDef()
		 * @generated
		 */
		EClass PRINTER_FILE_FORMAT_DEF = eINSTANCE.getPrinterFileFormatDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.PrinterFileFieldImpl <em>Printer File Field</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.PrinterFileFieldImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getPrinterFileField()
		 * @generated
		 */
		EClass PRINTER_FILE_FIELD = eINSTANCE.getPrinterFileField();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.SourceFileImpl <em>Source File</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.SourceFileImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '<em><b>File Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE__FILE_TYPE = eINSTANCE.getSourceFile_FileType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.FileOverrideImpl <em>File Override</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.FileOverrideImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getFileOverride()
		 * @generated
		 */
		EClass FILE_OVERRIDE = eINSTANCE.getFileOverride();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_OVERRIDE__NAME = eINSTANCE.getFileOverride_Name();

		/**
		 * The meta object literal for the '<em><b>File To</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_OVERRIDE__FILE_TO = eINSTANCE.getFileOverride_FileTo();

		/**
		 * The meta object literal for the '<em><b>Member To</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_OVERRIDE__MEMBER_TO = eINSTANCE.getFileOverride_MemberTo();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.file.impl.ExternalFileImpl <em>External File</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.file.impl.ExternalFileImpl
		 * @see org.smeup.sys.os.file.impl.OperatingSystemFilePackageImpl#getExternalFile()
		 * @generated
		 */
		EClass EXTERNAL_FILE = eINSTANCE.getExternalFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FILE__NAME = eINSTANCE.getExternalFile_Name();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FILE__FORMAT = eINSTANCE.getExternalFile_Format();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FILE__RULE = eINSTANCE.getExternalFile_Rule();

	}

} // OSFileCorePackage
