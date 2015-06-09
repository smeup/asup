/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.shell;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.co.shell.QCommunicationShellPackage#getShellManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QShellManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model authenticationIDRequired="true" commandRequired="true"
	 * @generated
	 */
	void execute(String authenticationID, String command, Map<String, Object> variables, boolean defaults);

} // QShellManager
