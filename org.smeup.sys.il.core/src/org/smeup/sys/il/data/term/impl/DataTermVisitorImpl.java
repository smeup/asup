/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.term.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QDataTermVisitor;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Term Visitor</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataTermVisitorImpl extends MinimalEObjectImpl.Container implements QDataTermVisitor {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTermVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataTermPackage.Literals.DATA_TERM_VISITOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void endVisit(QDataTerm<?> term) {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean visit(QDataTerm<?> term) {
		return true;
	}
} // DataTermVisitorImpl
