/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Tester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.rt.core.QServiceTester#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceTester()
 * @model
 * @generated
 */
public interface QServiceTester extends QServiceRef {

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * The default value is <code>"org.smeup.sys.dk.test.QTestSuiteLauncher"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceTester_InterfaceName()
	 * @model default="org.smeup.sys.dk.test.QTestSuiteLauncher" required="true" changeable="false"
	 * @generated
	 */
	String getInterfaceName();
} // QServiceTester
