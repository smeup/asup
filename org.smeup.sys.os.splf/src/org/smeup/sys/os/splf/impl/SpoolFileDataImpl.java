/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.splf.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.smeup.sys.il.data.def.QBufferedDataDef;

import org.smeup.sys.il.data.term.impl.DataTermImpl;

import org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage;
import org.smeup.sys.os.splf.QSpoolFileData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spool File Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SpoolFileDataImpl extends DataTermImpl<QBufferedDataDef<?>> implements QSpoolFileData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpoolFileDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemSpoolFilePackage.Literals.SPOOL_FILE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetDefinition(QBufferedDataDef<?> newDefinition, NotificationChain msgs) {
		return super.basicSetDefinition(newDefinition, msgs);
	}

} //SpoolFileDataImpl
