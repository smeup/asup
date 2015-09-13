/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

import org.smeup.sys.il.core.QNameable;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QResource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.memo.QResource#getContextProvider <em>Context Provider</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.QResource#getNotifier <em>Notifier</em>}</li>
 *   <li>{@link org.smeup.sys.il.memo.QResource#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface QResource<T extends QObjectNameable> extends QNameable {
	/**
	 * Returns the value of the '<em><b>Context Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Provider</em>' reference.
	 * @see #setContextProvider(QContextProvider)
	 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResource_ContextProvider()
	 * @model required="true"
	 * @generated
	 */
	QContextProvider getContextProvider();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.memo.QResource#getContextProvider <em>Context Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Provider</em>' reference.
	 * @see #getContextProvider()
	 * @generated
	 */
	void setContextProvider(QContextProvider value);

	/**
	 * Returns the value of the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifier</em>' reference.
	 * @see #setNotifier(QResourceNotifier)
	 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResource_Notifier()
	 * @model
	 * @generated
	 */
	QResourceNotifier<T> getNotifier();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.memo.QResource#getNotifier
	 * <em>Notifier</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Notifier</em>' reference.
	 * @see #getNotifier()
	 * @generated
	 */
	void setNotifier(QResourceNotifier<T> value);

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
	 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.memo.QResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model eventRequired="true" eventTypeRequired="true" objectRequired="true"
	 * @generated
	 */
	void fireEvent(QResourceEvent<T> event, ResourceEventType eventType, T object);

} // QResource
