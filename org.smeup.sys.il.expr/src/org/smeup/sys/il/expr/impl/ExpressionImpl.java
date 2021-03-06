/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.core.term.impl.NodeImpl;
import org.smeup.sys.il.expr.BaseExpressionStringBuilder;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionVisitor;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage;
import org.smeup.sys.il.expr.neutral.NeutralExpressionMatcher;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExpressionImpl extends NodeImpl implements QExpression {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageExpressionPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(QExpressionVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract ExpressionType getExpressionType();


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		
		BaseExpressionStringBuilder expressionStringBuilderImpl =  new BaseExpressionStringBuilder();
		accept(expressionStringBuilderImpl);

		return expressionStringBuilderImpl.getResult();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean match(String pattern) {
		return NeutralExpressionMatcher.getInstance().match(this, pattern);
	}
	
} // ExpressionImpl
