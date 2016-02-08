/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.splf.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;
import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.splf.QOperatingSystemSpoolFilePackage;
import org.smeup.sys.os.splf.QSpoolFile;
import org.smeup.sys.os.splf.QSpoolFileRow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spool File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileImpl#getJobReference <em>Job Reference</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileImpl#getOutQueue <em>Out Queue</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileImpl#getSpoolID <em>Spool ID</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileImpl#getUserData <em>User Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpoolFileImpl extends ObjectNameableImpl implements QSpoolFile {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJobReference() <em>Job Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobReference()
	 * @generated
	 * @ordered
	 */
	protected QJobReference jobReference;

	/**
	 * The default value of the '{@link #getOutQueue() <em>Out Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutQueue()
	 * @generated
	 * @ordered
	 */
	protected static final String OUT_QUEUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutQueue() <em>Out Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutQueue()
	 * @generated
	 * @ordered
	 */
	protected String outQueue = OUT_QUEUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<QSpoolFileRow> rows;

	/**
	 * The default value of the '{@link #getSpoolID() <em>Spool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolID()
	 * @generated
	 * @ordered
	 */
	protected static final String SPOOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpoolID() <em>Spool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoolID()
	 * @generated
	 * @ordered
	 */
	protected String spoolID = SPOOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserData() <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserData()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserData() <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserData()
	 * @generated
	 * @ordered
	 */
	protected String userData = USER_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpoolFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemSpoolFilePackage.Literals.SPOOL_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QJobReference getJobReference() {
		return jobReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobReference(QJobReference newJobReference, NotificationChain msgs) {
		QJobReference oldJobReference = jobReference;
		jobReference = newJobReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_REFERENCE, oldJobReference, newJobReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobReference(QJobReference newJobReference) {
		if (newJobReference != jobReference) {
			NotificationChain msgs = null;
			if (jobReference != null)
				msgs = ((InternalEObject)jobReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_REFERENCE, null, msgs);
			if (newJobReference != null)
				msgs = ((InternalEObject)newJobReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_REFERENCE, null, msgs);
			msgs = basicSetJobReference(newJobReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_REFERENCE, newJobReference, newJobReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutQueue() {
		return outQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutQueue(String newOutQueue) {
		String oldOutQueue = outQueue;
		outQueue = newOutQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE__OUT_QUEUE, oldOutQueue, outQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpoolID() {
		return spoolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpoolID(String newSpoolID) {
		String oldSpoolID = spoolID;
		spoolID = newSpoolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE__SPOOL_ID, oldSpoolID, spoolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserData() {
		return userData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserData(String newUserData) {
		String oldUserData = userData;
		userData = newUserData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE__USER_DATA, oldUserData, userData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QSpoolFileRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentWithInverseEList<QSpoolFileRow>(QSpoolFileRow.class, this, QOperatingSystemSpoolFilePackage.SPOOL_FILE__ROWS, QOperatingSystemSpoolFilePackage.SPOOL_FILE_ROW__SPOOL_FILE);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__ROWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRows()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_REFERENCE:
				return basicSetJobReference(null, msgs);
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__FILE_NAME:
				return getFileName();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_REFERENCE:
				return getJobReference();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__OUT_QUEUE:
				return getOutQueue();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__ROWS:
				return getRows();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__SPOOL_ID:
				return getSpoolID();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__USER_DATA:
				return getUserData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_REFERENCE:
				setJobReference((QJobReference)newValue);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__OUT_QUEUE:
				setOutQueue((String)newValue);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends QSpoolFileRow>)newValue);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__SPOOL_ID:
				setSpoolID((String)newValue);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__USER_DATA:
				setUserData((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_REFERENCE:
				setJobReference((QJobReference)null);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__OUT_QUEUE:
				setOutQueue(OUT_QUEUE_EDEFAULT);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__ROWS:
				getRows().clear();
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__SPOOL_ID:
				setSpoolID(SPOOL_ID_EDEFAULT);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__USER_DATA:
				setUserData(USER_DATA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_REFERENCE:
				return jobReference != null;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__OUT_QUEUE:
				return OUT_QUEUE_EDEFAULT == null ? outQueue != null : !OUT_QUEUE_EDEFAULT.equals(outQueue);
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__ROWS:
				return rows != null && !rows.isEmpty();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__SPOOL_ID:
				return SPOOL_ID_EDEFAULT == null ? spoolID != null : !SPOOL_ID_EDEFAULT.equals(spoolID);
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__USER_DATA:
				return USER_DATA_EDEFAULT == null ? userData != null : !USER_DATA_EDEFAULT.equals(userData);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", outQueue: ");
		result.append(outQueue);
		result.append(", spoolID: ");
		result.append(spoolID);
		result.append(", userData: ");
		result.append(userData);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return getSpoolID();
	}

} //SpoolFileImpl
