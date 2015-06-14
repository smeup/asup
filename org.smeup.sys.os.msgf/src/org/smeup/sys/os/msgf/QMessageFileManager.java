/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf;

import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message File Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage#getMessageFileManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QMessageFileManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.smeup.sys.os.msgf.MessageException" messageNameType="org.smeup.sys.il.core.java.JavaEnum" messageNameRequired="true" variablesDataType="org.smeup.sys.os.msgf.MessageVariableList" variablesRequired="true" EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> MessageException prepareException(QJob job, Enum<E> messageName, Object[] variables);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model messageFileFromRequired="true" messageFileToRequired="true"
	 * @generated
	 */
	void overrideMessageFile(QJob job, String messageFileFrom, QMessageFile messageFileTo) throws OperatingSystemRuntimeException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model messageFileNameRequired="true"
	 * @generated
	 */
	QMessageFile getOverrideMessageFile(QJob job, String messageFileName) throws OperatingSystemRuntimeException;
} // QMessageFileManager
