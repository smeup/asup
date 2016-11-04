/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QDefPackage;
import org.smeup.sys.il.data.def.QPointerDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Pointer Def</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class PointerDefImpl extends UnaryAtomicDataDefImpl<QPointer> implements QPointerDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDefPackage.Literals.POINTER_DEF;
	}

	@Override
	public Class<?> getJavaClass() {
		return QPointer.class;
	}

	@Override
	public Class<QPointer> getDataClass() {
		return QPointer.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.POINTER;
	}
} // PointerDefImpl
