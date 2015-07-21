/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.util.List;

import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QDataTermContainer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Container</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDataContainer extends QDataTermContainer {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void clearData();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model keyRequired="true"
	 * @generated
	 */
	QData getData(String key);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model dataTermRequired="true"
	 * @generated
	 */
	QData getData(QDataTerm<?> dataTerm);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model keyRequired="true"
	 * @generated
	 */
	QDataTerm<?> getDataTerm(String key);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	List<String> getKeys();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model keyRequired="true"
	 * @generated
	 */
	boolean isDefault(String key);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model dataTermRequired="true"
	 * @generated
	 */
	boolean isDefault(QDataTerm<?> dataTerm);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model keyRequired="true"
	 * @generated
	 */
	boolean isSet(String key);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model dataTermRequired="true"
	 * @generated
	 */
	boolean isSet(QDataTerm<?> dataTerm);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model dataTermRequired="true"
	 * @generated
	 */
	void removeDataTerm(QDataTerm<?> dataTerm);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void resetData();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model keyRequired="true"
	 * @generated
	 */
	void resetData(String key);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model dataTermRequired="true"
	 * @generated
	 */
	void resetData(QDataTerm<?> dataTerm);

} // QDataContainer
