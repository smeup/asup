/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.mi.core.util;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Lists</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.mi.core.util.QMachineInterfaceCoreUtilPackage#getLists()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QLists {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model listType="org.smeup.sys.mi.core.JavaList" listRequired="true" elementRequired="true"
	 * @generated
	 */
	<E> void addFirst(List<E> list, E element);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model listType="org.smeup.sys.mi.core.JavaList" listRequired="true" elementRequired="true"
	 * @generated
	 */
	<E> void addLast(List<E> list, E element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listType="org.smeup.sys.mi.core.JavaList" listRequired="true" oldElementRequired="true" newElementRequired="true"
	 * @generated
	 */
	<E> void addBefore(List<E> list, E oldElement, E newElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listType="org.smeup.sys.mi.core.JavaList" listRequired="true" oldElementRequired="true" newElementRequired="true"
	 * @generated
	 */
	<E> void addAfter(List<E> list, E oldElement, E newElement);

} // QLists
