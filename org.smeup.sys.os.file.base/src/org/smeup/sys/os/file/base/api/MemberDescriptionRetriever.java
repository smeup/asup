package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;

@Program(name = "QUSRMBRD")
public class MemberDescriptionRetriever {

	@Inject
	private QFileMemberManager fileMemberManager;
	@Inject
	private QJob job;

	public QUSM0100 qusm0100;
	public QUSM0200 qusm0200;
	public QUSM0300 qusm0300;
	
	@Main
	public void main(@DataDef(length = 30000) QCharacter $$dati, @DataDef(binaryType = BinaryType.INTEGER) QCharacter $$len, @DataDef(length = 8) QCharacter format, FILE file,
			@DataDef(length = 10) QCharacter member, @DataDef(length = 1) QCharacter over, QUSEC usec) {
		
		QFileMember fileMember = fileMemberManager.lookup(job, file.library.asEnum(), file.library.asData().trimR(), file.name.trimR(), member.trimR());
		if(fileMember == null) {
			usec.qusbavl.eval(1);
			return;
		}
		
		switch (format.trimR()) {
		case "MBRD0100":
			qusm0100.clear();

			qusm0100.qusdfiln.eval(fileMember.getName());
			qusm0100.qusdfill.eval(fileMember.getFile().getLibrary());
			qusm0100.qusmn02.eval(member.trimR());
			qusm0100.qusst00.eval(fileMember.getType());
			qusm0100.qustd03.eval(fileMember.getText());

			$$dati.eval(qusm0100);
			break;
		case "MBRD0200":
			qusm0200.clear();

			$$dati.eval(qusm0200);
			break;
		case "MBRD0300":
			qusm0300.clear();

			qusm0300.qusdfiln01.eval(fileMember.getName());
			qusm0300.qusdfill01.eval(fileMember.getFile().getLibrary());
			qusm0300.qusmn04.eval(member.trimR());
			qusm0300.qusst02.eval(fileMember.getType());
			qusm0300.qustd05.eval(fileMember.getText());

			$$dati.eval(qusm0300);
			break;
		default:
			break;
		}

		usec.qusbavl.eval(0);
	}

