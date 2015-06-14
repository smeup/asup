/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.resources.impl;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage;
import org.smeup.sys.os.core.resources.QResourceEvent;
import org.smeup.sys.os.core.resources.QResourceListener;
import org.smeup.sys.os.core.resources.QResourceNotifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QResource Notifier</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResourceNotifierImpl<T extends QObjectNameable> extends MinimalEObjectImpl.Container implements QResourceNotifier<T> {

	/**
	 * @generated NOT
	 */
	private List<QResourceListener<T>> listeners = new ArrayList<QResourceListener<T>>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceNotifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemResourcesPackage.Literals.RESOURCE_NOTIFIER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void fireEvent(QResourceEvent<T> event) {
		for (QResourceListener<T> listener : listeners)
			listener.handleEvent(event);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void registerListener(QResourceListener<T> listener) {
		listeners.add(listener);
	}

} // QResourceNotifierImpl
