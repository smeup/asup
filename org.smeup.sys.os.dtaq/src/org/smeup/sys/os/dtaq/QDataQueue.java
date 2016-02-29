/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq;

import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueue#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueue#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueue#getMaxEntryLength <em>Max Entry Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueue#isSenderInfo <em>Sender Info</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueue()
 * @model
 * @generated
 */
public interface QDataQueue extends QTypedObject {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.os.dtaq.DataQueueSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see org.smeup.sys.os.dtaq.DataQueueSequence
	 * @see #setSequence(DataQueueSequence)
	 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueue_Sequence()
	 * @model required="true"
	 * @generated
	 */
	DataQueueSequence getSequence();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.dtaq.QDataQueue#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see org.smeup.sys.os.dtaq.DataQueueSequence
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(DataQueueSequence value);

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

} // QDataQueue
