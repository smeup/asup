/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;

import org.smeup.sys.il.core.meta.QFacet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.dk.compiler.QCompilerLinker#getLinkedClass <em>Linked Class</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.QCompilerLinker#getLinkedTermName <em>Linked Term Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilerLinker()
 * @model
 * @generated
 */
public interface QCompilerLinker extends QFacet {
	/**
	 * Returns the value of the '<em><b>Linked Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Class</em>' attribute.
	 * @see #setLinkedClass(Class)
	 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilerLinker_LinkedClass()
	 * @model transient="true"
	 * @generated
	 */
	Class<?> getLinkedClass();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.compiler.QCompilerLinker#getLinkedClass <em>Linked Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Class</em>' attribute.
	 * @see #getLinkedClass()
	 * @generated
	 */
	void setLinkedClass(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Linked Term Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Term Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Term Name</em>' attribute.
	 * @see #setLinkedTermName(String)
	 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilerLinker_LinkedTermName()
	 * @model transient="true"
	 * @generated
	 */
	String getLinkedTermName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.compiler.QCompilerLinker#getLinkedTermName <em>Linked Term Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Term Name</em>' attribute.
	 * @see #getLinkedTermName()
	 * @generated
	 */
	void setLinkedTermName(String value);

} // QCompilerLinker
