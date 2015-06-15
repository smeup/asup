/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.dk.compiler.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentKitCompilerFactoryImpl extends EFactoryImpl implements QDevelopmentKitCompilerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QDevelopmentKitCompilerFactory init() {
		try {
			QDevelopmentKitCompilerFactory theDevelopmentKitCompilerFactory = (QDevelopmentKitCompilerFactory)EPackage.Registry.INSTANCE.getEFactory(QDevelopmentKitCompilerPackage.eNS_URI);
			if (theDevelopmentKitCompilerFactory != null) {
				return theDevelopmentKitCompilerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevelopmentKitCompilerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentKitCompilerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QDevelopmentKitCompilerPackage.COMPILATION_SETUP: return (EObject)createCompilationSetup();
			case QDevelopmentKitCompilerPackage.COMPILATION_TRASH_CAN: return (EObject)createCompilationTrashCan();
			case QDevelopmentKitCompilerPackage.COMPILER_LINKER: return (EObject)createCompilerLinker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QDevelopmentKitCompilerPackage.ENTRY_TYPE:
				return createEntryTypeFromString(eDataType, initialValue);
			case QDevelopmentKitCompilerPackage.CASE_SENSITIVE_TYPE:
				return createCaseSensitiveTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QDevelopmentKitCompilerPackage.ENTRY_TYPE:
				return convertEntryTypeToString(eDataType, instanceValue);
			case QDevelopmentKitCompilerPackage.CASE_SENSITIVE_TYPE:
				return convertCaseSensitiveTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCompilationSetup createCompilationSetup() {
		CompilationSetupImpl compilationSetup = new CompilationSetupImpl();
		return compilationSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCompilationTrashCan createCompilationTrashCan() {
		CompilationTrashCanImpl compilationTrashCan = new CompilationTrashCanImpl();
		return compilationTrashCan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCompilerLinker createCompilerLinker() {
		CompilerLinkerImpl compilerLinker = new CompilerLinkerImpl();
		return compilerLinker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType createEntryTypeFromString(EDataType eDataType, String initialValue) {
		EntryType result = EntryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseSensitiveType createCaseSensitiveTypeFromString(EDataType eDataType, String initialValue) {
		CaseSensitiveType result = CaseSensitiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaseSensitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDevelopmentKitCompilerPackage getDevelopmentKitCompilerPackage() {
		return (QDevelopmentKitCompilerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDevelopmentKitCompilerPackage getPackage() {
		return QDevelopmentKitCompilerPackage.eINSTANCE;
	}

} //DevelopmentKitCompilerFactoryImpl
