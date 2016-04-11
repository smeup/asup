/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf.impl;

import org.eclipse.emf.ecore.EClass;

import org.smeup.sys.os.msgf.QMessageFile;
import org.smeup.sys.os.msgf.QMessageFileContainer;
import org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage;

import org.smeup.sys.os.type.impl.TypedContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message File Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MessageFileContainerImpl extends TypedContainerImpl<QMessageFile> implements QMessageFileContainer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFileContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemMessageFilePackage.Literals.MESSAGE_FILE_CONTAINER;
	}

} //MessageFileContainerImpl
