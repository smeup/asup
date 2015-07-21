/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Adapter Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#getAdapterFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QAdapterFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model contextRequired="true" adaptableRequired="true" adapterTypeRequired="true" TBounds="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	<T extends Object> T getAdapter(QContext context, Object adaptable, Class<T> adapterType);

} // QAdapterFactory
