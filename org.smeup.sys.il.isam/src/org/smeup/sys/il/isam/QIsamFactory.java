/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.isam;

import org.smeup.sys.il.data.QRecord;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Isam Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.isam.QIntegratedLanguageIsamPackage#getIsamFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QIsamFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen);

} // QIsamFactory