	public static class QUSM0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbrtn02;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbavl03;
		@DataDef(length = 10)
		public QCharacter qusdfiln;
		@DataDef(length = 10)
		public QCharacter qusdfill;
		@DataDef(length = 10)
		public QCharacter qusmn02;
		@DataDef(length = 10)
		public QCharacter qusfila00;
		@DataDef(length = 10)
		public QCharacter qusst00;
		@DataDef(length = 13)
		public QCharacter quscd01;
		@DataDef(length = 13)
		public QCharacter quscd02;
		@DataDef(length = 50)
		public QCharacter qustd03;
		@DataDef(length = 1)
		public QCharacter qussfil00;
	}

	public static class QUSM0200 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbrtn03;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbavl04;
		@DataDef(length = 10)
		public QCharacter qusdfiln00;
		@DataDef(length = 10)
		public QCharacter qusdfill00;
		@DataDef(length = 10)
		public QCharacter qusmn03;
		@DataDef(length = 10)
		public QCharacter qusfila01;
		@DataDef(length = 10)
		public QCharacter qusst01;
		@DataDef(length = 13)
		public QCharacter quscd03;
		@DataDef(length = 13)
		public QCharacter qusscd;
		@DataDef(length = 50)
		public QCharacter qustd04;
		@DataDef(length = 1)
		public QCharacter qussfil01;
		@DataDef(length = 1)
		public QCharacter qusefil;
		@DataDef(length = 1)
		public QCharacter quslfil;
		@DataDef(length = 1)
		public QCharacter qusos;
		@DataDef(length = 2)
		public QCharacter quserved12;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusnbrcr;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusnbrdr;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusdss;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusaps;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusnbrdm;
		@DataDef(length = 13)
		public QCharacter quscd04;
		@DataDef(length = 13)
		public QCharacter qussd;
		@DataDef(length = 13)
		public QCharacter qusrd;
		@DataDef(length = 13)
		public QCharacter qused;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusndu;
		@DataDef(length = 7)
		public QCharacter qusdlu;
		@DataDef(length = 7)
		public QCharacter qusurd;
		@DataDef(length = 2)
		public QCharacter qusrsv101;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusdssm;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusapsm;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusmtc;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusoai;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary quslai;
		@DataDef(precision = 4)
		public QDecimal qusncru;
		@DataDef(precision = 4)
		public QDecimal qusndru;
		@DataDef(length = 6)
		public QCharacter qusrsv203;
	}

	public static class QUSM0300 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbrtn04;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbavl05;
		@DataDef(length = 10)
		public QCharacter qusdfiln01;
		@DataDef(length = 10)
		public QCharacter qusdfill01;
		@DataDef(length = 10)
		public QCharacter qusmn04;
		@DataDef(length = 10)
		public QCharacter qusfila02;
		@DataDef(length = 10)
		public QCharacter qusst02;
		@DataDef(length = 13)
		public QCharacter quscd05;
		@DataDef(length = 13)
		public QCharacter qusscd00;
		@DataDef(length = 50)
		public QCharacter qustd05;
		@DataDef(length = 1)
		public QCharacter qussfil02;
		@DataDef(length = 1)
		public QCharacter qusefil00;
		@DataDef(length = 1)
		public QCharacter quslfil00;
		@DataDef(length = 1)
		public QCharacter qusos00;
		@DataDef(length = 2)
		public QCharacter quserved13;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusnbrcr00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusnbrdr00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusdss00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusaps00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusnbrdm00;
		@DataDef(length = 13)
		public QCharacter quscd06;
		@DataDef(length = 13)
		public QCharacter qussd00;
		@DataDef(length = 13)
		public QCharacter qusrd00;
		@DataDef(length = 13)
		public QCharacter qused00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusndu00;
		@DataDef(length = 7)
		public QCharacter qusdlu00;
		@DataDef(length = 7)
		public QCharacter qusurd00;
		@DataDef(length = 2)
		public QCharacter qusrsv102;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusdssm00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusapsm00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusmtc00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusoai00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary quslai00;
		@DataDef(precision = 4)
		public QDecimal qusncru00;
		@DataDef(precision = 4)
		public QDecimal qusndru01;
		@DataDef(length = 6)
		public QCharacter qusrsv204;
		@DataDef(length = 1)
		public QCharacter qusjm;
		@DataDef(length = 1)
		public QCharacter qusapm;
		@DataDef(length = 10)
		public QCharacter qussqlft;
		@DataDef(length = 1)
		public QCharacter qusrsv3;
		@DataDef(length = 1)
		public QCharacter qusar;
		@DataDef(length = 1)
		public QCharacter qusaw;
		@DataDef(length = 1)
		public QCharacter qusau01;
		@DataDef(length = 1)
		public QCharacter qusad01;
		@DataDef(length = 1)
		public QCharacter qusrsv4;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusrfw;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusmpdr;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusinbrr;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusinbrr00;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusmnbri;
		@DataDef(precision = 4)
		public QDecimal quscnbri;
		@DataDef(precision = 4)
		public QDecimal qusrc;
		@DataDef(length = 10)
		public QCharacter qusrfsn;
		@DataDef(length = 10)
		public QCharacter qusrfsl;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusnbrci;
		@DataDef(length = 2)
		public QCharacter filler_56;
		@DataDef(length = 46)
		public QCharacter qusrsv5;
	}

	public static class QUSEC extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbprv;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary qusbavl;
		@DataDef(length = 7)
		public QCharacter qusei;
		@DataDef(length = 1)
		public QCharacter quserved;
		@DataDef(length = 256)
		public QCharacter qusecsta;
	}

	public static class FILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;

		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Scope, QCharacter> library;
	}
}