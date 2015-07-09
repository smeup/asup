/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.term;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Term Container</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage#getTermContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QTermContainer<T extends QTerm> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model kind="operation"
	 * @generated
	 */
	List<T> getTerms();

} // QTermContainer
