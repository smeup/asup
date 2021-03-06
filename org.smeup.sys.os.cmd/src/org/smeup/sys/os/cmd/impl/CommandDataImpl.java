/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd.impl;

import org.eclipse.emf.ecore.EClass;

import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.term.impl.DataTermImpl;

import org.smeup.sys.os.cmd.QCommandData;
import org.smeup.sys.os.cmd.QOperatingSystemCommandPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommandDataImpl extends DataTermImpl<QDataDef<?>> implements QCommandData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemCommandPackage.Literals.COMMAND_DATA;
	}

} //CommandDataImpl
