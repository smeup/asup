/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Object Container</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.core.QObjectContainer#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getObjectContainer()
 * @model abstract="true"
 * @generated
 */
public interface QObjectContainer<T extends QObject> extends QObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getObjectContainer_Contents()
	 * @model containment="true"
	 * @generated
	 */
	List<T> getContents();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	T lookupByName(String name);

} // QObjectContainer
