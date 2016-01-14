/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Format Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getFormatType()
 * @model
 * @generated
 */
public enum FormatType implements Enumerator {
	/**
	 * The '<em><b>Communications Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATIONS_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATIONS_NAME(30, "CommunicationsName", "CNAME"),

	/**
	 * The '<em><b>Command String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMAND_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	COMMAND_STRING(60, "CommandString", "SCMD"),

	/**
	 * The '<em><b>Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(50, "Generic", "GENERIC"),

	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(10, "Name", "NAME"),

	/**
	 * The '<em><b>Path Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_NAME(40, "PathName", "PNAME"),

	/**
	 * The '<em><b>Regular Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR_EXPRESSION(70, "RegularExpression", "REGEXP"),

	/**
	 * The '<em><b>Simple Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_NAME(20, "SimpleName", "SNAME");

	/**
	 * The '<em><b>Communications Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Communications Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATIONS_NAME
	 * @model name="CommunicationsName" literal="CNAME"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATIONS_NAME_VALUE = 30;

	/**
	 * The '<em><b>Command String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Command String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMAND_STRING
	 * @model name="CommandString" literal="SCMD"
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND_STRING_VALUE = 60;

	/**
	 * The '<em><b>Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model name="Generic" literal="GENERIC"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 50;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="Name" literal="NAME"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 10;

	/**
	 * The '<em><b>Path Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Path Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATH_NAME
	 * @model name="PathName" literal="PNAME"
	 * @generated
	 * @ordered
	 */
	public static final int PATH_NAME_VALUE = 40;

	/**
	 * The '<em><b>Regular Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regular Expression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGULAR_EXPRESSION
	 * @model name="RegularExpression" literal="REGEXP"
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_EXPRESSION_VALUE = 70;

	/**
	 * The '<em><b>Simple Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_NAME
	 * @model name="SimpleName" literal="SNAME"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_NAME_VALUE = 20;

	/**
	 * An array of all the '<em><b>Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormatType[] VALUES_ARRAY =
		new FormatType[] {
			COMMUNICATIONS_NAME,
			COMMAND_STRING,
			GENERIC,
			NAME,
			PATH_NAME,
			REGULAR_EXPRESSION,
			SIMPLE_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormatType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormatType get(int value) {
		switch (value) {
			case COMMUNICATIONS_NAME_VALUE: return COMMUNICATIONS_NAME;
			case COMMAND_STRING_VALUE: return COMMAND_STRING;
			case GENERIC_VALUE: return GENERIC;
			case NAME_VALUE: return NAME;
			case PATH_NAME_VALUE: return PATH_NAME;
			case REGULAR_EXPRESSION_VALUE: return REGULAR_EXPRESSION;
			case SIMPLE_NAME_VALUE: return SIMPLE_NAME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FormatType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FormatType
