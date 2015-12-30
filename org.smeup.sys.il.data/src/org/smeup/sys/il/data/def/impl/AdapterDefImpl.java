/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QAdapterDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Adapter Def</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class AdapterDefImpl extends UnaryAtomicDataDefImpl<QAdapter> implements QAdapterDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.ADAPTER_DEF;
	}

	@Override
	public Class<QAdapter> getDataClass() {
		return QAdapter.class;
	}

	@Override
	public Class<?> getJavaClass() {
		return Object.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.ADAPTER;
	}

} // AdapterDefImpl
