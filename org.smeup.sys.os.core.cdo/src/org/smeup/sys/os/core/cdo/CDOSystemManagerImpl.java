/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.core.cdo;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.il.memo.cdo.CDOResourceUtil;
import org.smeup.sys.il.memo.cdo.CDOSessionUtil;
import org.smeup.sys.os.core.OperatingSystemException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.SystemStatus;
import org.smeup.sys.os.core.base.BaseSystemManagerImpl;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.rt.core.ComponentStarted;

public class CDOSystemManagerImpl extends BaseSystemManagerImpl {
	@Inject
	private QLockManager lockManager;
	
	private static final String CDO_CORE = "os/core";

	private CDONet4jSession session;

	private QSystem viewSystem;
	private QSystem transactionSystem;

	private QJob startupJob;

	private CDOView view;
	private CDOTransaction transaction;

	private QSystem systemConfig;
	
	@PostConstruct
	public void init(QSystem systemConfig) {
		this.systemConfig = systemConfig;
	}

	@ComponentStarted
	public void init() {
		this.viewSystem = prepareSystem();		
	}

	@Override
	public QJob start() {

		// acquire system lock
		QObjectLocker<QSystem> locker = lockManager.getLocker(startupJob.getContext(), transactionSystem);

		while (!locker.tryLock(QSystem.LOCK_TIMEOUT, LockType.WRITE));

		// create job kernel
		this.startupJob = createJob(JobType.KERNEL, transactionSystem.getSystemUser(), "KERNEL_CDO");

		// save
		CDOResource resource = transaction.getOrCreateResource(CDO_CORE);
		resource.getContents().add((EObject) startupJob);

		// system not able to start
		if (!QOperatingSystemCoreHelper.isStartable(viewSystem)) {
			try {
				transaction.commit();
			} catch (CommitException e) {
				throw new OperatingSystemRuntimeException(e);
			} finally {
				locker.unlock(LockType.WRITE);
			}
			return startupJob;
		}

		// update system status
		try {
			transactionSystem.setStatus(SystemStatus.STARTED);
			transaction.commit();

		} catch (CommitException e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {
			locker.unlock(LockType.WRITE);
		}

		return startupJob;
	}

	@Override
	public void stop() {

		// acquire system lock
		QObjectLocker<QSystem> locker = lockManager.getLocker(startupJob.getContext(), transactionSystem);

		// system not able to stop
		if (!QOperatingSystemCoreHelper.isStoppable(transactionSystem)) {
			locker.unlock(LockType.WRITE);
			return;
		}

		// update system status
		try {
			transactionSystem.setStatus(SystemStatus.STOPPED);
			transaction.commit();
		} catch (CommitException e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {
			locker.unlock(LockType.WRITE);
		}

		// close session
		transaction.close();
		session.close();

	}

	@Override
	public QSystem getSystem() {
		return viewSystem;
	}

	protected CDONet4jSession getCDOSession() {
		return session;
	}

	protected QJob getStartupJob() {
		return startupJob;
	}

	CDOView getView() {
		return view;
	}

	CDOTransaction getTransaction() {
		return transaction;
	}

	QSystem getTransactionSystem() {
		return transactionSystem;
	}

	private QSystem prepareSystem() {

		// this.systemName =
		// properties.get("org.asup.os.system.name").toString();
		// this.systemAddress =
		// properties.get("org.asup.os.system.address").toString();

		// session
		session = CDOSessionUtil.openSession("asup-db1:2036", systemConfig.getName());

		// view
		view = session.openView();

		// transaction
		transaction = session.openTransaction();
		transaction.options().setAutoReleaseLocksEnabled(false);

		String queryString = "select * from " + CDOResourceUtil.getTableName(QSystem.class) + " where name=:name";

		try {
			CDOQuery query = transaction.createQuery("sql", queryString);
			query.setParameter("name", systemConfig.getName());
			query.setMaxResults(1);
			transactionSystem = query.getResultValue(QSystem.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// first run
		if (transactionSystem == null) {
			QSystem system = (QSystem) EcoreUtil.copy((EObject) systemConfig);
			system.setInstallPath(System.getProperty(system.getInstallPath()));
			system.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(system));

			CDOResource resourceSystem = transaction.getOrCreateResource(CDO_CORE);
			resourceSystem.getContents().add((EObject) system);

			try {
				transaction.commit();
			} catch (ConcurrentAccessException e) {
				throw new OperatingSystemRuntimeException(e);
			} catch (CommitException e) {
				throw new OperatingSystemRuntimeException(e);
			}

			CDOQuery query = transaction.createQuery("sql", queryString);
			query.setParameter("name", system.getName());
			query.setMaxResults(1);
			transactionSystem = query.getResultValue(QSystem.class);
		}

		CDOQuery query = view.createQuery("sql", queryString);
		query.setParameter("name", systemConfig.getName());
		query.setMaxResults(1);
		QSystem system = query.getResultValue(QSystem.class);

		return system;
	}

	@Override
	protected synchronized int nextJobID() {

		int x = viewSystem.getLastJobNumber() + 1;

		viewSystem.setLastJobNumber(x);
		transactionSystem.setLastJobNumber(x);

		try {
			transaction.commit();
		} catch (CommitException e) {
			throw new OperatingSystemRuntimeException(e);
		}

		return x;
	}

	@Override
	protected QJob createJob(JobType jobType, String user, String jobName){
		return super.createJob(jobType, user, jobName);
	}
	
	public void updateStatus(JobStatus status) throws OperatingSystemException {
		try {
			// save job
			CDOResource resource = transaction.getOrCreateResource(CDO_CORE);
			startupJob.setJobStatus(status);
			resource.getContents().add((EObject) startupJob);
			transaction.commit();
		} catch (CommitException e) {
			throw new OperatingSystemException(e);
		}
	}
}