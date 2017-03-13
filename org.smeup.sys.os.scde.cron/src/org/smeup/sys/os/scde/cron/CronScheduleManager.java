package org.smeup.sys.os.scde.cron;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.scde.QOperativeSystemScheduleEntryFactory;
import org.smeup.sys.os.scde.QScheduleEntry;
import org.smeup.sys.os.scde.QScheduleManager;

public class CronScheduleManager implements QScheduleManager {
	
	@Inject
	private QResourceManager resourceManager;
	
	@Inject
	private QJobManager jobManager;

	@Override
	public QScheduleEntry create(QJobCapability jobCapability, String jobName, String user, String description, String scheduleDate,
			List<String> scheduleDay, String scheduleTime, List<String> omitDate, List<String> relativeDayOfMonth, String frequency, String commandToRun) {
		
		QJob job = jobManager.lookup(jobCapability);

		QResourceWriter<QScheduleEntry> resourceWriter = resourceManager.getResourceWriter(job, QScheduleEntry.class, Scope.SYSTEM_LIBRARY);
		
		QScheduleEntry scheduleEntry = QOperativeSystemScheduleEntryFactory.eINSTANCE.createScheduleEntry();

		scheduleEntry.setJobName(jobName);
		
		scheduleEntry.setScheduleDate(scheduleDate);		
		for(String day: scheduleDay){
			scheduleEntry.getScheduleDay().add(day);
		}
		scheduleEntry.setScheduleTime(scheduleTime);
		scheduleEntry.setFrequency(frequency);
		for(String day: omitDate){
			scheduleEntry.getOmitDate().add(day);
		}
		for(String day: relativeDayOfMonth){
			scheduleEntry.getRelativeDayOfMonth().add(day);
		}
		scheduleEntry.setCommandToRun(commandToRun);
		scheduleEntry.setUser(user);		
		scheduleEntry.setDescription(description);
		resourceWriter.save(scheduleEntry);
		
		return scheduleEntry;
	}

	@Override
	public List<QScheduleEntry> lookup(QJobCapability jobCapability, String jobName) {
		
		QJob job = jobManager.lookup(jobCapability);
		
		QResourceReader<QScheduleEntry> resourceReader = resourceManager.getResourceReader(job, QScheduleEntry.class, Scope.SYSTEM_LIBRARY);
		QObjectIterator<QScheduleEntry> objectIterator = resourceReader.find(jobName);
		
		List<QScheduleEntry> scheduleList = new ArrayList<QScheduleEntry>();
		while (objectIterator.hasNext()) {						
			scheduleList.add(objectIterator.next());
		}
		
		objectIterator.close();
		return scheduleList;
	}

	@Override
	public void delete(QJobCapability jobCapability, String jobName) {
		
		QJob job = jobManager.lookup(jobCapability);
		QResourceWriter<QScheduleEntry> resourceWriter = resourceManager.getResourceWriter(job, QScheduleEntry.class, Scope.SYSTEM_LIBRARY);	
		
		if (resourceWriter.exists(jobName)) {
		
			QScheduleEntry scheduleEntry = resourceWriter.lookup(jobName);
			resourceWriter.delete(scheduleEntry);
		}	
	}

}
