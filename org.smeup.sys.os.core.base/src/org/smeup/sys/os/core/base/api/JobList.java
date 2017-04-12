/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.core.base.api;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.usrspc.QUserSpace;
import org.smeup.sys.os.usrspc.base.api.UserSpaceRef;

@Program(name = "QUSLJOB")
public class JobList {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QJob job;
	@Inject
	
	private USRSPC_HEADER_0100 userSpaceHeader;
	private JOBL0100 jobl0100;
	private JOBL0200 jobl0200;
	@DataDef(length = 6)
	private QCharacter jobNumber;

	@Main
	public void main(@DataDef(qualified = true) UserSpaceRef userSpaceRef, 
			 @DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName,
			 @DataDef(qualified = true) JobName jobName,
			 @DataDef(length = 10) QEnum<Status, QCharacter> status,
			 ERROR error, 
			 @DataDef(length = 1) QCharacter jobType,
			 @DataDef(binaryType = BinaryType.INTEGER, value = " 0") QBinary numberFiedsToReturn,
			 @DataDef(dimension = 100, binaryType = BinaryType.INTEGER, value = " 0") QArray<QBinary> keyOfFiledsToReturn, 
			 @DataDef(length = 48) QCharacter continuationHandle) {

		error.clear();

		QResourceWriter<QUserSpace> userSpaceWriter = resourceManager.getResourceWriter(job, QUserSpace.class, userSpaceRef.library.asEnum(), userSpaceRef.library.asData().trimR());
		QUserSpace userSpace = userSpaceWriter.lookup(userSpaceRef.name.trimR());
		if (userSpace == null) {
			error.exceptionID.eval("002763");
			return;
		}
		userSpaceHeader.reset();

		userSpaceHeader.formatName.eval(formatName.asData());
		userSpaceHeader.apiUsed.eval("QUSLJOB");
		userSpaceHeader.dateTimeCreated.eval(Long.toString(jobManager.now(job).getTime()));
		userSpaceHeader.informationStatus.eval(ACCURATEEnum.PARTIAL);


		ArrayList<QJob> listJobs = getNumberJob(jobName);
		userSpaceHeader.entriesNumber.eval(listJobs.size());
		userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(jobl0100.getSize()));

