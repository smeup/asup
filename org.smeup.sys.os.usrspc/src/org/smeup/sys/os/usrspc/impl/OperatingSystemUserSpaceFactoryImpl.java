/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.usrspc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.usrspc.QOperatingSystemUserSpaceFactory;
import org.smeup.sys.os.usrspc.QOperatingSystemUserSpacePackage;
import org.smeup.sys.os.usrspc.QUserSpace;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemUserSpaceFactoryImpl extends EFactoryImpl implements QOperatingSystemUserSpaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemUserSpaceFactory init() {
		try {
			QOperatingSystemUserSpaceFactory theOperatingSystemUserSpaceFactory = (QOperatingSystemUserSpaceFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemUserSpacePackage.eNS_URI);
			if (theOperatingSystemUserSpaceFactory != null) {
				return theOperatingSystemUserSpaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemUserSpaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemUserSpaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemUserSpacePackage.USER_SPACE: return (EObject)createUserSpace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QUserSpace createUserSpace() {
		UserSpaceImpl userSpace = new UserSpaceImpl();
		return userSpace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemUserSpacePackage getOperatingSystemUserSpacePackage() {
		return (QOperatingSystemUserSpacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemUserSpacePackage getPackage() {
		return QOperatingSystemUserSpacePackage.eINSTANCE;
	}

} // OSUserSpaceCoreFactoryImpl
