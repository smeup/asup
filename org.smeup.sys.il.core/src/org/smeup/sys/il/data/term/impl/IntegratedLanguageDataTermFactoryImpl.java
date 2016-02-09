/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.term.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.data.term.*;
import org.smeup.sys.il.data.term.DataTermType;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermFactory;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageDataTermFactoryImpl extends EFactoryImpl implements QIntegratedLanguageDataTermFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageDataTermFactory init() {
		try {
			QIntegratedLanguageDataTermFactory theIntegratedLanguageDataTermFactory = (QIntegratedLanguageDataTermFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageDataTermPackage.eNS_URI);
			if (theIntegratedLanguageDataTermFactory != null) {
				return theIntegratedLanguageDataTermFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageDataTermFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageDataTermFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QIntegratedLanguageDataTermPackage.FORMAT: return (EObject)createFormat();
			case QIntegratedLanguageDataTermPackage.OVERLAY: return (EObject)createOverlay();
			case QIntegratedLanguageDataTermPackage.RANGE: return (EObject)createRange();
			case QIntegratedLanguageDataTermPackage.REMAP: return (EObject)createRemap();
			case QIntegratedLanguageDataTermPackage.SPECIAL: return (EObject)createSpecial();
			case QIntegratedLanguageDataTermPackage.SPECIAL_ELEMENT: return (EObject)createSpecialElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageDataTermPackage.DATA_TERM_TYPE:
				return createDataTermTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataTermPackage.FORMAT_TYPE:
				return createFormatTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageDataTermPackage.DATA_TERM_TYPE:
				return convertDataTermTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataTermPackage.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFormat createFormat() {
		FormatImpl format = new FormatImpl();
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOverlay createOverlay() {
		OverlayImpl overlay = new OverlayImpl();
		return overlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRange createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRemap createRemap() {
		RemapImpl remap = new RemapImpl();
		return remap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSpecial createSpecial() {
		SpecialImpl special = new SpecialImpl();
		return special;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSpecialElement createSpecialElement() {
		SpecialElementImpl specialElement = new SpecialElementImpl();
		return specialElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataTermType createDataTermTypeFromString(EDataType eDataType, String initialValue) {
		DataTermType result = DataTermType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTermTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageDataTermPackage getIntegratedLanguageDataTermPackage() {
		return (QIntegratedLanguageDataTermPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageDataTermPackage getPackage() {
		return QIntegratedLanguageDataTermPackage.eINSTANCE;
	}

} // IntegratedLanguageDataTermFactoryImpl
