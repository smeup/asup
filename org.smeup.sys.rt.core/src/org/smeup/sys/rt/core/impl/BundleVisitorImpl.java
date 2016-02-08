/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectContainer;
import org.smeup.sys.rt.core.QBundleVisitor;
import org.smeup.sys.rt.core.QRuntimeCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Bundle Visitor</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BundleVisitorImpl extends MinimalEObjectImpl.Container implements QBundleVisitor {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRuntimeCorePackage.Literals.BUNDLE_VISITOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void visit(QObject object) {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void visitEnter(QObjectContainer<?> container) {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void visitExit(QObjectContainer<?> container) {
	}

} // BundleVisitorImpl
