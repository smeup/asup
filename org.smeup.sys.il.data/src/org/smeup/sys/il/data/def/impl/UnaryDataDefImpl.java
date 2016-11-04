/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.def.QDefPackage;
import org.smeup.sys.il.data.def.QUnaryDataDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Unary Data Def</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class UnaryDataDefImpl<D extends QData> extends DataDefImpl<D> implements QUnaryDataDef<D> {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryDataDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDefPackage.Literals.UNARY_DATA_DEF;
	}

} // UnaryDataDefImpl
