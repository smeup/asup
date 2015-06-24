/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.QCreationInfo;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QTyped Object</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.type.QTypedObject#getApplication <em>Application</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.QTypedObject#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.QTypedObject#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.QTypedObject#getText <em>Text</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.QTypedObject#getCreationInfo <em>Creation Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypedObject()
 * @model abstract="true"
 * @generated
 */
public interface QTypedObject extends QObjectNameable {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypedObject_Application()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.type.QTypedObject#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see #setLibrary(String)
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypedObject_Library()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.type.QTypedObject#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getAttribute();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypedObject_Name()
	 * @model required="true" annotation="il-data length='10'"
	 * @generated
	 */
	@Override
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.type.QTypedObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypedObject_Text()
	 * @model annotation="il-data length='50'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.type.QTypedObject#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Info</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Info</em>' containment reference.
	 * @see #setCreationInfo(QCreationInfo)
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypedObject_CreationInfo()
	 * @model containment="true"
	 *        annotation="il-data length='30'"
	 * @generated
	 */
	QCreationInfo getCreationInfo();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.type.QTypedObject#getCreationInfo <em>Creation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Info</em>' containment reference.
	 * @see #getCreationInfo()
	 * @generated
	 */
	void setCreationInfo(QCreationInfo value);

} // QTypedObject
