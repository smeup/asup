package org.smeup.sys.os.pgm.base.api;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QWVRCSTK")
public class CallStackRetriever {
	private QWVCSTKE qwvcstke;
	private QWVK0100 qwvk0100;


	@Main
	public void main(@DataDef(length = 500) CSRCVVAR receiverVariable, 
				     @DataDef(binaryType = BinaryType.SHORT) QBinary receiveVariableLength, 
				     @DataDef(length = 8) QCharacter formatName,
				     @DataDef(length = 500) CSJOBID jobIdentification,
				     @DataDef(length = 8) QCharacter formatJobId,
				     @DataDef() APIERROR errorCode){
		
		receiverVariable.clear();
		errorCode.clear();
		qwvcstke.clear();
		qwvk0100.clear();
		
		if (formatName.eq("CSTK0100")) {
			// TODO eval qwvk0100
			
		}
		receiverVariable.cscalstk.eval(qwvk0100);
		
	}

	
	// Format CSTK0100
	public static class QWVK0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 1)
		public QBinary qwvbrtn;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 5)
		public QBinary qwvbavl;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 9)
		public QBinary qwveavl;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 13)
		public QBinary qwveo;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 17)
		public QBinary qwvertn;
		@DataDef(length = 8)
		@Overlay(position = 21)
		public QCharacter qwvrtnti;
		@DataDef(length = 1)
		@Overlay(position = 29)
		public QCharacter qwvis;
	}

	// DS for qwvk0100.qwvis
	public static class QWVCSTKE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 1)
		public QBinary qwvel;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 5)
		public QBinary qwvsd;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 9)
		public QBinary qwvsrtn;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 13)
		public QBinary qwvpd;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 17)
		public QBinary qwvpl;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 21)
		public QBinary qwvrl01;
		@DataDef(length = 10)
		@Overlay(position = 25)
		public QCharacter qwvpgmn;
		@DataDef(length = 10)
		@Overlay(position = 35)
		public QCharacter qwvpgml;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 45)
		public QBinary qwvction;
		@DataDef(length = 10)
		@Overlay(position = 49)
		public QCharacter qwvmn;
		@DataDef(length = 10)
		@Overlay(position = 59)
		public QCharacter qwvmlib;
		@DataDef(length = 1)
		@Overlay(position = 69)
		public QCharacter qwvcb;
		@DataDef(length = 3)
		@Overlay(position = 70)
		public QCharacter qwverved01;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = 73)
		public QBinary qwvagnbr;
		@DataDef(length = 10)
		@Overlay(position = 77)
		public QCharacter qwvagn;
		@DataDef(length = 2)
		@Overlay(position = 87)
		public QCharacter qwvrsv201;
		@DataDef(length = 10)
		@Overlay(position = 89)
		public QCharacter qwvpaspn;
		@DataDef(length = 10)
		@Overlay(position = 99)
		public QCharacter qwvlaspn;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 109)
		public QBinary qwvpaspn00;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 113)
		public QBinary qwvlaspn00;
		@DataDef(binaryType = BinaryType.BYTE)
		@Overlay(position = 117)
		public QBinary qwvagnl;
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
