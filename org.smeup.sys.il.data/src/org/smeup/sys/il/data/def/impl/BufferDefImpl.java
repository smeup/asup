/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import java.nio.Buffer;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QBufferDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Buffer Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BufferDefImpl extends UnaryAtomicBufferedDataDefImpl<QBufferedData> implements QBufferDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BufferDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.BUFFER_DEF;
	}

	@Override
	public Class<QBufferedData> getDataClass() {
		return QBufferedData.class;
	}

	@Override
	public Class<?> getJavaClass() {
		return Buffer.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.BUFFER;
	}
} // BufferDefImpl
