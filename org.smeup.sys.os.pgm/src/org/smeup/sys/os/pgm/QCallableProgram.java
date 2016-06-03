/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm;

import java.io.Closeable;
import java.util.concurrent.Callable;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QCallable Program</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.QCallableProgram#getActivationGroup <em>Activation Group</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getCallableProgram()
 * @model abstract="true" superTypes="org.smeup.sys.il.core.Object org.smeup.sys.mi.core.JavaCallable<org.smeup.sys.os.pgm.ParameterList> org.smeup.sys.mi.core.JavaCloseable" PBounds="org.eclipse.emf.ecore.EJavaObject"
 * @generated
 */
public interface QCallableProgram<P extends Object> extends QObject, Callable<QData[]>, Closeable {
	/**
	 * Returns the value of the '<em><b>Activation Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.smeup.sys.os.pgm.QActivationGroup#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Group</em>' container reference.
	 * @see #setActivationGroup(QActivationGroup)
	 * @see org.smeup.sys.os.pgm.QOperatingSystemProgramPackage#getCallableProgram_ActivationGroup()
	 * @see org.smeup.sys.os.pgm.QActivationGroup#getPrograms
	 * @model opposite="programs" transient="false"
	 * @generated
	 */
	QActivationGroup getActivationGroup();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.pgm.QCallableProgram#getActivationGroup <em>Activation Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Group</em>' container reference.
	 * @see #getActivationGroup()
	 * @generated
	 */
	void setActivationGroup(QActivationGroup value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QDataContext getDataContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.os.pgm.ParameterList"
	 * @generated
	 */
	QData[] getEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QProgram getProgram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QProgramInfo getProgramInfo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QProgramStatus getProgramStatus();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	P getRawProgram();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isOpen();

} // QCallableProgram