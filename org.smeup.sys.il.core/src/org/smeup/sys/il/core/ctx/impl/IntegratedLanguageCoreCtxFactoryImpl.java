/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.core.ctx.ContextInjectionStrategy;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxFactory;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class IntegratedLanguageCoreCtxFactoryImpl extends EFactoryImpl implements QIntegratedLanguageCoreCtxFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static QIntegratedLanguageCoreCtxFactory init() {
		try {
			QIntegratedLanguageCoreCtxFactory theIntegratedLanguageCoreCtxFactory = (QIntegratedLanguageCoreCtxFactory) EPackage.Registry.INSTANCE
					.getEFactory(QIntegratedLanguageCoreCtxPackage.eNS_URI);
			if (theIntegratedLanguageCoreCtxFactory != null)
				return theIntegratedLanguageCoreCtxFactory;
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageCoreCtxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegratedLanguageCoreCtxFactoryImpl() {
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case QIntegratedLanguageCoreCtxPackage.CONTEXT_INJECTION_STRATEGY:
			return createContextInjectionStrategyFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case QIntegratedLanguageCoreCtxPackage.CONTEXT_INJECTION_STRATEGY:
			return convertContextInjectionStrategyToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContextInjectionStrategy createContextInjectionStrategyFromString(EDataType eDataType, String initialValue) {
		ContextInjectionStrategy result = ContextInjectionStrategy.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertContextInjectionStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QIntegratedLanguageCoreCtxPackage getIntegratedLanguageCoreCtxPackage() {
		return (QIntegratedLanguageCoreCtxPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageCoreCtxPackage getPackage() {
		return QIntegratedLanguageCoreCtxPackage.eINSTANCE;
	}

} // IntegratedLanguageCoreCtxFactoryImpl
