/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.out.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutFactory;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class IntegratedLanguageCoreOutFactoryImpl extends EFactoryImpl implements QIntegratedLanguageCoreOutFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static QIntegratedLanguageCoreOutFactory init() {
		try {
			QIntegratedLanguageCoreOutFactory theIntegratedLanguageCoreOutFactory = (QIntegratedLanguageCoreOutFactory) EPackage.Registry.INSTANCE
					.getEFactory(QIntegratedLanguageCoreOutPackage.eNS_URI);
			if (theIntegratedLanguageCoreOutFactory != null)
				return theIntegratedLanguageCoreOutFactory;
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageCoreOutFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegratedLanguageCoreOutFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated
	 */
	@Override
	public QIntegratedLanguageCoreOutPackage getIntegratedLanguageCoreOutPackage() {
		return (QIntegratedLanguageCoreOutPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageCoreOutPackage getPackage() {
		return QIntegratedLanguageCoreOutPackage.eINSTANCE;
	}

} // IntegratedLanguageCoreOutFactoryImpl
