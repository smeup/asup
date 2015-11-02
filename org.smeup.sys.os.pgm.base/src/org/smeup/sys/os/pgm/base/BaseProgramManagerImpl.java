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

import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.java.QStrings;
import org.smeup.sys.il.data.InitStrategy;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.annotation.Entry;
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
	@Inject
	private QStrings strings;

	private Map<Thread, QResourceSetReader<QProgram>> programReaders ;
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
		if(activationGroup == null) 
			activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);

		QCallableProgram callableProgram = activationGroup.lookup(program);

		// new program
		if(callableProgram == null) {
			callableProgram = loadProgram(job, program);
			activationGroup.getPrograms().add(callableProgram);
		} 

		callProgram(job, callableProgram, params);
	}

	@SuppressWarnings("resource")
	@Override
	public void callProgram(QJob job, Class<?> klass, QData[] params) {

		Program programAnnotation = klass.getAnnotation(Program.class);
		if(programAnnotation == null)
			throw new OperatingSystemRuntimeException("Program class not callable: "+klass);
		
		QProgram program = getProgram(job, null, programAnnotation.name());
		
		QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
		if(activationGroup == null) 
			activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);

		QCallableProgram callableProgram = activationGroup.lookup(program);

		// new program
		if(callableProgram == null) {	
			callableProgram = loadProgram(job, program);
			activationGroup.getPrograms().add(callableProgram);
		} 

		callProgram(job, callableProgram, params);
	}
	
	@Override
	public QCallableProgram loadProgram(QJob job, QProgram program) {
		
		// API
		String address = null;		
		if(program.getAddress() != null) 
			address = program.getAddress();
		// Duplicated program
		else if(program.getBaseProgram() != null) {
			address = "asup:/omac/com.smeup.erp.pgm.gen/com.smeup.erp.pgm."+program.getApplication()+".gen."+program.getBaseProgram();
		}
		// Program
		else				
			address = "asup:/omac/com.smeup.erp.pgm.gen/com.smeup.erp.pgm."+program.getApplication()+".gen."+program.getName();

		Class<?> klass = job.getContext().loadClass(address);
		
		if(klass == null)
			throw new OperatingSystemRuntimeException("Class not found: "+address);

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
		if(programStack == null) {
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
		for(QCallableProgram level: programStack.list()) {
			// looking for this
			if(level.equals(program))
				return caller;
			// set caller
			caller = level;						
		}
		return null;
	}

	@SuppressWarnings("resource")
	public QCallableProgram prepareCallableProgram(QJob job, QProgram program, Class<?> klass) {

		QCallableProgram callableProgram = null;

		BaseCallableInjector callableInjector = job.getContext().make(BaseCallableInjector.class);

		if (QCallableProgram.class.isAssignableFrom(klass)) {
			callableProgram = (QCallableProgram) callableInjector.prepareCallable(klass);
		} else {
			Object delegate = callableInjector.prepareCallable(klass);
			
			InitStrategy initStrategy = InitStrategy.BASE;
			Program programAnnotation = klass.getAnnotation(Program.class);
			if(programAnnotation != null)
				initStrategy = programAnnotation.initStrategy();
			
			QDataContext dataContext = callableInjector.getDataContext();			
			BaseCallableProgramDelegator delegator = new BaseCallableProgramDelegator(dataContext, delegate, initStrategy);

			// search @Entry
			for (Method method : klass.getMethods()) {
				if (method.isAnnotationPresent(Entry.class)) {
					delegator.entry = method;

					QData[] entry = callableInjector.buildEntry(job, method);
					delegator.setQEntry(entry);

					break;
				}
			}

			try {
				delegator.open = klass.getMethod("qINZSR");
			} catch (NoSuchMethodException | SecurityException e) {
			}
					
			callableProgram = delegator;
		}

		if (callableProgram.getQProgram() == null)
			callableProgram.setQProgram(program);

		QDataContext dataContext = callableInjector.getDataContext();
		
		BaseProgramStatus programStatus = (BaseProgramStatus) dataContext.getInfoStruct();
		programStatus.programName.eval(program.getName());
		programStatus.programLibrary.eval(program.getLibrary());
		programStatus.userName.eval(job.getJobUser());
		programStatus.jobNumber.eval(job.getJobNumber());
		programStatus.jobName.eval(job.getJobName());
		programStatus.status.clear();

		return callableProgram;
	}

	public void assignParameters(QData[] paramsTo, QData[] paramsFrom) {

		int paramsLength = 0;

		if (paramsTo != null && paramsFrom != null)
			paramsLength = paramsFrom.length < paramsTo.length ? paramsFrom.length : paramsTo.length;

		// assign data pointers
		for (int i = 0; i < paramsLength; i++) {

			if (paramsFrom[i] == null)
				continue;

			if (paramsTo[i] instanceof QAdapter) {
				QAdapter adapter = (QAdapter) paramsTo[i];
				adapter.eval(adapter.getDelegate());
			} else if (paramsTo[i] instanceof QBufferedData && paramsFrom[i] instanceof QBufferedData) {
				QBufferedData bufferedData = (QBufferedData) paramsTo[i];
				((QBufferedData) paramsFrom[i]).assign(bufferedData);
			} else if (paramsTo[i] instanceof QList<?> && paramsFrom[i] instanceof QList<?>) {
				assignList(paramsFrom[i], paramsTo[i]);
			} else
				throw new OperatingSystemRuntimeException("Unexpected condition: nxt057t024xn", null);
		}
	}

	@SuppressWarnings("unchecked")
	public <D extends QData> void assignList(QData from, QData to) {

		QList<D> listFrom = (QList<D>) from;
		QList<D> listTo = (QList<D>) to;

		listTo.eval(listFrom);
	}
	@Override
	public QCallableProgram getCaller(String contextID, Object program) {

		QProgramStack programStack = getProgramStack(contextID);
		QCallableProgram caller = null;
		for(QCallableProgram level: programStack.list()) {
			// looking for this
			if(level.getRawProgram().equals(program))
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
			if(programStack.isEmpty()) 
				jobManager.updateStatus(job, JobStatus.RUN);
			
			// push program on stack
			programStack.push(callableProgram);
			
			// call
			try {
				
				// open 
				if(!callableProgram.isOpen())
					callableProgram.open();
	
				assignParameters(callableProgram.getQEntry(), params);

				printOpenStack(job, programStack, callableProgram);
				
				// call
				callableProgram.call();	
			}
			catch(OperatingSystemMessageException | OperatingSystemRuntimeException e) {
				System.err.println(e);
				e.printStackTrace();
				throw e;
			}		
			catch(Exception e) {
				Throwable cause = e.getCause();
				if (cause != null && (cause instanceof OperatingSystemMessageException)) {
					System.err.println(cause);
				} else {
					e.printStackTrace();
				}
				throw new OperatingSystemRuntimeException(e.getMessage(), e);
			}		
			finally {
				printCloseStack(job, programStack, callableProgram);
	
				// TODO release parameters
				
				// remove program from stack
				programStack.setDateExit(new Date());
				programStack.pop();
	
				// close
				if(callableProgram.isStateless())
					callableProgram.close();
				
				if(programStack.isEmpty())
					jobManager.updateStatus(job, JobStatus.ACTIVE);
			}
		}		
	}

	private QProgram getProgram(QJob job, String library, String name) {
		
		QResourceSetReader<QProgram> programReader = programReaders.get(Thread.currentThread());
		if(programReader == null) {
			programReader = programReaders.get(Thread.currentThread());
			synchronized (programReaders) {
				if(programReader == null) {
					programReader = resourceManager.getResourceReader(job, QProgram.class, Scope.ALL);
					programReaders.put(Thread.currentThread(), programReader);
				}				
			}
		}
	
		// check program
		if(library != null && library.equalsIgnoreCase("*LIBL"))
			library = null;
		QProgram program = programReader.lookup(library, name);
		if(program == null) {
			jobLogManager.error(job, "Program not found: "+name);
			throw new OperatingSystemRuntimeException(job.getJobName()+"("+job.getJobNumber()+")"+"\t"+"Program not found: "+name, null);
		}

		return program;
	}

	protected void printOpenStack(QJob job, QProgramStack programStack, QCallableProgram callableProgram) {
		String text = "-> "+callableProgram.getQProgram().getName()+" (";
		for(QData param: callableProgram.getQEntry()) {
			if(param != null)
				text += param.toString()+"|";
			else
				text += "|";

			if(text.length() > 100) {
				text += "..";
				break;
			}

		}
		text += ")";
		System.out.println(job.getJobName()+"("+job.getJobNumber()+")"+strings.appendChars(text, "\t", programStack.size()-1, true));
	}
	
	protected void printCloseStack(QJob job, QProgramStack programStack, QCallableProgram callableProgram) {
		String text = "<- "+callableProgram.getQProgram().getName()+" (";
		for(QData param: callableProgram.getQEntry()) {
			if(param != null)
				text += param.toString()+"|";
			else
				text += "|";

			if(text.length() > 100) {
				text += "..";
				break;
			}
		}
		text += ")";
		text += callableProgram.isStateless() ? "(LR)" : "(RT)";
		System.out.println(job.getJobName()+"("+job.getJobNumber()+")"+strings.appendChars(text, "\t", programStack.size()-1, true));		
	}
	
	protected long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
}