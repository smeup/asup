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
package org.smeup.sys.os.pgm.base;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.mi.core.util.QStrings;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.core.jobs.QJobRunInfo;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QActivationGroupManager;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramInfo;
import org.smeup.sys.os.pgm.QProgramManager;
import org.smeup.sys.os.pgm.QProgramStack;

public class BaseProgramManagerImpl implements QProgramManager {
	@Inject
	private QJobManager jobManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QActivationGroupManager activationGroupManager;

	@Inject
	private QStrings strings;

	private Map<String, QProgramStack> programStacks;

	@PostConstruct
	private void init() {
		this.programStacks = new HashMap<String, QProgramStack>();
	}

	@Override
	public void callProgram(QJobCapability jobCapability, String library, String name, QData[] params) {

		QJob job = jobManager.lookup(jobCapability);
		callProgram(job, library, name, params);
	}

	@Override
	public void callProgram(QJob job, Class<?> klass, QData[] params) {

		Program programAnnotation = klass.getAnnotation(Program.class);
		if (programAnnotation == null)
			throw new OperatingSystemRuntimeException("Program class not callable: " + klass);

		callProgram(job, null, programAnnotation.name(), params);
	}

	@Override
	public void callProgram(QJob job, String library, String programName, QData[] params) {
		
		QProgram program = getProgram(job, library, programName);

		callProgram(job, program, params);		
	}

	@SuppressWarnings("resource")
	@Override
	public void callProgram(QJob job, QProgram program, QData[] params) {
		
		QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
		if (activationGroup == null)
			activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);

		QCallableProgram<?> callableProgram = activationGroup.lookup(program);

		// new program
		if (callableProgram == null) {
			callableProgram = loadProgram(job, program);
			activationGroup.getPrograms().add(callableProgram);
		}
		
