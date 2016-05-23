/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

import java.util.List;

import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QFile Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFileManager {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" nameRequired="true"
	 * @generated
	 */
	QFileOverride getFileOverride(QContext context, String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model contextRequired="true" fileOverrideRequired="true"
	 * @generated
	 */
	void setFileOverride(QContext context, QFileOverride fileOverride);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" contextRequired="true"
	 * @generated
	 */
	List<QFileOverride> listFileOverride(QContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" nameRequired="true"
	 * @generated
	 */
	QFileOverride removeFileOverride(QContext context, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	void removeAllFileOverride(QContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" fileRequired="true" formatNameRequired="true"
	 * @generated
	 */
	QFileFormat<?> getFileFormat(QFile file, String formatName);
} // QFileManager
