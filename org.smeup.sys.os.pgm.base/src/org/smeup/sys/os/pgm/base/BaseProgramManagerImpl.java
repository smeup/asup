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

import java.io.FileWriter;
import java.text.DecimalFormat;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
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
import org.smeup.sys.os.pgm.ProgramStackOrder;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QActivationGroupManager;
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramCallable;
import org.smeup.sys.os.pgm.QProgramManager;
import org.smeup.sys.os.pgm.QProgramStack;
import org.smeup.sys.os.pgm.rpj.RPJProgramInjector;
import org.smeup.sys.rt.core.QApplication;

public class BaseProgramManagerImpl implements QProgramManager {

	@Inject
	private QApplication application;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QDataManager dataManager;

	private QActivationGroupManager activationGroupManager;

	@PostConstruct
	private void init() {
		activationGroupManager = new BaseActivationGroupManagerImpl(this);
		application.getContext().set(QActivationGroupManager.class, activationGroupManager);
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

	@Override
	public void callProgram(QJob job, QProgram program, QData[] params) {

		QProgramCallable callableProgram = loadProgram(job, program);

		callProgram(job, callableProgram, params);
	}

	@Override
	public QProgramCallable loadProgram(QJob job, QProgram program) {

		QProgramCallable callableProgram = null;

		QActivationGroup activationGroup = null;

		if (program.getActivationGroup().equals("*CALLER")) {
			QProgramStack programStack = getProgramStack(job);

			if (!programStack.isEmpty()) {
				activationGroup = programStack.peek().getActivationGroup();
				callableProgram = activationGroup.lookup(program);
			} else {
				activationGroup = activationGroupManager.lookup(job, "*DFT");
				if (activationGroup == null)
					activationGroup = activationGroupManager.create(job, "*DFT", true);
				else
					callableProgram = activationGroup.lookup(program);
			}
		} else if (program.getActivationGroup().equals("*NEW")) {
			activationGroup = activationGroupManager.create(job, "*NEW_" + System.currentTimeMillis(), true);
		} else {
			activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
			if (activationGroup == null)
				activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);
			else
				callableProgram = activationGroup.lookup(program);
		}

		if (callableProgram != null)
			return callableProgram;

		// API
		String address = getAddress(job, program);

		Class<?> klass = job.getContext().loadClass(address);

		if (klass == null)
			throw new OperatingSystemRuntimeException("Class not found: " + address);

		QDataContext dataContext = dataManager.createDataContext(job.getContext(), null);

		RPJProgramInjector injector = new RPJProgramInjector(activationGroup, dataContext);
		job.getContext().inject(injector);

		callableProgram = injector.prepareCallable(program, klass);

		activationGroup.getPrograms().add(callableProgram);

		return callableProgram;
	}

