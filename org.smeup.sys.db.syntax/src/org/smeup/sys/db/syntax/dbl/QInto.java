/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Into Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QInto#getDescriptorName <em>Descriptor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QInto#getUsing <em>Using</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getInto()
 * @model
 * @generated
 */
public interface QInto {
	/**
	 * Returns the value of the '<em><b>Descriptor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor Name</em>' attribute.
	 * @see #setDescriptorName(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getInto_DescriptorName()
	 * @model required="true"
	 * @generated
	 */
	String getDescriptorName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QInto#getDescriptorName <em>Descriptor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor Name</em>' attribute.
	 * @see #getDescriptorName()
	 * @generated
	 */
	void setDescriptorName(String value);

	/**
	 * Returns the value of the '<em><b>Using</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.db.syntax.dbl.UsingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' attribute.
	 * @see org.smeup.sys.db.syntax.dbl.UsingType
	 * @see #setUsing(UsingType)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getInto_Using()
	 * @model
	 * @generated
	 */
	UsingType getUsing();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QInto#getUsing <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using</em>' attribute.
	 * @see org.smeup.sys.db.syntax.dbl.UsingType
	 * @see #getUsing()
	 * @generated
	 */
	void setUsing(UsingType value);

} // QIntoClause
