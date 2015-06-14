/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq;

import org.smeup.sys.il.data.QString;

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
	 * @model contextIDRequired="true" libraryRequired="true" nameRequired="true" valueRequired="true"
	 * @generated
	 */
	void writeDataQueue(String contextID, String library, String name, String key, QString value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextIDRequired="true" libraryRequired="true" nameRequired="true"
	 * @generated
	 */
	String readDataQueue(String contextID, String library, String name, long timeout, String key, DataQueueSearchType searchType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" libraryRequired="true" nameRequired="true"
	 * @generated
	 */
	void clearDataQueue(String contextID, String library, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextIDRequired="true" libraryRequired="true" nameRequired="true"
	 * @generated
	 */
	String peekDataQueue(String contextID, String library, String name, long timeout, String key, DataQueueSearchType searchType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" libraryRequired="true" nameRequired="true" typeRequired="true" maxEntryLengthRequired="true"
	 * @generated
	 */
	void createDataQueue(String contextID, String library, String name, DataQueueType type, int maxEntryLength);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" libraryRequired="true" nameRequired="true" valueRequired="true"
	 * @generated
	 */
	void writeDataQueue(String contextID, String library, String name, String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true"
	 * @generated
	 */
	void deleteDataQueue(String contextID, String library, String name);

} // QDataQueueManager
