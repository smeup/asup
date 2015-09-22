/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.out;

import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QOutput Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage#getOutputManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QOutputManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" contextRequired="true"
	 * @generated
	 */
	QObjectWriter getDefaultWriter(QContext context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" nameRequired="true"
	 * @generated
	 */
	QObjectWriter getObjectWriter(QContext context, String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model contextRequired="true" nameRequired="true" writerRequired="true"
	 * @generated
	 */
	void registerWriter(QContext context, String name, QObjectWriter writer);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model contextRequired="true" nameRequired="true"
	 * @generated
	 */
	void setDefaultWriter(QContext context, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" labelRequired="true"
	 * @generated
	 */
	QWritableObject getWritableObject(String label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" labelRequired="true" columnLengthRequired="true"
	 * @generated
	 */
	QWritableObject getWritableObject(String label, int columnLength);

} // QOutputManager
