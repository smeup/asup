/**
 */
package org.smeup.sys.os.scde.cron;

import org.eclipse.emf.ecore.EObject;

import org.smeup.sys.os.scde.QScheduleEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cron Schedule Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getWsip <em>Wsip</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getWsport <em>Wsport</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getSystem <em>System</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getPassword <em>Password</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage#getCronScheduleEntry()
 * @model
 * @generated
 */
public interface QCronScheduleEntry extends EObject, QScheduleEntry {
	/**
	 * Returns the value of the '<em><b>Wsip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsip</em>' attribute.
	 * @see #setWsip(String)
	 * @see org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage#getCronScheduleEntry_Wsip()
	 * @model
	 * @generated
	 */
	String getWsip();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getWsip <em>Wsip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsip</em>' attribute.
	 * @see #getWsip()
	 * @generated
	 */
	void setWsip(String value);

	/**
	 * Returns the value of the '<em><b>Wsport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsport</em>' attribute.
	 * @see #setWsport(String)
	 * @see org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage#getCronScheduleEntry_Wsport()
	 * @model
	 * @generated
	 */
	String getWsport();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getWsport <em>Wsport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsport</em>' attribute.
	 * @see #getWsport()
	 * @generated
	 */
	void setWsport(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage#getCronScheduleEntry_System()
	 * @model
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage#getCronScheduleEntry_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage#getCronScheduleEntry_Environment()
	 * @model
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.cron.QCronScheduleEntry#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

} // QCronScheduleEntry
