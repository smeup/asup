/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QBufferedElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Unary Atomic Buffered Data Def</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getUnaryAtomicBufferedDataDef()
 * @model abstract="true"
 * @generated
 */
public interface QUnaryAtomicBufferedDataDef<D extends QBufferedElement> extends QUnaryAtomicDataDef<D>, QUnaryBufferedDataDef<D> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lengthRequired="true"
	 * @generated
	 */
	void setLength(int length);
} // QUnaryAtomicBufferedDataDef
