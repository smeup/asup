/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QFile Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFileManager {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" fileNameRequired="true"
	 * @generated
	 */
	QFile getFileOverride(QJob job, String fileName) throws OperatingSystemRuntimeException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true" fileFromRequired="true" fileToRequired="true"
	 * @generated
	 */
	void setFileOverride(QJob job, String fileFrom, QFile fileTo) throws OperatingSystemRuntimeException;
} // QFileManager