	private String getAddress(QJob job, QProgram program) {
		
		String address = null;
		
		// specific address
		if (program.getAddress() != null)
			address = program.getAddress();
		// Duplicated program
		else if (program.getBaseProgram() != null) {
			QProgram baseProgram = getProgram(job, null, program.getBaseProgram());
			address = getAddress(job, baseProgram); 
		}
		// Program
		else
			address = "asup:/omac/com.smeup.erp.pgm.gen/com.smeup.erp.pgm." + program.getApplication() + ".gen." + program.getName();

		return address;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <P> P loadProgram(QJob job, Class<P> klass) {

		QDataContext dataContext = dataManager.createDataContext(job.getContext(), null);
		QDataContainer dataContainer = dataManager.createDataContainer(dataContext);
		try {
			QProgram program = QOperatingSystemProgramFactory.eINSTANCE.createProgram();
			program.setName(klass.getSimpleName());

			RPJProgramInjector injector = new RPJProgramInjector(null, dataContext);
			job.getContext().inject(injector);

			Object delegate = injector.prepareDelegate(dataContainer, program, klass);

			return (P) delegate;
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {
			dataContainer.close();
		}
	}

	@Override
	public QProgramStack getProgramStack(String contextID) {

		QJob job = jobManager.lookup(contextID);
		if (job == null)
			return null;

		return getProgramStack(job);
	}

	@Override
	public QProgramStack getProgramStack(QJob job) {

		QProgramStack programStack = job.getContext().get(QProgramStack.class);
		if (programStack == null) {
			synchronized (job) {
				programStack = job.getContext().get(QProgramStack.class);
				if (programStack == null) {
					programStack = QOperatingSystemProgramFactory.eINSTANCE.createProgramStack();
					job.getContext().set(QProgramStack.class, programStack);
				}
			}
		}

		return programStack;
	}

	@Override
	public QProgramCallable getCaller(String contextID, QProgramCallable program) {

		QJob job = jobManager.lookup(contextID);
		if (job == null)
			return null;

		return getCaller(job, program);
	}

	@Override
	public QProgramCallable getCaller(QJob job, QProgramCallable program) {

		QProgramStack programStack = getProgramStack(job);
		QProgramCallable caller = null;
		for (QProgramCallable level : programStack.list(ProgramStackOrder.ASCEND)) {
			// looking for this
			if (level.equals(program))
				return caller;
			// set caller
			caller = level;
		}
		return null;
	}

	@Override
	public QProgramCallable getCaller(String contextID, Object program) {

		QJob job = jobManager.lookup(contextID);
		if (job == null)
			return null;

		return getCaller(job, program);
	}

	@Override
	public QProgramCallable getCaller(QJob job, Object program) {

		QProgramStack programStack = getProgramStack(job);
		QProgramCallable caller = null;
		for (QProgramCallable level : programStack.list(ProgramStackOrder.ASCEND)) {
			// looking for this
			if (level.getRawProgram().equals(program))
				return caller;
			// set caller
			caller = level;
		}
		return null;
	}

	private void assignParameters(QProgramCallable callableProgram, QData[] paramsFrom) {

		QData[] paramsTo = callableProgram.getParameters();

		int paramsLength = 0;

		if (paramsTo != null && paramsFrom != null)
			paramsLength = paramsFrom.length < paramsTo.length ? paramsFrom.length : paramsTo.length;

		callableProgram.getProgramStatus().getParametersNumber().eval(paramsLength);

		// assign data pointers
		for (int i = 0; i < paramsLength; i++) {

			if (paramsFrom[i] == null)
				continue;

			// pointer
			if (paramsTo[i] instanceof QPointer) {
				QPointer pointer = (QPointer) paramsTo[i];
				if(paramsFrom[i] instanceof QPointer){ 
					pointer.eval((QPointer) paramsFrom[i]);
				} else {
					pointer.eval(((QBufferedData) paramsFrom[i]).qAddr());
				}
			}
			// bufferedData
			else if (paramsTo[i] instanceof QBufferedData && paramsFrom[i] instanceof QStorable) {
				QBufferedData bufferedData = (QBufferedData) paramsTo[i];

				// TODO verify Binary
				if (paramsTo[i] instanceof QBinary && !(paramsFrom[i] instanceof QBinary)) {
					System.err.println("Verify condition call with binary : oapfy08372q5tvn023yhgf9q3yf9y");
					BinaryType type = null;
					
					switch (((QNumeric) paramsTo[i]).getLength()) {
						case 3:
							type = BinaryType.BYTE;
							break;
						case 5:
							type = BinaryType.SHORT;
							break;
						case 10:
							type = BinaryType.INTEGER;
							break;
						case 20:
							type = BinaryType.LONG;
							break;
					}
					QBinary binaryNumber = callableProgram.getDataContext().getDataFactory().createBinary(type, false, true);
					binaryNumber.clear();
					binaryNumber.eval((QNumeric) paramsFrom[i]);
					paramsFrom[i] = binaryNumber;
				}

				((QStorable) paramsFrom[i]).assign(bufferedData);
			}
			// list not buffered (QCLCALL)
			else if (paramsTo[i] instanceof QList<?> && paramsFrom[i] instanceof QList<?>) {
				assignList(paramsFrom[i], paramsTo[i]);
			} else
				throw new OperatingSystemRuntimeException("Unexpected condition: nxt057t024xn", null);
		}

		if (paramsTo == null)
			return;

		for (int i = paramsLength; i < paramsTo.length; i++) {
			if (paramsTo[i] instanceof QBufferedData) {
				QBufferedData bufferedData = (QBufferedData) paramsTo[i];
				QPointer nullReference = callableProgram.getDataContext().getDataFactory().createPointer(0);
				nullReference.assign(bufferedData);
			} else
				paramsTo[i].clear();
		}
	}

	@SuppressWarnings("unchecked")
	public <D extends QData> void assignList(QData from, QData to) {

		QList<D> listFrom = (QList<D>) from;
		QList<D> listTo = (QList<D>) to;
		listTo.clear();

		int e = 1;
		for (D elementFrom : listFrom) {
			D elementTo = listTo.get(e);
			((QBufferedData) elementFrom).assign((QBufferedData) elementTo);
			e++;
		}
	}

	private void callProgram(QJob job, QProgramCallable callableProgram, QData[] params) {

		if (job.getJobThread() != null && !job.getJobThread().checkRunnable()){
			throw new OperatingSystemRuntimeException("Job closed!", null);
			//return;
		}

		callableProgram.getProgramInfo().setCallTime(System.currentTimeMillis());

		synchronized (callableProgram) {

			// retrieve program stack from job
			QProgramStack programStack = getProgramStack(job);
			if (programStack.isEmpty())
				jobManager.updateStatus(job, JobStatus.RUN);

			// call
			try {

				assignParameters(callableProgram, params);

				programStack.push(callableProgram);

//				printSendStack(job, programStack, callableProgram);

				// call
				callableProgram.call();

				assignPointerParameters(callableProgram, params);
				
			} catch (OperatingSystemMessageException | OperatingSystemRuntimeException e) {
				System.err.println(e.getMessage());
				if(e.getMessage().startsWith("java"))
 					e.printStackTrace();
				throw e;
			} catch (Exception e) {
				System.err.println(e.getMessage());

				e.printStackTrace();

				Throwable cause = e.getCause();
				if (cause != null)
					System.err.println(cause);
				else
					System.err.println(e);
				throw new OperatingSystemRuntimeException(e.getMessage(), e);
			} finally {

				long callTime = System.currentTimeMillis() - callableProgram.getProgramInfo().getCallTime();
				callableProgram.getProgramInfo().setCallTime(callTime);

//				printReceiveStack(job, programStack, callableProgram);

				programStack.pop();

				if (programStack.isEmpty())
					jobManager.updateStatus(job, JobStatus.ACTIVE);
			}
		}
	}

	private void assignPointerParameters(QProgramCallable callableProgram, QData[] paramsFrom) {

		QData[] paramsTo = callableProgram.getParameters();

		int paramsLength = 0;

		if (paramsTo != null && paramsFrom != null)
			paramsLength = paramsFrom.length < paramsTo.length ? paramsFrom.length : paramsTo.length;

		callableProgram.getProgramStatus().getParametersNumber().eval(paramsLength);

		// assign pointer to pointers
		for (int i = 0; i < paramsLength; i++) {

			if (paramsFrom[i] == null)
				continue;
			if (!(paramsFrom[i] instanceof QPointer && paramsTo[i] instanceof QPointer))
				continue;

			((QPointer) paramsFrom[i]).eval((QPointer) paramsTo[i]);
		}
	}

	private QProgram getProgram(QJob job, String library, String name) {

		// check program
		Scope scope = null;
		if (library != null && !library.isEmpty())
			scope = Scope.get(library);
		else
			scope = Scope.LIBRARY_LIST;

		if (scope == null)
			scope = Scope.OTHER;

		QResourceReader<QProgram> programReader = resourceManager.getResourceReader(job, QProgram.class, scope, library);
		QProgram program = programReader.lookup(name);
		if (program == null) {
			QJobReference jobReference = job.getJobReference();
			jobLogManager.error(job, "Program not found: " + name);
			throw new OperatingSystemRuntimeException(jobReference.getJobName() + "(" + jobReference.getJobNumber() + ")" + "\t" + "Program not found: " + name, null);
		}

		return program;
	}

	@SuppressWarnings("unused")
	private void printSendStack(QJob job, QProgramStack programStack, QProgramCallable callableProgram) {

		String text = callableProgram.isOpen() ? ">  " : "-> ";
		text += callableProgram.getProgram().getName() + "[" + callableProgram.getProgram().getActivationGroup() + "]" + " (";

		if (callableProgram.getParameters() != null)
			text += formatStackParameters(callableProgram.getDataContext(), callableProgram.getParameters());
		text += ")";

		String loadTimeString = "       ";
		if (!callableProgram.isOpen())
			loadTimeString = "[" + new DecimalFormat("00000").format(callableProgram.getProgramInfo().getLoadTime()) + "]";

		QJobReference jobReference = job.getJobReference();
		writeContent(job, "pgm:\t" + jobReference.getJobName() + "(" + jobReference.getJobNumber() + ")" + loadTimeString + QStrings.qINSTANCE.appendChars(text, "\t", programStack.size(), true));
	}

	@SuppressWarnings("unused")
	private void printReceiveStack(QJob job, QProgramStack programStack, QProgramCallable callableProgram) {

		String text = callableProgram.isOpen() ? "<  " : "<- ";
		text += callableProgram.getProgram().getName() + "[" + callableProgram.getProgram().getActivationGroup() + "]" + " (";
		if (callableProgram.getParameters() != null)
			text += formatStackParameters(callableProgram.getDataContext(), callableProgram.getParameters());
		text += ")";

		String callTimeString = "[" + new DecimalFormat("00000").format(callableProgram.getProgramInfo().getCallTime()) + "]";

		QJobReference jobReference = job.getJobReference();
		writeContent(job, "\t" + jobReference.getJobName() + "(" + jobReference.getJobNumber() + ")" + callTimeString + QStrings.qINSTANCE.appendChars(text, "\t", programStack.size(), true));
	}

	private void writeContent(QJob job, String content) {
		System.out.println(content);

		try {
			FileWriter fw = new FileWriter("/home/jamiro/asup_stacks/" + job.getJobReference().getJobName() + ".txt", true);
			fw.write(content + "\n");
			fw.close();
		} catch (Exception e) {
			e.toString();
		}
	}

	private String formatStackParameters(QDataContext dataContext, QData[] entry) {
		String text = "";

		for (QData param : entry) {

			if (param == null) {
				text += "|";
				continue;
			}

			try {
				text += formatStackParameter(dataContext, param) + "|";

				if (text.length() > 100) {
					text = text.substring(0, 100);
					break;
				}
			} catch (Exception e) {
				text += "|";
			}
		}
		return text;
	}

	private String formatStackParameter(QDataContext dataContext, QData param) {

		String paramValue = null;
		if (param instanceof QString) {
			QString stringData = (QString) param;
			if (stringData.isNull()) {
				return "";
			}
			paramValue = stringData.trimR();

			if (paramValue.length() > 20)
				paramValue = paramValue.substring(0, 20) + "..";

		} else if (param instanceof QBufferedElement) {
			QBufferedElement bufferedElement = (QBufferedElement) param;
			if (bufferedElement.isNull()) {
				return "";
			}

			byte[] bytes = bufferedElement.asBytes();
			paramValue = QStrings.qINSTANCE.trimR(new String(bytes, dataContext.getCharset()));

			if (paramValue.length() > 20)
				paramValue = paramValue.substring(0, 20) + "..";

		} else if (param instanceof QBufferedList) {
			QBufferedList<?> bufferedList = (QBufferedList<?>) param;
			if (bufferedList.isNull()) {
				return "";
			}

			StringBuffer sb = new StringBuffer();
			for (QBufferedElement bufferedElement : bufferedList) {
				if(bufferedElement.isNull()) {
					sb.append(":" + paramValue);
					continue;
				}
				
				byte[] bytes = bufferedElement.asBytes();
				paramValue = QStrings.qINSTANCE.trimR(new String(bytes, dataContext.getCharset()));

				if (paramValue.length() > 20)
					sb.append(paramValue.substring(0, 20));

				sb.append(":" + paramValue);

				if (sb.length() > 80) {
					sb.append("..");
					break;
				}
			}
			paramValue = "[" + sb.toString() + "]";
		} else {
			paramValue = param.toString();
			if (paramValue.length() > 100)
				paramValue = paramValue.substring(0, 100) + "..";
		}

		return paramValue;
	}
}