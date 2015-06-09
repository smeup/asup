/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.shell.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.co.shell.QCommunicationShellPackage;
import org.smeup.sys.co.shell.QShellData;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.term.impl.DataTermImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Shell Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ShellDataImpl extends DataTermImpl<QBufferedDataDef<?>> implements QShellData {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ShellDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QCommunicationShellPackage.Literals.SHELL_DATA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> This is specialized for the
	 * more specific type known in this context.
	 *
	 * @generated
	 */
	@Override
	public NotificationChain basicSetDefinition(QBufferedDataDef<?> newDefinition, NotificationChain msgs) {
		return super.basicSetDefinition(newDefinition, msgs);
	}

} // ShellDataImpl
