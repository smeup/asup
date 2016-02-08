/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type.impl;

import org.eclipse.emf.ecore.EClass;

import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeContainerImpl extends TypedContainerImpl<QType<?>> implements QTypeContainer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemTypePackage.Literals.TYPE_CONTAINER;
	}

} //TypeContainerImpl
