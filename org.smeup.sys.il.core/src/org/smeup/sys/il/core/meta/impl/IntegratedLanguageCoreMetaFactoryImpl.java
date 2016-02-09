/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.meta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.core.meta.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageCoreMetaFactoryImpl extends EFactoryImpl implements QIntegratedLanguageCoreMetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageCoreMetaFactory init() {
		try {
			QIntegratedLanguageCoreMetaFactory theIntegratedLanguageCoreMetaFactory = (QIntegratedLanguageCoreMetaFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageCoreMetaPackage.eNS_URI);
			if (theIntegratedLanguageCoreMetaFactory != null) {
				return theIntegratedLanguageCoreMetaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageCoreMetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageCoreMetaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QIntegratedLanguageCoreMetaPackage.CARDINALITY: return (EObject)createCardinality();
			case QIntegratedLanguageCoreMetaPackage.DEFAULT: return (EObject)createDefault();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDefault createDefault() {
		DefaultImpl default_ = new DefaultImpl();
		return default_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageCoreMetaPackage getIntegratedLanguageCoreMetaPackage() {
		return (QIntegratedLanguageCoreMetaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageCoreMetaPackage getPackage() {
		return QIntegratedLanguageCoreMetaPackage.eINSTANCE;
	}

} // IntegratedLanguageCoreMetaFactoryImpl
