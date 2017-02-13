/**
 */
package org.smeup.sys.os.scde.cron.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smeup.sys.os.scde.cron.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperativeSystemCronScheduleEntryFactoryImpl extends EFactoryImpl implements QOperativeSystemCronScheduleEntryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QOperativeSystemCronScheduleEntryFactory init() {
		try {
			QOperativeSystemCronScheduleEntryFactory theOperativeSystemCronScheduleEntryFactory = (QOperativeSystemCronScheduleEntryFactory)EPackage.Registry.INSTANCE.getEFactory(QOperativeSystemCronScheduleEntryPackage.eNS_URI);
			if (theOperativeSystemCronScheduleEntryFactory != null) {
				return theOperativeSystemCronScheduleEntryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperativeSystemCronScheduleEntryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeSystemCronScheduleEntryFactoryImpl() {
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
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULE_ENTRY: return createCronScheduleEntry();
			case QOperativeSystemCronScheduleEntryPackage.CRON_SCHEDULER_CONFIG: return createCronSchedulerConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCronScheduleEntry createCronScheduleEntry() {
		CronScheduleEntryImpl cronScheduleEntry = new CronScheduleEntryImpl();
		return cronScheduleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCronSchedulerConfig createCronSchedulerConfig() {
		CronSchedulerConfigImpl cronSchedulerConfig = new CronSchedulerConfigImpl();
		return cronSchedulerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOperativeSystemCronScheduleEntryPackage getOperativeSystemCronScheduleEntryPackage() {
		return (QOperativeSystemCronScheduleEntryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QOperativeSystemCronScheduleEntryPackage getPackage() {
		return QOperativeSystemCronScheduleEntryPackage.eINSTANCE;
	}

} //OperativeSystemCronScheduleEntryFactoryImpl
