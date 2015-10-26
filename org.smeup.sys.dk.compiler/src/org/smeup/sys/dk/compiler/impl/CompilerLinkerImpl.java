/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage;
import org.smeup.sys.il.core.meta.impl.FacetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compiler Linker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.dk.compiler.impl.CompilerLinkerImpl#getLinkedClass <em>Linked Class</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.impl.CompilerLinkerImpl#getLinkedTermName <em>Linked Term Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilerLinkerImpl extends FacetImpl implements QCompilerLinker {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getLinkedClass() <em>Linked Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedClass()
	 * @generated
	 * @ordered
	 */
	protected Class<?> linkedClass;

	/**
	 * The default value of the '{@link #getLinkedTermName() <em>Linked Term Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedTermName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKED_TERM_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLinkedTermName() <em>Linked Term Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedTermName()
	 * @generated
	 * @ordered
	 */
	protected String linkedTermName = LINKED_TERM_NAME_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilerLinkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDevelopmentKitCompilerPackage.Literals.COMPILER_LINKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class<?> getLinkedClass() {
		return linkedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkedClass(Class<?> newLinkedClass) {
		Class<?> oldLinkedClass = linkedClass;
		linkedClass = newLinkedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_CLASS, oldLinkedClass, linkedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkedTermName() {
		return linkedTermName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedTermName(String newLinkedTermName) {
		String oldLinkedTermName = linkedTermName;
		linkedTermName = newLinkedTermName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_TERM_NAME, oldLinkedTermName, linkedTermName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_CLASS:
				return getLinkedClass();
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_TERM_NAME:
				return getLinkedTermName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_CLASS:
				setLinkedClass((Class<?>)newValue);
				return;
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_TERM_NAME:
				setLinkedTermName((String)newValue);
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
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_CLASS:
				setLinkedClass((Class<?>)null);
				return;
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_TERM_NAME:
				setLinkedTermName(LINKED_TERM_NAME_EDEFAULT);
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
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_CLASS:
				return linkedClass != null;
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_TERM_NAME:
				return LINKED_TERM_NAME_EDEFAULT == null ? linkedTermName != null : !LINKED_TERM_NAME_EDEFAULT.equals(linkedTermName);
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
		result.append(" (linkedClass: ");
		result.append(linkedClass);
		result.append(", linkedTermName: ");
		result.append(linkedTermName);
		result.append(')');
		return result.toString();
	}

} //CompilerLinkerImpl
