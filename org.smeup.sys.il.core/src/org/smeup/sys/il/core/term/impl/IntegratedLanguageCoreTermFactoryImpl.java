/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.term.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermFactory;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageCoreTermFactoryImpl extends EFactoryImpl implements QIntegratedLanguageCoreTermFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageCoreTermFactory init() {
		try {
			QIntegratedLanguageCoreTermFactory theIntegratedLanguageCoreTermFactory = (QIntegratedLanguageCoreTermFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageCoreTermPackage.eNS_URI);
			if (theIntegratedLanguageCoreTermFactory != null) {
				return theIntegratedLanguageCoreTermFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageCoreTermFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageCoreTermFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageCoreTermPackage getIntegratedLanguageCoreTermPackage() {
		return (QIntegratedLanguageCoreTermPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageCoreTermPackage getPackage() {
		return QIntegratedLanguageCoreTermPackage.eINSTANCE;
	}

} // IntegratedLanguageCoreTermFactoryImpl
