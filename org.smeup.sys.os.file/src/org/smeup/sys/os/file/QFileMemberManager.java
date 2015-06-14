/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.file;

import java.util.List;
import org.smeup.sys.os.core.jobs.QJob;

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
	 * @model jobRequired="true" libraryRequired="true" fileRequired="true"
	 * @generated
	 */
	List<QFileMember> list(QJob job, String library, QFileMembered file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" fileRequired="true" nameRequired="true"
	 * @generated
	 */
	QFileMember lookup(QJob job, String library, QFileMembered file, String name);

} // QFileMemberManager
