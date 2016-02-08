/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.type.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.type.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemTypeFactoryImpl extends EFactoryImpl implements QOperatingSystemTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemTypeFactory init() {
		try {
			QOperatingSystemTypeFactory theOperatingSystemTypeFactory = (QOperatingSystemTypeFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemTypePackage.eNS_URI);
			if (theOperatingSystemTypeFactory != null) {
				return theOperatingSystemTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemTypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemTypePackage.TYPE: return (EObject)createType();
			case QOperatingSystemTypePackage.TYPED_REF: return (EObject)createTypedRef();
			case QOperatingSystemTypePackage.TYPE_CONTAINER: return (EObject)createTypeContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends QTypedObject> QType<T> createType() {
		TypeImpl<T> type = new TypeImpl<T>();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends QTypedObject> QTypedRef<T> createTypedRef() {
		TypedRefImpl<T> typedRef = new TypedRefImpl<T>();
		return typedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QTypeContainer createTypeContainer() {
		TypeContainerImpl typeContainer = new TypeContainerImpl();
		return typeContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemTypePackage getOperatingSystemTypePackage() {
		return (QOperatingSystemTypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemTypePackage getPackage() {
		return QOperatingSystemTypePackage.eINSTANCE;
	}

} // OSTypeFactoryImpl