		switch(formatName.asEnum()){
		case JOBL0100:
			userSpaceHeader.listOffset.eval(512);
			userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(jobl0100.getSize()));
			userSpaceHeader.entrySize.eval(jobl0100.getSize());
			break;
		case JOBL0200:
			userSpaceHeader.listOffset.eval(390);
			userSpaceHeader.listSize.eval(userSpaceHeader.entriesNumber.qMult(jobl0200.getSize()));
			userSpaceHeader.entrySize.eval(jobl0200.getSize());
			break;
		}
		byte[] bytes = new byte[userSpaceHeader.listOffset.i() + userSpaceHeader.listSize.i()];
		ByteBuffer buffer = ByteBuffer.wrap(bytes);
		
		buffer.put(userSpaceHeader.asBytes());
		
		buffer.position(userSpaceHeader.listOffset.i());
		for(QJob jobChild: listJobs) {

			jobl0100.clear();
			jobl0200.clear();
			
			switch(formatName.asEnum()){
			case JOBL0100:
				setJobl0100(jobChild);
				buffer.put(jobl0100.asBytes());
				break;
			case JOBL0200:
				setJobl0100(jobChild);
				jobl0200.jobl0100Format.eval(jobl0100);
				// TODO
				buffer.put(jobl0200.asBytes());
				break;
			}

		}
			
		userSpace.setContentArray(bytes);
		userSpaceWriter.save(userSpace, true);
	}

	private void setJobl0100(QJob jobChild) {
		
		jobl0100.jobNameUsed.eval(jobChild.getJobReference().getJobName());
		jobl0100.jobUserUsed.eval(jobChild.getJobReference().getJobUser());
		jobNumber.move(jobChild.getJobReference().getJobNumber());
		jobl0100.jobNumberUsed.eval(jobNumber);
		jobl0100.internalJobIdentifier.eval("");
		jobl0100.status.eval(jobChild.getJobStatus().getName());
		jobl0100.jobType.eval(jobChild.getJobType().getName());
		jobl0100.jobSubtype.eval("");
		jobl0100.reserved.eval("");
	}

	private ArrayList<QJob> getNumberJob(JobName jobName) {
		ArrayList<QJob> jobs = new ArrayList<QJob>();
		List<QJob> jobsChilds = new ArrayList<QJob>();

		
		switch(jobName.name.asEnum()){
		case ALL:
			jobsChilds = jobManager.getActiveJobs();
			break;
		case CURRENT:
		case TERM_STAR:
		case OTHER:
			jobManager.getUserJobs(jobName.user.asData().trimR());
			break;
		}
		
		for(QJob jobChild: jobsChilds) {

			switch(jobName.name.asEnum()){
			case ALL:
				break;
			case CURRENT:
			case TERM_STAR:
				if(!jobChild.getJobReference().getJobName().equals(job.getJobReference().getJobName()))
					continue;
			case OTHER:
				if(!jobChild.getJobReference().getJobName().equals(jobName.name.asData().trimR()))
					continue;
			}
			
			switch(jobName.number.asEnum()){
			case ALL:
				break;
			case OTHER:
				jobNumber.move(jobChild.getJobReference().getJobNumber());
				if(!jobNumber.trimR().equals(jobName.number.asData().trimR()))
					continue;
				break;
			}
			
			switch(jobName.user.asEnum()){
			case ALL:
				break;
			case CURRENT:
				if(!jobChild.getJobReference().getJobUser().equals(job.getJobReference().getJobUser()))
					continue;
			case OTHER:
				if(!jobChild.getJobReference().getJobUser().equals(jobName.user.asData().trimR()))
					continue;
			}
			
			jobs.add(jobChild);
		}
		
		return jobs;
	}
	
	
	public static enum FORMATEnum {
		@Special(value = "JOBL0100") JOBL0100, @Special(value = "JOBL0200") JOBL0200;
	}

	public static enum ACCURATEEnum {
		@Special(value = "C") COMPLETE, @Special(value = "I") INCOMPLETE, @Special(value = "P") PARTIAL;
	}
	
	public static class JOBL0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter jobNameUsed;
		@DataDef(length = 10)
		public QCharacter jobUserUsed;
		@DataDef(length = 6)
		public QCharacter jobNumberUsed;
		@DataDef(length = 16)
		public QCharacter internalJobIdentifier;
		@DataDef(length = 10)
		public QCharacter status;
		@DataDef(length = 1)
		public QCharacter jobType;
		@DataDef(length = 1)
		public QCharacter jobSubtype;
		@DataDef(length = 2)
		public QCharacter reserved;
	}

	public static class JOBL0200 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 56)
		public QCharacter jobl0100Format;
		@DataDef(length = 1)
		public QCharacter jobInformationStatus;
		@DataDef(length = 3)
		public QCharacter reserved;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary numberOfFieldReturned;
		// TODO continue ds... 
	}

	public static class USRSPC_HEADER_0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 64)
		@Overlay(position = 1)
		public QCharacter userArea;
		@DataDef(binaryType = BinaryType.INTEGER, value = "128")
		@Overlay(position = 65)
		public QBinary userSpaceHeaderSize;
		@DataDef(length = 4, value = "0100")
		@Overlay(position = 69)
		public QCharacter structureReleaseLevel;
		@DataDef(length = 8)
		@Overlay(position = 73)
		public QCharacter formatName;
		@DataDef(length = 10)
		@Overlay(position = 81)
		public QCharacter apiUsed;
		@DataDef(length = 13)
		@Overlay(position = 91)
		public QCharacter dateTimeCreated;
		@DataDef(length = 1)
		@Overlay(position = 104)
		public QEnum<ACCURATEEnum, QCharacter> informationStatus;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 105)
		public QBinary userSpaceSizeUsed;
		@DataDef(binaryType = BinaryType.INTEGER, value = "192")
		@Overlay(position = 109)
		public QBinary parameterOffset;
		@DataDef(binaryType = BinaryType.INTEGER, value = "64")
		@Overlay(position = 113)
		public QBinary parameterSize;
		@DataDef(binaryType = BinaryType.INTEGER, value = "256")
		@Overlay(position = 117)
		public QBinary headerOffset;
		@DataDef(binaryType = BinaryType.INTEGER, value = "256")
		@Overlay(position = 121)
		public QBinary headerSize;
		@DataDef(binaryType = BinaryType.INTEGER, value = "512")
		@Overlay(position = 125)
		public QBinary listOffset;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 129)
		public QBinary listSize;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 133)
		public QBinary entriesNumber;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 137)
		public QBinary entrySize;

		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 141)
		public QBinary entryCCSID;
		@DataDef(length = 2)
		@Overlay(position = 145)
		public QCharacter countryID;
		@DataDef(length = 3)
		@Overlay(position = 147)
		public QCharacter languageID;
		@DataDef(length = 1)
		@Overlay(position = 150)
		public QCharacter listIndicator;
		@DataDef(length = 42)
		@Overlay(position = 151)
		public QCharacter reserved01;
	}
	
	public static enum Status {
		@Special(value = "*ACTIVE") ACTIVE, @Special(value = "*JOBQ") JOBQ, @Special(value = "*OUTQ") OUTQ, @Special(value = "*ALL") ALL
	}

	public static class ERROR extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesProvided;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesAvailable;
		@DataDef(length = 7)
		public QCharacter exceptionID;
		@DataDef(length = 1)
		public QCharacter reserved01;
	}
	
	public static class JobName extends QDataStructWrapper {

		public class JobNotFoundException extends Exception {
			private static final long serialVersionUID = 1L;
		}

		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NameEnum, QCharacter> name;
		@DataDef(length = 10)
		public QEnum<UserEnum, QCharacter> user;
		@DataDef(length = 6)
		public QEnum<NumberEnum, QCharacter> number;

		public static enum NameEnum {
			@Special(value = "*")
			TERM_STAR, CURRENT, ALL, OTHER
		}
		public static enum UserEnum {
			CURRENT, ALL, OTHER
		}
		public static enum NumberEnum {
			ALL, OTHER
		}
	}
	

}
