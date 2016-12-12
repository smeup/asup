/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.expr.QPredicateExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QResource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.memo.QResourceReader#getNotifier <em>Notifier</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResourceReader()
 * @model abstract="true"
 * @generated
 */
public interface QResourceReader<T extends QObjectNameable> extends QResourceHandler<T> {
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
	 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResourceReader_Notifier()
	 * @model
	 * @generated
	 */
	QResourceNotifier<T> getNotifier();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.memo.QResourceReader#getNotifier <em>Notifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifier</em>' reference.
	 * @see #getNotifier()
	 * @generated
	 */
	void setNotifier(QResourceNotifier<T> value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	boolean exists(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QObjectIterator<T> find(String filter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QObjectIterator<T> findByExpression(QPredicateExpression filter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	T lookup(String name);
} // QResource
