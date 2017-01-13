package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.usrprf.QUserProfile;

@Program(name = "QSYGETPH")
public class ProfileHandleGetter {
	public static enum QCPFMSG {
		CPF2204
	}
	
	@Inject
	private transient QJob job;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QExceptionManager exceptionManager;

	@Main
	public void main(@DataDef(length = 10) QEnum<USERIDEnum, QCharacter> userId, 
			@DataDef(length = 10) QEnum<PASSWORDEnum, QCharacter> password,
			@DataDef(length = 12) QCharacter profileHandle,
			QUSEC qusec,
			@DataDef(binaryType = BinaryType.INTEGER) QBinary lengthOfPassword,
			@DataDef(binaryType = BinaryType.INTEGER) QBinary ccsidOfPassword) {
		
		QResourceWriter<QUserProfile> resourceWriter = null;
		resourceWriter = resourceManager.getResourceWriter(job, QUserProfile.class, Scope.SYSTEM_LIBRARY);

		profileHandle.clear();
		qusec.clear();
		
		String user = "";
		switch (userId.asEnum()) {
		case CURRENT:
			user = job.getJobReference().getJobUser();
			break;
		case OTHER:
			user = userId.asData().trimR();
			break;
		}
		QUserProfile qUserProfile = resourceWriter.lookup(user);
		
		if(qUserProfile == null){
			qusec.qusbavl.eval(1);
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2204, new String[] { user });
		}
		
		profileHandle.eval(user);
	}

	public static enum USERIDEnum {
		CURRENT, OTHER;
	}

	public static enum PASSWORDEnum {
		NOPWD, NOPWDCHK, OTHER;
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
	
}
