/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.splf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spool File Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage#getSpoolFileWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QSpoolFileWriter {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" spoolFileRequired="true"
	 * @generated
	 */
	void writeSpoolFile(String contextID, QSpoolFile spoolFile);
} // QSpoolFileWriter
