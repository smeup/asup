/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import java.util.List;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.os.core.QCreationInfo;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.env.QEnvironmentVariableContainer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QJob</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getContext <em>Context</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getCreationInfo <em>Creation Info</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getCurrentLibrary <em>Current Library</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getDateSeparator <em>Date Separator</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getJobID <em>Job ID</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getJobReference <em>Job Reference</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getJobRunInfo <em>Job Run Info</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getJobThread <em>Job Thread</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getJobType <em>Job Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getSwitches <em>Switches</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getSystem <em>System</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getTimeSeparator <em>Time Separator</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJob#getVariableContainer <em>Variable Container</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob()
 * @model
 * @generated
 */
public interface QJob extends QObjectNameable, QContextProvider {
	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(QSystem)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_System()
	 * @model required="true" transient="true"
	 * @generated
	 */
	QSystem getSystem();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(QSystem value);

	/**
	 * Returns the value of the '<em><b>Job ID</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job ID</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Job ID</em>' attribute.
	 * @see #setJobID(String)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobID()
	 * @model id="true" required="true" annotation="il-data length='13'"
	 * @generated
	 */
	String getJobID();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getJobID
	 * <em>Job ID</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Job ID</em>' attribute.
	 * @see #getJobID()
	 * @generated
	 */
	void setJobID(String value);

	/**
	 * Returns the value of the '<em><b>Job Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Reference</em>' containment reference.
	 * @see #setJobReference(QJobReference)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QJobReference getJobReference();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getJobReference <em>Job Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Reference</em>' containment reference.
	 * @see #getJobReference()
	 * @generated
	 */
	void setJobReference(QJobReference value);

	/**
	 * Returns the value of the '<em><b>Job Run Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Run Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Run Info</em>' containment reference.
	 * @see #setJobRunInfo(QJobRunInfo)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobRunInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QJobRunInfo getJobRunInfo();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getJobRunInfo <em>Job Run Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Run Info</em>' containment reference.
	 * @see #getJobRunInfo()
	 * @generated
	 */
	void setJobRunInfo(QJobRunInfo value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Status</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="il-data length='20'"
	 * @generated
	 */
	JobStatus getJobStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="il-data precision='10' scale='0'"
	 * @generated
	 */
	long getMemorySize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	int getPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="il-data precision='10' scale='2'"
	 * @generated
	 */
	double getCPUUsage();

	/**
	 * Returns the value of the '<em><b>Job Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.os.core.jobs.JobType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Type</em>' attribute.
	 * @see org.smeup.sys.os.core.jobs.JobType
	 * @see #setJobType(JobType)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobType()
	 * @model
	 * @generated
	 */
	JobType getJobType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getJobType
	 * <em>Job Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Job Type</em>' attribute.
	 * @see org.smeup.sys.os.core.jobs.JobType
	 * @see #getJobType()
	 * @generated
	 */
	void setJobType(JobType value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' attribute list.
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_Libraries()
	 * @model
	 * @generated
	 */
	List<String> getLibraries();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' attribute list.
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_Messages()
	 * @model
	 * @generated
	 */
	List<String> getMessages();

	/**
	 * Returns the value of the '<em><b>Current Library</b></em>' attribute.
	 * The default value is <code>"QGPL"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Library</em>' attribute.
	 * @see #setCurrentLibrary(String)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_CurrentLibrary()
	 * @model default="QGPL"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	String getCurrentLibrary();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getCurrentLibrary <em>Current Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Library</em>' attribute.
	 * @see #getCurrentLibrary()
	 * @generated
	 */
	void setCurrentLibrary(String value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * The default value is <code>"*DMY"</code>.
	 * The literals are from the enumeration {@link org.smeup.sys.il.data.def.DateFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DateFormat
	 * @see #setDateFormat(DateFormat)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_DateFormat()
	 * @model default="*DMY"
	 * @generated
	 */
	DateFormat getDateFormat();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DateFormat
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(DateFormat value);

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' attribute.
	 * The default value is <code>"00000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' attribute.
	 * @see #setSwitches(String)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_Switches()
	 * @model default="00000000"
	 *        annotation="il-data length='8'"
	 * @generated
	 */
	String getSwitches();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getSwitches <em>Switches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switches</em>' attribute.
	 * @see #getSwitches()
	 * @generated
	 */
	void setSwitches(String value);

	/**
	 * Returns the value of the '<em><b>Date Separator</b></em>' attribute.
	 * The default value is <code>"/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Separator</em>' attribute.
	 * @see #setDateSeparator(String)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_DateSeparator()
	 * @model default="/"
	 *        annotation="il-data length='1'"
	 * @generated
	 */
	String getDateSeparator();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getDateSeparator <em>Date Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Separator</em>' attribute.
	 * @see #getDateSeparator()
	 * @generated
	 */
	void setDateSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Time Separator</b></em>' attribute.
	 * The default value is <code>":"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Separator</em>' attribute.
	 * @see #setTimeSeparator(String)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_TimeSeparator()
	 * @model default=":"
	 *        annotation="il-data length='1'"
	 * @generated
	 */
	String getTimeSeparator();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getTimeSeparator <em>Time Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Separator</em>' attribute.
	 * @see #getTimeSeparator()
	 * @generated
	 */
	void setTimeSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Variable Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Container</em>' containment reference.
	 * @see #setVariableContainer(QEnvironmentVariableContainer)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_VariableContainer()
	 * @model containment="true"
	 * @generated
	 */
	QEnvironmentVariableContainer getVariableContainer();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getVariableContainer <em>Variable Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Container</em>' containment reference.
	 * @see #getVariableContainer()
	 * @generated
	 */
	void setVariableContainer(QEnvironmentVariableContainer value);

	/**
	 * Returns the value of the '<em><b>Job Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Thread</em>' reference.
	 * @see #setJobThread(QThread)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_JobThread()
	 * @model resolveProxies="false" transient="true"
	 * @generated
	 */
	QThread getJobThread();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getJobThread <em>Job Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Thread</em>' reference.
	 * @see #getJobThread()
	 * @generated
	 */
	void setJobThread(QThread value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	boolean isActive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	boolean isRouted();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(QContext)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_Context()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	@Override
	QContext getContext();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(QContext value);

	/**
	 * Returns the value of the '<em><b>Creation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Info</em>' containment reference.
	 * @see #setCreationInfo(QCreationInfo)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJob_CreationInfo()
	 * @model containment="true"
	 * @generated
	 */
	QCreationInfo getCreationInfo();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJob#getCreationInfo <em>Creation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Info</em>' containment reference.
	 * @see #getCreationInfo()
	 * @generated
	 */
	void setCreationInfo(QCreationInfo value);

} // QJob
