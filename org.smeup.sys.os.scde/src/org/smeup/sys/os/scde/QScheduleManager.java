/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde;

import java.util.List;
import org.smeup.sys.os.core.jobs.QJobCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QScheduleManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobCapabilityRequired="true" jobNameRequired="true" userRequired="true" descriptionRequired="true" scheduleDateRequired="true" scheduleDayType="org.smeup.sys.mi.core.JavaList<org.eclipse.emf.ecore.EString>" scheduleDayRequired="true" scheduleDayMany="false" scheduleTimeRequired="true" omitDateType="org.smeup.sys.mi.core.JavaList<org.eclipse.emf.ecore.EString>" omitDateRequired="true" omitDateMany="false" relativeDayOfMonthType="org.smeup.sys.mi.core.JavaList<org.eclipse.emf.ecore.EString>" relativeDayOfMonthRequired="true" relativeDayOfMonthMany="false" frequencyRequired="true" commadToRunRequired="true"
	 * @generated
	 */
	QScheduleEntry create(QJobCapability jobCapability, String jobName, String user, String description, String scheduleDate, List<String> scheduleDay, String scheduleTime, List<String> omitDate, List<String> relativeDayOfMonth, String frequency, String commadToRun);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.smeup.sys.mi.core.JavaList<org.smeup.sys.os.scde.ScheduleEntry>" required="true" many="false" jobCapabilityRequired="true" jobNameRequired="true"
	 * @generated
	 */
	List<QScheduleEntry> lookup(QJobCapability jobCapability, String jobName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobCapabilityRequired="true" jobNameRequired="true"
	 * @generated
	 */
	void delete(QJobCapability jobCapability, String jobName);

} // QScheduleManager
