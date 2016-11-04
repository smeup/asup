/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import java.nio.Buffer;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QBufferDef;
import org.smeup.sys.il.data.def.QDefPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Buffer Def</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class BufferDefImpl extends UnaryAtomicBufferedDataDefImpl<QBufferedElement> implements QBufferDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDefPackage.Literals.BUFFER_DEF;
	}

	@Override
	public Class<QBufferedElement> getDataClass() {
		return QBufferedElement.class;
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
