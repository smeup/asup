/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.usrprf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfilePackage
 * @generated
 */
public interface QOperatingSystemUserProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemUserProfileFactory eINSTANCE = org.smeup.sys.os.usrprf.impl.OperatingSystemUserProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User Profile</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>User Profile</em>'.
	 * @generated
	 */
	QUserProfile createUserProfile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperatingSystemUserProfilePackage getOperatingSystemUserProfilePackage();

} // OSUserProfileCoreFactory
