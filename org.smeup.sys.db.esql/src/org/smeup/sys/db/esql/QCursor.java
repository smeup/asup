/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.esql;

import java.io.Closeable;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QNumeric;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cursor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage#getCursor()
 * @model interface="true" abstract="true" superTypes="org.smeup.sys.db.esql.ESqlObject org.smeup.sys.mi.core.JavaCloseable"
 * @generated
 */
public interface QCursor extends QESqlObject, Closeable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void after();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void before();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void next(QBufferedData target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetDataType="org.smeup.sys.db.esql.CursorRecord" targetRequired="true"
	 * @generated
	 */
	void next(QBufferedData[] target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void next(QDataStruct target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descriptorRequired="true"
	 * @generated
	 */
	void next(String descriptor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void open();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void prior(QBufferedData target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetDataType="org.smeup.sys.db.esql.CursorRecord" targetRequired="true"
	 * @generated
	 */
	void prior(QBufferedData[] target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void prior(QDataStruct target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descriptorRequired="true"
	 * @generated
	 */
	void prior(String descriptor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model positionRequired="true" descriptorRequired="true"
	 * @generated
	 */
	void relative(QNumeric position, String descriptor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void first(QBufferedData target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetDataType="org.smeup.sys.db.esql.CursorRecord" targetRequired="true"
	 * @generated
	 */
	void first(QBufferedData[] target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void first(QDataStruct target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descriptorRequired="true"
	 * @generated
	 */
	void first(String descriptor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void last(QBufferedData target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetDataType="org.smeup.sys.db.esql.CursorRecord" targetRequired="true"
	 * @generated
	 */
	void last(QBufferedData[] target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void last(QDataStruct target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descriptorRequired="true"
	 * @generated
	 */
	void last(String descriptor);

} // QCursor
