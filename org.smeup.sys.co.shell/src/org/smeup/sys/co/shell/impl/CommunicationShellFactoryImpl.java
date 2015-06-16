/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.shell.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.co.shell.*;
import org.smeup.sys.co.shell.QCommunicationShellFactory;
import org.smeup.sys.co.shell.QCommunicationShellPackage;
import org.smeup.sys.co.shell.QShellData;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CommunicationShellFactoryImpl extends EFactoryImpl implements QCommunicationShellFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QCommunicationShellFactory init() {
		try {
			QCommunicationShellFactory theCommunicationShellFactory = (QCommunicationShellFactory)EPackage.Registry.INSTANCE.getEFactory(QCommunicationShellPackage.eNS_URI);
			if (theCommunicationShellFactory != null) {
				return theCommunicationShellFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationShellFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public CommunicationShellFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QCommunicationShellPackage.SHELL_CREDENTIALS: return (EObject)createShellCredentials();
			case QCommunicationShellPackage.SHELL_DATA: return (EObject)createShellData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QShellCredentials createShellCredentials() {
		ShellCredentialsImpl shellCredentials = new ShellCredentialsImpl();
		return shellCredentials;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QShellData createShellData() {
		ShellDataImpl shellData = new ShellDataImpl();
		return shellData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCommunicationShellPackage getCommunicationShellPackage() {
		return (QCommunicationShellPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QCommunicationShellPackage getPackage() {
		return QCommunicationShellPackage.eINSTANCE;
	}

} // CommunicationShellFactoryImpl
