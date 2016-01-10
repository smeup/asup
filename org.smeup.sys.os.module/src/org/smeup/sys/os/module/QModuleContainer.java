/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.module;

import org.smeup.sys.os.type.QTypedContainer;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Module Container</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.module.QModuleContainer#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.smeup.sys.os.module.QModuleContainer#isScanPackage <em>Scan Package</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.module.QOperatingSystemModulePackage#getModuleContainer()
 * @model
 * @generated
 */
public interface QModuleContainer extends QTypedContainer<QModule> {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.smeup.sys.os.module.QOperatingSystemModulePackage#getModuleContainer_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.module.QModuleContainer#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Scan Package</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scan Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Scan Package</em>' attribute.
	 * @see #setScanPackage(boolean)
	 * @see org.smeup.sys.os.module.QOperatingSystemModulePackage#getModuleContainer_ScanPackage()
	 * @model required="true"
	 * @generated
	 */
	boolean isScanPackage();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.module.QModuleContainer#isScanPackage <em>Scan Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Scan Package</em>' attribute.
	 * @see #isScanPackage()
	 * @generated
	 */
	void setScanPackage(boolean value);

} // QModuleContainer
