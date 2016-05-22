/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.usrspc;

import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QUser Space</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.usrspc.QUserSpace#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrspc.QUserSpace#getHeader <em>Header</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrspc.QUserSpace#getContent <em>Content</em>}</li>
 *   <li>{@link org.smeup.sys.os.usrspc.QUserSpace#getContentArray <em>Content Array</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.usrspc.QOperatingSystemUserSpacePackage#getUserSpace()
 * @model
 * @generated
 */
public interface QUserSpace extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see org.smeup.sys.os.usrspc.QOperatingSystemUserSpacePackage#getUserSpace_Attribute()
	 * @model
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.usrspc.QUserSpace#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see org.smeup.sys.os.usrspc.QOperatingSystemUserSpacePackage#getUserSpace_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.usrspc.QUserSpace#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.smeup.sys.os.usrspc.QOperatingSystemUserSpacePackage#getUserSpace_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.usrspc.QUserSpace#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Content Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Array</em>' attribute.
	 * @see #setContentArray(byte[])
	 * @see org.smeup.sys.os.usrspc.QOperatingSystemUserSpacePackage#getUserSpace_ContentArray()
	 * @model
	 * @generated
	 */
	byte[] getContentArray();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.usrspc.QUserSpace#getContentArray <em>Content Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Array</em>' attribute.
	 * @see #getContentArray()
	 * @generated
	 */
	void setContentArray(byte[] value);

} // QUserSpace
