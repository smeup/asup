/**
 */
package org.smeup.sys.il.memo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.memo.test.QIntegratedLanguageMemoryTestPackage#getEnum1()
 * @model
 * @generated
 */
public enum Enum1 implements Enumerator {
	/**
	 * The '<em><b>Value1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE1_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE1(10, "Value1", "VAL1"),

	/**
	 * The '<em><b>Value2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE2_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE2(20, "Value2", "VAL2");

	/**
	 * The '<em><b>Value1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Value1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE1
	 * @model name="Value1" literal="VAL1"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE1_VALUE = 10;

	/**
	 * The '<em><b>Value2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Value2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE2
	 * @model name="Value2" literal="VAL2"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE2_VALUE = 20;

	/**
	 * An array of all the '<em><b>Enum1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Enum1[] VALUES_ARRAY =
		new Enum1[] {
			VALUE1,
			VALUE2,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Enum1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Enum1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Enum1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Enum1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Enum1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Enum1 get(int value) {
		switch (value) {
			case VALUE1_VALUE: return VALUE1;
			case VALUE2_VALUE: return VALUE2;
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
	private Enum1(int value, String name, String literal) {
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
	
} //Enum1
