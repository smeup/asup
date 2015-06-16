/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq;

import org.smeup.sys.il.lock.QObjectLockable;

import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueue#getDataQueueType <em>Data Queue Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueue#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueue#getMaxEntryLength <em>Max Entry Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueue#isSenderInfo <em>Sender Info</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueue#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueue()
 * @model
 * @generated
 */
public interface QDataQueue extends QTypedObject, QObjectLockable {
	/**
	 * Returns the value of the '<em><b>Data Queue Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.os.dtaq.DataQueueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Queue Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Queue Type</em>' attribute.
	 * @see org.smeup.sys.os.dtaq.DataQueueType
	 * @see #setDataQueueType(DataQueueType)
	 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueue_DataQueueType()
	 * @model required="true"
	 * @generated
	 */
	DataQueueType getDataQueueType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaq.QDataQueue#getDataQueueType <em>Data Queue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Queue Type</em>' attribute.
	 * @see org.smeup.sys.os.dtaq.DataQueueType
	 * @see #getDataQueueType()
	 * @generated
	 */
	void setDataQueueType(DataQueueType value);

	/**
	 * Returns the value of the '<em><b>Key Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Length</em>' attribute.
	 * @see #setKeyLength(int)
	 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueue_KeyLength()
	 * @model required="true"
	 * @generated
	 */
	int getKeyLength();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaq.QDataQueue#getKeyLength <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Length</em>' attribute.
	 * @see #getKeyLength()
	 * @generated
	 */
	void setKeyLength(int value);

	/**
	 * Returns the value of the '<em><b>Max Entry Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Entry Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Entry Length</em>' attribute.
	 * @see #setMaxEntryLength(int)
	 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueue_MaxEntryLength()
	 * @model required="true"
	 * @generated
	 */
	int getMaxEntryLength();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaq.QDataQueue#getMaxEntryLength <em>Max Entry Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Entry Length</em>' attribute.
	 * @see #getMaxEntryLength()
	 * @generated
	 */
	void setMaxEntryLength(int value);

	/**
	 * Returns the value of the '<em><b>Sender Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Info</em>' attribute.
	 * @see #setSenderInfo(boolean)
	 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueue_SenderInfo()
	 * @model
	 * @generated
	 */
	boolean isSenderInfo();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaq.QDataQueue#isSenderInfo <em>Sender Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Info</em>' attribute.
	 * @see #isSenderInfo()
	 * @generated
	 */
	void setSenderInfo(boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(QDataQueueContent)
	 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueue_Content()
	 * @model containment="true"
	 * @generated
	 */
	QDataQueueContent getContent();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaq.QDataQueue#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(QDataQueueContent value);

} // QDataQueue
