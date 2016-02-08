/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaara;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.os.dtaara.QOperatingSystemDataAreaPackage
 * @generated
 */
public interface QOperatingSystemDataAreaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemDataAreaFactory eINSTANCE = org.smeup.sys.os.dtaara.impl.OperatingSystemDataAreaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Area</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Area</em>'.
	 * @generated
	 */
	QDataArea createDataArea();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperatingSystemDataAreaPackage getOperatingSystemDataAreaPackage();

} // QOperatingSystemDataAreaFactory
