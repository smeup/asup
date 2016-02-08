/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.out;

import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Object Writer Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage#getObjectWriterFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QObjectWriterFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" contextRequired="true"
	 * @generated
	 */
	QObjectWriter createObjectWriter(QContext context);

} // QObjectWriterFactory
