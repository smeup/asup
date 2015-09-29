package org.smeup.sys.os.core.base.api.tools;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;

public class JobName extends QDataStructWrapper {
	
	public class JobNotFoundException extends Exception {
		private static final long serialVersionUID = 1L;
	}
	
	private static final long serialVersionUID = 1L;
	@DataDef(length = 10)
	public QEnum<NameEnum, QCharacter> name;
	@DataDef(length = 10)
	public QCharacter user;
	@DataDef(length = 6)
	public QCharacter number;

	public static enum NameEnum {
		@Special(value = "*")
		TERM_STAR, OTHER
	}

	public QJob findJob(QJob job, QJobManager jobManager) throws JobNotFoundException {
			QJob result = null;
			switch (name.asEnum()) {
			case TERM_STAR:
				result = job;
				break;
			case OTHER:
				result = jobManager.lookup(job.getJobID(), name.asData().trimR(), user.trimR(), new Integer(number.trim()));
				break;
			}
			
			if (result == null) {
				throw new JobNotFoundException();
			}
			
			return result;
		}

}