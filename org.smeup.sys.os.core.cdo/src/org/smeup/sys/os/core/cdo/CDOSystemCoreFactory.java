/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.cdo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage
 * @generated
 */
public interface CDOSystemCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	CDOSystemCoreFactory eINSTANCE = org.smeup.sys.os.core.cdo.impl.CDOSystemCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CDO System Config</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>CDO System Config</em>'.
	 * @generated
	 */
	CDOSystemConfig createCDOSystemConfig();

	/**
	 * Returns a new object of class '<em>CDO Store Config</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>CDO Store Config</em>'.
	 * @generated
	 */
	CDOStoreConfig createCDOStoreConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CDOSystemCorePackage getCDOSystemCorePackage();

} // QCDOSystemCoreFactory
