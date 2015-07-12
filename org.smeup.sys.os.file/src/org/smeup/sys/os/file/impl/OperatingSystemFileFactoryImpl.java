/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.file.*;
import org.smeup.sys.os.file.QDatabaseFileField;
import org.smeup.sys.os.file.QDatabaseFileFormat;
import org.smeup.sys.os.file.QDatabaseFileFormatDef;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QDisplayFileField;
import org.smeup.sys.os.file.QDisplayFileFormat;
import org.smeup.sys.os.file.QDisplayFileFormatDef;
import org.smeup.sys.os.file.QExternalFile;
import org.smeup.sys.os.file.QFileFormatKey;
import org.smeup.sys.os.file.QFileFormatKeyField;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberRow;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QOperatingSystemFileFactory;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.QPrinterFileField;
import org.smeup.sys.os.file.QPrinterFileFormat;
import org.smeup.sys.os.file.QPrinterFileFormatDef;
import org.smeup.sys.os.file.QSourceFile;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemFileFactoryImpl extends EFactoryImpl implements QOperatingSystemFileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemFileFactory init() {
		try {
			QOperatingSystemFileFactory theOperatingSystemFileFactory = (QOperatingSystemFileFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemFilePackage.eNS_URI);
			if (theOperatingSystemFileFactory != null) {
				return theOperatingSystemFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemFileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemFileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemFilePackage.DATABASE_FILE_FIELD: return (EObject)createDatabaseFileField();
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT: return (EObject)createDatabaseFileFormat();
			case QOperatingSystemFilePackage.DATABASE_FILE_FORMAT_DEF: return (EObject)createDatabaseFileFormatDef();
			case QOperatingSystemFilePackage.DISPLAY_FILE: return (EObject)createDisplayFile();
			case QOperatingSystemFilePackage.DISPLAY_FILE_FIELD: return (EObject)createDisplayFileField();
			case QOperatingSystemFilePackage.DISPLAY_FILE_FORMAT: return (EObject)createDisplayFileFormat();
			case QOperatingSystemFilePackage.DISPLAY_FILE_FORMAT_DEF: return (EObject)createDisplayFileFormatDef();
			case QOperatingSystemFilePackage.EXTERNAL_FILE: return (EObject)createExternalFile();
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY: return (EObject)createFileFormatKey();
			case QOperatingSystemFilePackage.FILE_FORMAT_KEY_FIELD: return (EObject)createFileFormatKeyField();
			case QOperatingSystemFilePackage.FILE_MEMBER: return (EObject)createFileMember();
			case QOperatingSystemFilePackage.FILE_MEMBER_ROW: return (EObject)createFileMemberRow();
			case QOperatingSystemFilePackage.LOGICAL_FILE: return (EObject)createLogicalFile();
			case QOperatingSystemFilePackage.PHYSICAL_FILE: return (EObject)createPhysicalFile();
			case QOperatingSystemFilePackage.PRINTER_FILE: return (EObject)createPrinterFile();
			case QOperatingSystemFilePackage.PRINTER_FILE_FORMAT: return (EObject)createPrinterFileFormat();
			case QOperatingSystemFilePackage.PRINTER_FILE_FORMAT_DEF: return (EObject)createPrinterFileFormatDef();
			case QOperatingSystemFilePackage.PRINTER_FILE_FIELD: return (EObject)createPrinterFileField();
			case QOperatingSystemFilePackage.SOURCE_FILE: return (EObject)createSourceFile();
			case QOperatingSystemFilePackage.FILE_OVERRIDE: return (EObject)createFileOverride();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDatabaseFileField createDatabaseFileField() {
		DatabaseFileFieldImpl databaseFileField = new DatabaseFileFieldImpl();
		return databaseFileField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDatabaseFileFormat createDatabaseFileFormat() {
		DatabaseFileFormatImpl databaseFileFormat = new DatabaseFileFormatImpl();
		return databaseFileFormat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDatabaseFileFormatDef createDatabaseFileFormatDef() {
		DatabaseFileFormatDefImpl databaseFileFormatDef = new DatabaseFileFormatDefImpl();
		return databaseFileFormatDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDisplayFile createDisplayFile() {
		DisplayFileImpl displayFile = new DisplayFileImpl();
		return displayFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDisplayFileField createDisplayFileField() {
		DisplayFileFieldImpl displayFileField = new DisplayFileFieldImpl();
		return displayFileField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDisplayFileFormat createDisplayFileFormat() {
		DisplayFileFormatImpl displayFileFormat = new DisplayFileFormatImpl();
		return displayFileFormat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDisplayFileFormatDef createDisplayFileFormatDef() {
		DisplayFileFormatDefImpl displayFileFormatDef = new DisplayFileFormatDefImpl();
		return displayFileFormatDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFileMember createFileMember() {
		FileMemberImpl fileMember = new FileMemberImpl();
		return fileMember;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFileMemberRow createFileMemberRow() {
		FileMemberRowImpl fileMemberRow = new FileMemberRowImpl();
		return fileMemberRow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QLogicalFile createLogicalFile() {
		LogicalFileImpl logicalFile = new LogicalFileImpl();
		return logicalFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QPhysicalFile createPhysicalFile() {
		PhysicalFileImpl physicalFile = new PhysicalFileImpl();
		return physicalFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QPrinterFile createPrinterFile() {
		PrinterFileImpl printerFile = new PrinterFileImpl();
		return printerFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QPrinterFileFormat createPrinterFileFormat() {
		PrinterFileFormatImpl printerFileFormat = new PrinterFileFormatImpl();
		return printerFileFormat;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QPrinterFileFormatDef createPrinterFileFormatDef() {
		PrinterFileFormatDefImpl printerFileFormatDef = new PrinterFileFormatDefImpl();
		return printerFileFormatDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QPrinterFileField createPrinterFileField() {
		PrinterFileFieldImpl printerFileField = new PrinterFileFieldImpl();
		return printerFileField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSourceFile createSourceFile() {
		SourceFileImpl sourceFile = new SourceFileImpl();
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFileOverride createFileOverride() {
		FileOverrideImpl fileOverride = new FileOverrideImpl();
		return fileOverride;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QExternalFile createExternalFile() {
		ExternalFileImpl externalFile = new ExternalFileImpl();
		return externalFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFileFormatKey createFileFormatKey() {
		FileFormatKeyImpl fileFormatKey = new FileFormatKeyImpl();
		return fileFormatKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFileFormatKeyField createFileFormatKeyField() {
		FileFormatKeyFieldImpl fileFormatKeyField = new FileFormatKeyFieldImpl();
		return fileFormatKeyField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemFilePackage getOperatingSystemFilePackage() {
		return (QOperatingSystemFilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemFilePackage getPackage() {
		return QOperatingSystemFilePackage.eINSTANCE;
	}

} // OSFileCoreFactoryImpl
