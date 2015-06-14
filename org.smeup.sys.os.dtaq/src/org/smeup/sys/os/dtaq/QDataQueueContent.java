/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq;

import java.util.List;
import org.smeup.sys.il.lock.QObjectLockable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Queue Content</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.dtaq.QDataQueueContent#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueueContent()
 * @model
 * @generated
 */
public interface QDataQueueContent extends QObjectLockable {

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.os.dtaq.QDataQueueEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueueContent_Entries()
	 * @model containment="true"
	 * @generated
	 */
	List<QDataQueueEntry> getEntries();
} // QDataQueueContent
