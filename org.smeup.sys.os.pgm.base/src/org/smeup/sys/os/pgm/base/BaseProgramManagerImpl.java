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
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceSetReader;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.pgm.OperatingSystemRuntimeProgramException;
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

	@Override
	public void callProgram(QJob job, Class<?> klass, QData[] params) {

		Program programAnnotation = klass.getAnnotation(Program.class);
		if(programAnnotation == null)
			throw new OperatingSystemRuntimeProgramException("Program class not callable: "+klass);
		
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
	public QCallableProgram loadProgram(QJob job, QProgram program) throws OperatingSystemRuntimeProgramException {
		
		// API
		String address = null;
		if(program.getAddress() != null) 
			address = program.getAddress(); 
		// Program
		else				
			address = "asup:/omac/com.smeup.erp.pgm.gen/com.smeup.erp.pgm."+program.getApplication()+".gen."+program.getName();

		Class<?> klass = job.getContext().loadClass(address);
		
		if(klass == null)
			throw new OperatingSystemRuntimeProgramException("Class not found: "+address);

		QCallableProgram callableProgram = prepareCallableProgram(job, program, klass);
		
		return callableProgram;
	}

	@Override
	public QCallableProgram loadProgram(QJob job, Class<?> klass) throws OperatingSystemRuntimeProgramException {

		try {
			QProgram program = null;
			QCallableProgram callableProgram = prepareCallableProgram(job, program, klass);
			
			return callableProgram;
			
		} catch (Exception e) {
			throw new OperatingSystemRuntimeProgramException(e);
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

	public QCallableProgram prepareCallableProgram(QJob job, QProgram program, Class<?> klass) {

		QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
		if (activationGroup == null)
			activationGroup = activationGroupManager.create(job, program.getActivationGroup(), true);

		QCallableProgram callableProgram = null;

		BaseCallableInjector callableInjector = activationGroup.getFrameworkContext().get(BaseCallableInjector.class);
		if (callableInjector == null) {
			callableInjector = activationGroup.getFrameworkContext().make(BaseCallableInjector.class);
			activationGroup.getFrameworkContext().set(BaseCallableInjector.class, callableInjector);
		}

		if (QCallableProgram.class.isAssignableFrom(klass)) {
			callableProgram = (QCallableProgram) callableInjector.prepareCallable(activationGroup.getFrameworkContext(), klass);
		} else {
			Object delegate = callableInjector.prepareCallable(activationGroup.getFrameworkContext(), klass);
			BaseCallableProgramDelegator delegator = new BaseCallableProgramDelegator(delegate);

			// search @Entry
			for (Method method : klass.getMethods()) {
				if (method.isAnnotationPresent(Entry.class)) {
					delegator.entry = method;

					QData[] entry = callableInjector.buildEntry(job, method);
					delegator.setQEntry(entry);

					break;
				}
			}

			callableProgram = delegator;
		}

		if (callableProgram.getQProgram() == null)
			callableProgram.setQProgram(program);

		return callableProgram;
	}

	public void assignParameters(QData[] paramsTo, QData[] paramsFrom) throws OperatingSystemRuntimeProgramException {

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
				throw new OperatingSystemRuntimeProgramException("Unexpected condition: nxt057t024xn", null);
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

	private void callProgram(QJob job, QCallableProgram callableProgram, QData[] params) throws OperatingSystemRuntimeProgramException {

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
//				printOpenStack(job, programStack, callableProgram);
				
				// open 
				if(!callableProgram.isOpen())
					callableProgram.open();
	
				assignParameters(callableProgram.getQEntry(), params);
				
	/*			PrintStream ps = System.out;
				ps.println("Calling program: "+callableProgram.getQProgram().getName());
				
				ps.println("\t-> entry:");
				BaseProgramMemoryPrinter memoryPrinter = new BaseProgramMemoryPrinter(ps);
				memoryPrinter.setPrefix("\t\t->");
				
				if(callableProgram.getQEntry() != null) {
					for(QData entryData: callableProgram.getQEntry()) {
						entryData.accept(memoryPrinter);
						ps.println();
					}
				}*/
				
				// call
				callableProgram.call();
	
				
	//			System.out.println(callableProgram.getQProgram().getName()+" ("+getDateDiff(programStack.getDateEnter(), programStack.getDateExit(), TimeUnit.MILLISECONDS)+"ms)");
	
			}
			catch(Exception e) {
				Throwable cause = e.getCause();
				if (cause != null && (cause instanceof OperatingSystemMessageException)) {
					System.err.println(cause);
				} else {
					e.printStackTrace();
				}
				throw new OperatingSystemRuntimeProgramException(e.getMessage(), e);
			}		
			finally {
//				printCloseStack(job, programStack, callableProgram);
	
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
			throw new OperatingSystemRuntimeProgramException(job.getJobName()+"("+job.getJobNumber()+")"+"\t"+"Program not found: "+name, null);
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
			
		}
		text += ")";
		System.out.println(job.getJobName()+"("+job.getJobNumber()+")"+"\t"+strings.appendChars(text, "\t", programStack.size(), true));
	}
	
	protected void printCloseStack(QJob job, QProgramStack programStack, QCallableProgram callableProgram) {
		String text = "<- "+callableProgram.getQProgram().getName()+" (";
		for(QData param: callableProgram.getQEntry()) {
			text += param.toString()+"|";
		}
		text += ")";
		text += callableProgram.isStateless() ? "(LR)" : "(RT)";
		System.out.println(job.getJobName()+"("+job.getJobNumber()+")"+"\t"+strings.appendChars(text, "\t", programStack.size(), true));		
	}
	
	protected long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
}