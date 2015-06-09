/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.QScrollerDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Scroller Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ScrollerDefImpl<D extends QScroller<QBufferedData>> extends MultipleAtomicBufferedDataDefImpl<D> implements QScrollerDef<D> {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollerDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.SCROLLER_DEF;
	}

	@Override
	public Class<?> getJavaClass() {
		return List.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<D> getDataClass() {
		return (Class<D>) QScroller.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.SCROLLER;
	}
} // ScrollerDefImpl
