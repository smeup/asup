/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Manager Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.QDataManagerConfig#getInjectionStrategy <em>Injection Strategy</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataManagerConfig()
 * @model
 * @generated
 */
public interface QDataManagerConfig extends QObject {
	/**
	 * Returns the value of the '<em><b>Injection Strategy</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.smeup.sys.il.data.InjectionStrategyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injection Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injection Strategy</em>' attribute.
	 * @see org.smeup.sys.il.data.InjectionStrategyType
	 * @see #setInjectionStrategy(InjectionStrategyType)
	 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataManagerConfig_InjectionStrategy()
	 * @model default=""
	 * @generated
	 */
	InjectionStrategyType getInjectionStrategy();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.QDataManagerConfig#getInjectionStrategy <em>Injection Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injection Strategy</em>' attribute.
	 * @see org.smeup.sys.il.data.InjectionStrategyType
	 * @see #getInjectionStrategy()
	 * @generated
	 */
	void setInjectionStrategy(InjectionStrategyType value);

} // QDataManagerConfig
