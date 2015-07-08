/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.meta;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Frame Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage#getFrameManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFrameManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true" objectRequired="true"
	 * @generated
	 */
	<O extends QObject> QFrame<O> getFrame(O object);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true" eClassRequired="true"
	 * @generated
	 */
	QFrame<?> getFrame(EClass eClass);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true" frameRequired="true"
	 * @generated
	 */
	<O extends QObject> O createObject(QFrame<O> frame);

} // QFrameManager
