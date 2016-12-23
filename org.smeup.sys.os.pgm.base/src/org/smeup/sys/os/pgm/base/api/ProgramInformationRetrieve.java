package org.smeup.sys.os.pgm.base.api;

import javax.inject.Inject;

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
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.pgm.QProgram;

@Program(name = "QCLRPGMI")
public class ProgramInformationRetrieve {
	public static enum QCPFMSG {
		CPF9810, // Library &1 not found
		CPF9811 // Program &1 in library &2 not found
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	public PGMI0100 pgmi0100;

	@Main
	public void main(@DataDef(length = 2000) QCharacter receiverVariable, @DataDef(binaryType = BinaryType.INTEGER, value = "2000") QBinary lengthReceiverVariable,
			@DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName, @DataDef(qualified = true) ProgramRef qualifiedProgramName, QUSEC qusec) {

		QResourceReader<QProgram> resource = null;
		String library = null;
		switch (qualifiedProgramName.library.asEnum()) {
		case LIBL:
			resource = resourceManager.getResourceReader(job, QProgram.class, Scope.LIBRARY_LIST);
			break;
		case USRLIBL:
			resource = resourceManager.getResourceReader(job, QProgram.class, Scope.USER_LIBRARY_LIST);
			break;
		case CURLIB:
			resource = resourceManager.getResourceWriter(job, QProgram.class, Scope.CURRENT_LIBRARY);
			break;
		case ALL:
			resource = resourceManager.getResourceWriter(job, QProgram.class, Scope.ALL);
			break;
		case ALLUSR:
			resource = resourceManager.getResourceWriter(job, QProgram.class, Scope.ALL_USER);
			break;
		case OTHER:
			library = qualifiedProgramName.library.asData().trimR();
			resource = resourceManager.getResourceWriter(job, QProgram.class, library);
			break;
		}

		QProgram qProgram = resource.lookup(qualifiedProgramName.name.trimR());
		if (qProgram == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9811, new String[] { qualifiedProgramName.name.trimR(), qualifiedProgramName.library.asData().trimR() });

		receiverVariable.clear();
		switch (formatName.asEnum()) {
		case PGMI0100:
			pgmi0100.clear();
			pgmi0100.qclpn.eval(qProgram.getName());
			pgmi0100.qclpln.eval(qProgram.getLibrary());
			pgmi0100.qcltext.eval(qProgram.getText());
			pgmi0100.qclpa.eval(qProgram.getSource().getType());
			
			pgmi0100.qclsfiln.eval("SRC");
			pgmi0100.qclsln.eval(qProgram.getLibrary());
			pgmi0100.qclsmn.eval(qProgram.getName());
			
			receiverVariable.eval(pgmi0100);
			break;
		case PGMI0200:
			break;
		case PGMI0300:
			break;
		default:
			break;
		}
	}

	public static enum FORMATEnum {
		@Special(value = "PGMI0100") PGMI0100, 
		@Special(value = "PGMI0200") PGMI0200, 
		@Special(value = "PGMI0300") PGMI0300;
	}

