/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
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
public class OperatingSystemSpoolfileFactoryImpl extends EFactoryImpl implements QOperatingSystemSpoolfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemSpoolfileFactory init() {
		try {
			QOperatingSystemSpoolfileFactory theOperatingSystemSpoolfileFactory = (QOperatingSystemSpoolfileFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemSpoolfilePackage.eNS_URI);
			if (theOperatingSystemSpoolfileFactory != null) {
				return theOperatingSystemSpoolfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemSpoolfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystemSpoolfileFactoryImpl() {
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
			case QOperatingSystemSpoolfilePackage.SPOOL_FILE: return (EObject)createSpoolFile();
			case QOperatingSystemSpoolfilePackage.SPOOL_FILE_ROW: return (EObject)createSpoolFileRow();
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
	public QOperatingSystemSpoolfilePackage getOperatingSystemSpoolfilePackage() {
		return (QOperatingSystemSpoolfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemSpoolfilePackage getPackage() {
		return QOperatingSystemSpoolfilePackage.eINSTANCE;
	}

} //OperatingSystemSpoolfileFactoryImpl
