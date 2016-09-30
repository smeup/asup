/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import org.smeup.sys.il.core.ctx.QContextProvider;

import org.smeup.sys.il.data.QDataContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getAccessContext()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QAccessContext extends QContextProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QDataContext getDataContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QAccessFactory getAccessFactory();

} // QAccessContext
