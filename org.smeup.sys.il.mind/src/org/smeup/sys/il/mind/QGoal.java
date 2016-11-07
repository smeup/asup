/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.mind;

import java.util.List;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.mind.QGoal#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getGoal()
 * @model
 * @generated
 */
public interface QGoal extends QObject {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.mind.QMindTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getGoal_Terms()
	 * @model containment="true"
	 * @generated
	 */
	List<QMindTerm> getTerms();

} // QGoal
