/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx;

import java.net.URI;
import java.util.List;
import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.core.ctx.QCapability#getRights <em>Rights</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.ctx.QCapability#getObjectURI <em>Object URI</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#getCapability()
 * @model abstract="true"
 * @generated
 */
public interface QCapability extends QObject {

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' attribute list.
	 * The list contents are of type {@link org.smeup.sys.il.core.ctx.CapabilityRight}.
	 * The literals are from the enumeration {@link org.smeup.sys.il.core.ctx.CapabilityRight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' attribute list.
	 * @see org.smeup.sys.il.core.ctx.CapabilityRight
	 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#getCapability_Rights()
	 * @model
	 * @generated
	 */
	List<CapabilityRight> getRights();

	/**
	 * Returns the value of the '<em><b>Object URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object URI</em>' attribute.
	 * @see #setObjectURI(URI)
	 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#getCapability_ObjectURI()
	 * @model dataType="org.smeup.sys.mi.core.JavaURI" required="true"
	 * @generated
	 */
	URI getObjectURI();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.core.ctx.QCapability#getObjectURI <em>Object URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object URI</em>' attribute.
	 * @see #getObjectURI()
	 * @generated
	 */
	void setObjectURI(URI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getObjectName();

} // QCapability
