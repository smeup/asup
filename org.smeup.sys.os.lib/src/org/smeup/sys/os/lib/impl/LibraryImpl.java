/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.lib.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.smeup.sys.os.lib.LibraryType;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QOperatingSystemLibraryPackage;
import org.smeup.sys.os.type.impl.TypedObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QLibrary</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.lib.impl.LibraryImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.smeup.sys.os.lib.impl.LibraryImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.smeup.sys.os.lib.impl.LibraryImpl#getLibraryType <em>Library Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.lib.impl.LibraryImpl#getParentLibrary <em>Parent Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.lib.impl.LibraryImpl#isSynchronized <em>Synchronized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends TypedObjectImpl implements QLibrary {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, 2016 Sme.UP and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dependencies;
	/**
	 * The default value of the '{@link #getLibraryType() <em>Library Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryType()
	 * @generated
	 * @ordered
	 */
	protected static final LibraryType LIBRARY_TYPE_EDEFAULT = LibraryType.PRODUCTION;
	/**
	 * The cached value of the '{@link #getLibraryType() <em>Library Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryType()
	 * @generated
	 * @ordered
	 */
	protected LibraryType libraryType = LIBRARY_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getParentLibrary() <em>Parent Library</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getParentLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_LIBRARY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentLibrary() <em>Parent Library</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getParentLibrary()
	 * @generated
	 * @ordered
	 */
	protected String parentLibrary = PARENT_LIBRARY_EDEFAULT;
	/**
	 * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronized_ = SYNCHRONIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemLibraryPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getDependencies() {
		if (dependencies == null) {
			dependencies = new EDataTypeUniqueEList<String>(String.class, this, QOperatingSystemLibraryPackage.LIBRARY__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryType getLibraryType() {
		return libraryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryType(LibraryType newLibraryType) {
		LibraryType oldLibraryType = libraryType;
		libraryType = newLibraryType == null ? LIBRARY_TYPE_EDEFAULT : newLibraryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemLibraryPackage.LIBRARY__LIBRARY_TYPE, oldLibraryType, libraryType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentLibrary() {
		return parentLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentLibrary(String newParentLibrary) {
		String oldParentLibrary = parentLibrary;
		parentLibrary = newParentLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemLibraryPackage.LIBRARY__PARENT_LIBRARY, oldParentLibrary, parentLibrary));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSynchronized() {
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynchronized(boolean newSynchronized) {
		boolean oldSynchronized = synchronized_;
		synchronized_ = newSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemLibraryPackage.LIBRARY__SYNCHRONIZED, oldSynchronized, synchronized_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemLibraryPackage.LIBRARY__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isRootLibrary() {
		return getParentLibrary() == null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isChildLibrary() {
		return getParentLibrary() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public URI getPackageURI() {
		try {
			String packageURI = getBasePackage();
			if (packageURI != null)
				packageURI = packageURI.replaceAll("\\.", "/") + "/";
			else
				packageURI = "";

			URI uri = new URI(packageURI);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemLibraryPackage.LIBRARY__BASE_PACKAGE:
				return getBasePackage();
			case QOperatingSystemLibraryPackage.LIBRARY__DEPENDENCIES:
				return getDependencies();
			case QOperatingSystemLibraryPackage.LIBRARY__LIBRARY_TYPE:
				return getLibraryType();
			case QOperatingSystemLibraryPackage.LIBRARY__PARENT_LIBRARY:
				return getParentLibrary();
			case QOperatingSystemLibraryPackage.LIBRARY__SYNCHRONIZED:
				return isSynchronized();
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
			case QOperatingSystemLibraryPackage.LIBRARY__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case QOperatingSystemLibraryPackage.LIBRARY__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case QOperatingSystemLibraryPackage.LIBRARY__LIBRARY_TYPE:
				setLibraryType((LibraryType)newValue);
				return;
			case QOperatingSystemLibraryPackage.LIBRARY__PARENT_LIBRARY:
				setParentLibrary((String)newValue);
				return;
			case QOperatingSystemLibraryPackage.LIBRARY__SYNCHRONIZED:
				setSynchronized((Boolean)newValue);
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
			case QOperatingSystemLibraryPackage.LIBRARY__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case QOperatingSystemLibraryPackage.LIBRARY__DEPENDENCIES:
				getDependencies().clear();
				return;
			case QOperatingSystemLibraryPackage.LIBRARY__LIBRARY_TYPE:
				setLibraryType(LIBRARY_TYPE_EDEFAULT);
				return;
			case QOperatingSystemLibraryPackage.LIBRARY__PARENT_LIBRARY:
				setParentLibrary(PARENT_LIBRARY_EDEFAULT);
				return;
			case QOperatingSystemLibraryPackage.LIBRARY__SYNCHRONIZED:
				setSynchronized(SYNCHRONIZED_EDEFAULT);
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
			case QOperatingSystemLibraryPackage.LIBRARY__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case QOperatingSystemLibraryPackage.LIBRARY__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case QOperatingSystemLibraryPackage.LIBRARY__LIBRARY_TYPE:
				return libraryType != LIBRARY_TYPE_EDEFAULT;
			case QOperatingSystemLibraryPackage.LIBRARY__PARENT_LIBRARY:
				return PARENT_LIBRARY_EDEFAULT == null ? parentLibrary != null : !PARENT_LIBRARY_EDEFAULT.equals(parentLibrary);
			case QOperatingSystemLibraryPackage.LIBRARY__SYNCHRONIZED:
				return synchronized_ != SYNCHRONIZED_EDEFAULT;
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
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", dependencies: ");
		result.append(dependencies);
		result.append(", libraryType: ");
		result.append(libraryType);
		result.append(", parentLibrary: ");
		result.append(parentLibrary);
		result.append(", synchronized: ");
		result.append(synchronized_);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getAttribute() {
		return null;
	}
} // QLibraryImpl
