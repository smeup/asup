/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Area Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataAreaFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDataAreaFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataContextRequired="true" argumentRequired="true" externalNameRequired="true"
	 * @generated
	 */
	<D extends QBufferedElement> QDataArea<D> createDataArea(QDataContext dataContext, D argument, QString externalName);

} // QDataAreaFactory
