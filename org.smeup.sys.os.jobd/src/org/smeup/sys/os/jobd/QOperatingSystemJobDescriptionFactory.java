/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.jobd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionPackage
 * @generated
 */
public interface QOperatingSystemJobDescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemJobDescriptionFactory eINSTANCE = org.smeup.sys.os.jobd.impl.OperatingSystemJobDescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Job Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Description</em>'.
	 * @generated
	 */
	QJobDescription createJobDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperatingSystemJobDescriptionPackage getOperatingSystemJobDescriptionPackage();

} //QOperatingSystemJobDescriptionFactory
