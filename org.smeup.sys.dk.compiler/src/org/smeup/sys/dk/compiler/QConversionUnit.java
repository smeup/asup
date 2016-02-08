/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;

import java.io.Closeable;

import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getConversionUnit()
 * @model abstract="true" superTypes="org.smeup.sys.il.core.ctx.ContextProvider org.smeup.sys.mi.core.JavaCloseable"
 * @generated
 */
public interface QConversionUnit extends QContextProvider, Closeable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

} // QConversionUnit
