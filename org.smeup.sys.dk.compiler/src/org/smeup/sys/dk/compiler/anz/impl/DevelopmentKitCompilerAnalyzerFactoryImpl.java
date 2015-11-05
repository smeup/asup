/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.anz.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.dk.compiler.anz.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentKitCompilerAnalyzerFactoryImpl extends EFactoryImpl implements QDevelopmentKitCompilerAnalyzerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QDevelopmentKitCompilerAnalyzerFactory init() {
		try {
			QDevelopmentKitCompilerAnalyzerFactory theDevelopmentKitCompilerAnalyzerFactory = (QDevelopmentKitCompilerAnalyzerFactory)EPackage.Registry.INSTANCE.getEFactory(QDevelopmentKitCompilerAnalyzerPackage.eNS_URI);
			if (theDevelopmentKitCompilerAnalyzerFactory != null) {
				return theDevelopmentKitCompilerAnalyzerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevelopmentKitCompilerAnalyzerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentKitCompilerAnalyzerFactoryImpl() {
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
			case QDevelopmentKitCompilerAnalyzerPackage.PROGRAM_ANALISYS: return (EObject)createProgramAnalisys();
			case QDevelopmentKitCompilerAnalyzerPackage.VARIABLE_REF: return (EObject)createVariableRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QProgramAnalisys createProgramAnalisys() {
		ProgramAnalisysImpl programAnalisys = new ProgramAnalisysImpl();
		return programAnalisys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDevelopmentKitCompilerAnalyzerPackage getDevelopmentKitCompilerAnalyzerPackage() {
		return (QDevelopmentKitCompilerAnalyzerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDevelopmentKitCompilerAnalyzerPackage getPackage() {
		return QDevelopmentKitCompilerAnalyzerPackage.eINSTANCE;
	}

} //DevelopmentKitCompilerAnalyzerFactoryImpl
