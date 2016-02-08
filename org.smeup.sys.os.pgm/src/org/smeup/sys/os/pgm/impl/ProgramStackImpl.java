/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;
import org.smeup.sys.os.pgm.QProgramStack;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QProgram Stack</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramStackImpl#getDateEnter <em>Date Enter</em>}</li>
 *   <li>{@link org.smeup.sys.os.pgm.impl.ProgramStackImpl#getDateExit <em>Date Exit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramStackImpl extends ObjectImpl implements QProgramStack {
	/**
	 * The default value of the '{@link #getDateEnter() <em>Date Enter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDateEnter()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ENTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateEnter() <em>Date Enter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDateEnter()
	 * @generated
	 * @ordered
	 */
	protected Date dateEnter = DATE_ENTER_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateExit() <em>Date Exit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDateExit()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EXIT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateExit() <em>Date Exit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDateExit()
	 * @generated
	 * @ordered
	 */
	protected Date dateExit = DATE_EXIT_EDEFAULT;
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Stack<QCallableProgram<?>> stack;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	protected ProgramStackImpl() {
		super();
		this.stack = new Stack<QCallableProgram<?>>();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemProgramPackage.Literals.PROGRAM_STACK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateEnter() {
		return dateEnter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateEnter(Date newDateEnter) {
		Date oldDateEnter = dateEnter;
		dateEnter = newDateEnter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_ENTER, oldDateEnter, dateEnter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateExit() {
		return dateExit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateExit(Date newDateExit) {
		Date oldDateExit = dateExit;
		dateExit = newDateExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_EXIT, oldDateExit, dateExit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void push(QCallableProgram<?> element) {
		this.stack.push(element);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QCallableProgram<?> peek() {
		return this.stack.peek();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QCallableProgram<?> pop() {
		return this.stack.pop();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public List<QCallableProgram<?>> list() {
		List<QCallableProgram<?>> programList = new ArrayList<QCallableProgram<?>>();
		Iterator<QCallableProgram<?>> programs = stack.iterator();
		while (programs.hasNext()) {
			@SuppressWarnings("resource")
			QCallableProgram<?> program = programs.next();
			programList.add(program);
		}
		return programList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public int size() {
		return stack.size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_ENTER:
				return getDateEnter();
			case QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_EXIT:
				return getDateExit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_ENTER:
				setDateEnter((Date)newValue);
				return;
			case QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_EXIT:
				setDateExit((Date)newValue);
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
			case QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_ENTER:
				setDateEnter(DATE_ENTER_EDEFAULT);
				return;
			case QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_EXIT:
				setDateExit(DATE_EXIT_EDEFAULT);
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
			case QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_ENTER:
				return DATE_ENTER_EDEFAULT == null ? dateEnter != null : !DATE_ENTER_EDEFAULT.equals(dateEnter);
			case QOperatingSystemProgramPackage.PROGRAM_STACK__DATE_EXIT:
				return DATE_EXIT_EDEFAULT == null ? dateExit != null : !DATE_EXIT_EDEFAULT.equals(dateExit);
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
		result.append(" (dateEnter: ");
		result.append(dateEnter);
		result.append(", dateExit: ");
		result.append(dateExit);
		result.append(')');
		return result.toString();
	}

} // QProgramStackImpl
