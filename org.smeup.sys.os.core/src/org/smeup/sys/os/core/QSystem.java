/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.lock.QObjectLockable;
import org.smeup.sys.os.core.env.QEnvironmentVariableContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getContext <em>Context</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getCreationInfo <em>Creation Info</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getInstallPath <em>Install Path</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getLastJobNumber <em>Last Job Number</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getSystemLibrary <em>System Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getSystemUser <em>System User</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getTemporaryLibrary <em>Temporary Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystem#getVariableContainer <em>Variable Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem()
 * @model
 * @generated
 */
public interface QSystem extends QObjectLockable, QObjectNameable, QContextProvider {

	public static final long LOCK_TIMEOUT = 1000;
	
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(QContext)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_Context()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	@Override
	QContext getContext();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(QContext value);

	/**
	 * Returns the value of the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Info</em>' containment reference.
	 * @see #setCreationInfo(QCreationInfo)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_CreationInfo()
	 * @model containment="true"
	 * @generated
	 */
	QCreationInfo getCreationInfo();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getCreationInfo <em>Creation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Info</em>' containment reference.
	 * @see #getCreationInfo()
	 * @generated
	 */
	void setCreationInfo(QCreationInfo value);

	/**
	 * Returns the value of the '<em><b>Install Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path di installazione del sistema.
	 * 
	 * All'interno e' generalmente prevista una strutturazione del tipo:
	 * 
	 * $installPath/library/objectType/objectName
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Install Path</em>' attribute.
	 * @see #setInstallPath(String)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_InstallPath()
	 * @model required="true"
	 * @generated
	 */
	String getInstallPath();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getInstallPath <em>Install Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Path</em>' attribute.
	 * @see #getInstallPath()
	 * @generated
	 */
	void setInstallPath(String value);

	/**
	 * Returns the value of the '<em><b>Last Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Job Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Job Number</em>' attribute.
	 * @see #setLastJobNumber(int)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_LastJobNumber()
	 * @model
	 * @generated
	 */
	int getLastJobNumber();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getLastJobNumber <em>Last Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Job Number</em>' attribute.
	 * @see #getLastJobNumber()
	 * @generated
	 */
	void setLastJobNumber(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	@Override
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"STP"</code>.
	 * The literals are from the enumeration {@link org.smeup.sys.os.core.SystemStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.smeup.sys.os.core.SystemStatus
	 * @see #setStatus(SystemStatus)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_Status()
	 * @model default="STP" required="true"
	 * @generated
	 */
	SystemStatus getStatus();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.smeup.sys.os.core.SystemStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SystemStatus value);

	/**
	 * Returns the value of the '<em><b>System Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Library</em>' attribute.
	 * @see #setSystemLibrary(String)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_SystemLibrary()
	 * @model required="true"
	 * @generated
	 */
	String getSystemLibrary();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getSystemLibrary <em>System Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Library</em>' attribute.
	 * @see #getSystemLibrary()
	 * @generated
	 */
	void setSystemLibrary(String value);

	/**
	 * Returns the value of the '<em><b>System User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System User</em>' attribute.
	 * @see #setSystemUser(String)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_SystemUser()
	 * @model required="true"
	 * @generated
	 */
	String getSystemUser();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getSystemUser <em>System User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System User</em>' attribute.
	 * @see #getSystemUser()
	 * @generated
	 */
	void setSystemUser(String value);

	/**
	 * Returns the value of the '<em><b>Temporary Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporary Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporary Library</em>' attribute.
	 * @see #setTemporaryLibrary(String)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_TemporaryLibrary()
	 * @model required="true"
	 * @generated
	 */
	String getTemporaryLibrary();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getTemporaryLibrary <em>Temporary Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporary Library</em>' attribute.
	 * @see #getTemporaryLibrary()
	 * @generated
	 */
	void setTemporaryLibrary(String value);

	/**
	 * Returns the value of the '<em><b>Variable Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Container</em>' containment reference.
	 * @see #setVariableContainer(QEnvironmentVariableContainer)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystem_VariableContainer()
	 * @model containment="true"
	 * @generated
	 */
	QEnvironmentVariableContainer getVariableContainer();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystem#getVariableContainer <em>Variable Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Container</em>' containment reference.
	 * @see #getVariableContainer()
	 * @generated
	 */
	void setVariableContainer(QEnvironmentVariableContainer value);

} // QSystem
