/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Multiple Atomic Data Def</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MultipleAtomicDataDefImpl<D extends QList<?>> extends MultipleDataDefImpl<D> implements QMultipleAtomicDataDef<D> {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleAtomicDataDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.MULTIPLE_ATOMIC_DATA_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QUnaryAtomicDataDef<?> getArgument() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // MultipleAtomicDataDefImpl
