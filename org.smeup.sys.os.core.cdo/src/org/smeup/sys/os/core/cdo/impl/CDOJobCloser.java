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
package org.smeup.sys.os.core.cdo.impl;

import java.util.Date;

import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.net4j.util.collection.CloseableIterator;
import org.smeup.sys.il.memo.cdo.CDOResourceUtil;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.QJob;

public class CDOJobCloser extends Thread {

	private CDOJobManagerImpl jobManager;

	public CDOJobCloser(CDOJobManagerImpl jobManager) {
		this.jobManager = jobManager;
	}

	@Override
	public void run() {

		while (true) {

			try {
				Thread.sleep(60 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			StringBuffer queryString = new StringBuffer();
			queryString.append("select * from " + CDOResourceUtil.getTableName(QJob.class));
			queryString.append(" where jobStatus<>:end");

			CDOQuery query = jobManager.getTransaction().createQuery("sql", queryString.toString());

			// query.setParameter("end", JobStatus.END_VALUE);
			query.setParameter("end", JobStatus.END_VALUE);

			CloseableIterator<QJob> jobs = query.getResultAsync(QJob.class);
			while (jobs.hasNext()) {
				QJob job = jobs.next();

				Date creationDate = job.getCreationInfo().getCreationDate();
				Date now = QOperatingSystemCoreHelper.now();

				long seconds = (now.getTime() - creationDate.getTime()) / 1000;

				// 1 hour
				if (seconds > 60 * 60)
					try {
						jobManager.updateStatus(job, JobStatus.END);
					} catch (OperatingSystemRuntimeException e) {
						System.err.println(e.getMessage());
					}
			}
			jobs.close();
		}

	}
}