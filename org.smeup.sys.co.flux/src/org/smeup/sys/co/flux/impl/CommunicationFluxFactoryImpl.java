/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.flux.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.co.flux.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationFluxFactoryImpl extends EFactoryImpl implements QCommunicationFluxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QCommunicationFluxFactory init() {
		try {
			QCommunicationFluxFactory theCommunicationFluxFactory = (QCommunicationFluxFactory)EPackage.Registry.INSTANCE.getEFactory(QCommunicationFluxPackage.eNS_URI);
			if (theCommunicationFluxFactory != null) {
				return theCommunicationFluxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationFluxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationFluxFactoryImpl() {
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
			case QCommunicationFluxPackage.FLUX_SERVER_CONNECTION_CONFIG: return (EObject)createFluxServerConnectionConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFluxServerConnectionConfig createFluxServerConnectionConfig() {
		FluxServerConnectionConfigImpl fluxServerConnectionConfig = new FluxServerConnectionConfigImpl();
		return fluxServerConnectionConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCommunicationFluxPackage getCommunicationFluxPackage() {
		return (QCommunicationFluxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QCommunicationFluxPackage getPackage() {
		return QCommunicationFluxPackage.eINSTANCE;
	}

} //CommunicationFluxFactoryImpl
