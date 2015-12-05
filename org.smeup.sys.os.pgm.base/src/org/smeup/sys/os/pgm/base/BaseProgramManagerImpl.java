/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.util.QStrings;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QActivationGroupManager;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;
import org.smeup.sys.os.pgm.QProgram;
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
	@SuppressWarnings("unused")
	@Inject
	private QStrings strings;

	private Map<Thread, QResourceSetReader<QProgram>> programReaders;
	private Map<String, QProgramStack> programStacks;

	@PostConstruct
	private void init() {
		this.programReaders = new WeakHashMap<Thread, QResourceSetReader<QProgram>>();
		this.programStacks = new HashMap<String, QProgramStack>();
	}

	@SuppressWarnings("resource")
	@Override
	public void callProgram(String contextID, String library, String name, QData[] params) {

		QJob job = jobManager.lookup(contextID);

		QProgram program = getProgram(job, library, name);

		QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
		if (activationGroup == null)
			activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);

		QCallableProgram callableProgram = activationGroup.lookup(program);

		// new program
		if (callableProgram == null) {
			callableProgram = loadProgram(job, program);
			activationGroup.getPrograms().add(callableProgram);
		}

		callProgram(job, callableProgram, params);
	}

	@SuppressWarnings("resource")
	@Override
	public void callProgram(QJob job, Class<?> klass, QData[] params) {

		Program programAnnotation = klass.getAnnotation(Program.class);
		if (programAnnotation == null)
			throw new OperatingSystemRuntimeException("Program class not callable: " + klass);

		QProgram program = getProgram(job, null, programAnnotation.name());

		QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
		if (activationGroup == null)
			activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);

		QCallableProgram callableProgram = activationGroup.lookup(program);

		// new program
		if (callableProgram == null) {
			callableProgram = loadProgram(job, program);
			activationGroup.getPrograms().add(callableProgram);
		}

		callProgram(job, callableProgram, params);
	}

	@Override
	public QCallableProgram loadProgram(QJob job, QProgram program) {

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

		QCallableProgram callableProgram = prepareCallableProgram(job, program, klass);

		return callableProgram;
	}

	@Override
	public QCallableProgram loadProgram(QJob job, Class<?> klass) {

		try {
			QProgram program = null;
			QCallableProgram callableProgram = prepareCallableProgram(job, program, klass);

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
	public QCallableProgram getCaller(String contextID, QCallableProgram program) {

		QProgramStack programStack = getProgramStack(contextID);
		QCallableProgram caller = null;
		for (QCallableProgram level : programStack.list()) {
			// looking for this
			if (level.equals(program))
				return caller;
			// set caller
			caller = level;
		}
		return null;
	}

	public QCallableProgram prepareCallableProgram(QJob job, QProgram program, Class<?> klass) {

		BaseCallableInjector callableInjector = job.getContext().make(BaseCallableInjector.class);
		QCallableProgram callableProgram = callableInjector.prepareCallable(program, klass);

		return callableProgram;
	}

	private void assignParameters(QCallableProgram callableProgram, QData[] paramsFrom) {

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
			if (paramsTo[i] instanceof QAdapter) {
				QAdapter adapter = (QAdapter) paramsTo[i];
				adapter.eval(adapter.getDelegate());
			}  
			 */
		}

		if (paramsTo == null)
			return;

		QCharacter nullReference = callableProgram.getDataContext().getDataFactory().createCharacter(1, false, false);
		for (int i = paramsLength; i < paramsTo.length; i++) {
			if (paramsTo[i] instanceof QBufferedData) {
				QBufferedData bufferedData = (QBufferedData) paramsTo[i];
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
	public QCallableProgram getCaller(String contextID, Object program) {

		QProgramStack programStack = getProgramStack(contextID);
		QCallableProgram caller = null;
		for (QCallableProgram level : programStack.list()) {
			// looking for this
			if (level.getRawProgram().equals(program))
				return caller;
			// set caller
			caller = level;
		}
		return null;

	}

	private void callProgram(QJob job, QCallableProgram callableProgram, QData[] params) {

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

				printSendStack(job, programStack, callableProgram);

				// call
				callableProgram.call();

				if (!callableProgram.isOpen()) {
					QProgram program = callableProgram.getProgram();
					QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
					activationGroup.remove(program);
				}

			} catch (OperatingSystemMessageException | OperatingSystemRuntimeException e) {
				e.printStackTrace();
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
				printReceiveStack(job, programStack, callableProgram);

				// remove program from stack
				programStack.setDateExit(new Date());
				programStack.pop();

				if (programStack.isEmpty())
					jobManager.updateStatus(job, JobStatus.ACTIVE);
			}
		}
	}

	private QProgram getProgram(QJob job, String library, String name) {

		QResourceSetReader<QProgram> programReader = programReaders.get(Thread.currentThread());
		if (programReader == null) {
			programReader = programReaders.get(Thread.currentThread());
			synchronized (programReaders) {
				if (programReader == null) {
					programReader = resourceManager.getResourceReader(job, QProgram.class, Scope.ALL);
					programReaders.put(Thread.currentThread(), programReader);
				}
			}
		}

		// check program
		if (library != null && library.equalsIgnoreCase("*LIBL"))
			library = null;
		QProgram program = programReader.lookup(library, name);
		if (program == null) {
			jobLogManager.error(job, "Program not found: " + name);
			throw new OperatingSystemRuntimeException(job.getJobName() + "(" + job.getJobNumber() + ")" + "\t" + "Program not found: " + name, null);
		}

		return program;
	}

	@SuppressWarnings("unused")
	protected void printSendStack(QJob job, QProgramStack programStack, QCallableProgram callableProgram) {
		String text = "-> " + callableProgram.getProgram().getName() + " (";

		if (callableProgram.getEntry() != null)
			text += formatStackParameters(callableProgram.getEntry());
		text += ")";
//		System.out.println(job.getJobName() + "(" + job.getJobNumber() + ")" + strings.appendChars(text, "\t", programStack.size() - 1, true));
	}

	@SuppressWarnings("unused")
	protected void printReceiveStack(QJob job, QProgramStack programStack, QCallableProgram callableProgram) {
		String text = "<- " + callableProgram.getProgram().getName() + " (";
		if (callableProgram.getEntry() != null)
			text += formatStackParameters(callableProgram.getEntry());
		text += ")";
		text += callableProgram.isOpen() ? "(RT)" : "(LR)";
//		System.out.println(job.getJobName() + "(" + job.getJobNumber() + ")" + strings.appendChars(text, "\t", programStack.size() - 1, true));
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
			} else if (param instanceof QBufferedData) {
				QBufferedData bufferedData = (QBufferedData) param;
				if (bufferedData.isNull()) {
					text += "|";
					continue;
				}
				paramValue = new String(bufferedData.asBytes());
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