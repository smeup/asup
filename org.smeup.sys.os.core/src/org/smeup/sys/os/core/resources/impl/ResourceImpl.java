/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage;
import org.smeup.sys.os.core.resources.QResource;
import org.smeup.sys.os.core.resources.QResourceEvent;
import org.smeup.sys.os.core.resources.QResourceNotifier;
import org.smeup.sys.os.core.resources.ResourceEventType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QResource</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.resources.impl.ResourceImpl#getJob <em>Job</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.resources.impl.ResourceImpl#getNotifier <em>Notifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceImpl<T extends QObjectNameable> extends MinimalEObjectImpl.Container implements QResource<T> {

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected QJob job;

	/**
	 * The cached value of the '{@link #getNotifier() <em>Notifier</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNotifier()
	 * @generated
	 * @ordered
	 */
	protected QResourceNotifier<T> notifier;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemResourcesPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QJob getJob() {
		if (job != null && ((EObject)job).eIsProxy()) {
			InternalEObject oldJob = (InternalEObject)job;
			job = (QJob)eResolveProxy(oldJob);
			if (job != oldJob) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QOperatingSystemResourcesPackage.RESOURCE__JOB, oldJob, job));
			}
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QJob basicGetJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob(QJob newJob) {
		QJob oldJob = job;
		job = newJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemResourcesPackage.RESOURCE__JOB, oldJob, job));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public QResourceNotifier<T> getNotifier() {
		if (notifier != null && ((EObject)notifier).eIsProxy()) {
			InternalEObject oldNotifier = (InternalEObject)notifier;
			notifier = (QResourceNotifier<T>)eResolveProxy(oldNotifier);
			if (notifier != oldNotifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QOperatingSystemResourcesPackage.RESOURCE__NOTIFIER, oldNotifier, notifier));
			}
		}
		return notifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QResourceNotifier<T> basicGetNotifier() {
		return notifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotifier(QResourceNotifier<T> newNotifier) {
		QResourceNotifier<T> oldNotifier = notifier;
		notifier = newNotifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemResourcesPackage.RESOURCE__NOTIFIER, oldNotifier, notifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void fireEvent(QResourceEvent<T> event, ResourceEventType eventType, T object) {
		// check for listeners
		QResourceNotifier<T> resourceNotifier = getNotifier();
		if (resourceNotifier == null)
			return;

		// set event information
		event.setSource(object);
		event.setType(eventType);

		// notify event
		resourceNotifier.fireEvent(event);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemResourcesPackage.RESOURCE__JOB:
				if (resolve) return getJob();
				return basicGetJob();
			case QOperatingSystemResourcesPackage.RESOURCE__NOTIFIER:
				if (resolve) return getNotifier();
				return basicGetNotifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemResourcesPackage.RESOURCE__JOB:
				setJob((QJob)newValue);
				return;
			case QOperatingSystemResourcesPackage.RESOURCE__NOTIFIER:
				setNotifier((QResourceNotifier<T>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperatingSystemResourcesPackage.RESOURCE__JOB:
				setJob((QJob)null);
				return;
			case QOperatingSystemResourcesPackage.RESOURCE__NOTIFIER:
				setNotifier((QResourceNotifier<T>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperatingSystemResourcesPackage.RESOURCE__JOB:
				return job != null;
			case QOperatingSystemResourcesPackage.RESOURCE__NOTIFIER:
				return notifier != null;
		}
		return super.eIsSet(featureID);
	}

} // QResourceImpl
