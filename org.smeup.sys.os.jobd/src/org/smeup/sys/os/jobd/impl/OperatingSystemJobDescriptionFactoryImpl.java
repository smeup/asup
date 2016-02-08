/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.jobd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.jobd.QJobDescription;
import org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionFactory;
import org.smeup.sys.os.jobd.QOperatingSystemJobDescriptionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemJobDescriptionFactoryImpl extends EFactoryImpl implements QOperatingSystemJobDescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemJobDescriptionFactory init() {
		try {
			QOperatingSystemJobDescriptionFactory theOperatingSystemJobDescriptionFactory = (QOperatingSystemJobDescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemJobDescriptionPackage.eNS_URI);
			if (theOperatingSystemJobDescriptionFactory != null) {
				return theOperatingSystemJobDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemJobDescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemJobDescriptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemJobDescriptionPackage.JOB_DESCRIPTION: return (EObject)createJobDescription();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QJobDescription createJobDescription() {
		JobDescriptionImpl jobDescription = new JobDescriptionImpl();
		return jobDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemJobDescriptionPackage getOperatingSystemJobDescriptionPackage() {
		return (QOperatingSystemJobDescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemJobDescriptionPackage getPackage() {
		return QOperatingSystemJobDescriptionPackage.eINSTANCE;
	}

} // OSJobDescriptionCoreFactoryImpl
