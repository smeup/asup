/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;
import org.smeup.sys.os.pgm.QProgramStack;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QProgram Stack</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ProgramStackImpl extends ObjectImpl implements QProgramStack {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean contains(QCallableProgram<?> element) {
		return this.stack.contains(element);
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

} // QProgramStackImpl
