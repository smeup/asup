/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;

import org.smeup.sys.il.core.term.QNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Expression</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface QExpression extends QNode {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model visitorRequired="true"
	 * @generated
	 */
	void accept(QExpressionVisitor visitor);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	ExpressionType getExpressionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model patternRequired="true"
	 * @generated
	 */
	boolean match(String pattern);

} // QExpression
