/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Display Term</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DisplayTermImpl extends FileTermImpl implements QDisplayTerm {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DisplayTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageEsamPackage.Literals.DISPLAY_TERM;
	}

	@Override
	public String getName() {
		return getFileName();
	}

} // DisplayTermImpl
