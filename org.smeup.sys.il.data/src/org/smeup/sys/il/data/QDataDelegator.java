/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Delegator</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataDelegator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDataDelegator<D extends QData> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QData getDelegate();

} // QDataDelegator
