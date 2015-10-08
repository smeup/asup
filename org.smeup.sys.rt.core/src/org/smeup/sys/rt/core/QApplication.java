/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;

import java.util.List;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.rt.core.QApplication#getComponents <em>Components</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QApplication#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QApplication#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QApplication#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplication()
 * @model
 * @generated
 */
public interface QApplication extends QObjectNameable, QContextProvider {

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.rt.core.QApplicationComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplication_Components()
	 * @model containment="true"
	 * @generated
	 */
	List<QApplicationComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Hooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.rt.core.QServiceHook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hooks</em>' containment reference list.
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplication_Hooks()
	 * @model containment="true"
	 * @generated
	 */
	List<QServiceHook> getHooks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplication_Name()
	 * @model id="true"
	 * @generated
	 */
	@Override
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplication_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QApplication#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);
} // Application
