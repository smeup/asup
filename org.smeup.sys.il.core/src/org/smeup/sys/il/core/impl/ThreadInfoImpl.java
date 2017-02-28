/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.QThreadInfo;
import org.smeup.sys.il.core.ThreadStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#getThreadName <em>Thread Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#getThreadId <em>Thread Id</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#getThreadPriority <em>Thread Priority</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#getThreadCPUUsage <em>Thread CPU Usage</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#getThreadStatus <em>Thread Status</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#isThreadRunnable <em>Thread Runnable</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#isThreadInterrupted <em>Thread Interrupted</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#isThreadNative <em>Thread Native</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#isThreadSuspended <em>Thread Suspended</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.impl.ThreadInfoImpl#isThreadDaemon <em>Thread Daemon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadInfoImpl extends ObjectImpl implements QThreadInfo {

	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getThreadName() <em>Thread Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadName()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadName() <em>Thread Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadName()
	 * @generated
	 * @ordered
	 */
	protected String threadName = THREAD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadId() <em>Thread Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadId()
	 * @generated
	 * @ordered
	 */
	protected static final long THREAD_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getThreadId() <em>Thread Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadId()
	 * @generated
	 * @ordered
	 */
	protected long threadId = THREAD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadPriority() <em>Thread Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int THREAD_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreadPriority() <em>Thread Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPriority()
	 * @generated
	 * @ordered
	 */
	protected int threadPriority = THREAD_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadCPUUsage() <em>Thread CPU Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadCPUUsage()
	 * @generated
	 * @ordered
	 */
	protected static final double THREAD_CPU_USAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreadCPUUsage() <em>Thread CPU Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadCPUUsage()
	 * @generated
	 * @ordered
	 */
	protected double threadCPUUsage = THREAD_CPU_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadStatus() <em>Thread Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ThreadStatus THREAD_STATUS_EDEFAULT = ThreadStatus.NEW;

	/**
	 * The cached value of the '{@link #getThreadStatus() <em>Thread Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadStatus()
	 * @generated
	 * @ordered
	 */
	protected ThreadStatus threadStatus = THREAD_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isThreadRunnable() <em>Thread Runnable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadRunnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREAD_RUNNABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThreadRunnable() <em>Thread Runnable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadRunnable()
	 * @generated
	 * @ordered
	 */
	protected boolean threadRunnable = THREAD_RUNNABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isThreadInterrupted() <em>Thread Interrupted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadInterrupted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREAD_INTERRUPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThreadInterrupted() <em>Thread Interrupted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadInterrupted()
	 * @generated
	 * @ordered
	 */
	protected boolean threadInterrupted = THREAD_INTERRUPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isThreadNative() <em>Thread Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREAD_NATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThreadNative() <em>Thread Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadNative()
	 * @generated
	 * @ordered
	 */
	protected boolean threadNative = THREAD_NATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isThreadSuspended() <em>Thread Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREAD_SUSPENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThreadSuspended() <em>Thread Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadSuspended()
	 * @generated
	 * @ordered
	 */
	protected boolean threadSuspended = THREAD_SUSPENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #isThreadDaemon() <em>Thread Daemon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadDaemon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREAD_DAEMON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThreadDaemon() <em>Thread Daemon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadDaemon()
	 * @generated
	 * @ordered
	 */
	protected boolean threadDaemon = THREAD_DAEMON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageCorePackage.Literals.THREAD_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThreadName() {
		return threadName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadName(String newThreadName) {
		String oldThreadName = threadName;
		threadName = newThreadName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NAME, oldThreadName, threadName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getThreadId() {
		return threadId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadId(long newThreadId) {
		long oldThreadId = threadId;
		threadId = newThreadId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_ID, oldThreadId, threadId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThreadPriority() {
		return threadPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadPriority(int newThreadPriority) {
		int oldThreadPriority = threadPriority;
		threadPriority = newThreadPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_PRIORITY, oldThreadPriority, threadPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThreadCPUUsage() {
		return threadCPUUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadCPUUsage(double newThreadCPUUsage) {
		double oldThreadCPUUsage = threadCPUUsage;
		threadCPUUsage = newThreadCPUUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_CPU_USAGE, oldThreadCPUUsage, threadCPUUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadStatus getThreadStatus() {
		return threadStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadStatus(ThreadStatus newThreadStatus) {
		ThreadStatus oldThreadStatus = threadStatus;
		threadStatus = newThreadStatus == null ? THREAD_STATUS_EDEFAULT : newThreadStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_STATUS, oldThreadStatus, threadStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThreadRunnable() {
		return threadRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadRunnable(boolean newThreadRunnable) {
		boolean oldThreadRunnable = threadRunnable;
		threadRunnable = newThreadRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_RUNNABLE, oldThreadRunnable, threadRunnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThreadInterrupted() {
		return threadInterrupted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadInterrupted(boolean newThreadInterrupted) {
		boolean oldThreadInterrupted = threadInterrupted;
		threadInterrupted = newThreadInterrupted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_INTERRUPTED, oldThreadInterrupted, threadInterrupted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThreadNative() {
		return threadNative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadNative(boolean newThreadNative) {
		boolean oldThreadNative = threadNative;
		threadNative = newThreadNative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NATIVE, oldThreadNative, threadNative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThreadSuspended() {
		return threadSuspended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadSuspended(boolean newThreadSuspended) {
		boolean oldThreadSuspended = threadSuspended;
		threadSuspended = newThreadSuspended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_SUSPENDED, oldThreadSuspended, threadSuspended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThreadDaemon() {
		return threadDaemon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadDaemon(boolean newThreadDaemon) {
		boolean oldThreadDaemon = threadDaemon;
		threadDaemon = newThreadDaemon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_DAEMON, oldThreadDaemon, threadDaemon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NAME:
				return getThreadName();
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_ID:
				return getThreadId();
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_PRIORITY:
				return getThreadPriority();
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_CPU_USAGE:
				return getThreadCPUUsage();
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_STATUS:
				return getThreadStatus();
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_RUNNABLE:
				return isThreadRunnable();
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_INTERRUPTED:
				return isThreadInterrupted();
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NATIVE:
				return isThreadNative();
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_SUSPENDED:
				return isThreadSuspended();
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_DAEMON:
				return isThreadDaemon();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NAME:
				setThreadName((String)newValue);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_ID:
				setThreadId((Long)newValue);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_PRIORITY:
				setThreadPriority((Integer)newValue);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_CPU_USAGE:
				setThreadCPUUsage((Double)newValue);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_STATUS:
				setThreadStatus((ThreadStatus)newValue);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_RUNNABLE:
				setThreadRunnable((Boolean)newValue);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_INTERRUPTED:
				setThreadInterrupted((Boolean)newValue);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NATIVE:
				setThreadNative((Boolean)newValue);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_SUSPENDED:
				setThreadSuspended((Boolean)newValue);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_DAEMON:
				setThreadDaemon((Boolean)newValue);
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
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NAME:
				setThreadName(THREAD_NAME_EDEFAULT);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_ID:
				setThreadId(THREAD_ID_EDEFAULT);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_PRIORITY:
				setThreadPriority(THREAD_PRIORITY_EDEFAULT);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_CPU_USAGE:
				setThreadCPUUsage(THREAD_CPU_USAGE_EDEFAULT);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_STATUS:
				setThreadStatus(THREAD_STATUS_EDEFAULT);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_RUNNABLE:
				setThreadRunnable(THREAD_RUNNABLE_EDEFAULT);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_INTERRUPTED:
				setThreadInterrupted(THREAD_INTERRUPTED_EDEFAULT);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NATIVE:
				setThreadNative(THREAD_NATIVE_EDEFAULT);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_SUSPENDED:
				setThreadSuspended(THREAD_SUSPENDED_EDEFAULT);
				return;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_DAEMON:
				setThreadDaemon(THREAD_DAEMON_EDEFAULT);
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
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NAME:
				return THREAD_NAME_EDEFAULT == null ? threadName != null : !THREAD_NAME_EDEFAULT.equals(threadName);
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_ID:
				return threadId != THREAD_ID_EDEFAULT;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_PRIORITY:
				return threadPriority != THREAD_PRIORITY_EDEFAULT;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_CPU_USAGE:
				return threadCPUUsage != THREAD_CPU_USAGE_EDEFAULT;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_STATUS:
				return threadStatus != THREAD_STATUS_EDEFAULT;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_RUNNABLE:
				return threadRunnable != THREAD_RUNNABLE_EDEFAULT;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_INTERRUPTED:
				return threadInterrupted != THREAD_INTERRUPTED_EDEFAULT;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_NATIVE:
				return threadNative != THREAD_NATIVE_EDEFAULT;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_SUSPENDED:
				return threadSuspended != THREAD_SUSPENDED_EDEFAULT;
			case QIntegratedLanguageCorePackage.THREAD_INFO__THREAD_DAEMON:
				return threadDaemon != THREAD_DAEMON_EDEFAULT;
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
		result.append(" (threadName: ");
		result.append(threadName);
		result.append(", threadId: ");
		result.append(threadId);
		result.append(", threadPriority: ");
		result.append(threadPriority);
		result.append(", threadCPUUsage: ");
		result.append(threadCPUUsage);
		result.append(", threadStatus: ");
		result.append(threadStatus);
		result.append(", threadRunnable: ");
		result.append(threadRunnable);
		result.append(", threadInterrupted: ");
		result.append(threadInterrupted);
		result.append(", threadNative: ");
		result.append(threadNative);
		result.append(", threadSuspended: ");
		result.append(threadSuspended);
		result.append(", threadDaemon: ");
		result.append(threadDaemon);
		result.append(')');
		return result.toString();
	}

} //ThreadInfoImpl
