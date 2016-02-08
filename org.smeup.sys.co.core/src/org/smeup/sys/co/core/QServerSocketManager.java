/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Socket Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.co.core.QCommunicationCorePackage#getServerSocketManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QServerSocketManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model configRequired="true"
	 * @generated
	 */
	void startServerSocket(QServerSocketConfig config);

} // QServerSocketManager
