/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd;

import java.io.Closeable;
import java.util.Map;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.data.QDataContainer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QCallable Command</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.cmd.QCallableCommand#getCommand <em>Command</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCallableCommand#getCommandString <em>Command String</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCallableCommand#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCallableCommand#getDataContainer <em>Data Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCallableCommand()
 * @model superTypes="org.smeup.sys.il.core.Object org.smeup.sys.mi.core.JavaCloseable"
 * @generated
 */
public interface QCallableCommand extends QObject, Closeable {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(QCommand)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCallableCommand_Command()
	 * @model required="true"
	 * @generated
	 */
	QCommand getCommand();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCallableCommand#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(QCommand value);

	/**
	 * Returns the value of the '<em><b>Command String</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Command String</em>' attribute.
	 * @see #setCommandString(String)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCallableCommand_CommandString()
	 * @model required="true"
	 * @generated
	 */
	String getCommandString();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCallableCommand#getCommandString <em>Command String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Command String</em>' attribute.
	 * @see #getCommandString()
	 * @generated
	 */
	void setCommandString(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Variables</em>' attribute.
	 * @see #setVariables(Map)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCallableCommand_Variables()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<String, Object> getVariables();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.cmd.QCallableCommand#getVariables
	 * <em>Variables</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Variables</em>' attribute.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(Map<String, Object> value);

	/**
	 * Returns the value of the '<em><b>Data Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Container</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Container</em>' containment reference.
	 * @see #setDataContainer(QDataContainer)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCallableCommand_DataContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QDataContainer getDataContainer();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCallableCommand#getDataContainer <em>Data Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Container</em>' containment reference.
	 * @see #getDataContainer()
	 * @generated
	 */
	void setDataContainer(QDataContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

} // QCallableCommand
