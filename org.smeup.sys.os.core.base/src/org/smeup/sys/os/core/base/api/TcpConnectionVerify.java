package org.smeup.sys.os.core.base.api;

import java.net.UnknownHostException;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobMessage;
import org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsFactoryImpl;

@Program(name = "QTONPING")
public @ToDo class TcpConnectionVerify {
	public static enum QCPFMSG {
		TCP0000, TCP3203
	}

	@Inject
	private transient QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QDataContext dataContext;

	@Main
	public void main(@ToDo @DataDef(length = 255) QEnum<REMOTESYSTEMEnum, QCharacter> remoteSystem, @DataDef(length = 64) QCharacter remoteInternetAddress,
			@DataDef(length = 10) QEnum<ADDRESSVERSIONFORMATEnum, QCharacter> addressVersionFormat, @ToDo MESSAGEMODE messageMode,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QBinary packetLengthinBytes, @ToDo @DataDef(binaryType = BinaryType.INTEGER) QBinary numberOfPackets,
			@DataDef(binaryType = BinaryType.INTEGER) QBinary waitTimeinSeconds, @DataDef(length = 64) QEnum<LOCALINTERNETADDRESSEnum, QCharacter> localInternetAddress,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<TYPEOFSERVICEEnum, QBinary> typeOfService,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<IPTIMETOLIVEHOPLIMITEnum, QBinary> iPTimeToLivehopLimit) {
		
		
		QCharacter system = dataContext.getDataFactory().createCharacter(8, false, true);
		QCharacter filler = dataContext.getDataFactory().createCharacter(16, false, true);
		QCharacter address = dataContext.getDataFactory().createCharacter(15, false, true);
		
		system.eval(job.getSystem().getName());
		filler.clear();
		
		try {
			java.net.InetAddress inetA;
			inetA = java.net.InetAddress.getLocalHost();
			address.eval(inetA.getHostAddress());
		} catch (UnknownHostException e) {
			jobLogManager.error(job, e.getMessage());
		}
		QJobMessage qJobMessage = OperatingSystemJobsFactoryImpl.eINSTANCE.createJobMessage();
		qJobMessage.setMessageId("TCP3203");	
		qJobMessage.setMessageText(system.toString() + filler.toString() + address.toString());
		job.getMessages().add(qJobMessage);
	}

	public static enum REMOTESYSTEMEnum {
		INTNETADR, OTHER
	}

	public static enum ADDRESSVERSIONFORMATEnum {
		CALC, IP4, IP6
	}

	public static class MESSAGEMODE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "*VERBOSE")
		public QEnum<RESPONSEMESSAGEDETAILEnum, QCharacter> responseMessageDetail;
		@DataDef(length = 10, value = "*COMP")
		public QEnum<SUMMARYIFRESPONSEERRORSEnum, QCharacter> summaryIfResponseErrors;

		public static enum RESPONSEMESSAGEDETAILEnum {
			VERBOSE, QUIET
		}

		public static enum SUMMARYIFRESPONSEERRORSEnum {
			COMP, ESCAPE
		}
	}

	public static enum LOCALINTERNETADDRESSEnum {
		ANY, OTHER
	}

	public static enum TYPEOFSERVICEEnum {
		@Special(value = "2") MINDELAY, @Special(value = "3") MAXTHRPUT, @Special(value = "4") MAXRLB, @Special(value = "5") MINCOST, @Special(value = "6") NORMAL
	}

	public static enum IPTIMETOLIVEHOPLIMITEnum {
		@Special(value = "0") DFT, OTHER
	}
}
