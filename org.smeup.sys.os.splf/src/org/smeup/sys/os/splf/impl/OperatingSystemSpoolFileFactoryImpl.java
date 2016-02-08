/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.splf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.os.splf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingSystemSpoolFileFactoryImpl extends EFactoryImpl implements QOperatingSystemSpoolFileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemSpoolFileFactory init() {
		try {
			QOperatingSystemSpoolFileFactory theOperatingSystemSpoolFileFactory = (QOperatingSystemSpoolFileFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemSpoolFilePackage.eNS_URI);
			if (theOperatingSystemSpoolFileFactory != null) {
				return theOperatingSystemSpoolFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemSpoolFileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemSpoolFileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE: return (EObject)createSpoolFile();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW: return (EObject)createSpoolFileRow();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE_DATA: return (EObject)createSpoolFileData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSpoolFile createSpoolFile() {
		SpoolFileImpl spoolFile = new SpoolFileImpl();
		return spoolFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSpoolFileRow createSpoolFileRow() {
		SpoolFileRowImpl spoolFileRow = new SpoolFileRowImpl();
		return spoolFileRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSpoolFileData createSpoolFileData() {
		SpoolFileDataImpl spoolFileData = new SpoolFileDataImpl();
		return spoolFileData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperatingSystemSpoolFilePackage getOperatingSystemSpoolFilePackage() {
		return (QOperatingSystemSpoolFilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemSpoolFilePackage getPackage() {
		return QOperatingSystemSpoolFilePackage.eINSTANCE;
	}

} //OperatingSystemSpoolFileFactoryImpl
