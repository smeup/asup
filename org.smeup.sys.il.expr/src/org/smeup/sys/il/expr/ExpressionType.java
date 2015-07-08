/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Expression Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getExpressionType()
 * @model
 * @generated
 */
public enum ExpressionType implements Enumerator {
	/**
	 * The '<em><b>Arithmetic</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ARITHMETIC_VALUE
	 * @generated
	 * @ordered
	 */
	ARITHMETIC(10, "Arithmetic", "ART"), /**
	 * The '<em><b>Assignment</b></em>'
	 * literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #ASSIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNMENT(20, "Assignment", "ASS"), /**
	 * The '<em><b>Logical</b></em>'
	 * literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #LOGICAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL(31, "Logical", "LOG"), /**
	 * The '<em><b>Relational</b></em>' literal
	 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #RELATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIONAL(32, "Relational", "REL"), /**
	 * The '<em><b>Boolean</b></em>'
	 * literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(33, "Boolean", "BOOL"), /**
	 * The '<em><b>Atomic</b></em>' literal
	 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #ATOMIC_VALUE
	 * @generated
	 * @ordered
	 */
	ATOMIC(41, "Atomic", "ATOM"), /**
	 * The '<em><b>Qualified</b></em>' literal
	 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #QUALIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	QUALIFIED(42, "Qualified", "QUAL"), /**
	 * The '<em><b>Function</b></em>'
	 * literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(43, "Function", "FUNC"), /**
	 * The '<em><b>Block</b></em>' literal
	 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCK(50, "Block", "BLC");

	/**
	 * The '<em><b>Arithmetic</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arithmetic</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ARITHMETIC
	 * @model name="Arithmetic" literal="ART"
	 * @generated
	 * @ordered
	 */
	public static final int ARITHMETIC_VALUE = 10;

	/**
	 * The '<em><b>Assignment</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assignment</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ASSIGNMENT
	 * @model name="Assignment" literal="ASS"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT_VALUE = 20;

	/**
	 * The '<em><b>Logical</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Logical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #LOGICAL
	 * @model name="Logical" literal="LOG"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_VALUE = 31;

	/**
	 * The '<em><b>Relational</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relational</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #RELATIONAL
	 * @model name="Relational" literal="REL"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_VALUE = 32;

	/**
	 * The '<em><b>Boolean</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BOOLEAN
	 * @model name="Boolean" literal="BOOL"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 33;

	/**
	 * The '<em><b>Atomic</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Atomic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ATOMIC
	 * @model name="Atomic" literal="ATOM"
	 * @generated
	 * @ordered
	 */
	public static final int ATOMIC_VALUE = 41;

	/**
	 * The '<em><b>Qualified</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qualified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #QUALIFIED
	 * @model name="Qualified" literal="QUAL"
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFIED_VALUE = 42;

	/**
	 * The '<em><b>Function</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FUNCTION
	 * @model name="Function" literal="FUNC"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 43;

	/**
	 * The '<em><b>Block</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Block</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #BLOCK
	 * @model name="Block" literal="BLC"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCK_VALUE = 50;

	/**
	 * An array of all the '<em><b>Expression Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ExpressionType[] VALUES_ARRAY = new ExpressionType[] { ARITHMETIC, ASSIGNMENT, LOGICAL, RELATIONAL, BOOLEAN, ATOMIC, QUALIFIED, FUNCTION, BLOCK, };

	/**
	 * A public read-only list of all the '<em><b>Expression Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ExpressionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expression Type</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ExpressionType get(String literal) {
		for (ExpressionType result : VALUES_ARRAY) {
			if (result.toString().equals(literal))
				return result;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Type</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ExpressionType getByName(String name) {
		for (ExpressionType result : VALUES_ARRAY) {
			if (result.getName().equals(name))
				return result;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Type</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ExpressionType get(int value) {
		switch (value) {
		case ARITHMETIC_VALUE:
			return ARITHMETIC;
		case ASSIGNMENT_VALUE:
			return ASSIGNMENT;
		case LOGICAL_VALUE:
			return LOGICAL;
		case RELATIONAL_VALUE:
			return RELATIONAL;
		case BOOLEAN_VALUE:
			return BOOLEAN;
		case ATOMIC_VALUE:
			return ATOMIC;
		case QUALIFIED_VALUE:
			return QUALIFIED;
		case FUNCTION_VALUE:
			return FUNCTION;
		case BLOCK_VALUE:
			return BLOCK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private ExpressionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // ExpressionType
