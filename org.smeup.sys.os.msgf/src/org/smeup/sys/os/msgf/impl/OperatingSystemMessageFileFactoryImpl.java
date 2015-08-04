/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.msgf.QMessageDataField;
import org.smeup.sys.os.msgf.QMessageDescription;
import org.smeup.sys.os.msgf.QMessageFile;
import org.smeup.sys.os.msgf.QOperatingSystemMessageFileFactory;
import org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemMessageFileFactoryImpl extends EFactoryImpl implements QOperatingSystemMessageFileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemMessageFileFactory init() {
		try {
			QOperatingSystemMessageFileFactory theOperatingSystemMessageFileFactory = (QOperatingSystemMessageFileFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemMessageFilePackage.eNS_URI);
			if (theOperatingSystemMessageFileFactory != null) {
				return theOperatingSystemMessageFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemMessageFileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemMessageFileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION: return (EObject)createMessageDescription();
			case QOperatingSystemMessageFilePackage.MESSAGE_DATA_FIELD: return (EObject)createMessageDataField();
			case QOperatingSystemMessageFilePackage.MESSAGE_FILE: return (EObject)createMessageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QMessageDescription createMessageDescription() {
		MessageDescriptionImpl messageDescription = new MessageDescriptionImpl();
		return messageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QMessageDataField createMessageDataField() {
		MessageDataFieldImpl messageDataField = new MessageDataFieldImpl();
		return messageDataField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QMessageFile createMessageFile() {
		MessageFileImpl messageFile = new MessageFileImpl();
		return messageFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemMessageFilePackage getOperatingSystemMessageFilePackage() {
		return (QOperatingSystemMessageFilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemMessageFilePackage getPackage() {
		return QOperatingSystemMessageFilePackage.eINSTANCE;
	}

} // OperatingSystemMessageFileFactoryImpl
