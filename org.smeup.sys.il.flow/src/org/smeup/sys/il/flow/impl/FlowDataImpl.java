/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.term.impl.DataTermImpl;
import org.smeup.sys.il.flow.QFlowData;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Flow Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FlowDataImpl extends DataTermImpl<QDataDef<?>> implements QFlowData {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FlowDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageFlowPackage.Literals.FLOW_DATA;
	}

} // FlowDataImpl
