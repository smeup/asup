/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;

import org.smeup.sys.os.core.jobs.QJob;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystemManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QSystemManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" systemRequired="true"
	 * @generated
	 */
	QJob start(QSystem system);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerRequired="true"
	 * @generated
	 */
	void registerListener(QSystemListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model statusRequired="true"
	 * @generated
	 */
	void updateStatus(SystemStatus status);

} // QSystemManager
