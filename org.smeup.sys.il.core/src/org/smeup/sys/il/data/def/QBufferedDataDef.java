/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QBufferedData;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Buffered Data Def</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getBufferedDataDef()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QBufferedDataDef<D extends QBufferedData> extends QDataDef<D> {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getSize();

} // QBufferedDataDef
