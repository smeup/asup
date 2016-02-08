/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

import java.util.List;

import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.Scope;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QFile Member Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.file.QOperatingSystemFilePackage#getFileMemberManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QFileMemberManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" fileRequired="true"
	 * @generated
	 */
	List<QFileMember> list(QContextProvider contextProvider, QFileMembered file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" libraryRequired="true" fileRequired="true" memberRequired="true"
	 * @generated
	 */
	QFileMember lookup(QContextProvider contextProvider, String library, String file, String member);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" fileRequired="true" memberRequired="true"
	 * @generated
	 */
	QFileMember lookup(QContextProvider contextProvider, QFileMembered file, String member);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" libraryRequired="true" fileRequired="true" memberRequired="true"
	 * @generated
	 */
	QFileMember lookup(QContextProvider contextProvider, Scope scope, String library, String file, String member);

} // QFileMemberManager
