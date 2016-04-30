/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.term;

import java.io.Serializable;
import java.util.List;

import org.smeup.sys.il.core.meta.QFacet;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.core.term.QNode#getFacets <em>Facets</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage#getNode()
 * @model abstract="true"
 * @generated NOT
 */
public interface QNode extends Serializable {
	/**
	 * Returns the value of the '<em><b>Facets</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.core.meta.QFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facets</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facets</em>' containment reference list.
	 * @see org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage#getNode_Facets()
	 * @model containment="true"
	 * @generated
	 */
	List<QFacet> getFacets();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QNode getParent();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isChild();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model klassRequired="true"
	 * @generated
	 */
	<F extends QFacet> F getFacet(Class<F> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true"
	 * @generated
	 */
	<F extends QFacet> List<F> getFacets(Class<F> klass);

} // QNode
