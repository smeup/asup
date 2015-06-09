/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.core;

import java.io.IOException;
import java.io.Writer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.co.core.QCommunicationCorePackage#getOutputWrapper()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QOutputWrapper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.il.core.java.JavaIOException"
	 * @generated
	 */
	void flush(String contextID) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.il.core.java.JavaIOException"
	 * @generated
	 */
	void write(String contextID, String value) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model writerDataType="org.smeup.sys.il.core.java.JavaWriter"
	 * @generated
	 */
	void register(String contextID, Writer writer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unregister(String contextID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean contains(String contextID);

} // QOutputWrapper
