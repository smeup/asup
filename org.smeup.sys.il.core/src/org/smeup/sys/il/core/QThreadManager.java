/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import java.util.List;

import org.smeup.sys.mi.core.util.QSingleton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getThreadManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QThreadManager extends QSingleton<QThreadManager> {
	
	QThreadManager qINSTANCE = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" runnableType="org.smeup.sys.mi.core.JavaRunnable" runnableRequired="true"
	 * @generated
	 */
	QThread createThread(String name, Runnable runnable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" runnableType="org.smeup.sys.mi.core.JavaRunnable" runnableRequired="true" daemonRequired="true"
	 * @generated
	 */
	QThread createThread(String name, Runnable runnable, boolean daemon);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QThread currentThread();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<QThread> listThreads();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true"
	 * @generated
	 */
	QThread lookupThread(long id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	QThread lookupThread(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void release(QThread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void start(QThread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void stop(QThread thread);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model threadRequired="true"
	 * @generated
	 */
	void suspend(QThread thread);

} // QThreadManager
