/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QIdentity;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QDefPackage;
import org.smeup.sys.il.data.def.QIdentityDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Identity Def</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class IdentityDefImpl extends UnaryAtomicBufferedDataDefImpl<QIdentity> implements QIdentityDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDefPackage.Literals.IDENTITY_DEF;
	}

	@Override
	public Class<QIdentity> getDataClass() {
		return QIdentity.class;
	}

	@Override
	public Class<?> getJavaClass() {
		return Object.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.IDENTITY;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getLength() {
		return 10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getSize() {
		return getLength();
	}
} // IdentityDefImpl
