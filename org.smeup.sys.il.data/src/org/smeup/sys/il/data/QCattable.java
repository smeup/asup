/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cattable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getCattable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QCattable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, String factor2, int space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(String factor1, String factor2, int space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, String factor2, QNumeric space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(String factor1, String factor2, QNumeric space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, QString factor2, int space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(String factor1, QString factor2, int space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, QString factor2, QNumeric space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(String factor1, QString factor2, QNumeric space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2, int space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2, int space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2, QNumeric space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2, QNumeric space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, String factor2, int space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, String factor2, int space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceType="org.smeup.sys.il.core.java.JavaNumber" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2, Number space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceType="org.smeup.sys.il.core.java.JavaNumber" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2, Number space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceType="org.smeup.sys.il.core.java.JavaNumber" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, String factor2, Number space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" spaceType="org.smeup.sys.il.core.java.JavaNumber" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, String factor2, Number space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true"
	 * @generated
	 */
	void cat(String factor1, String factor2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" clearRequired="true"
	 * @generated
	 */
	void cat(String factor1, String factor2, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true"
	 * @generated
	 */
	void cat(String factor1, QString factor2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" clearRequired="true"
	 * @generated
	 */
	void cat(String factor1, QString factor2, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QString factor2, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true"
	 * @generated
	 */
	void cat(QString factor1, String factor2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" factor2Required="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, String factor2, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true"
	 * @generated
	 */
	void cat(String factor1);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" clearRequired="true"
	 * @generated
	 */
	void cat(String factor1, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" spaceType="org.smeup.sys.il.core.java.JavaNumber" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, Number space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" spaceType="org.smeup.sys.il.core.java.JavaNumber" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, Number space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" spaceType="org.smeup.sys.il.core.java.JavaNumber" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, Number space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" spaceType="org.smeup.sys.il.core.java.JavaNumber" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(String factor1, Number space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QNumeric space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, QNumeric space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" spaceRequired="true"
	 * @generated
	 */
	void cat(String factor1, QNumeric space);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" spaceRequired="true" clearRequired="true"
	 * @generated
	 */
	void cat(String factor1, QNumeric space, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true"
	 * @generated
	 */
	void cat(QString factor1);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factor1Required="true" clearRequired="true"
	 * @generated
	 */
	void cat(QString factor1, boolean clear);

} // QCattable
