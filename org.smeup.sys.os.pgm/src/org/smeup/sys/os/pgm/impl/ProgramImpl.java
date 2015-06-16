/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramSource;
import org.smeup.sys.os.type.impl.TypedObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QProgram</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramImpl#getActivationGroup <em>Activation Group</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramImpl#getCreationParams <em>Creation Params</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends TypedObjectImpl implements QProgram {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getActivationGroup() <em>Activation Group</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getActivationGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATION_GROUP_EDEFAULT = "*DFT";

	/**
	 * The cached value of the '{@link #getActivationGroup() <em>Activation Group</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getActivationGroup()
	 * @generated
	 * @ordered
	 */
	protected String activationGroup = ACTIVATION_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreationParams() <em>Creation Params</em>}' attribute list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCreationParams()
	 * @generated
	 * @ordered
	 */
	protected EList<String> creationParams;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected QProgramSource source;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemProgramPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivationGroup() {
		return activationGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationGroup(String newActivationGroup) {
		String oldActivationGroup = activationGroup;
		activationGroup = newActivationGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM__ACTIVATION_GROUP, oldActivationGroup, activationGroup));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCreationParams() {
		if (creationParams == null) {
			creationParams = new EDataTypeUniqueEList<String>(String.class, this, QOperatingSystemProgramPackage.PROGRAM__CREATION_PARAMS);
		}
		return creationParams;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QProgramSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(QProgramSource newSource, NotificationChain msgs) {
		QProgramSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(QProgramSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemProgramPackage.PROGRAM__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemProgramPackage.PROGRAM__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public URI getClassURI() {

		try {
			// TODO
			// eClass().getEPackage().getNsURI();
			String classURI = "pgm/" + getApplication() + "/" + getName();
			URI uri = new URI(classURI);
			return uri;
		} catch (URISyntaxException e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public URI getPackageInfoURI() {
		try {
			String classURI = "pgm/" + getApplication();
			URI uri = new URI(classURI);
			return uri;
		} catch (URISyntaxException e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.PROGRAM__SOURCE:
				return basicSetSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.PROGRAM__ACTIVATION_GROUP:
				return getActivationGroup();
			case QOperatingSystemProgramPackage.PROGRAM__ADDRESS:
				return getAddress();
			case QOperatingSystemProgramPackage.PROGRAM__CREATION_PARAMS:
				return getCreationParams();
			case QOperatingSystemProgramPackage.PROGRAM__SOURCE:
				return getSource();
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
			case QOperatingSystemProgramPackage.PROGRAM__ACTIVATION_GROUP:
				setActivationGroup((String)newValue);
				return;
			case QOperatingSystemProgramPackage.PROGRAM__ADDRESS:
				setAddress((String)newValue);
				return;
			case QOperatingSystemProgramPackage.PROGRAM__CREATION_PARAMS:
				getCreationParams().clear();
				getCreationParams().addAll((Collection<? extends String>)newValue);
				return;
			case QOperatingSystemProgramPackage.PROGRAM__SOURCE:
				setSource((QProgramSource)newValue);
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
			case QOperatingSystemProgramPackage.PROGRAM__ACTIVATION_GROUP:
				setActivationGroup(ACTIVATION_GROUP_EDEFAULT);
				return;
			case QOperatingSystemProgramPackage.PROGRAM__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case QOperatingSystemProgramPackage.PROGRAM__CREATION_PARAMS:
				getCreationParams().clear();
				return;
			case QOperatingSystemProgramPackage.PROGRAM__SOURCE:
				setSource((QProgramSource)null);
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
			case QOperatingSystemProgramPackage.PROGRAM__ACTIVATION_GROUP:
				return ACTIVATION_GROUP_EDEFAULT == null ? activationGroup != null : !ACTIVATION_GROUP_EDEFAULT.equals(activationGroup);
			case QOperatingSystemProgramPackage.PROGRAM__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case QOperatingSystemProgramPackage.PROGRAM__CREATION_PARAMS:
				return creationParams != null && !creationParams.isEmpty();
			case QOperatingSystemProgramPackage.PROGRAM__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (activationGroup: ");
		result.append(activationGroup);
		result.append(", address: ");
		result.append(address);
		result.append(", creationParams: ");
		result.append(creationParams);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getAttribute() {
		return null;
	}
} // QProgramImpl
