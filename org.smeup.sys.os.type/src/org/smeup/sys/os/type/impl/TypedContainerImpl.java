/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.smeup.sys.il.core.impl.ObjectContainerImpl;
import org.smeup.sys.os.type.QOperatingSystemTypePackage;
import org.smeup.sys.os.type.QTypedContainer;
import org.smeup.sys.os.type.QTypedObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Typed Container</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypedContainerImpl<T extends QTypedObject> extends ObjectContainerImpl<T> implements QTypedContainer<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemTypePackage.Literals.TYPED_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> This is specialized for the
	 * more specific element type known in this context.
	 *
	 * @generated
	 */
	@Override
	public List<T> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<T>(QTypedObject.class, this, QOperatingSystemTypePackage.TYPED_CONTAINER__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public T lookupByName(String name) {
		for (T object : getContents())
			if (name.equals(object.getName()))
				return object;

		return null;
	}

} // TypedContainerImpl
