/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Connection Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.QConnectionDescription#getSchemas <em>Schemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionDescription()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QConnectionDescription {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' attribute list.
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionDescription_Schemas()
	 * @model
	 * @generated
	 */
	List<String> getSchemas();

} // QConnectionDescription
