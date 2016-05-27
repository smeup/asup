package org.smeup.sys.os.pgm.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QWVRCSTK")
public class CallStackRetriever {

	@Inject
	private QExceptionManager exceptionManager;

	@Inject
	private QJob job;

	public static enum QCPFMSG {
		CPFAFFF;
	}
	
	@Main
	public void main(@DataDef(length = 500) CSRCVVAR receiverVariable, 
				     @DataDef(binaryType = BinaryType.SHORT) QBinary receiveVariableLength, 
				     @DataDef(length = 8) QCharacter formatName,
				     @DataDef(length = 500) CSJOBID jobIdentification,
				     @DataDef(length = 8) QCharacter formatJobId,
				     @DataDef() APIERROR errorCode){

		throw exceptionManager.prepareException(job, QCPFMSG.CPFAFFF, this);
	}


	
	public static class CSJOBID extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter jijobnam;
		@DataDef(length = 10)
		public QCharacter jiusrnam;
		@DataDef(length = 6)
		@Overlay(name = "jijobid")
		public QCharacter jijobnbr;
		@DataDef(length = 16)
		public QCharacter jiintid;
		@DataDef(length = 2)
		public QCharacter jirsv;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary jithrind;
		@DataDef(length = 8)
		public QCharacter jithrid;
	}
	
	public static class CSRCVVAR extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary csbytrtn;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary csbytavl;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary csnbrstke;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary csofsstke;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary csnbrentrtn;
		@DataDef(length = 8)
		public QCharacter csthrid;
		@DataDef(length = 1)
		public QCharacter csinfsts;
		@DataDef(length = 32767)
		public QCharacter cscalstk;
	}

	public static class APIERROR extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER, value = "144")
		public QBinary aebytprv;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary aebytavl;
		@DataDef(length = 7)
		public QCharacter aeexcpid;
		@DataDef(length = 1)
		public QCharacter £mu_b£cri0_1;
		@DataDef(length = 128)
		public QCharacter aeexcpdta;
	}
}