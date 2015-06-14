/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.resources;

import java.util.List;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QResource Cross Reader</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.resources.QResourceSetReader#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResourceSetReader()
 * @model abstract="true"
 * @generated
 */
public interface QResourceSetReader<T extends QObjectNameable> extends QResourceReader<T> {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' attribute list.
	 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResourceSetReader_Containers()
	 * @model required="true"
	 * @generated
	 */
	List<String> getContainers();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model containerRequired="true" nameRequired="true"
	 * @generated
	 */
	T lookup(String container, String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" containerRequired="true" nameRequired="true"
	 * @generated
	 */
	boolean exists(String container, String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model containerRequired="true"
	 * @generated
	 */
	QObjectIterator<T> find(String container, String nameFilter);

} // QResourceCrossReader
