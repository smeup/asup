/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.rt.core.QServiceRegistry#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QServiceRegistry#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceRegistry()
 * @model
 * @generated
 */
public interface QServiceRegistry extends QServiceRef {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.rt.core.QServiceRegistryEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceRegistry_Entries()
	 * @model containment="true"
	 * @generated
	 */
	List<QServiceRegistryEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceRegistry_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QServiceRegistry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // QServiceRegistry
