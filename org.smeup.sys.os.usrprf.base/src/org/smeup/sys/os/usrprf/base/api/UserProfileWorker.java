/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.usrprf.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.usrprf.QUserProfile;

@Program(name = "QMNWRKUSR")
public class UserProfileWorker {
	public static enum QCPFMSG {
	}
	
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QOutputManager outputManager;
	
	@Main
	public void main(
			@DataDef(qualified = true) USERPROFILE userProfileName,
			@DataDef(length = 10) QEnum<ASSISTANCELEVELEnum, QCharacter> assistanceLevel) {
		
		QResourceReader<QUserProfile> userProfileReader = resourceManager.getResourceReader(job, QUserProfile.class, job.getSystem().getSystemLibrary());
		
		QObjectWriter objectWriter = outputManager.getDefaultWriter(job.getContext());
		objectWriter.initialize();

		try (QObjectIterator<QUserProfile> userProfileIterator = findIterator(userProfileName, userProfileReader)) {
			while (userProfileIterator.hasNext()) {
				QUserProfile qUserProfile = userProfileIterator.next();
				try {
					objectWriter.write(qUserProfile);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		objectWriter.flush();
	}
	
	@SuppressWarnings("resource")
	private QObjectIterator<QUserProfile> findIterator(USERPROFILE userProfileName, QResourceReader<QUserProfile> reader) {
		QObjectIterator<QUserProfile> result = null;
		switch (userProfileName.nameGeneric.asEnum()) {
		case ALL:
			result = reader.find(null);
			break;
		case OTHER:
			result = reader.find(userProfileName.nameGeneric.asData().trimR());
			break;
		}
		return result;
	}

	public static class USERPROFILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEGENERICEnum, QCharacter> nameGeneric;

		public static enum NAMEGENERICEnum {
			ALL, OTHER
		}
	}

	public static enum ASSISTANCELEVELEnum {
		PRV, BASIC, INTERMED, USRPRF
	}
}
