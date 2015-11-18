/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.os.scde.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperativeSystemScheduleEntryFactoryImpl extends EFactoryImpl implements QOperativeSystemScheduleEntryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperativeSystemScheduleEntryFactory init() {
		try {
			QOperativeSystemScheduleEntryFactory theOperativeSystemScheduleEntryFactory = (QOperativeSystemScheduleEntryFactory)EPackage.Registry.INSTANCE.getEFactory(QOperativeSystemScheduleEntryPackage.eNS_URI);
			if (theOperativeSystemScheduleEntryFactory != null) {
				return theOperativeSystemScheduleEntryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperativeSystemScheduleEntryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeSystemScheduleEntryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY: return (EObject)createScheduleEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QScheduleEntry createScheduleEntry() {
		ScheduleEntryImpl scheduleEntry = new ScheduleEntryImpl();
		return scheduleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperativeSystemScheduleEntryPackage getOperativeSystemScheduleEntryPackage() {
		return (QOperativeSystemScheduleEntryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperativeSystemScheduleEntryPackage getPackage() {
		return QOperativeSystemScheduleEntryPackage.eINSTANCE;
	}

} //OperativeSystemScheduleEntryFactoryImpl
