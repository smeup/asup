/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.term.impl.DataTermImpl;
import org.smeup.sys.os.file.QFileFormat;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>File Format</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FileFormatImpl<DD extends QCompoundDataDef<?, ?>> extends DataTermImpl<DD> implements QFileFormat<DD> {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FileFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.FILE_FORMAT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> This is specialized for the
	 * more specific type known in this context.
	 *
	 * @generated
	 */
	@Override
	public NotificationChain basicSetDefinition(DD newDefinition, NotificationChain msgs) {
		return super.basicSetDefinition(newDefinition, msgs);
	}
} // FileFormatImpl
