/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>QResource Event Type</b></em>', and utility methods for working with
 * them. <!-- end-user-doc -->
 * @see org.smeup.sys.il.memo.QIntegratedLanguageMemoryPackage#getResourceEventType()
 * @model
 * @generated
 */
public enum ResourceEventType implements Enumerator {
	/**
	 * The '<em><b>Pre Save</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_SAVE_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_SAVE(10, "PreSave", "PRESAVE"),

	/**
	 * The '<em><b>Post Save</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_SAVE_VALUE
	 * @generated
	 * @ordered
	 */
	POST_SAVE(20, "PostSave", "POSTSAVE"),

	/**
	 * The '<em><b>Post Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	POST_LOAD(30, "PostLoad", "POSTLOAD"), /**
	 * The '<em><b>Pre Delete</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #PRE_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_DELETE(60, "PreDelete", "PREDLT"),

	/**
	 * The '<em><b>Post Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	POST_DELETE(70, "PostDelete", "POSTDLT");

	/**
	 * The '<em><b>Pre Save</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre Save</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_SAVE
	 * @model name="PreSave" literal="PRESAVE"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_SAVE_VALUE = 10;

	/**
	 * The '<em><b>Post Save</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Save</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_SAVE
	 * @model name="PostSave" literal="POSTSAVE"
	 * @generated
	 * @ordered
	 */
	public static final int POST_SAVE_VALUE = 20;

	/**
	 * The '<em><b>Post Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_LOAD
	 * @model name="PostLoad" literal="POSTLOAD"
	 * @generated
	 * @ordered
	 */
	public static final int POST_LOAD_VALUE = 30;

	/**
	 * The '<em><b>Pre Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre Delete</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_DELETE
	 * @model name="PreDelete" literal="PREDLT"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_DELETE_VALUE = 60;

	/**
	 * The '<em><b>Post Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Delete</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_DELETE
	 * @model name="PostDelete" literal="POSTDLT"
	 * @generated
	 * @ordered
	 */
	public static final int POST_DELETE_VALUE = 70;

	/**
	 * An array of all the '<em><b>Resource Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceEventType[] VALUES_ARRAY = new ResourceEventType[] {
			PRE_SAVE,
			POST_SAVE,
			POST_LOAD,
			PRE_DELETE,
			POST_DELETE,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceEventType get(int value) {
		switch (value) {
			case PRE_SAVE_VALUE: return PRE_SAVE;
			case POST_SAVE_VALUE: return POST_SAVE;
			case POST_LOAD_VALUE: return POST_LOAD;
			case PRE_DELETE_VALUE: return PRE_DELETE;
			case POST_DELETE_VALUE: return POST_DELETE;
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
	private ResourceEventType(int value, String name, String literal) {
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

} // QResourceEventType
