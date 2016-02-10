/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type;




/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.type.QType#getTypedClassName <em>Typed Class Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.QType#isPersistent <em>Persistent</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getType()
 * @model
 * @generated
 */
public interface QType<T extends QTypedObject> extends QTypedObject {

	/**
	 * Returns the value of the '<em><b>Typed Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Class Name</em>' attribute.
	 * @see #setTypedClassName(String)
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getType_TypedClassName()
	 * @model required="true"
	 * @generated
	 */
	String getTypedClassName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.type.QType#getTypedClassName <em>Typed Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Class Name</em>' attribute.
	 * @see #getTypedClassName()
	 * @generated
	 */
	void setTypedClassName(String value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getType_Persistent()
	 * @model default="true"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.type.QType#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Class<T> getTypedClass();

} // QType
