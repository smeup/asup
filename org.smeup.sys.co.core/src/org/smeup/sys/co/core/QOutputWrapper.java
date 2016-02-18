/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.core;

import java.io.IOException;
import java.io.Writer;
import org.smeup.sys.os.core.jobs.QJobCapability;

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
	 * @model
	 * @generated
	 */
	boolean contains(QJobCapability capability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException"
	 * @generated
	 */
	void flush(QJobCapability capability) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model writerDataType="org.smeup.sys.mi.core.JavaWriter"
	 * @generated
	 */
	void register(QJobCapability capability, Writer writer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unregister(QJobCapability capability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException"
	 * @generated
	 */
	void write(QJobCapability capability, String content) throws IOException;

} // QOutputWrapper
