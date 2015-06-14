/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.cdo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.os.core.cdo.CDOStoreConfig;
import org.smeup.sys.os.core.cdo.CDOSystemConfig;
import org.smeup.sys.os.core.cdo.CDOSystemCoreFactory;
import org.smeup.sys.os.core.cdo.CDOSystemCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CDOSystemCoreFactoryImpl extends EFactoryImpl implements CDOSystemCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static CDOSystemCoreFactory init() {
		try {
			CDOSystemCoreFactory theCDOSystemCoreFactory = (CDOSystemCoreFactory)EPackage.Registry.INSTANCE.getEFactory(CDOSystemCorePackage.eNS_URI);
			if (theCDOSystemCoreFactory != null) {
				return theCDOSystemCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDOSystemCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public CDOSystemCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CDOSystemCorePackage.CDO_STORE_CONFIG: return (EObject)createCDOStoreConfig();
			case CDOSystemCorePackage.CDO_SYSTEM_CONFIG: return (EObject)createCDOSystemConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDOSystemConfig createCDOSystemConfig() {
		CDOSystemConfigImpl cdoSystemConfig = new CDOSystemConfigImpl();
		return cdoSystemConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDOStoreConfig createCDOStoreConfig() {
		CDOStoreConfigImpl cdoStoreConfig = new CDOStoreConfigImpl();
		return cdoStoreConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDOSystemCorePackage getCDOSystemCorePackage() {
		return (CDOSystemCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDOSystemCorePackage getPackage() {
		return CDOSystemCorePackage.eINSTANCE;
	}

} // CDOSystemCoreFactoryImpl
