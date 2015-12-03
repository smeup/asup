/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.out;

import java.io.IOException;
import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QObject Writer</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage#getObjectWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QObjectWriter {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void flush();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException" objectRequired="true"
	 * @generated
	 */
	void write(QObject object) throws IOException;

} // QObjectWriter
