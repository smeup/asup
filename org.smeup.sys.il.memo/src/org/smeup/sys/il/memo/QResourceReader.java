/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.expr.QPredicateExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QResource</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResourceReader()
 * @model abstract="true"
 * @generated
 */
public interface QResourceReader<T extends QObjectNameable> extends QResource<T> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	boolean exists(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QObjectIterator<T> find(String nameFilter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QObjectIterator<T> findByExpression(QPredicateExpression filter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	T lookup(String name);
} // QResource