	public static class PGMI0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 1)
		public QBinary qclbrtn;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 5)
		public QBinary qclbavl;
		@DataDef(length = 10)
		@Overlay(position = 9)
		public QCharacter qclpn;
		@DataDef(length = 10)
		@Overlay(position = 19)
		public QCharacter qclpln;
		@DataDef(length = 10)
		@Overlay(position = 29)
		public QCharacter qclpo;
		@DataDef(length = 10)
		@Overlay(position = 39)
		public QCharacter qclpa;
		@DataDef(length = 13)
		@Overlay(position = 49)
		public QCharacter qclcdt;
		@DataDef(length = 10)
		@Overlay(position = 62)
		public QCharacter qclsfiln;
		@DataDef(length = 10)
		@Overlay(position = 72)
		public QCharacter qclsln;
		@DataDef(length = 10)
		@Overlay(position = 82)
		public QCharacter qclsmn;
		@DataDef(length = 13)
		@Overlay(position = 92)
		public QCharacter qclsdt;
		@DataDef(length = 1)
		@Overlay(position = 105)
		public QCharacter qcloi;
		@DataDef(length = 1)
		@Overlay(position = 106)
		public QCharacter qclupo;
		@DataDef(length = 1)
		@Overlay(position = 107)
		public QCharacter qcluaa;
		@DataDef(length = 1)
		@Overlay(position = 108)
		public QCharacter qcllc;
		@DataDef(length = 1)
		@Overlay(position = 109)
		public QCharacter qclclsrc;
		@DataDef(length = 1)
		@Overlay(position = 110)
		public QCharacter qclidd;
		@DataDef(length = 50)
		@Overlay(position = 111)
		public QCharacter qcltext;
		@DataDef(length = 1)
		@Overlay(position = 161)
		public QCharacter qcltop;
		@DataDef(length = 1)
		@Overlay(position = 162)
		public QCharacter qcltsep;
		@DataDef(length = 58)
		@Overlay(position = 163)
		public QCharacter qclrsv1;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 221)
		public QBinary qclmp;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 225)
		public QBinary qclmp00;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 229)
		public QBinary qclps;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 233)
		public QBinary qclass;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 237)
		public QBinary qclss;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 241)
		public QBinary qclas;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 245)
		public QBinary qclnmii;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 249)
		public QBinary qcliodte;
		@DataDef(length = 1)
		@Overlay(position = 253)
		public QCharacter qclps00;
		@DataDef(length = 14)
		@Overlay(position = 254)
		public QCharacter qclci;
		@DataDef(length = 6)
		@Overlay(position = 268)
		public QCharacter qcler;
		@DataDef(length = 10)
		@Overlay(position = 274)
		public QCharacter qclsstn;
		@DataDef(length = 10)
		@Overlay(position = 284)
		public QCharacter qclsstl;
		@DataDef(length = 10)
		@Overlay(position = 294)
		public QCharacter qclli;
		@DataDef(length = 1)
		@Overlay(position = 304)
		public QCharacter qclpd;
		@DataDef(length = 1)
		@Overlay(position = 305)
		public QCharacter qclcr;
		@DataDef(length = 20)
		@Overlay(position = 306)
		public QCharacter qclrsv2;
		@DataDef(length = 1)
		@Overlay(position = 326)
		public QCharacter qclation;
		@DataDef(length = 1)
		@Overlay(position = 327)
		public QCharacter qclpp;
		@DataDef(length = 1)
		@Overlay(position = 328)
		public QCharacter qclupasa;
		@DataDef(length = 1)
		@Overlay(position = 329)
		public QCharacter qclcpasa;
		@DataDef(length = 1)
		@Overlay(position = 330)
		public QCharacter qclpa00;
		@DataDef(length = 18)
		@Overlay(position = 331)
		public QCharacter qclrsv3;
		@DataDef(length = 10)
		@Overlay(position = 349)
		public QCharacter qclpm;
		@DataDef(length = 10)
		@Overlay(position = 359)
		public QCharacter qclpl;
		@DataDef(length = 30)
		@Overlay(position = 369)
		public QCharacter qclaga;
		@DataDef(length = 1)
		@Overlay(position = 399)
		public QCharacter qcloic;
		@DataDef(length = 1)
		@Overlay(position = 400)
		public QCharacter qclrtic;
		@DataDef(length = 6)
		@Overlay(position = 401)
		public QCharacter qclrpco;
		@DataDef(length = 1)
		@Overlay(position = 407)
		public QCharacter qclsag;
		@DataDef(length = 1)
		@Overlay(position = 408)
		public QCharacter qclau;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 409)
		public QBinary qclccsid;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 413)
		public QBinary qclnbrm;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 417)
		public QBinary qclnbrsp;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 421)
		public QBinary qclnbrc;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 425)
		public QBinary qclnbrur;
		@DataDef(length = 6)
		@Overlay(position = 429)
		public QCharacter qclrpcf;
		@DataDef(length = 1)
		@Overlay(position = 435)
		public QCharacter qclar;
		@DataDef(length = 1)
		@Overlay(position = 436)
		public QCharacter qclacd00;
		@DataDef(length = 1)
		@Overlay(position = 437)
		public QCharacter qclpgmlu;
		@DataDef(length = 10)
		@Overlay(position = 438)
		public QCharacter qclpd01;
		@DataDef(length = 1)
		@Overlay(position = 448)
		public QCharacter qclte;
		@DataDef(length = 1)
		@Overlay(position = 449)
		public QCharacter qclsm;
		@DataDef(length = 87)
		@Overlay(position = 450)
		public QCharacter qclrsv4;
	}

	public static class QUSEC extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER, value = "16")
		@Overlay(position = 1)
		public QBinary qusbprv;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 5)
		public QBinary qusbavl;
		@DataDef(length = 7)
		@Overlay(position = 9)
		public QCharacter qusei;
		@DataDef(length = 1)
		@Overlay(position = 16)
		public QCharacter quserved;
	}
}
