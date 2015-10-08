/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;

import java.util.List;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectNameable;

import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.rt.core.QApplicationComponent#getConfigs <em>Configs</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QApplicationComponent#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QApplicationComponent#getModules <em>Modules</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QApplicationComponent#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplicationComponent()
 * @model
 * @generated
 */
public interface QApplicationComponent extends QObjectNameable, QContextProvider {
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
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplicationComponent_Hooks()
	 * @model containment="true"
	 * @generated
	 */
	List<QServiceHook> getHooks();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link org.smeup.sys.rt.core.QApplicationModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplicationComponent_Modules()
	 * @model
	 * @generated
	 */
	List<QApplicationModule> getModules();

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
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplicationComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	@Override
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QApplicationComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.core.QObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configs</em>' containment reference list.
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getApplicationComponent_Configs()
	 * @model containment="true"
	 * @generated
	 */
	List<QObject> getConfigs();

} // QApplicationComponent
