/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;
import org.smeup.sys.os.file.QPrinterFileFormat;
import org.smeup.sys.os.file.QPrinterFileFormatDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Printer File Format</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class PrinterFileFormatImpl extends FileFormatImpl<QPrinterFileFormatDef> implements QPrinterFileFormat {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PrinterFileFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.PRINTER_FILE_FORMAT;
	}
} // PrinterFileFormatImpl