		callProgram(job, callableProgram, params);
	}
	
	@Override
	public QCallableProgram<?> loadProgram(QJob job, QProgram program) {

		// API
		String address = null;
		if (program.getAddress() != null)
			address = program.getAddress();
		// Duplicated program
		else if (program.getBaseProgram() != null) {
			address = "asup:/omac/com.smeup.erp.pgm.gen/com.smeup.erp.pgm." + program.getApplication() + ".gen." + program.getBaseProgram();
		}
		// Program
		else
			address = "asup:/omac/com.smeup.erp.pgm.gen/com.smeup.erp.pgm." + program.getApplication() + ".gen." + program.getName();

		Class<?> klass = job.getContext().loadClass(address);

		if (klass == null)
			throw new OperatingSystemRuntimeException("Class not found: " + address);

		QCallableProgram<?> callableProgram = prepareCallableProgram(job, program, klass);

		return callableProgram;
	}

	@Override
	public <P> QCallableProgram<P> loadProgram(QJob job, Class<P> klass) {

		try {
			QProgram program = null;
			QCallableProgram<P> callableProgram = prepareCallableProgram(job, program, klass);

			return callableProgram;

		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}

	}

	@Override
	public QProgramStack getProgramStack(String contextID) {

		QProgramStack programStack = programStacks.get(contextID);
		if (programStack == null) {
			programStack = QOperatingSystemProgramFactory.eINSTANCE.createProgramStack();
			programStacks.put(contextID, programStack);
		}
		return programStack;
	}

	@Override
	public QProgramStack getProgramStack(String contextID, String jobID) {

		QProgramStack programStack = programStacks.get(jobID);

		return programStack;
	}

	@Override
	public QCallableProgram<?> getCaller(String contextID, QCallableProgram<?> program) {

		QProgramStack programStack = getProgramStack(contextID);
		QCallableProgram<?> caller = null;
		for (QCallableProgram<?> level : programStack.list()) {
			// looking for this
			if (level.equals(program))
				return caller;
			// set caller
			caller = level;
		}
		return null;
	}

	private <P> QCallableProgram<P> prepareCallableProgram(QJob job, QProgram program, Class<P> klass) {

		BaseCallableInjector callableInjector = new BaseCallableInjector(job.getContext());
		job.getContext().inject(callableInjector);
		QCallableProgram<P> callableProgram = callableInjector.prepareCallable(program, klass);

		QProgramInfo programInfo = callableProgram.getProgramInfo();
		if (programInfo != null) {
			QJobRunInfo jobRunInfo = job.getJobRunInfo();
			if (jobRunInfo == null) {
				jobRunInfo = QOperatingSystemJobsFactory.eINSTANCE.createJobRunInfo();
				job.setJobRunInfo(jobRunInfo);
			}
			jobRunInfo.setMemorySize(jobRunInfo.getMemorySize() + programInfo.getMemorySize());
		}

		return callableProgram;
	}

	private void assignParameters(QCallableProgram<?> callableProgram, QData[] paramsFrom) {

		QData[] paramsTo = callableProgram.getEntry();

		int paramsLength = 0;

		if (paramsTo != null && paramsFrom != null)
			paramsLength = paramsFrom.length < paramsTo.length ? paramsFrom.length : paramsTo.length;

		callableProgram.getProgramStatus().getParametersNumber().eval(paramsLength);

		// assign data pointers
		for (int i = 0; i < paramsLength; i++) {

			if (paramsFrom[i] == null)
				continue;

			if (paramsTo[i] instanceof QPointer) {
				QPointer pointer = (QPointer) paramsTo[i];
				pointer.eval(((QBufferedData) paramsFrom[i]).qAddr());
			} else if (paramsTo[i] instanceof QBufferedData && paramsFrom[i] instanceof QStorable) {
				QBufferedData bufferedData = (QBufferedData) paramsTo[i];
				((QStorable) paramsFrom[i]).assign(bufferedData);
			} else if (paramsTo[i] instanceof QList<?> && paramsFrom[i] instanceof QList<?>) {
				assignList(paramsFrom[i], paramsTo[i]);
			} else
				throw new OperatingSystemRuntimeException("Unexpected condition: nxt057t024xn", null);
			/*
			 * if (paramsTo[i] instanceof QAdapter) { QAdapter adapter =
			 * (QAdapter) paramsTo[i]; adapter.eval(adapter.getDelegate()); }
			 */
		}

		if (paramsTo == null)
			return;

		for (int i = paramsLength; i < paramsTo.length; i++) {
			if (paramsTo[i] instanceof QBufferedData) {
				QBufferedData bufferedData = (QBufferedData) paramsTo[i];
				QCharacter nullReference = callableProgram.getDataContext().getDataFactory().createCharacter(1, false, false);				
				nullReference.assign(bufferedData);
			} else
				paramsTo[i].clear();
		}
	}

	@SuppressWarnings("unchecked")
	public <D extends QData> void assignList(QData from, QData to) {

		QList<D> listFrom = (QList<D>) from;
		QList<D> listTo = (QList<D>) to;

		int e = 1;
		for (D elementFrom : listFrom) {
			D elementTo = listTo.get(e);
			((QBufferedData) elementFrom).assign((QBufferedData) elementTo);
			e++;
		}
	}

	@Override
	public QCallableProgram<?> getCaller(String contextID, Object program) {

		QProgramStack programStack = getProgramStack(contextID);
		QCallableProgram<?> caller = null;
		for (QCallableProgram<?> level : programStack.list()) {
			// looking for this
			if (level.getRawProgram().equals(program))
				return caller;
			// set caller
			caller = level;
		}
		return null;

	}

	private void callProgram(QJob job, QCallableProgram<?> callableProgram, QData[] params) {

		if(job.getJobThread() != null && !job.getJobThread().checkRunnable())
			return;
		
		synchronized (callableProgram) {

			// retrieve program stack from job
			QProgramStack programStack = getProgramStack(job.getJobID());
			programStack.setDateEnter(new Date());
			programStack.setDateExit(null);
			if (programStack.isEmpty())
				jobManager.updateStatus(job, JobStatus.RUN);

			// push program on stack
			programStack.push(callableProgram);

			// call
			try {

				// assign parameter
				assignParameters(callableProgram, params);

				// open
				if (!callableProgram.isOpen())
					callableProgram.open();

//				printSendStack(job, programStack, callableProgram);

				// call
				callableProgram.call();

				if (!callableProgram.isOpen()) {
					QProgram program = callableProgram.getProgram();
					QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
					activationGroup.remove(program);

					QProgramInfo programInfo = callableProgram.getProgramInfo();
					if (programInfo != null) {
						QJobRunInfo jobRunInfo = job.getJobRunInfo();
						if (jobRunInfo == null) {
							jobRunInfo = QOperatingSystemJobsFactory.eINSTANCE.createJobRunInfo();
							job.setJobRunInfo(jobRunInfo);
						}
						else
							jobRunInfo.setMemorySize(jobRunInfo.getMemorySize() - programInfo.getMemorySize());
					}
				}

			} catch (OperatingSystemMessageException | OperatingSystemRuntimeException e) {
				System.err.println(e.getMessage());
				throw e;
			} catch (Exception e) {
				Throwable cause = e.getCause();
				if (cause != null && (cause instanceof OperatingSystemMessageException)) {
					System.err.println(cause);
				} else {
					e.printStackTrace();
				}
				throw new OperatingSystemRuntimeException(e.getMessage(), e);
			} finally {
//				printReceiveStack(job, programStack, callableProgram);

				// remove program from stack
				programStack.setDateExit(new Date());
				programStack.pop();

				if (programStack.isEmpty())
					jobManager.updateStatus(job, JobStatus.ACTIVE);
			}
		}
	}

	private QProgram getProgram(QJob job, String library, String name) {

		// check program
		Scope scope = Scope.get(library);
		if (scope == null)
			scope = Scope.LIBRARY_LIST;

		QResourceReader<QProgram> programReader = resourceManager.getResourceReader(job, QProgram.class, scope, library);		
		QProgram program = programReader.lookup(name);
		if (program == null) {
			QJobReference jobReference = job.getJobReference();
			jobLogManager.error(job, "Program not found: " + name);
			throw new OperatingSystemRuntimeException(jobReference.getJobName() + "(" + jobReference.getJobNumber() + ")" + "\t" + "Program not found: " + name, null);
		}

		return program;
	}

	protected void printSendStack(QJob job, QProgramStack programStack, QCallableProgram<?> callableProgram) {
		String text = "-> " + callableProgram.getProgram().getName() + " (";

		if (callableProgram.getEntry() != null)
			text += formatStackParameters(callableProgram.getEntry());
		text += ")";
		QJobReference jobReference = job.getJobReference();
		System.out.println(jobReference.getJobName() + "(" + jobReference.getJobNumber() + ")" + strings.appendChars(text, "\t", programStack.size() - 1, true));
	}

	protected void printReceiveStack(QJob job, QProgramStack programStack, QCallableProgram<?> callableProgram) {
		String text = "<- " + callableProgram.getProgram().getName() + " (";
		if (callableProgram.getEntry() != null)
			text += formatStackParameters(callableProgram.getEntry());
		text += ")";
		text += callableProgram.isOpen() ? "(RT)" : "(LR)";
		QJobReference jobReference = job.getJobReference();
		System.out.println(jobReference.getJobName() + "(" + jobReference.getJobNumber() + ")" + strings.appendChars(text, "\t", programStack.size() - 1, true));
	}

	private String formatStackParameters(QData[] entry) {
		String text = "";
		for (QData param : entry) {
			if (param == null) {
				text += "|";
				continue;
			}
			String paramValue = null;
			if (param instanceof QString) {
				QString stringData = (QString) param;
				if (stringData.isNull()) {
					text += "|";
					continue;
				}
				paramValue = stringData.asString();
			} else if (param instanceof QBufferedElement) {
				QBufferedElement bufferedElement = (QBufferedElement) param;
				if (bufferedElement.isNull()) {
					text += "|";
					continue;
				}
				paramValue = new String(bufferedElement.asBytes());
			} else
				paramValue = param.toString();

			if (paramValue.length() > 100)
				text += paramValue.substring(0, 100) + "..|";
			else
				text += paramValue + "|";
		}
		return text;
	}

	protected long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
		long diffInMillies = date2.getTime() - date1.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}
}
