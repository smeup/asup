/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QType Registry</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.type.QOperatingSystemTypePackage#getTypeRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QTypeRegistry {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" typedClassRequired="true"
	 * @generated
	 */
	QType<?> lookup(Class<?> typedClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QType<?> lookup(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	List<QType<?>> list();

} // QTypeRegistry
