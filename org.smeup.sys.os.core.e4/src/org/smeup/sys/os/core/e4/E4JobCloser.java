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
package org.smeup.sys.os.core.e4;

import java.util.Date;
import java.util.Iterator;

import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.QJob;

public class E4JobCloser extends Thread {

	private E4JobManagerImpl jobManager;

	public E4JobCloser(E4JobManagerImpl jobManager) {
		super("asup://thread/jobs/closer");
		setDaemon(true);
		this.jobManager = jobManager;
	}

	@Override
	public void run() {

		while (!Thread.currentThread().isInterrupted()) {

			try {
				Thread.sleep(60 * 1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				break;
			}

			Iterator<QJob> iterator = jobManager.getActiveJobs().iterator();
			QJob tmpJob = null;
			while (iterator.hasNext()) {
				tmpJob = iterator.next();

				switch (tmpJob.getJobStatus()) {
				case ACTIVE:

					Date creationDate = tmpJob.getCreationInfo().getCreationDate();
					Date now = QOperatingSystemCoreHelper.now();

					long seconds = (now.getTime() - creationDate.getTime()) / 1000;

					// 12 hour
					if (seconds > 12 * 60 * 60)
						try {
							jobManager.updateStatus(tmpJob, JobStatus.END);
							jobManager.close(tmpJob);
						} catch (Exception e) {
							System.err.println(e.getMessage());
						}

					break;
				case END:
					break;
				case END_OF_JOB:
					break;
				case EVENT_WAITING:
					break;
				case LOCK_WAITING:
					break;
				case MESSAGE_WAITING:
					break;
				case RUN:
					break;
				case TIME_WAITING:
					break;
				}
			}
		}
	}
}
