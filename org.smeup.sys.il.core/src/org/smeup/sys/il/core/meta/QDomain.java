/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.meta;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Domain</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.smeup.sys.il.core.meta.QDomain#getName <em>Name</em>}</li>
 * <li>{@link org.smeup.sys.il.core.meta.QDomain#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage#getDomain()
 * @model
 * @generated
 */
public interface QDomain extends QFacet {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage#getDomain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.core.meta.QDomain#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage#getDomain_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.core.meta.QDomain#getText
	 * <em>Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // QDomain
