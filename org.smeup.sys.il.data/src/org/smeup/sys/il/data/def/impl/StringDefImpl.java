/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QDefPackage;
import org.smeup.sys.il.data.def.QStringDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>String Def</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class StringDefImpl extends UnaryAtomicBufferedDataDefImpl<QString> implements QStringDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StringDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDefPackage.Literals.STRING_DEF;
	}

	@Override
	public Class<?> getJavaClass() {
		return String.class;
	}

	@Override
	public Class<QString> getDataClass() {
		return QString.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.STRING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getLength() {
		return 255;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getSize() {
		return getLength();
	}
} // StringDefImpl
