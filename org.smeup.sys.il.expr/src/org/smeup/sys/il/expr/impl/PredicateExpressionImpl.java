/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage;
import org.smeup.sys.il.expr.QPredicateExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Predicate Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PredicateExpressionImpl extends ExpressionImpl implements QPredicateExpression {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageExpressionPackage.Literals.PREDICATE_EXPRESSION;
	}	
} // PredicateExpressionImpl
