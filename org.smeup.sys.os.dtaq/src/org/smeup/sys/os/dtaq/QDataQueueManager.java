/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq;

import org.smeup.sys.il.data.QString;
import org.smeup.sys.os.core.jobs.QJobCapability;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QData Queue Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueueManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDataQueueManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model capabilityRequired="true" libraryRequired="true" nameRequired="true" valueRequired="true"
	 * @generated
	 */
	void writeDataQueue(QJobCapability capability, String library, String name, String key, QString value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" capabilityRequired="true" libraryRequired="true" nameRequired="true"
	 * @generated
	 */
	String readDataQueue(QJobCapability capability, String library, String name, long timeout, String key, DataQueueSearchType searchType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model capabilityRequired="true" libraryRequired="true" nameRequired="true"
	 * @generated
	 */
	void clearDataQueue(QJobCapability capability, String library, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" capabilityRequired="true" libraryRequired="true" nameRequired="true"
	 * @generated
	 */
	String peekDataQueue(QJobCapability capability, String library, String name, long timeout, String key, DataQueueSearchType searchType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model capabilityRequired="true" libraryRequired="true" nameRequired="true" typeRequired="true" maxEntryLengthRequired="true"
	 * @generated
	 */
	void createDataQueue(QJobCapability capability, String library, String name, DataQueueType type, int maxEntryLength);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model capabilityRequired="true" libraryRequired="true" nameRequired="true" valueRequired="true"
	 * @generated
	 */
	void writeDataQueue(QJobCapability capability, String library, String name, String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model capabilityRequired="true"
	 * @generated
	 */
	void deleteDataQueue(QJobCapability capability, String library, String name);

} // QDataQueueManager
