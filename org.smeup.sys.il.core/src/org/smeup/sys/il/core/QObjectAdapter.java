/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Object Adapter</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getObjectAdapter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QObjectAdapter {

	/*
	 * @generated NOT
	 */
	public static QObject adapt(Object object) {
		return new QObject() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public String qURI() {
				return this.toString();
			}
		};
	}
} // QObjectAdapter
