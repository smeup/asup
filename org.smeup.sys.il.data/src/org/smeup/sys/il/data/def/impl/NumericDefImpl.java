/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QDefPackage;
import org.smeup.sys.il.data.def.QNumericDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numeric Def</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class NumericDefImpl extends UnaryAtomicBufferedDataDefImpl<QNumeric> implements QNumericDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDefPackage.Literals.NUMERIC_DEF;
	}

	@Override
	public Class<?> getJavaClass() {
		return Number.class;
	}

	@Override
	public Class<QNumeric> getDataClass() {
		return QNumeric.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.DECIMAL;
	}
} // NumericDefImpl
