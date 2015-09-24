/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QRecord;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Access Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getAccessFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QAccessFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" recordRequired="true" nameRequired="true"
	 * @generated
	 */
	<R extends QRecord> QKSDataSet<R> createKeySequencedDataSet(R record, String name, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" recordRequired="true" nameRequired="true"
	 * @generated
	 */
	<R extends QRecord> QRRDataSet<R> createRelativeRecordDataSet(R record, String name, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper, AccessMode accessMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrapperRequired="true"
	 * @generated
	 */
	<R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(Class<R> wrapper, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" recordRequired="true" nameRequired="true"
	 * @generated
	 */
	<R extends QRecord> QSMDataSet<R> createSourceMemberDataSet(R record, String name, AccessMode accessMode, boolean userOpen, QDataStruct infoStruct);

} // QAccessFactory
