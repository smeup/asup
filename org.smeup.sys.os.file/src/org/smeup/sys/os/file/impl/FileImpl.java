/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.QNamedNode;
import org.smeup.sys.il.core.QNode;
import org.smeup.sys.il.core.meta.QFacet;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;
import org.smeup.sys.os.type.impl.TypedObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QFile</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.file.impl.FileImpl#getFacets <em>Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FileImpl extends TypedObjectImpl implements QFile {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemFilePackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QFacet> getFacets() {
		if (facets == null) {
			facets = new EObjectContainmentEList<QFacet>(QFacet.class, this, QOperatingSystemFilePackage.FILE__FACETS);
		}
		return facets;
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
			String classURI = "file/" + getAttribute().toLowerCase() + "/" + getApplication() + "/" + getName();
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
			String classURI = "file/" + getAttribute().toLowerCase() + "/" + getApplication();
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
	public QNode getParent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChild() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <F extends QFacet> F getFacet(Class<F> klass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemFilePackage.FILE__FACETS:
				return ((InternalEList<?>)getFacets()).basicRemove(otherEnd, msgs);
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
			case QOperatingSystemFilePackage.FILE__FACETS:
				return getFacets();
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
			case QOperatingSystemFilePackage.FILE__FACETS:
				getFacets().clear();
				getFacets().addAll((Collection<? extends QFacet>)newValue);
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
			case QOperatingSystemFilePackage.FILE__FACETS:
				getFacets().clear();
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
			case QOperatingSystemFilePackage.FILE__FACETS:
				return facets != null && !facets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QNode.class) {
			switch (derivedFeatureID) {
				case QOperatingSystemFilePackage.FILE__FACETS: return QIntegratedLanguageCorePackage.NODE__FACETS;
				default: return -1;
			}
		}
		if (baseClass == QNamedNode.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QNode.class) {
			switch (baseFeatureID) {
				case QIntegratedLanguageCorePackage.NODE__FACETS: return QOperatingSystemFilePackage.FILE__FACETS;
				default: return -1;
			}
		}
		if (baseClass == QNamedNode.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
} // QFileImpl
