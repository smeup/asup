/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.cdo;

import org.smeup.sys.os.core.QSystem;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>CDO System Config</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.cdo.CDOSystemConfig#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#getCDOSystemConfig()
 * @model
 * @generated
 */
public interface CDOSystemConfig {

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(QSystem)
	 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#getCDOSystemConfig_System()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QSystem getSystem();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.cdo.CDOSystemConfig#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(QSystem value);
} // QCDOSystemConfig
