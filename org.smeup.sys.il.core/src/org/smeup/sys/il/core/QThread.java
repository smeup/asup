/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import java.lang.Thread;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getThread()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QThread extends QObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.smeup.sys.mi.core.JavaThread" required="true"
	 * @generated
	 */
	Thread getJavaThread();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data precision='10' scale='2'"
	 * @generated
	 */
	double getThreadCPUUsage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data precision='10'"
	 * @generated
	 */
	long getThreadID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data length='96'"
	 * @generated
	 */
	String getThreadName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data precision='10'"
	 * @generated
	 */
	int getThreadPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data length='12'"
	 * @generated
	 */
	ThreadStatus getThreadStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	boolean isInterrupted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	boolean isNative();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	boolean isSuspended();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	boolean isThreadDaemon();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean checkRunnable();
} // QThread
