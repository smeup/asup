/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QResource Writer</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResourceWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QResourceWriter<T extends QObjectNameable> extends QResourceReader<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" objectRequired="true" nameRequired="true"
	 * @generated
	 */
	T copy(T object, String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model objectRequired="true"
	 * @generated
	 */
	void delete(T object);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model objectRequired="true"
	 * @generated
	 */
	void save(T object);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model objectRequired="true" replaceRequired="true"
	 * @generated
	 */
	void save(T object, boolean replace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true" newNameRequired="true"
	 * @generated
	 */
	void rename(T object, String newName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getResourceName();

} // QResourceWriter
