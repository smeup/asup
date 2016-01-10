/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaara;

import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QData Area</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.dtaara.QDataArea#getDataAreaType <em>Data Area Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaara.QDataArea#getContentLength <em>Content Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaara.QDataArea#getContentDecimal <em>Content Decimal</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaara.QDataArea#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.dtaara.QOperatingSystemDataAreaPackage#getDataArea()
 * @model
 * @generated
 */
public interface QDataArea extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Data Area Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.os.dtaara.DataAreaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Area Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Area Type</em>' attribute.
	 * @see org.smeup.sys.os.dtaara.DataAreaType
	 * @see #setDataAreaType(DataAreaType)
	 * @see org.smeup.sys.os.dtaara.QOperatingSystemDataAreaPackage#getDataArea_DataAreaType()
	 * @model required="true"
	 * @generated
	 */
	DataAreaType getDataAreaType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaara.QDataArea#getDataAreaType <em>Data Area Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Data Area Type</em>' attribute.
	 * @see org.smeup.sys.os.dtaara.DataAreaType
	 * @see #getDataAreaType()
	 * @generated
	 */
	void setDataAreaType(DataAreaType value);

	/**
	 * Returns the value of the '<em><b>Content Length</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Content Length</em>' attribute.
	 * @see #setContentLength(int)
	 * @see org.smeup.sys.os.dtaara.QOperatingSystemDataAreaPackage#getDataArea_ContentLength()
	 * @model required="true"
	 * @generated
	 */
	int getContentLength();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaara.QDataArea#getContentLength <em>Content Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Content Length</em>' attribute.
	 * @see #getContentLength()
	 * @generated
	 */
	void setContentLength(int value);

	/**
	 * Returns the value of the '<em><b>Content Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Decimal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Decimal</em>' attribute.
	 * @see #setContentDecimal(int)
	 * @see org.smeup.sys.os.dtaara.QOperatingSystemDataAreaPackage#getDataArea_ContentDecimal()
	 * @model
	 * @generated
	 */
	int getContentDecimal();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaara.QDataArea#getContentDecimal <em>Content Decimal</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Content Decimal</em>' attribute.
	 * @see #getContentDecimal()
	 * @generated
	 */
	void setContentDecimal(int value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.smeup.sys.os.dtaara.QOperatingSystemDataAreaPackage#getDataArea_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaara.QDataArea#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // QDataArea
