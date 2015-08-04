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
package org.smeup.sys.os.msgf.base;

import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.msgf.QMessageFile;
import org.smeup.sys.os.msgf.QMessageFileManager;

public class BaseMessageFileManagerImpl implements QMessageFileManager {

	@Override
	public void overrideMessageFile(QJob job, String fileFrom, QMessageFile fileTo) throws OperatingSystemRuntimeException {

		BaseMessageFileOverrideMap overrideMessageFileMap = getMessageFileOverride(job);
		overrideMessageFileMap.registerFile(fileFrom, fileTo);
	}

	@Override
	public QMessageFile getOverrideMessageFile(QJob job, String fileName) throws OperatingSystemRuntimeException {
		BaseMessageFileOverrideMap overrideFileMap = getMessageFileOverride(job);

		QMessageFile qMessageFile = overrideFileMap.getFile(fileName);

		return qMessageFile;
	}

	private BaseMessageFileOverrideMap getMessageFileOverride(QJob job) {
		BaseMessageFileOverrideMap overrideMessageFileMap = job.getContext().get(BaseMessageFileOverrideMap.class);
		if (overrideMessageFileMap == null) {
			overrideMessageFileMap = new BaseMessageFileOverrideMap();
			job.getContext().set(BaseMessageFileOverrideMap.class, overrideMessageFileMap);
		}
		return overrideMessageFileMap;
	}

}