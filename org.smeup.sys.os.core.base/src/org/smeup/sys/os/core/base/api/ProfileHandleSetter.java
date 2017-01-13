package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
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

@Program(name = "QWTSETP")
public class ProfileHandleSetter {
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
	public void main(@DataDef(length = 12) QCharacter profileHandle,
			QUSEC qusec) {
		qusec.clear();

		QResourceWriter<QUserProfile> resourceWriter = null;
		resourceWriter = resourceManager.getResourceWriter(job, QUserProfile.class, Scope.SYSTEM_LIBRARY);

		String user = profileHandle.trimR();
		
		QUserProfile qUserProfile = resourceWriter.lookup(user);
		if(qUserProfile == null){
			qusec.qusbavl.eval(1);
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2204, new String[] { user });
		}
		job.getJobReference().setJobUser(user);
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
