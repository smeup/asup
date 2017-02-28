/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;
import org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDatabaseFileField;
import org.smeup.sys.os.file.QDatabaseFileFormat;
import org.smeup.sys.os.file.QDatabaseFileFormatDef;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QDisplayFileField;
import org.smeup.sys.os.file.QDisplayFileFormat;
import org.smeup.sys.os.file.QDisplayFileFormatDef;
import org.smeup.sys.os.file.QExternalFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileFormat;
import org.smeup.sys.os.file.QFileFormatField;
import org.smeup.sys.os.file.QFileFormatKey;
import org.smeup.sys.os.file.QFileFormatKeyField;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMemberRow;
import org.smeup.sys.os.file.QFileMembered;
import org.smeup.sys.os.file.QFileOverride;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QOperatingSystemFileFactory;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.QPrinterFileField;
import org.smeup.sys.os.file.QPrinterFileFormat;
import org.smeup.sys.os.file.QPrinterFileFormatDef;
import org.smeup.sys.os.file.QSourceFile;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemFilePackageImpl extends EPackageImpl implements QOperatingSystemFilePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseFileEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseFileFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseFileFormatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseFileFormatDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayFileEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayFileFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayFileFormatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayFileFormatDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileFormatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileFormatFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileFormatKeyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileFormatKeyFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileMemberEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileMemberManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileMemberRowEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileMemberedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalFileEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalFileEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerFileEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerFileFormatEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerFileFormatDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerFileFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileOverrideEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalFileEClass = null;

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
	 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatingSystemFilePackageImpl() {
		super(eNS_URI, QOperatingSystemFileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QOperatingSystemFilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QOperatingSystemFilePackage init() {
		if (isInited) return (QOperatingSystemFilePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemFilePackage.eNS_URI);

		// Obtain or create and register package
		OperatingSystemFilePackageImpl theOperatingSystemFilePackage = (OperatingSystemFilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatingSystemFilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatingSystemFilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageMemoryPackage.eINSTANCE.eClass();
		QOperatingSystemTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOperatingSystemFilePackage.createPackageContents();

		// Initialize created meta-data
		theOperatingSystemFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperatingSystemFilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QOperatingSystemFilePackage.eNS_URI, theOperatingSystemFilePackage);
		return theOperatingSystemFilePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseFile() {
		return databaseFileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseFile_DatabaseFormat() {
		return (EReference)databaseFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseFileField() {
		return databaseFileFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseFileFormat() {
		return databaseFileFormatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseFileFormat_FormatKey() {
		return (EReference)databaseFileFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseFileFormatDef() {
		return databaseFileFormatDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisplayFile() {
		return displayFileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplayFile_DisplayFormats() {
		return (EReference)displayFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisplayFileField() {
		return displayFileFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisplayFileFormat() {
		return displayFileFormatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisplayFileFormatDef() {
		return displayFileFormatDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileFormat() {
		return fileFormatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileFormatField() {
		return fileFormatFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileFormatKey() {
		return fileFormatKeyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileFormatKey_Unique() {
		return (EAttribute)fileFormatKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFileFormatKey_KeyFields() {
		return (EReference)fileFormatKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileFormatKeyField() {
		return fileFormatKeyFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileFormatKeyField_Name() {
		return (EAttribute)fileFormatKeyFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileFormatKeyField_Descend() {
		return (EAttribute)fileFormatKeyFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileManager() {
		return fileManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileMember() {
		return fileMemberEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFileMember_File() {
		return (EReference)fileMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileMember_Name() {
		return (EAttribute)fileMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFileMember_Rows() {
		return (EReference)fileMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileMember_Text() {
		return (EAttribute)fileMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileMember_Type() {
		return (EAttribute)fileMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileMemberManager() {
		return fileMemberManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileMemberRow() {
		return fileMemberRowEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileMemberRow_Sequence() {
		return (EAttribute)fileMemberRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileMemberRow_Date() {
		return (EAttribute)fileMemberRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileMemberRow_Content() {
		return (EAttribute)fileMemberRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFileMemberRow_FileMember() {
		return (EReference)fileMemberRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileMembered() {
		return fileMemberedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalFile() {
		return logicalFileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalFile_CreationStatement() {
		return (EAttribute)logicalFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalFile_Tables() {
		return (EAttribute)logicalFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalFile() {
		return physicalFileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrinterFile() {
		return printerFileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrinterFile_PrinterFormats() {
		return (EReference)printerFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrinterFileFormat() {
		return printerFileFormatEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrinterFileFormatDef() {
		return printerFileFormatDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrinterFileField() {
		return printerFileFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceFile() {
		return sourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFile_FileType() {
		return (EAttribute)sourceFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileOverride() {
		return fileOverrideEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileOverride_Name() {
		return (EAttribute)fileOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFileOverride_FileTo() {
		return (EReference)fileOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileOverride_MemberTo() {
		return (EAttribute)fileOverrideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalFile() {
		return externalFileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalFile_Name() {
		return (EAttribute)externalFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalFile_Format() {
		return (EAttribute)externalFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFile_Rule() {
		return (EAttribute)externalFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemFileFactory getOperatingSystemFileFactory() {
		return (QOperatingSystemFileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		databaseFileEClass = createEClass(DATABASE_FILE);
		createEReference(databaseFileEClass, DATABASE_FILE__DATABASE_FORMAT);

		databaseFileFieldEClass = createEClass(DATABASE_FILE_FIELD);

		databaseFileFormatEClass = createEClass(DATABASE_FILE_FORMAT);
		createEReference(databaseFileFormatEClass, DATABASE_FILE_FORMAT__FORMAT_KEY);

		databaseFileFormatDefEClass = createEClass(DATABASE_FILE_FORMAT_DEF);

		displayFileEClass = createEClass(DISPLAY_FILE);
		createEReference(displayFileEClass, DISPLAY_FILE__DISPLAY_FORMATS);

		displayFileFieldEClass = createEClass(DISPLAY_FILE_FIELD);

		displayFileFormatEClass = createEClass(DISPLAY_FILE_FORMAT);

		displayFileFormatDefEClass = createEClass(DISPLAY_FILE_FORMAT_DEF);

		externalFileEClass = createEClass(EXTERNAL_FILE);
		createEAttribute(externalFileEClass, EXTERNAL_FILE__NAME);
		createEAttribute(externalFileEClass, EXTERNAL_FILE__FORMAT);
		createEAttribute(externalFileEClass, EXTERNAL_FILE__RULE);

		fileEClass = createEClass(FILE);

		fileFormatEClass = createEClass(FILE_FORMAT);

		fileFormatFieldEClass = createEClass(FILE_FORMAT_FIELD);

		fileFormatKeyEClass = createEClass(FILE_FORMAT_KEY);
		createEAttribute(fileFormatKeyEClass, FILE_FORMAT_KEY__UNIQUE);
		createEReference(fileFormatKeyEClass, FILE_FORMAT_KEY__KEY_FIELDS);

		fileFormatKeyFieldEClass = createEClass(FILE_FORMAT_KEY_FIELD);
		createEAttribute(fileFormatKeyFieldEClass, FILE_FORMAT_KEY_FIELD__NAME);
		createEAttribute(fileFormatKeyFieldEClass, FILE_FORMAT_KEY_FIELD__DESCEND);

		fileManagerEClass = createEClass(FILE_MANAGER);

		fileMemberEClass = createEClass(FILE_MEMBER);
		createEReference(fileMemberEClass, FILE_MEMBER__FILE);
		createEAttribute(fileMemberEClass, FILE_MEMBER__NAME);
		createEReference(fileMemberEClass, FILE_MEMBER__ROWS);
		createEAttribute(fileMemberEClass, FILE_MEMBER__TEXT);
		createEAttribute(fileMemberEClass, FILE_MEMBER__TYPE);

		fileMemberManagerEClass = createEClass(FILE_MEMBER_MANAGER);

		fileMemberRowEClass = createEClass(FILE_MEMBER_ROW);
		createEAttribute(fileMemberRowEClass, FILE_MEMBER_ROW__SEQUENCE);
		createEAttribute(fileMemberRowEClass, FILE_MEMBER_ROW__DATE);
		createEAttribute(fileMemberRowEClass, FILE_MEMBER_ROW__CONTENT);
		createEReference(fileMemberRowEClass, FILE_MEMBER_ROW__FILE_MEMBER);

		fileMemberedEClass = createEClass(FILE_MEMBERED);

		fileOverrideEClass = createEClass(FILE_OVERRIDE);
		createEAttribute(fileOverrideEClass, FILE_OVERRIDE__NAME);
		createEReference(fileOverrideEClass, FILE_OVERRIDE__FILE_TO);
		createEAttribute(fileOverrideEClass, FILE_OVERRIDE__MEMBER_TO);

		logicalFileEClass = createEClass(LOGICAL_FILE);
		createEAttribute(logicalFileEClass, LOGICAL_FILE__CREATION_STATEMENT);
		createEAttribute(logicalFileEClass, LOGICAL_FILE__TABLES);

		physicalFileEClass = createEClass(PHYSICAL_FILE);

		printerFileEClass = createEClass(PRINTER_FILE);
		createEReference(printerFileEClass, PRINTER_FILE__PRINTER_FORMATS);

		printerFileFormatEClass = createEClass(PRINTER_FILE_FORMAT);

		printerFileFormatDefEClass = createEClass(PRINTER_FILE_FORMAT_DEF);

		printerFileFieldEClass = createEClass(PRINTER_FILE_FIELD);

		sourceFileEClass = createEClass(SOURCE_FILE);
		createEAttribute(sourceFileEClass, SOURCE_FILE__FILE_TYPE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QIntegratedLanguageDataDefPackage theIntegratedLanguageDataDefPackage = (QIntegratedLanguageDataDefPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI);
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);
		QIntegratedLanguageCoreMetaPackage theIntegratedLanguageCoreMetaPackage = (QIntegratedLanguageCoreMetaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI);
		QOperatingSystemTypePackage theOperatingSystemTypePackage = (QOperatingSystemTypePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemTypePackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);
		QIntegratedLanguageDataTermPackage theIntegratedLanguageDataTermPackage = (QIntegratedLanguageDataTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QIntegratedLanguageMemoryPackage theIntegratedLanguageMemoryPackage = (QIntegratedLanguageMemoryPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageMemoryPackage.eNS_URI);

		// Create type parameters
		ETypeParameter fileFormatEClass_DD = addETypeParameter(fileFormatEClass, "DD");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getCompoundDataDef());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		fileFormatEClass_DD.getEBounds().add(g1);

		// Add supertypes to classes
		databaseFileEClass.getESuperTypes().add(this.getFile());
		databaseFileFieldEClass.getESuperTypes().add(this.getFileFormatField());
		g1 = createEGenericType(this.getFileFormat());
		g2 = createEGenericType(this.getDatabaseFileFormatDef());
		g1.getETypeArguments().add(g2);
		databaseFileFormatEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getCompoundDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getRecord());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getDatabaseFileField());
		g1.getETypeArguments().add(g2);
		databaseFileFormatDefEClass.getEGenericSuperTypes().add(g1);
		displayFileEClass.getESuperTypes().add(this.getFile());
		displayFileFieldEClass.getESuperTypes().add(this.getFileFormatField());
		g1 = createEGenericType(this.getFileFormat());
		g2 = createEGenericType(this.getDisplayFileFormatDef());
		g1.getETypeArguments().add(g2);
		displayFileFormatEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getCompoundDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getRecord());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getDisplayFileField());
		g1.getETypeArguments().add(g2);
		displayFileFormatDefEClass.getEGenericSuperTypes().add(g1);
		externalFileEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		fileEClass.getESuperTypes().add(theOperatingSystemTypePackage.getTypedObject());
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType(fileFormatEClass_DD);
		g1.getETypeArguments().add(g2);
		fileFormatEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType(theIntegratedLanguageDataDefPackage.getUnaryAtomicBufferedDataDef());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		fileFormatFieldEClass.getEGenericSuperTypes().add(g1);
		fileFormatKeyEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		fileMemberEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObjectNameable());
		fileMemberRowEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		fileMemberedEClass.getESuperTypes().add(this.getFile());
		fileOverrideEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		logicalFileEClass.getESuperTypes().add(this.getDatabaseFile());
		physicalFileEClass.getESuperTypes().add(this.getDatabaseFile());
		printerFileEClass.getESuperTypes().add(this.getFile());
		g1 = createEGenericType(this.getFileFormat());
		g2 = createEGenericType(this.getPrinterFileFormatDef());
		g1.getETypeArguments().add(g2);
		printerFileFormatEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getCompoundDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getRecord());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getPrinterFileField());
		g1.getETypeArguments().add(g2);
		printerFileFormatDefEClass.getEGenericSuperTypes().add(g1);
		printerFileFieldEClass.getESuperTypes().add(this.getFileFormatField());
		sourceFileEClass.getESuperTypes().add(this.getFileMembered());

		// Initialize classes and features; add operations and parameters
		initEClass(databaseFileEClass, QDatabaseFile.class, "DatabaseFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseFile_DatabaseFormat(), this.getDatabaseFileFormat(), null, "databaseFormat", null, 0, 1, QDatabaseFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseFileFieldEClass, QDatabaseFileField.class, "DatabaseFileField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseFileFormatEClass, QDatabaseFileFormat.class, "DatabaseFileFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseFileFormat_FormatKey(), this.getFileFormatKey(), null, "formatKey", null, 0, 1, QDatabaseFileFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(databaseFileFormatEClass, ecorePackage.getEBoolean(), "isEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseFileFormatDefEClass, QDatabaseFileFormatDef.class, "DatabaseFileFormatDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayFileEClass, QDisplayFile.class, "DisplayFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayFile_DisplayFormats(), this.getDisplayFileFormat(), null, "displayFormats", null, 0, -1, QDisplayFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayFileFieldEClass, QDisplayFileField.class, "DisplayFileField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayFileFormatEClass, QDisplayFileFormat.class, "DisplayFileFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayFileFormatDefEClass, QDisplayFileFormatDef.class, "DisplayFileFormatDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalFileEClass, QExternalFile.class, "ExternalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalFile_Name(), ecorePackage.getEString(), "name", null, 1, 1, QExternalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFile_Format(), ecorePackage.getEString(), "format", null, 1, 1, QExternalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFile_Rule(), ecorePackage.getEString(), "rule", null, 1, 1, QExternalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, QFile.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fileEClass, theMachineInterfaceCorePackage.getJavaURI(), "getClassURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fileEClass, theMachineInterfaceCorePackage.getJavaURI(), "getPackageInfoURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fileFormatEClass, QFileFormat.class, "FileFormat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileFormatFieldEClass, QFileFormatField.class, "FileFormatField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileFormatKeyEClass, QFileFormatKey.class, "FileFormatKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileFormatKey_Unique(), ecorePackage.getEBoolean(), "unique", null, 1, 1, QFileFormatKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileFormatKey_KeyFields(), this.getFileFormatKeyField(), null, "keyFields", null, 0, -1, QFileFormatKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileFormatKeyFieldEClass, QFileFormatKeyField.class, "FileFormatKeyField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileFormatKeyField_Name(), ecorePackage.getEString(), "name", null, 1, 1, QFileFormatKeyField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileFormatKeyField_Descend(), ecorePackage.getEBoolean(), "descend", null, 0, 1, QFileFormatKeyField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileManagerEClass, QFileManager.class, "FileManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(fileManagerEClass, null, "addFileOverride", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileOverride(), "fileOverride", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileManagerEClass, this.getFileOverride(), "getFileOverride", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileManagerEClass, this.getFileOverride(), "listFileOverride", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileManagerEClass, this.getFileOverride(), "removeFileOverride", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileManagerEClass, null, "removeAllFileOverride", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileManagerEClass, null, "getFileFormat", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "formatName", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFileFormat());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(fileMemberEClass, QFileMember.class, "FileMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileMember_File(), this.getFileMembered(), null, "file", null, 1, 1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMember_Name(), ecorePackage.getEString(), "name", null, 1, 1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileMember_Rows(), this.getFileMemberRow(), this.getFileMemberRow_FileMember(), "rows", null, 0, -1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMember_Text(), ecorePackage.getEString(), "text", null, 0, 1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMember_Type(), ecorePackage.getEString(), "type", null, 0, 1, QFileMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileMemberManagerEClass, QFileMemberManager.class, "FileMemberManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(fileMemberManagerEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileMembered(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "member", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileMemberManagerEClass, this.getFileMember(), "list", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileMembered(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileMemberManagerEClass, this.getFileMember(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileMembered(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "member", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileMemberManagerEClass, this.getFileMember(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageMemoryPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "member", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileMemberManagerEClass, this.getFileMember(), "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "library", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "member", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileMemberManagerEClass, this.getFileMember(), "lookupFirst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileMembered(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fileMemberManagerEClass, this.getFileMember(), "lookupLast", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileMembered(), "file", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fileMemberRowEClass, QFileMemberRow.class, "FileMemberRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileMemberRow_Sequence(), ecorePackage.getEInt(), "sequence", null, 0, 1, QFileMemberRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMemberRow_Date(), ecorePackage.getEInt(), "date", null, 0, 1, QFileMemberRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMemberRow_Content(), ecorePackage.getEString(), "content", null, 0, 1, QFileMemberRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileMemberRow_FileMember(), this.getFileMember(), this.getFileMember_Rows(), "fileMember", null, 1, 1, QFileMemberRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileMemberedEClass, QFileMembered.class, "FileMembered", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fileMemberedEClass, ecorePackage.getEString(), "getLibrary", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fileMemberedEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fileOverrideEClass, QFileOverride.class, "FileOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileOverride_Name(), ecorePackage.getEString(), "name", null, 1, 1, QFileOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileOverride_FileTo(), this.getFile(), null, "fileTo", null, 1, 1, QFileOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileOverride_MemberTo(), ecorePackage.getEString(), "memberTo", null, 1, 1, QFileOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fileOverrideEClass, ecorePackage.getEString(), "getLibrary", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(logicalFileEClass, QLogicalFile.class, "LogicalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalFile_CreationStatement(), ecorePackage.getEString(), "creationStatement", null, 0, 1, QLogicalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalFile_Tables(), ecorePackage.getEString(), "tables", null, 1, -1, QLogicalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalFileEClass, QPhysicalFile.class, "PhysicalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(printerFileEClass, QPrinterFile.class, "PrinterFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrinterFile_PrinterFormats(), this.getPrinterFileFormat(), null, "printerFormats", null, 0, -1, QPrinterFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printerFileFormatEClass, QPrinterFileFormat.class, "PrinterFileFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(printerFileFormatDefEClass, QPrinterFileFormatDef.class, "PrinterFileFormatDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(printerFileFieldEClass, QPrinterFileField.class, "PrinterFileField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceFileEClass, QSourceFile.class, "SourceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceFile_FileType(), ecorePackage.getEString(), "fileType", null, 0, 1, QSourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // OSFileCorePackageImpl
