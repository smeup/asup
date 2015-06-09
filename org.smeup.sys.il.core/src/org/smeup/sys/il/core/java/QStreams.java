/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.java;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streams</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage#getStreams()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QStreams {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inputDataType="org.smeup.sys.il.core.java.JavaInputStream" inputRequired="true" outputDataType="org.smeup.sys.il.core.java.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void copy(InputStream input, OutputStream output);

} // QStreams
