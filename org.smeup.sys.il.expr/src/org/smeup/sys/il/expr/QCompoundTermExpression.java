/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Compound Term Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.expr.QCompoundTermExpression#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getCompoundTermExpression()
 * @model abstract="true"
 * @generated
 */
public interface QCompoundTermExpression extends QTermExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.expr.QExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getCompoundTermExpression_Elements()
	 * @model containment="true"
	 * @generated
	 */
	List<QExpression> getElements();

} // QCompoundTermExpression
