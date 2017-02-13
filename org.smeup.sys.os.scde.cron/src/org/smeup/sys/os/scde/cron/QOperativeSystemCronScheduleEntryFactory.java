/**
 */
package org.smeup.sys.os.scde.cron;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.scde.cron.QOperativeSystemCronScheduleEntryPackage
 * @generated
 */
public interface QOperativeSystemCronScheduleEntryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperativeSystemCronScheduleEntryFactory eINSTANCE = org.smeup.sys.os.scde.cron.impl.OperativeSystemCronScheduleEntryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cron Schedule Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cron Schedule Entry</em>'.
	 * @generated
	 */
	QCronScheduleEntry createCronScheduleEntry();

	/**
	 * Returns a new object of class '<em>Cron Scheduler Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cron Scheduler Config</em>'.
	 * @generated
	 */
	QCronSchedulerConfig createCronSchedulerConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperativeSystemCronScheduleEntryPackage getOperativeSystemCronScheduleEntryPackage();

} //QOperativeSystemCronScheduleEntryFactory
