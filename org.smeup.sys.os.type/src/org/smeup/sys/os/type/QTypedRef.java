/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Typed Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.type.QTypedRef#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.QTypedRef#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypedRef()
 * @model
 * @generated
 */
public interface QTypedRef<T extends QTypedObject> extends QObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see #setLibrary(String)
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypedReference_Library()
	 * @model required="true" annotation="il-data length='10'"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.type.QTypedRef#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Attributo dell'oggetto.
	 *
	 * Ogni oggetto di tip QObject prevede una ulteriore specificazione di tipo
	 * dfinita tramite attributo. L'attributo non partecipa all'ereditarieta'
	 * dell'oggetto pur influenzandono comportamenti e proprieta'. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypedReference_Name()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.type.QTypedRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // QTypedRef
