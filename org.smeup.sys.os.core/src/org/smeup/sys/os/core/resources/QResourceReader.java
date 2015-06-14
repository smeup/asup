/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.resources;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.expr.QPredicateExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QResource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.resources.QResourceReader#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResourceReader()
 * @model abstract="true"
 * @generated
 */
public interface QResourceReader<T extends QObjectNameable> extends QResource<T> {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(String)
	 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResourceReader_Container()
	 * @model required="true"
	 * @generated
	 */
	String getContainer();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.core.resources.QResourceReader#getContainer
	 * <em>Container</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(String value);

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
	QObjectIterator<T> find(String nameFilter);

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
