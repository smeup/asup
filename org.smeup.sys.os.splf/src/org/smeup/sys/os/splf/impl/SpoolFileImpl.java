/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
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
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileImpl#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link org.smeup.sys.os.splf.impl.SpoolFileImpl#getJobUser <em>Job User</em>}</li>
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
	 * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected String jobName = JOB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected int jobNumber = JOB_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobUser() <em>Job User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobUser()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobUser() <em>Job User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobUser()
	 * @generated
	 * @ordered
	 */
	protected String jobUser = JOB_USER_EDEFAULT;

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
	public String getJobName() {
		return jobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobName(String newJobName) {
		String oldJobName = jobName;
		jobName = newJobName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NAME, oldJobName, jobName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobNumber() {
		return jobNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobNumber(int newJobNumber) {
		int oldJobNumber = jobNumber;
		jobNumber = newJobNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NUMBER, oldJobNumber, jobNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobUser() {
		return jobUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobUser(String newJobUser) {
		String oldJobUser = jobUser;
		jobUser = newJobUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_USER, oldJobUser, jobUser));
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
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NAME:
				return getJobName();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NUMBER:
				return getJobNumber();
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_USER:
				return getJobUser();
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
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NAME:
				setJobName((String)newValue);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NUMBER:
				setJobNumber((Integer)newValue);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_USER:
				setJobUser((String)newValue);
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
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NAME:
				setJobName(JOB_NAME_EDEFAULT);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NUMBER:
				setJobNumber(JOB_NUMBER_EDEFAULT);
				return;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_USER:
				setJobUser(JOB_USER_EDEFAULT);
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
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NAME:
				return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_NUMBER:
				return jobNumber != JOB_NUMBER_EDEFAULT;
			case QOperatingSystemSpoolFilePackage.SPOOL_FILE__JOB_USER:
				return JOB_USER_EDEFAULT == null ? jobUser != null : !JOB_USER_EDEFAULT.equals(jobUser);
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
		result.append(", jobName: ");
		result.append(jobName);
		result.append(", jobNumber: ");
		result.append(jobNumber);
		result.append(", jobUser: ");
		result.append(jobUser);
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
