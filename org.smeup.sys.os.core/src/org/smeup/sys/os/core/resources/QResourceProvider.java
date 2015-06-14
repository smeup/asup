/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.resources;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource Provider</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResourceProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QResourceProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" klassRequired="true" containerRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QResourceReader<T> getResourceReader(QJob job, Class<T> klass, String container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" klassRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QResourceSetReader<T> getResourceReader(QJob job, Class<T> klass, Scope scope);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" klassRequired="true" containerRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, String container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" klassRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QJob job, Class<T> klass, Scope scope);

} // QResourceProvider
