/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd;

import java.util.List;
import org.smeup.sys.os.type.QTypedContainer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Command Container</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.cmd.QCommandContainer#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommandContainer()
 * @model
 * @generated
 */
public interface QCommandContainer extends QTypedContainer<QCommand> {

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
	 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage#getCommandContainer_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.cmd.QCommandContainer#getTypeName
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" orderRequired="true"
	 * @generated
	 */
	List<QCommand> getCommands(CommandOrder order);
} // QCommandContainer
