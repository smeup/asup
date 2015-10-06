/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core.auth;

import org.smeup.sys.il.core.ctx.QCredentials;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.rt.core.auth.QRuntimeCoreAuthPackage#getAuthenticationManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QAuthenticationManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model credentialsRequired="true"
	 * @generated
	 */
	QAuthenticationToken createAuthenticationToken(QCredentials credentials);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model authTokenRequired="true"
	 * @generated
	 */
	void deleteAuthenticationToken(QAuthenticationToken authToken);

} // QAuthenticationManager
