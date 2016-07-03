/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.core.QNameable;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;
import org.smeup.sys.il.core.meta.QFacet;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QTyped Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.type.impl.TypedObjectImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.impl.TypedObjectImpl#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.impl.TypedObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.impl.TypedObjectImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.smeup.sys.os.type.impl.TypedObjectImpl#getCreationInfo <em>Creation Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypedObjectImpl extends ObjectNameableImpl implements QTypedObject {

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFacets() <em>Facets</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<QFacet> facets;

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreationInfo() <em>Creation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationInfo()
	 * @generated
	 * @ordered
	 */
	protected QCreationInfo creationInfo;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemTypePackage.Literals.TYPED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<QFacet> getFacets() {
		if (facets == null) {
			facets = new EObjectContainmentEList<QFacet>(QFacet.class, this, QOperatingSystemTypePackage.TYPED_OBJECT__FACETS);
		}
		return facets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract String getAttribute();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemTypePackage.TYPED_OBJECT__FACETS:
				return ((InternalEList<?>)getFacets()).basicRemove(otherEnd, msgs);
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				return basicSetCreationInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCreationInfo getCreationInfo() {
		return creationInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationInfo(QCreationInfo newCreationInfo, NotificationChain msgs) {
		QCreationInfo oldCreationInfo = creationInfo;
		creationInfo = newCreationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO, oldCreationInfo, newCreationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationInfo(QCreationInfo newCreationInfo) {
		if (newCreationInfo != creationInfo) {
			NotificationChain msgs = null;
			if (creationInfo != null)
				msgs = ((InternalEObject)creationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO, null, msgs);
			if (newCreationInfo != null)
				msgs = ((InternalEObject)newCreationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO, null, msgs);
			msgs = basicSetCreationInfo(newCreationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO, newCreationInfo, newCreationInfo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getLibrary() {
		Resource resource = eResource();
		if(resource == null)
			if(getClass().getSimpleName().equalsIgnoreCase("UserProfileImpl"))
				return "QSYS";
			else
				return null;
//				throw new IntegratedLanguageCoreRuntimeException("Invalid library for object: " + this);
		
		if(resource instanceof QNameable)
			return ((QNameable)resource).getName();
		
		URI uri = resource.getURI();		
		if(uri.segmentCount() == 0)
			throw new IntegratedLanguageCoreRuntimeException("Invalid library for object: " + this);
		
		return uri.segment(0);		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION:
				return getApplication();
			case QOperatingSystemTypePackage.TYPED_OBJECT__FACETS:
				return getFacets();
			case QOperatingSystemTypePackage.TYPED_OBJECT__NAME:
				return getName();
			case QOperatingSystemTypePackage.TYPED_OBJECT__TEXT:
				return getText();
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				return getCreationInfo();
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
			case QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION:
				setApplication((String)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__FACETS:
				getFacets().clear();
				getFacets().addAll((Collection<? extends QFacet>)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__NAME:
				setName((String)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__TEXT:
				setText((String)newValue);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				setCreationInfo((QCreationInfo)newValue);
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
			case QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__FACETS:
				getFacets().clear();
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				setCreationInfo((QCreationInfo)null);
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
			case QOperatingSystemTypePackage.TYPED_OBJECT__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case QOperatingSystemTypePackage.TYPED_OBJECT__FACETS:
				return facets != null && !facets.isEmpty();
			case QOperatingSystemTypePackage.TYPED_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QOperatingSystemTypePackage.TYPED_OBJECT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case QOperatingSystemTypePackage.TYPED_OBJECT__CREATION_INFO:
				return creationInfo != null;
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
		result.append(" (application: ");
		result.append(application);
		result.append(", name: ");
		result.append(name);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}
} // TypedObjectImpl
