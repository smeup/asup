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
 * <em><b>QActivation Group</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.QActivationGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.QActivationGroup#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getActivationGroup()
 * @model
 * @generated
 */
public interface QActivationGroup extends QObject {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.os.pgm.QProgramCallable}.
	 * It is bidirectional and its opposite is '{@link org.smeup.sys.os.pgm.QProgramCallable#getActivationGroup <em>Activation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programs</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getActivationGroup_Programs()
	 * @see org.smeup.sys.os.pgm.QProgramCallable#getActivationGroup
	 * @model opposite="activationGroup" containment="true"
	 * @generated
	 */
	List<QProgramCallable> getPrograms();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model programRequired="true"
	 * @generated
	 */
	QProgramCallable lookup(QProgram program);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getActivationGroup_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QActivationGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // QActivationGroup
