/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Program Status</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.QProgramStatus#getCallableProgram <em>Callable Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramStatus()
 * @model
 * @generated
 */
public interface QProgramStatus extends QObject {
	/**
	 * Returns the value of the '<em><b>Callable Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callable Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable Program</em>' reference.
	 * @see #setCallableProgram(QCallableProgram)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramStatus_CallableProgram()
	 * @model required="true"
	 * @generated
	 */
	QCallableProgram getCallableProgram();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QProgramStatus#getCallableProgram <em>Callable Program</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Callable Program</em>' reference.
	 * @see #getCallableProgram()
	 * @generated
	 */
	void setCallableProgram(QCallableProgram value);

} // QProgramStatus
