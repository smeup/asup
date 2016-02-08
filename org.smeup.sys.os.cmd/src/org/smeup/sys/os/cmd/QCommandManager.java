/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd;

import java.util.Map;

import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;

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
	 * @model required="true" capabilityRequired="true" commandRequired="true"
	 * @generated
	 */
	QDataContainer decodeCommand(QJobCapability capability, String command);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" capabilityRequired="true" containerRequired="true"
	 * @generated
	 */
	String encodeCommand(QJobCapability capability, QDataContainer container, boolean showDefaults);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" commandRequired="true"
	 * @generated
	 */
	QCallableCommand prepareCommand(QJob job, String command, Map<String, Object> variables, boolean controlRequiredParms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" commandRequired="true"
	 * @generated
	 */
	void executeCommand(QJob job, QCallableCommand command);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model capabilityRequired="true" commandRequired="true"
	 * @generated
	 */
	void executeCommand(QJobCapability capability, String command, Map<String, Object> variables);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" commandRequired="true"
	 * @generated
	 */
	QJobCapability submitCommand(QJob job, String command, String jobName, Object caller);

} // QCommandManager
