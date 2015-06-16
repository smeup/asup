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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER__LINKED_CLASS:
				return getLinkedClass();
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
		result.append(')');
		return result.toString();
	}

} //CompilerLinkerImpl
