/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;

import org.smeup.sys.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getExceptionManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QExceptionManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.smeup.sys.os.core.MessageException" messageType="org.smeup.sys.mi.core.JavaEnum" messageRequired="true" EBounds="org.smeup.sys.mi.core.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> OperatingSystemMessageException prepareException(QJob job, Enum<E> message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.smeup.sys.os.core.MessageException" messageType="org.smeup.sys.mi.core.JavaEnum" messageRequired="true" variableRequired="true" EBounds="org.smeup.sys.mi.core.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> OperatingSystemMessageException prepareException(QJob job, Enum<E> message, Object variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.smeup.sys.os.core.MessageException" messageType="org.smeup.sys.mi.core.JavaEnum" messageRequired="true" variablesDataType="org.smeup.sys.os.core.MessageVariableList" variablesRequired="true" EBounds="org.smeup.sys.mi.core.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> OperatingSystemMessageException prepareException(QJob job, Enum<E> message, Object[] variables);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.smeup.sys.os.core.MessageException" messageRequired="true" messageFileNameRequired="true" messageFileLibRequired="true" variablesDataType="org.smeup.sys.os.core.MessageVariableList" variablesRequired="true"
	 * @generated
	 */
	OperatingSystemMessageException prepareException(QJob job, String message, String messageFileName, String messageFileLib, Object[] variables);

} // QExceptionManager
