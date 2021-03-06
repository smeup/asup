/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.QProgramInfo#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.QProgramInfo#getLoadTime <em>Load Time</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.QProgramInfo#getCallTime <em>Call Time</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramInfo()
 * @model
 * @generated
 */
public interface QProgramInfo extends QObject {

	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size</em>' attribute.
	 * @see #setMemorySize(long)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramInfo_MemorySize()
	 * @model
	 * @generated
	 */
	long getMemorySize();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QProgramInfo#getMemorySize <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' attribute.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(long value);

	/**
	 * Returns the value of the '<em><b>Load Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Time</em>' attribute.
	 * @see #setLoadTime(long)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramInfo_LoadTime()
	 * @model
	 * @generated
	 */
	long getLoadTime();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QProgramInfo#getLoadTime <em>Load Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Time</em>' attribute.
	 * @see #getLoadTime()
	 * @generated
	 */
	void setLoadTime(long value);

	/**
	 * Returns the value of the '<em><b>Call Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Time</em>' attribute.
	 * @see #setCallTime(long)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramInfo_CallTime()
	 * @model
	 * @generated
	 */
	long getCallTime();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QProgramInfo#getCallTime <em>Call Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Time</em>' attribute.
	 * @see #getCallTime()
	 * @generated
	 */
	void setCallTime(long value);
} // QProgramInfo
