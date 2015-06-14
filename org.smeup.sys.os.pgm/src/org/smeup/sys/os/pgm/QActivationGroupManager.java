/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import org.smeup.sys.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QActivation Group Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getActivationGroupManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QActivationGroupManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" nameRequired="true" registerRequired="true"
	 * @generated
	 */
	QActivationGroup create(QJob job, String name, boolean register);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true" activationGroupRequired="true"
	 * @generated
	 */
	void register(QJob job, QActivationGroup activationGroup);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true" nameRequired="true"
	 * @generated
	 */
	QActivationGroup lookup(QJob job, String name);

} // QActivationGroupManager
