/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.core;

import org.smeup.sys.il.core.meta.QFacet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Development Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.dk.core.QDevelopmentStatus#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.dk.core.QDevelopmentKitCorePackage#getDevelopmentStatus()
 * @model
 * @generated
 */
public interface QDevelopmentStatus extends QFacet {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.dk.core.DevelopmentStatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.smeup.sys.dk.core.DevelopmentStatusType
	 * @see #setValue(DevelopmentStatusType)
	 * @see org.smeup.sys.dk.core.QDevelopmentKitCorePackage#getDevelopmentStatus_Value()
	 * @model required="true"
	 * @generated
	 */
	DevelopmentStatusType getValue();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.core.QDevelopmentStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.smeup.sys.dk.core.DevelopmentStatusType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DevelopmentStatusType value);

} // QDevelopmentStatus
