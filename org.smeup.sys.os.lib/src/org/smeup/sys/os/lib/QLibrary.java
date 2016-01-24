/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.lib;

import java.net.URI;
import java.util.List;

import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QLibrary</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.lib.QLibrary#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.smeup.sys.os.lib.QLibrary#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.smeup.sys.os.lib.QLibrary#getLibraryType <em>Library Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.lib.QLibrary#getParentLibrary <em>Parent Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.lib.QLibrary#isSynchronized <em>Synchronized</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.lib.QOperatingSystemLibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface QLibrary extends QTypedObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, 2015 Sme.UP and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Dependencies</em>' attribute list.
	 * @see org.smeup.sys.os.lib.QOperatingSystemLibraryPackage#getLibrary_Dependencies()
	 * @model
	 * @generated
	 */
	List<String> getDependencies();

	/**
	 * Returns the value of the '<em><b>Library Type</b></em>' attribute.
	 * The default value is <code>"PROD"</code>.
	 * The literals are from the enumeration {@link org.smeup.sys.os.lib.LibraryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Type</em>' attribute.
	 * @see org.smeup.sys.os.lib.LibraryType
	 * @see #setLibraryType(LibraryType)
	 * @see org.smeup.sys.os.lib.QOperatingSystemLibraryPackage#getLibrary_LibraryType()
	 * @model default="PROD" required="true"
	 * @generated
	 */
	LibraryType getLibraryType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.lib.QLibrary#getLibraryType <em>Library Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Type</em>' attribute.
	 * @see org.smeup.sys.os.lib.LibraryType
	 * @see #getLibraryType()
	 * @generated
	 */
	void setLibraryType(LibraryType value);

	/**
	 * Returns the value of the '<em><b>Parent Library</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parent Library</em>' attribute.
	 * @see #setParentLibrary(String)
	 * @see org.smeup.sys.os.lib.QOperatingSystemLibraryPackage#getLibrary_ParentLibrary()
	 * @model
	 * @generated
	 */
	String getParentLibrary();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.lib.QLibrary#getParentLibrary <em>Parent Library</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Parent Library</em>' attribute.
	 * @see #getParentLibrary()
	 * @generated
	 */
	void setParentLibrary(String value);

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' attribute.
	 * @see #setSynchronized(boolean)
	 * @see org.smeup.sys.os.lib.QOperatingSystemLibraryPackage#getLibrary_Synchronized()
	 * @model default="false"
	 * @generated
	 */
	boolean isSynchronized();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.lib.QLibrary#isSynchronized <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Synchronized</em>' attribute.
	 * @see #isSynchronized()
	 * @generated
	 */
	void setSynchronized(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.smeup.sys.os.lib.QOperatingSystemLibraryPackage#getLibrary_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.lib.QLibrary#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRootLibrary();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isChildLibrary();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.mi.core.JavaURI"
	 * @generated
	 */
	URI getPackageURI();
} // QLibrary
