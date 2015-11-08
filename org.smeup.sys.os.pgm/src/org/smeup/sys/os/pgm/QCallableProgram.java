/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import java.io.Closeable;
import java.util.concurrent.Callable;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QCallable Program</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getCallableProgram()
 * @model interface="true" abstract="true" superTypes="org.smeup.sys.il.core.Object org.smeup.sys.il.core.java.JavaCallable<org.smeup.sys.os.pgm.ParameterList> org.smeup.sys.il.core.java.JavaCloseable"
 * @generated
 */
public interface QCallableProgram extends QObject, Callable<QData[]>, Closeable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QDataContext getDataContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.os.pgm.ParameterList"
	 * @generated
	 */
	QData[] getEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QProgram getProgram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QProgramStatus getProgramStatus();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Object getRawProgram();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void open() throws OperatingSystemRuntimeException;

} // QCallableProgram