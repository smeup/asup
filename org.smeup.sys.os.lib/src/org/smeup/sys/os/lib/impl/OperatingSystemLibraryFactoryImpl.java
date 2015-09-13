/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.lib.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;
import org.smeup.sys.os.lib.QOperatingSystemLibraryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OperatingSystemLibraryFactoryImpl extends EFactoryImpl implements QOperatingSystemLibraryFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, 2015 Sme.UP and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QOperatingSystemLibraryFactory init() {
		try {
			QOperatingSystemLibraryFactory theOperatingSystemLibraryFactory = (QOperatingSystemLibraryFactory)EPackage.Registry.INSTANCE.getEFactory(QOperatingSystemLibraryPackage.eNS_URI);
			if (theOperatingSystemLibraryFactory != null) {
				return theOperatingSystemLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatingSystemLibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OperatingSystemLibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperatingSystemLibraryPackage.LIBRARY: return (EObject)createLibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QLibrary createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QOperatingSystemLibraryPackage getOperatingSystemLibraryPackage() {
		return (QOperatingSystemLibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperatingSystemLibraryPackage getPackage() {
		return QOperatingSystemLibraryPackage.eINSTANCE;
	}

} // OperatingSystemLibraryFactoryImpl
