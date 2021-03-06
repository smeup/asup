/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import java.util.List;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QProgram Stack</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramStack()
 * @model
 * @generated
 */
public interface QProgramStack extends QObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" elementRequired="true"
	 * @generated
	 */
	boolean contains(QProgramCallable element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	boolean contains(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model orderRequired="true"
	 * @generated
	 */
	List<QProgramCallable> list(ProgramStackOrder order);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model elementRequired="true"
	 * @generated
	 */
	void push(QProgramCallable element);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QProgramCallable peek();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QProgramCallable pop();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int size();

} // QProgramStack
