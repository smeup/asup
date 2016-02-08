/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;

import org.smeup.sys.il.core.ctx.QPluginRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Writer Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getExpressionWriterRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QExpressionWriterRegistry extends QPluginRegistry<QExpressionWriter> {
	public static String DEFAULT_WRITER = "RPJ";
} 
