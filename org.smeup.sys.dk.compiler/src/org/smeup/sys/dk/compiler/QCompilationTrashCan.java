/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;

import java.util.List;

import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Trashcan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.dk.compiler.QCompilationTrashCan#getDataTerms <em>Data Terms</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilationTrashCan()
 * @model
 * @generated
 */
public interface QCompilationTrashCan {
	/**
	 * Returns the value of the '<em><b>Data Terms</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.data.term.QDataTerm}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Terms</em>' containment reference list.
	 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilationTrashCan_DataTerms()
	 * @model containment="true"
	 * @generated
	 */
	List<QDataTerm<?>> getDataTerms();

} // QCompilationTrashCan
