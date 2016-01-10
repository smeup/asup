/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFileFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemMessageFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "msgf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/msgf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-msgf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemMessageFilePackage eINSTANCE = org.smeup.sys.os.msgf.impl.OperatingSystemMessageFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.msgf.impl.MessageDescriptionImpl <em>Message Description</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.msgf.impl.MessageDescriptionImpl
	 * @see org.smeup.sys.os.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageDescription()
	 * @generated
	 */
	int MESSAGE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__SEVERITY = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Help</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__MESSAGE_HELP = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__MESSAGE_TEXT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message Data Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Message Description</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESCRIPTION_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.msgf.impl.MessageDataFieldImpl <em>Message Data Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.msgf.impl.MessageDataFieldImpl
	 * @see org.smeup.sys.os.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageDataField()
	 * @generated
	 */
	int MESSAGE_DATA_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__FACETS = QIntegratedLanguageDataTermPackage.DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__BASED = QIntegratedLanguageDataTermPackage.DATA_TERM__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__CARDINALITY = QIntegratedLanguageDataTermPackage.DATA_TERM__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__CONSTANT = QIntegratedLanguageDataTermPackage.DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__DEFAULT = QIntegratedLanguageDataTermPackage.DATA_TERM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__DEFINITION = QIntegratedLanguageDataTermPackage.DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__INITIALIZED = QIntegratedLanguageDataTermPackage.DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__LIKE = QIntegratedLanguageDataTermPackage.DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__NAME = QIntegratedLanguageDataTermPackage.DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__RESTRICTED = QIntegratedLanguageDataTermPackage.DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__TEXT = QIntegratedLanguageDataTermPackage.DATA_TERM__TEXT;

	/**
	 * The feature id for the '<em><b>Output Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD__OUTPUT_MASK = QIntegratedLanguageDataTermPackage.DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FIELD_FEATURE_COUNT = QIntegratedLanguageDataTermPackage.DATA_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.msgf.impl.MessageFileImpl <em>Message File</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.os.msgf.impl.MessageFileImpl
	 * @see org.smeup.sys.os.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageFile()
	 * @generated
	 */
	int MESSAGE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__APPLICATION = QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__FACETS = QOperatingSystemTypePackage.TYPED_OBJECT__FACETS;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__LIBRARY = QOperatingSystemTypePackage.TYPED_OBJECT__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__NAME = QOperatingSystemTypePackage.TYPED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__TEXT = QOperatingSystemTypePackage.TYPED_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__CREATION_INFO = QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE__MESSAGES = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_FEATURE_COUNT = QOperatingSystemTypePackage.TYPED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.msgf.QMessageFileManager <em>Message File Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.msgf.QMessageFileManager
	 * @see org.smeup.sys.os.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageFileManager()
	 * @generated
	 */
	int MESSAGE_FILE_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Message File Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FILE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.msgf.QMessageDescription
	 * <em>Message Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Message Description</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageDescription
	 * @generated
	 */
	EClass getMessageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.msgf.QMessageDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageDescription#getName()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.msgf.QMessageDescription#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageDescription#getSeverity()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.msgf.QMessageDescription#getMessageHelp <em>Message Help</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Help</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageDescription#getMessageHelp()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_MessageHelp();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.msgf.QMessageDescription#getMessageText <em>Message Text</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Text</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageDescription#getMessageText()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EAttribute getMessageDescription_MessageText();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.smeup.sys.os.msgf.QMessageDescription#getMessageDataFields
	 * <em>Message Data Fields</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for the containment reference list '
	 *         <em>Message Data Fields</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageDescription#getMessageDataFields()
	 * @see #getMessageDescription()
	 * @generated
	 */
	EReference getMessageDescription_MessageDataFields();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.msgf.QMessageDataField <em>Message Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Data Field</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageDataField
	 * @generated
	 */
	EClass getMessageDataField();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.msgf.QMessageDataField#getOutputMask <em>Output Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Mask</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageDataField#getOutputMask()
	 * @see #getMessageDataField()
	 * @generated
	 */
	EAttribute getMessageDataField_OutputMask();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.os.msgf.QMessageFile <em>Message File</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Message File</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageFile
	 * @generated
	 */
	EClass getMessageFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.os.msgf.QMessageFile#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageFile#getMessages()
	 * @see #getMessageFile()
	 * @generated
	 */
	EReference getMessageFile_Messages();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.msgf.QMessageFileManager <em>Message File Manager</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Message File Manager</em>'.
	 * @see org.smeup.sys.os.msgf.QMessageFileManager
	 * @generated
	 */
	EClass getMessageFileManager();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemMessageFileFactory getOperatingSystemMessageFileFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.msgf.impl.MessageDescriptionImpl <em>Message Description</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.msgf.impl.MessageDescriptionImpl
		 * @see org.smeup.sys.os.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageDescription()
		 * @generated
		 */
		EClass MESSAGE_DESCRIPTION = eINSTANCE.getMessageDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__NAME = eINSTANCE.getMessageDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__SEVERITY = eINSTANCE.getMessageDescription_Severity();

		/**
		 * The meta object literal for the '<em><b>Message Help</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__MESSAGE_HELP = eINSTANCE.getMessageDescription_MessageHelp();

		/**
		 * The meta object literal for the '<em><b>Message Text</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESCRIPTION__MESSAGE_TEXT = eINSTANCE.getMessageDescription_MessageText();

		/**
		 * The meta object literal for the '<em><b>Message Data Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS = eINSTANCE.getMessageDescription_MessageDataFields();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.msgf.impl.MessageDataFieldImpl <em>Message Data Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.msgf.impl.MessageDataFieldImpl
		 * @see org.smeup.sys.os.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageDataField()
		 * @generated
		 */
		EClass MESSAGE_DATA_FIELD = eINSTANCE.getMessageDataField();

		/**
		 * The meta object literal for the '<em><b>Output Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DATA_FIELD__OUTPUT_MASK = eINSTANCE.getMessageDataField_OutputMask();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.msgf.impl.MessageFileImpl <em>Message File</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.msgf.impl.MessageFileImpl
		 * @see org.smeup.sys.os.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageFile()
		 * @generated
		 */
		EClass MESSAGE_FILE = eINSTANCE.getMessageFile();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FILE__MESSAGES = eINSTANCE.getMessageFile_Messages();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.msgf.QMessageFileManager <em>Message File Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.msgf.QMessageFileManager
		 * @see org.smeup.sys.os.msgf.impl.OperatingSystemMessageFilePackageImpl#getMessageFileManager()
		 * @generated
		 */
		EClass MESSAGE_FILE_MANAGER = eINSTANCE.getMessageFileManager();

	}

} // QOperatingSystemMessageFilePackage
