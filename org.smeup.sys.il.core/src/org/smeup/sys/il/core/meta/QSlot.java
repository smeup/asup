/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.meta;

import org.smeup.sys.il.core.QNameable;
import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Slot</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage#getSlot()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QSlot extends QNameable {

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation"
	 * @generated
	 */
	QCardinality getCardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation"
	 * @generated
	 */
	Object getDefaultValue();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model kind="operation"
	 * @generated
	 */
	QDomain getDomain();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model kind="operation"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model kind="operation"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model nsPrefixRequired="true"
	 * @generated
	 */
	QObject getValue(String nsPrefix);
} // QSlot
