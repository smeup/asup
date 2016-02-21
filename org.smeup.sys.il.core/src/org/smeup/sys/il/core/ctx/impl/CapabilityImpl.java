/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx.impl;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.smeup.sys.il.core.ctx.CapabilityRight;
import org.smeup.sys.il.core.ctx.QCapability;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.impl.ObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.core.ctx.impl.CapabilityImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.ctx.impl.CapabilityImpl#getObjectURI <em>Object URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CapabilityImpl extends ObjectImpl implements QCapability {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRight> rights;

	/**
	 * The default value of the '{@link #getObjectURI() <em>Object URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectURI()
	 * @generated
	 * @ordered
	 */
	protected static final URI OBJECT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectURI() <em>Object URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectURI()
	 * @generated
	 * @ordered
	 */
	protected URI objectURI = OBJECT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageCoreCtxPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CapabilityRight> getRights() {
		if (rights == null) {
			rights = new EDataTypeUniqueEList<CapabilityRight>(CapabilityRight.class, this, QIntegratedLanguageCoreCtxPackage.CAPABILITY__RIGHTS);
		}
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getObjectURI() {
		return objectURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectURI(URI newObjectURI) {
		URI oldObjectURI = objectURI;
		objectURI = newObjectURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageCoreCtxPackage.CAPABILITY__OBJECT_URI, oldObjectURI, objectURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getObjectName() {
		return objectURI.getFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageCoreCtxPackage.CAPABILITY__RIGHTS:
				return getRights();
			case QIntegratedLanguageCoreCtxPackage.CAPABILITY__OBJECT_URI:
				return getObjectURI();
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
			case QIntegratedLanguageCoreCtxPackage.CAPABILITY__RIGHTS:
				getRights().clear();
				getRights().addAll((Collection<? extends CapabilityRight>)newValue);
				return;
			case QIntegratedLanguageCoreCtxPackage.CAPABILITY__OBJECT_URI:
				setObjectURI((URI)newValue);
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
			case QIntegratedLanguageCoreCtxPackage.CAPABILITY__RIGHTS:
				getRights().clear();
				return;
			case QIntegratedLanguageCoreCtxPackage.CAPABILITY__OBJECT_URI:
				setObjectURI(OBJECT_URI_EDEFAULT);
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
			case QIntegratedLanguageCoreCtxPackage.CAPABILITY__RIGHTS:
				return rights != null && !rights.isEmpty();
			case QIntegratedLanguageCoreCtxPackage.CAPABILITY__OBJECT_URI:
				return OBJECT_URI_EDEFAULT == null ? objectURI != null : !OBJECT_URI_EDEFAULT.equals(objectURI);
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
		result.append(" (rights: ");
		result.append(rights);
		result.append(", objectURI: ");
		result.append(objectURI);
		result.append(')');
		return result.toString();
	}

} //CapabilityImpl
