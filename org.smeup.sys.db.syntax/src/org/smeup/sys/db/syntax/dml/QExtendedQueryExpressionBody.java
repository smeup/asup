/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dml;

import org.eclipse.datatools.modelbase.sql.query.QueryExpressionBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QExtended Query Expression Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dml.QExtendedQueryExpressionBody#getOptimizeRecordsNumber <em>Optimize Records Number</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage#getExtendedQueryExpressionBody()
 * @model
 * @generated
 */
public interface QExtendedQueryExpressionBody extends QueryExpressionBody {
	/**
	 * Returns the value of the '<em><b>Optimize Records Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimize Records Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimize Records Number</em>' attribute.
	 * @see #setOptimizeRecordsNumber(int)
	 * @see org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage#getExtendedQueryExpressionBody_OptimizeRecordsNumber()
	 * @model
	 * @generated
	 */
	int getOptimizeRecordsNumber();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dml.QExtendedQueryExpressionBody#getOptimizeRecordsNumber <em>Optimize Records Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimize Records Number</em>' attribute.
	 * @see #getOptimizeRecordsNumber()
	 * @generated
	 */
	void setOptimizeRecordsNumber(int value);

} // QExtendedQueryExpressionBody
