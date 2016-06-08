/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.pgm.ProgramStackOrder;
import org.smeup.sys.os.pgm.QProgramCallable;
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
	private Stack<QProgramCallable> stack;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	protected ProgramStackImpl() {
		super();
		this.stack = new Stack<QProgramCallable>();
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
	public boolean contains(QProgramCallable element) {
		return this.stack.contains(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean contains(String name) {
		for (QProgramCallable level : list(ProgramStackOrder.ASCEND)) {
			if (level.getProgram().getName().equalsIgnoreCase(name))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void push(QProgramCallable element) {
		this.stack.push(element);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QProgramCallable peek() {
		return this.stack.peek();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public QProgramCallable pop() {
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
	public List<QProgramCallable> list(ProgramStackOrder order) {
		List<QProgramCallable> programList = new ArrayList<QProgramCallable>();
		Iterator<QProgramCallable> programs = stack.iterator();
		while (programs.hasNext()) {
			@SuppressWarnings("resource")
			QProgramCallable program = programs.next();
			programList.add(program);
		}
		
		switch (order) {
		case ASCEND:
			break;
		case DESCEND:
			Collections.reverse(programList);
			break;
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
