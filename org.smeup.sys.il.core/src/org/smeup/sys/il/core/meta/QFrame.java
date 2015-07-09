/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.meta;

import java.util.List;

import org.smeup.sys.il.core.QNameable;
import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Frame</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage#getFrame()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFrame<O extends QObject> extends QNameable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @model
	 * @generated
	 */
	QFrame<?> ako();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation"
	 * @generated
	 */
	List<QSlot> getSlots();
} // QFrame
