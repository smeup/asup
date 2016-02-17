/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.core;

import java.util.List;
import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.os.core.jobs.QJobCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.co.core.QCommunicationCorePackage#getCommunicationManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QCommunicationManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true"
	 * @generated
	 */
	List<QEndPoint> find(String contextID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" endPointIDRequired="true"
	 * @generated
	 */
	QEndPoint lookup(String contextID, String endPointID);

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
	 * @model capabilityRequired="true"
	 * @generated
	 */
	void disconnect(QJobCapability capability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" SBounds="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	<S extends Object> S locate(QJobCapability capability, Class<S> klass);

} // QCommunicationManager
