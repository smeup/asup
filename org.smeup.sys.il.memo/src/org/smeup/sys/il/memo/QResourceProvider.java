/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource Provider</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResourceProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QResourceProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" resourceRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QResourceReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, String resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<T extends QObjectNameable, E extends Enum<E>> QResourceSetReader<T> getResourceReader(QContextProvider contextProvider, Class<T> klass, E path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" resourceRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, String resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	<T extends QObjectNameable, E extends Enum<E>> QResourceWriter<T> getResourceWriter(QContextProvider contextProvider, Class<T> klass, E path);

} // QResourceProvider
