/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd;

import java.util.List;
import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QCommand</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.cmd.QCommand#getAddress <em>Address</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCommand#isAllowBatch <em>Allow Batch</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCommand#isClassCMD <em>Class CMD</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCommand#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCommand#getProgram <em>Program</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCommand#getSource <em>Source</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCommand#getStatus <em>Status</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.QCommand#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommand()
 * @model
 * @generated
 */
public interface QCommand extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommand_Address()
	 * @model annotation="il-data length='128'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCommand#getAddress
	 * <em>Address</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Allow Batch</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Batch</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Batch</em>' attribute.
	 * @see #setAllowBatch(boolean)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommand_AllowBatch()
	 * @model default="true"
	 * @generated
	 */
	boolean isAllowBatch();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCommand#isAllowBatch <em>Allow Batch</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Allow Batch</em>' attribute.
	 * @see #isAllowBatch()
	 * @generated
	 */
	void setAllowBatch(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.os.cmd.QCommandParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommand_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	List<QCommandParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Program</em>' attribute.
	 * @see #setProgram(String)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommand_Program()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getProgram();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCommand#getProgram
	 * <em>Program</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Program</em>' attribute.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(QCommandSource)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommand_Source()
	 * @model containment="true"
	 * @generated
	 */
	QCommandSource getSource();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCommand#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(QCommandSource value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"SUP"</code>.
	 * The literals are from the enumeration {@link org.smeup.sys.os.cmd.CommandStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.smeup.sys.os.cmd.CommandStatus
	 * @see #setStatus(CommandStatus)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommand_Status()
	 * @model default="SUP"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	CommandStatus getStatus();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCommand#getStatus
	 * <em>Status</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Status</em>' attribute.
	 * @see org.smeup.sys.os.cmd.CommandStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CommandStatus value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommand_TypeName()
	 * @model annotation="il-data length='128'"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCommand#getTypeName
	 * <em>Type Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Class CMD</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class CMD</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class CMD</em>' attribute.
	 * @see #setClassCMD(boolean)
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommand_ClassCMD()
	 * @model default="false"
	 * @generated
	 */
	boolean isClassCMD();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.cmd.QCommand#isClassCMD
	 * <em>Class CMD</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Class CMD</em>' attribute.
	 * @see #isClassCMD()
	 * @generated
	 */
	void setClassCMD(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QCommandParameter getParameter(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" orderRequired="true"
	 * @generated
	 */
	List<QCommandParameter> getParameters(CommandParameterOrder order);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isSupported();

} // QCommand
