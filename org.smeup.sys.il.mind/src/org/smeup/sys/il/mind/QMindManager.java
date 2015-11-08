/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.mind;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.meta.QFrame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getMindManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QMindManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true"
	 * @generated
	 */
	<O extends QObject> QTheory buildTheory(QContext context, QFrame<O> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	QReasoner createReasoner(QContext context);
} // QMindManager
