/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 */
package org.smeup.sys.os.jobd.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.jobd.QJobDescription;

@Program(name = "QWDRJOBD")
public class JobDescriptionRetriever {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QDataContext dataContext;

	@Main
	public void main(@DataDef(length = 500) QCharacter receiverVariable, @DataDef(binaryType = BinaryType.SHORT) QBinary receiveVariableLength, @DataDef(length = 8) QCharacter formatName,
			JobDescription jobDescription, @DataDef() QCharacter errorCode

	// @DataDef() QPointer receiverVariable,
	// QBinary receiveVariableLength,
	// @DataDef(length = 8) QCharacter formatName,
	// JobDescription jobDescription,
	// @DataDef()QPointer errorCode
	) {

		try {

			QResourceWriter<QJobDescription> resource = resourceManager.getResourceWriter(job, QJobDescription.class, jobDescription.library.trimR());
			QJobDescription qJobDescription = resource.lookup(jobDescription.name.trimR());

			if (qJobDescription == null)
				throw new OperatingSystemException("Job Description " + jobDescription.name + " not exists in library " + jobDescription.library);

			if (formatName.eq("JOBD0100")) {
				JOBD0100 jobd0100 = dataContext.getDataFactory().createDataStruct(JOBD0100.class, 0, true);
				jobd0100.clear();
				
				jobd0100.jobDescriptionName.eval(qJobDescription.getName());
				jobd0100.jobDescriptionLibrary.eval(qJobDescription.getLibrary());
				if (qJobDescription.getUser() != null)
					jobd0100.user.eval(qJobDescription.getUser());
				if (qJobDescription.getJobQueue() != null) {
					jobd0100.jobQueueName.eval(qJobDescription.getJobQueue().getName());
					jobd0100.jobQueueLibrary.eval(qJobDescription.getJobQueue().getLibrary());
				}
				if (qJobDescription.getJobPriorityOnJobq() != null)
					jobd0100.jobQueuePriority.eval(qJobDescription.getJobPriorityOnJobq());

				if (qJobDescription.getOutQueue() != null) {
					jobd0100.outQueueName.eval(qJobDescription.getOutQueue().getName());
					jobd0100.outQueueLibrary.eval(qJobDescription.getOutQueue().getLibrary());
				}

				if (qJobDescription.getOutputPriorityOnOutq() != null)
					jobd0100.outQueuePriority.eval(qJobDescription.getOutputPriorityOnOutq());

				if (qJobDescription.getText() != null)
					jobd0100.textDescription.eval(qJobDescription.getText());

				int l = 1;
				for (String initLibrary : qJobDescription.getLibraries()) {
					jobd0100.initialLibraryList.get(l).eval(initLibrary);
					l++;
				}

				receiverVariable.eval(jobd0100);
			} else
				throw new OperatingSystemException("Format name not supported");

		} catch (OperatingSystemException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	public static class JobDescription extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QCharacter library;
	}

	public static class JOBD0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter jobDescriptionName;
		@DataDef(length = 10)
		public QCharacter jobDescriptionLibrary;
		@DataDef(length = 10)
		public QCharacter user;
		@DataDef(length = 10)
		public QCharacter jobQueueName;
		@DataDef(length = 10)
		public QCharacter jobQueueLibrary;
		@DataDef(length = 1)
		public QCharacter jobQueuePriority;
		@DataDef(length = 10)
		public QCharacter outQueueName;
		@DataDef(length = 10)
		public QCharacter outQueueLibrary;
		@DataDef(length = 1)
		public QCharacter outQueuePriority;
		@DataDef(length = 50)
		public QCharacter textDescription;
		@DataDef(dimension = 250, length = 11)
		public QScroller<QCharacter> initialLibraryList;
	}

}
