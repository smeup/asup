/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import java.util.List;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QActivation Group</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.QActivationGroup#getFrameworkContext <em>Framework Context</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.QActivationGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.QActivationGroup#getPrograms <em>Programs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getActivationGroup()
 * @model
 * @generated
 */
public interface QActivationGroup extends QObject {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.os.pgm.QCallableProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programs</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getActivationGroup_Programs()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	List<QCallableProgram> getPrograms();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model programRequired="true"
	 * @generated
	 */
	QCallableProgram lookup(QProgram program);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model programRequired="true"
	 * @generated
	 */
	void remove(QProgram program);

	/**
	 * Returns the value of the '<em><b>Framework Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Context</em>' containment reference.
	 * @see #setFrameworkContext(QContext)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getActivationGroup_FrameworkContext()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	QContext getFrameworkContext();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QActivationGroup#getFrameworkContext <em>Framework Context</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Context</em>' containment reference.
	 * @see #getFrameworkContext()
	 * @generated
	 */
	void setFrameworkContext(QContext value);

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
