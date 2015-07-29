/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd;

import java.util.Map;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QCommand Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommandManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QCommandManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextIDRequired="true" commandRequired="true" defaultsRequired="true"
	 * @generated
	 */
	QCallableCommand prepareCommand(String contextID, String command, Map<String, Object> variables, boolean defaults);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" commandRequired="true"
	 * @generated
	 */
	void executeCommand(String contextID, QCallableCommand command);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" commandRequired="true" defaultsRequired="true"
	 * @generated
	 */
	void executeCommandImmediate(String contextID, String command, Map<String, Object> variables, boolean defaults);

} // QCommandManager
