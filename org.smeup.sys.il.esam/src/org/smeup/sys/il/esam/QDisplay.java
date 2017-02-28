/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import java.io.Serializable;

import org.smeup.sys.il.data.QRecord;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Display</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getDisplay()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDisplay<R extends QRecord> extends QFileHandler<R>, Serializable{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true"
	 * @generated
	 */
	void readc(Class<?> format);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true"
	 * @generated
	 */
	void show(Class<?> format);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true"
	 * @generated
	 */
	void update(Class<?> format);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model formatRequired="true"
	 * @generated
	 */
	void write(Class<?> format);

} // QDisplay
