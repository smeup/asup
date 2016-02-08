/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import java.util.Date;
import java.util.List;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QProgram Stack</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.QProgramStack#getDateEnter <em>Date Enter</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.QProgramStack#getDateExit <em>Date Exit</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramStack()
 * @model
 * @generated
 */
public interface QProgramStack extends QObject {
	/**
	 * Returns the value of the '<em><b>Date Enter</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Enter</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Date Enter</em>' attribute.
	 * @see #setDateEnter(Date)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramStack_DateEnter()
	 * @model
	 * @generated
	 */
	Date getDateEnter();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QProgramStack#getDateEnter <em>Date Enter</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Date Enter</em>' attribute.
	 * @see #getDateEnter()
	 * @generated
	 */
	void setDateEnter(Date value);

	/**
	 * Returns the value of the '<em><b>Date Exit</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Exit</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Date Exit</em>' attribute.
	 * @see #setDateExit(Date)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getProgramStack_DateExit()
	 * @model
	 * @generated
	 */
	Date getDateExit();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QProgramStack#getDateExit <em>Date Exit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Exit</em>' attribute.
	 * @see #getDateExit()
	 * @generated
	 */
	void setDateExit(Date value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<QCallableProgram<?>> list();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model elementRequired="true"
	 * @generated
	 */
	void push(QCallableProgram<?> element);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QCallableProgram<?> peek();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QCallableProgram<?> pop();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int size();

} // QProgramStack
