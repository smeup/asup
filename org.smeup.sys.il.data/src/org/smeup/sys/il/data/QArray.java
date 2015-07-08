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
 * <em><b>Array</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getArray()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QArray<D extends QBufferedData> extends QBufferedList<D> {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QArray<D> value);
} // QArray
