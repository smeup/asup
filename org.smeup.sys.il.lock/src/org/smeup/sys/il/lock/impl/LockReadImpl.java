/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.lock.QIntegratedLanguageLockPackage;
import org.smeup.sys.il.lock.QLockRead;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Lock Read</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LockReadImpl extends ObjectImpl implements QLockRead {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LockReadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageLockPackage.Literals.LOCK_READ;
	}

} // LockReadImpl
