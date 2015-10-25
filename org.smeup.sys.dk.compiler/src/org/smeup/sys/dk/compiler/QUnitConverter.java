/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;

import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QProgram;

import org.smeup.sys.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getUnitConverter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QUnitConverter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" moduleRequired="true"
	 * @generated
	 */
	QConversionUnit createConversionUnit(QJob job, org.smeup.sys.os.module.QModule module);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" programRequired="true"
	 * @generated
	 */
	QConversionUnit createConversionUnit(QJob job, org.smeup.sys.os.pgm.QProgram program);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" conversionUnitRequired="true" moduleRequired="true"
	 * @generated
	 */
	QModule convertModule(QConversionUnit conversionUnit, org.smeup.sys.os.module.QModule module);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" conversionUnitRequired="true" programRequired="true"
	 * @generated
	 */
	QProgram convertProgram(QConversionUnit conversionUnit, org.smeup.sys.os.pgm.QProgram program);

} // QUnitConverter
