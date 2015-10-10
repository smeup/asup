/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.impl.CompoundDataDefImpl;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;
import org.smeup.sys.os.file.QPrinterFileField;
import org.smeup.sys.os.file.QPrinterFileFormatDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Printer File Format Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrinterFileFormatDefImpl extends CompoundDataDefImpl<QRecord, QPrinterFileField> implements QPrinterFileFormatDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PrinterFileFormatDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.PRINTER_FILE_FORMAT_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> This is specialized for the
	 * more specific element type known in this context.
	 *
	 * @generated
	 */
	@Override
	public List<QPrinterFileField> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<QPrinterFileField>(QPrinterFileField.class, this, QOperatingSystemFilePackage.PRINTER_FILE_FORMAT_DEF__ELEMENTS);
		}
		return elements;
	}

	@Override
	public Class<?> getJavaClass() {
		return Object.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.STRUCT;
	}

	@Override
	public Class<QRecord> getDataClass() {
		return QRecord.class;
	}
} // PrinterFileFormatDefImpl
