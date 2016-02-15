/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.shell;

import java.util.Map;

import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;

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
	 * @model required="true" identityRequired="true"
	 * @generated
	 */
	QJobCapability connect(QIdentity<?> identity);

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
	 * @model capabilityRequired="true"
	 * @generated
	 */
	void disconnect(QJobCapability capability);

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
	 * @model capabilityRequired="true" commandRequired="true"
	 * @generated
	 */
	void executeCommand(QJobCapability capability, String command, Map<String, Object> variables);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QJobManager locate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" SBounds="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	<S extends Object> S locate(QJobCapability capability, Class<S> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model capabilityRequired="true" nameRequired="true"
	 * @generated
	 */
	void setDefaultWriter(QJobCapability capability, String name);

} // QShellManager
