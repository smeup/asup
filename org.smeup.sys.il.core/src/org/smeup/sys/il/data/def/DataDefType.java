/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Data Def Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDataDefType()
 * @model
 * @generated
 */
public enum DataDefType implements Enumerator {
	/**
	 * The '<em><b>Adapter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAPTER_VALUE
	 * @generated
	 * @ordered
	 */
	ADAPTER(10, "Adapter", "ADAPTER"), /**
	 * The '<em><b>Array</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY(20, "Array", "ARRAY"), /**
	 * The '<em><b>Binary</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(30, "Binary", "BINARY"), /**
	 * The '<em><b>Buffer</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #BUFFER_VALUE
	 * @generated
	 * @ordered
	 */
	BUFFER(40, "Buffer", "BUFFER"), /**
	 * The '<em><b>Character</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #CHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTER(50, "Character", "CHAR"), /**
	 * The '<em><b>Data Struct</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #DATA_STRUCT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_STRUCT(60, "DataStruct", "DATASTRUCT"), /**
	 * The '<em><b>Datetime</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #DATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME(70, "Datetime", "DATETIME"), /**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(80, "Decimal", "DECIMAL"), /**
	 * The '<em><b>Floating</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #FLOATING_VALUE
	 * @generated
	 * @ordered
	 */
	FLOATING(90, "Floating", "FLOAT"), /**
	 * The '<em><b>Hexadecimal</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #HEXADECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	HEXADECIMAL(100, "Hexadecimal", "HEX"), /**
	 * The '<em><b>Identity</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #IDENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTITY(105, "Identity", "IDN"), /**
	 * The '<em><b>Indicator</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #INDICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	INDICATOR(110, "Indicator", "IND"), /**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(120, "List", "LIST"), /**
	 * The '<em><b>Pointer</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	POINTER(140, "Pointer", "POINTER"), /**
	 * The '<em><b>Scroller</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #SCROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLLER(150, "Scroller", "SCROLLER"), /**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(160, "String", "STRING"), /**
	 * The '<em><b>Stroller</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #STROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	STROLLER(170, "Stroller", "STROLLER"), /**
	 * The '<em><b>Struct</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #STRUCT_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCT(180, "Struct", "STRUCT"), /**
	 * The '<em><b>Wrapper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAPPER_VALUE
	 * @generated
	 * @ordered
	 */
	WRAPPER(190, "Wrapper", "WRAPPER");

	/**
	 * The '<em><b>Adapter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adapter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADAPTER
	 * @model name="Adapter" literal="ADAPTER"
	 * @generated
	 * @ordered
	 */
	public static final int ADAPTER_VALUE = 10;

	/**
	 * The '<em><b>Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Array</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY
	 * @model name="Array" literal="ARRAY"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_VALUE = 20;

	/**
	 * The '<em><b>Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Binary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @model name="Binary" literal="BINARY"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 30;

	/**
	 * The '<em><b>Buffer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Buffer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUFFER
	 * @model name="Buffer" literal="BUFFER"
	 * @generated
	 * @ordered
	 */
	public static final int BUFFER_VALUE = 40;

	/**
	 * The '<em><b>Character</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Character</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER
	 * @model name="Character" literal="CHAR"
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_VALUE = 50;

	/**
	 * The '<em><b>Data Struct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Struct</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_STRUCT
	 * @model name="DataStruct" literal="DATASTRUCT"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_STRUCT_VALUE = 60;

	/**
	 * The '<em><b>Datetime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Datetime</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATETIME
	 * @model name="Datetime" literal="DATETIME"
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_VALUE = 70;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decimal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model name="Decimal" literal="DECIMAL"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 80;

	/**
	 * The '<em><b>Floating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Floating</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOATING
	 * @model name="Floating" literal="FLOAT"
	 * @generated
	 * @ordered
	 */
	public static final int FLOATING_VALUE = 90;

	/**
	 * The '<em><b>Hexadecimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hexadecimal</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEXADECIMAL
	 * @model name="Hexadecimal" literal="HEX"
	 * @generated
	 * @ordered
	 */
	public static final int HEXADECIMAL_VALUE = 100;

	/**
	 * The '<em><b>Identity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Identity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDENTITY
	 * @model name="Identity" literal="IDN"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTITY_VALUE = 105;

	/**
	 * The '<em><b>Indicator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Indicator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDICATOR
	 * @model name="Indicator" literal="IND"
	 * @generated
	 * @ordered
	 */
	public static final int INDICATOR_VALUE = 110;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model name="List" literal="LIST"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 120;

	/**
	 * The '<em><b>Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINTER
	 * @model name="Pointer" literal="POINTER"
	 * @generated
	 * @ordered
	 */
	public static final int POINTER_VALUE = 140;

	/**
	 * The '<em><b>Scroller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scroller</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROLLER
	 * @model name="Scroller" literal="SCROLLER"
	 * @generated
	 * @ordered
	 */
	public static final int SCROLLER_VALUE = 150;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String" literal="STRING"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 160;

	/**
	 * The '<em><b>Stroller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stroller</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STROLLER
	 * @model name="Stroller" literal="STROLLER"
	 * @generated
	 * @ordered
	 */
	public static final int STROLLER_VALUE = 170;

	/**
	 * The '<em><b>Struct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Struct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCT
	 * @model name="Struct" literal="STRUCT"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCT_VALUE = 180;

	/**
	 * The '<em><b>Wrapper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wrapper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRAPPER
	 * @model name="Wrapper" literal="WRAPPER"
	 * @generated
	 * @ordered
	 */
	public static final int WRAPPER_VALUE = 190;

	/**
	 * An array of all the '<em><b>Data Def Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final DataDefType[] VALUES_ARRAY = new DataDefType[] {
			ADAPTER,
			ARRAY,
			BINARY,
			BUFFER,
			CHARACTER,
			DATA_STRUCT,
			DATETIME,
			DECIMAL,
			FLOATING,
			HEXADECIMAL,
			IDENTITY,
			INDICATOR,
			LIST,
			POINTER,
			SCROLLER,
			STRING,
			STROLLER,
			STRUCT,
			WRAPPER,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Def Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataDefType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Def Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataDefType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataDefType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Def Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataDefType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataDefType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Def Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataDefType get(int value) {
		switch (value) {
			case ADAPTER_VALUE: return ADAPTER;
			case ARRAY_VALUE: return ARRAY;
			case BINARY_VALUE: return BINARY;
			case BUFFER_VALUE: return BUFFER;
			case CHARACTER_VALUE: return CHARACTER;
			case DATA_STRUCT_VALUE: return DATA_STRUCT;
			case DATETIME_VALUE: return DATETIME;
			case DECIMAL_VALUE: return DECIMAL;
			case FLOATING_VALUE: return FLOATING;
			case HEXADECIMAL_VALUE: return HEXADECIMAL;
			case IDENTITY_VALUE: return IDENTITY;
			case INDICATOR_VALUE: return INDICATOR;
			case LIST_VALUE: return LIST;
			case POINTER_VALUE: return POINTER;
			case SCROLLER_VALUE: return SCROLLER;
			case STRING_VALUE: return STRING;
			case STROLLER_VALUE: return STROLLER;
			case STRUCT_VALUE: return STRUCT;
			case WRAPPER_VALUE: return WRAPPER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private DataDefType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // DataDefType
