/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Prototype</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QPrototype#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getPrototype()
 * @model
 * @generated
 */
public interface QPrototype extends QDataTerm<QDataDef<?>> {

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(QEntry)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getPrototype_Entry()
	 * @model containment="true"
	 * @generated
	 */
	QEntry getEntry();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QPrototype#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(QEntry value);
} // QPrototype
