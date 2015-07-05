/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.core.ConversionStatus;
import org.smeup.sys.il.core.FormatType;
import org.smeup.sys.il.core.QAnnotationTest;
import org.smeup.sys.il.core.QConversion;
import org.smeup.sys.il.core.QDerived;
import org.smeup.sys.il.core.QFormat;
import org.smeup.sys.il.core.QIntegratedLanguageCoreFactory;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.QOverlay;
import org.smeup.sys.il.core.QRemap;
import org.smeup.sys.il.core.QSpecial;
import org.smeup.sys.il.core.QSpecialElement;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageCoreFactoryImpl extends EFactoryImpl implements QIntegratedLanguageCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageCoreFactory init() {
		try {
			QIntegratedLanguageCoreFactory theIntegratedLanguageCoreFactory = (QIntegratedLanguageCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageCorePackage.eNS_URI);
			if (theIntegratedLanguageCoreFactory != null) {
				return theIntegratedLanguageCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QIntegratedLanguageCorePackage.ANNOTATION_TEST: return (EObject)createAnnotationTest();
			case QIntegratedLanguageCorePackage.CONVERSION: return (EObject)createConversion();
			case QIntegratedLanguageCorePackage.DERIVED: return (EObject)createDerived();
			case QIntegratedLanguageCorePackage.FORMAT: return (EObject)createFormat();
			case QIntegratedLanguageCorePackage.OBJECT: return (EObject)createObject();
			case QIntegratedLanguageCorePackage.OBJECT_NAMEABLE: return (EObject)createObjectNameable();
			case QIntegratedLanguageCorePackage.OVERLAY: return (EObject)createOverlay();
			case QIntegratedLanguageCorePackage.REMAP: return (EObject)createRemap();
			case QIntegratedLanguageCorePackage.SPECIAL: return (EObject)createSpecial();
			case QIntegratedLanguageCorePackage.SPECIAL_ELEMENT: return (EObject)createSpecialElement();
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
			case QIntegratedLanguageCorePackage.CONVERSION_STATUS:
				return createConversionStatusFromString(eDataType, initialValue);
			case QIntegratedLanguageCorePackage.FORMAT_TYPE:
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
			case QIntegratedLanguageCorePackage.CONVERSION_STATUS:
				return convertConversionStatusToString(eDataType, instanceValue);
			case QIntegratedLanguageCorePackage.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QAnnotationTest createAnnotationTest() {
		AnnotationTestImpl annotationTest = new AnnotationTestImpl();
		return annotationTest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QConversion createConversion() {
		ConversionImpl conversion = new ConversionImpl();
		return conversion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDerived createDerived() {
		DerivedImpl derived = new DerivedImpl();
		return derived;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFormat createFormat() {
		FormatImpl format = new FormatImpl();
		return format;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QObject createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QObjectNameable createObjectNameable() {
		ObjectNameableImpl objectNameable = new ObjectNameableImpl();
		return objectNameable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOverlay createOverlay() {
		OverlayImpl overlay = new OverlayImpl();
		return overlay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QRemap createRemap() {
		RemapImpl remap = new RemapImpl();
		return remap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSpecial createSpecial() {
		SpecialImpl special = new SpecialImpl();
		return special;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QSpecialElement createSpecialElement() {
		SpecialElementImpl specialElement = new SpecialElementImpl();
		return specialElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionStatus createConversionStatusFromString(EDataType eDataType, String initialValue) {
		ConversionStatus result = ConversionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConversionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public QIntegratedLanguageCorePackage getIntegratedLanguageCorePackage() {
		return (QIntegratedLanguageCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageCorePackage getPackage() {
		return QIntegratedLanguageCorePackage.eINSTANCE;
	}

} // IntegratedLanguageCoreFactoryImpl
