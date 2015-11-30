/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.env;

import java.util.List;
import org.smeup.sys.os.core.QEnvironmentVariable;

import org.smeup.sys.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Variable Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.core.env.QOperatingSystemEnvironmentPackage#getEnvironmentVariableManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QEnvironmentVariableManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" levelRequired="true" variableRequired="true" replaceRequired="true"
	 * @generated
	 */
	void addVariable(QJob job, EnvironmentLevel level, QEnvironmentVariable variable, boolean replace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" levelRequired="true" variableRequired="true" replaceRequired="true"
	 * @generated
	 */
	void changeVariable(QJob job, EnvironmentLevel level, QEnvironmentVariable variable, boolean replace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" levelRequired="true"
	 * @generated
	 */
	List<QEnvironmentVariable> listVariables(QJob job, EnvironmentLevel level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" levelRequired="true" nameRequired="true" replaceRequired="true"
	 * @generated
	 */
	void removeVariable(QJob job, EnvironmentLevel level, QEnvironmentVariable name, boolean replace);

} // QEnvironmentVariableManager
