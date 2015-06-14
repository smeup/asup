/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import java.net.URI;
import java.util.List;
import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QProgram</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.QProgram#getActivationGroup <em>Activation Group</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.QProgram#getAddress <em>Address</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.QProgram#getCreationParams <em>Creation Params</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.QProgram#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgram()
 * @model
 * @generated
 */
public interface QProgram extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Activation Group</b></em>' attribute.
	 * The default value is <code>"*DFT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Group</em>' attribute.
	 * @see #setActivationGroup(String)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgram_ActivationGroup()
	 * @model default="*DFT"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	String getActivationGroup();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QProgram#getActivationGroup <em>Activation Group</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Activation Group</em>' attribute.
	 * @see #getActivationGroup()
	 * @generated
	 */
	void setActivationGroup(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgram_Address()
	 * @model annotation="il-data length='128'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QProgram#getAddress
	 * <em>Address</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Creation Params</b></em>' attribute
	 * list. The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Params</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Creation Params</em>' attribute list.
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgram_CreationParams()
	 * @model
	 * @generated
	 */
	List<String> getCreationParams();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(QProgramSource)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgram_Source()
	 * @model containment="true"
	 * @generated
	 */
	QProgramSource getSource();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QProgram#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(QProgramSource value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.il.core.java.JavaURI"
	 * @generated
	 */
	URI getClassURI();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.il.core.java.JavaURI"
	 * @generated
	 */
	URI getPackageInfoURI();

} // QProgram
