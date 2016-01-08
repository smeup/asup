/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.mi.core.util;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Files</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.mi.core.util.QMachineInterfaceUtilPackage#getFiles()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFiles {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" fileNameRequired="true"
	 * @generated
	 */
	String getBaseName(String fileName);

} // QFiles