/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.String;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDataManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataContextRequired="true"
	 * @generated
	 */
	QDataContainer createDataContainer(QDataContext dataContext, Map<String, QDataTerm<?>> dataTerms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true"
	 * @generated
	 */
	QDataContainer createDataContainer(QContext context, Map<String, QDataTerm<?>> dataTerms);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" objectRequired="true" termRequired="true"
	 * @generated
	 */
	QDataContainer createDataContainer(QContext context, QObject object, EClass term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true"
	 * @generated
	 */
	QDataContext createDataContext(QContext context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model containerRequired="true"
	 * @generated
	 */
	void validateDataContainer(QDataContainer container);

} // QDataManager
