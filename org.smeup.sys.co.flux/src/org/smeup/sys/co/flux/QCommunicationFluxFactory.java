/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.flux;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.co.flux.QCommunicationFluxPackage
 * @generated
 */
public interface QCommunicationFluxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QCommunicationFluxFactory eINSTANCE = org.smeup.sys.co.flux.impl.CommunicationFluxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flux Server Connection Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flux Server Connection Config</em>'.
	 * @generated
	 */
	QFluxServerConnectionConfig createFluxServerConnectionConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QCommunicationFluxPackage getCommunicationFluxPackage();

} //QCommunicationFluxFactory
