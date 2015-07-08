/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import org.smeup.sys.il.core.QAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Annotation Command</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.smeup.sys.il.flow.QAnnotationCommand#getCommand <em>Command
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getAnnotationCommand()
 * @model
 * @generated
 */
public interface QAnnotationCommand extends QAnnotation {

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getAnnotationCommand_Command()
	 * @model required="true"
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.flow.QAnnotationCommand#getCommand
	 * <em>Command</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);
} // QAnnotationCommand
