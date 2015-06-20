/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import org.smeup.sys.il.data.QData;
import org.smeup.sys.os.core.OperatingSystemException;
import org.smeup.sys.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QProgram Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QProgramManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model paramsDataType="org.smeup.sys.os.pgm.ParameterList"
	 * @generated
	 */
	void callProgram(String contextID, String library, String program, QData[] params);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model paramsDataType="org.smeup.sys.os.pgm.ParameterList"
	 * @generated
	 */
	void callProgram(QJob job, Class<?> klass, QData[] params);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model programRequired="true"
	 * @generated
	 */
	QCallableProgram getCaller(String contextID, QCallableProgram program);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model programRequired="true"
	 * @generated
	 */
	QCallableProgram getCaller(String contextID, Object program);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QProgramStack getProgramStack(String contextID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobIDRequired="true"
	 * @generated
	 */
	QProgramStack getProgramStack(String contextID, String jobID);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model programRequired="true"
	 * @generated
	 */
	QCallableProgram loadProgram(QJob job, QProgram program) throws OperatingSystemException, OperatingSystemRuntimeProgramException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QCallableProgram loadProgram(QJob job, Class<?> klass) throws OperatingSystemException, OperatingSystemRuntimeProgramException;

} // QProgramManager