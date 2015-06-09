/**
 *  Copyright (c) 2012, 2015 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getLogger()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QLogger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageRequired="true"
	 * @generated
	 */
	void debug(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageRequired="true" throwableDataType="org.smeup.sys.il.core.java.JavaThrowable" throwableRequired="true"
	 * @generated
	 */
	void debug(String message, Throwable throwable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageRequired="true"
	 * @generated
	 */
	void info(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageRequired="true" throwableDataType="org.smeup.sys.il.core.java.JavaThrowable" throwableRequired="true"
	 * @generated
	 */
	void info(String message, Throwable throwable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageRequired="true"
	 * @generated
	 */
	void warning(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageRequired="true" throwableDataType="org.smeup.sys.il.core.java.JavaThrowable" throwableRequired="true"
	 * @generated
	 */
	void warning(String message, Throwable throwable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void error(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model throwableDataType="org.smeup.sys.il.core.java.JavaThrowable" throwableRequired="true"
	 * @generated
	 */
	void error(String message, Throwable throwable);

} // Logger
