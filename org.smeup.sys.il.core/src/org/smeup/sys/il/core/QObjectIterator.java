/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import java.io.Closeable;
import java.util.Iterator;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QObject Iterator</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getObjectIterator()
 * @model interface="true" abstract="true" superTypes="org.smeup.sys.mi.core.JavaIterator<T> org.smeup.sys.mi.core.JavaCloseable"
 * @generated
 */
public interface QObjectIterator<T extends QObject> extends Iterator<T>, Closeable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	@Override
	boolean hasNext();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	@Override
	T next();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	@Override
	void remove();

} // QObjectIterator
