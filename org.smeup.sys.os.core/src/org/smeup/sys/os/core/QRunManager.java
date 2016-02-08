/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;

import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getRunManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QRunManager {
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

} // QRunManager
