/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.anz;

import java.util.List;

import org.smeup.sys.dk.compiler.QCompilationUnit;

import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage#getAnalysisUnit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QAnalysisUnit extends QCompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List<QDataTerm<?>> getDataTermsList();

} // QAnalysisUnit