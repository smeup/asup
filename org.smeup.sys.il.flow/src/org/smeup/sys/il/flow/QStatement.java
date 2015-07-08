/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import org.smeup.sys.il.core.QNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Statement</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface QStatement extends QNode {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model visitorRequired="true"
	 * @generated
	 */
	void accept(QStatementVisitor visitor);
} // Statement
