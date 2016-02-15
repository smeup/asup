/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.memo.QResourceHandler#getContextProvider <em>Context Provider</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResourceHandler()
 * @model abstract="true"
 * @generated
 */
public interface QResourceHandler<T extends QObjectNameable> extends QObject {

	/**
	 * Returns the value of the '<em><b>Context Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Provider</em>' reference.
	 * @see #setContextProvider(QContextProvider)
	 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResourceHandler_ContextProvider()
	 * @model resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	QContextProvider getContextProvider();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.memo.QResourceHandler#getContextProvider <em>Context Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Provider</em>' reference.
	 * @see #getContextProvider()
	 * @generated
	 */
	void setContextProvider(QContextProvider value);
} // QResourceHandler
