/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;

import java.util.List;
import org.smeup.sys.il.core.QNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.rt.core.QServiceRef#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QServiceRef#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QServiceRef#isRemoteExport <em>Remote Export</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QServiceRef#getStatus <em>Status</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QServiceRef#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceRef()
 * @model
 * @generated
 */
public interface QServiceRef extends QNode {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceRef_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QServiceRef#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceRef_InterfaceName()
	 * @model
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QServiceRef#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Export</em>' attribute.
	 * @see #setRemoteExport(boolean)
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceRef_RemoteExport()
	 * @model required="true"
	 * @generated
	 */
	boolean isRemoteExport();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QServiceRef#isRemoteExport <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Export</em>' attribute.
	 * @see #isRemoteExport()
	 * @generated
	 */
	void setRemoteExport(boolean value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.rt.core.ServiceStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.smeup.sys.rt.core.ServiceStatus
	 * @see #setStatus(ServiceStatus)
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceRef_Status()
	 * @model required="true"
	 * @generated
	 */
	ServiceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QServiceRef#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.smeup.sys.rt.core.ServiceStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ServiceStatus value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.rt.core.QServiceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceRef_Services()
	 * @model containment="true"
	 * @generated
	 */
	List<QServiceRef> getServices();

} // QServiceRef
