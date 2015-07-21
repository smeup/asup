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

import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.pgm.OperatingSystemRuntimeProgramException;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QActivationGroupManager;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QProgram;

public class BaseProgramCallableHelper {
	
	private QActivationGroupManager activationGroupManager;
	
	public BaseProgramCallableHelper(QActivationGroupManager activationGroupManager) {
		this.activationGroupManager = activationGroupManager;
	}

	public QCallableProgram prepareCallableProgram(QJob job, QProgram program, Class<?> klass) {

		QActivationGroup activationGroup = activationGroupManager.lookup(job, program.getActivationGroup());
		if(activationGroup == null) 
			activationGroup = activationGroupManager.create(job, program.getName(), true);
		
		QCallableProgram callableProgram = null;
		BaseCallableInjector callableInjector = activationGroup.getFrameworkContext().make(BaseCallableInjector.class);
		
		if(QCallableProgram.class.isAssignableFrom(klass)) {
			callableProgram = (QCallableProgram) callableInjector.makeCallable(job.getContext(), activationGroup, klass);
		}
		else {
			Object delegate = callableInjector.makeCallable(job.getContext(), activationGroup, klass);
			BaseCallableProgramDelegator delegator = new BaseCallableProgramDelegator(delegate);

			// search @Entry
			for(Method method: klass.getMethods()) {
				if(method.isAnnotationPresent(Entry.class)) {
					delegator.entry = method;
					
					QData[] entry = callableInjector.buildEntry(job, method);
					delegator.setQEntry(entry);        

					break;
				}
			}		
	
			callableProgram = delegator;
		}

		if(callableProgram.getQProgram() == null)
			callableProgram.setQProgram(program);
		
		return callableProgram;
	}
	
	public void assignParameters(QData[] paramsTo, QData[] paramsFrom) throws OperatingSystemRuntimeProgramException {
		
		int paramsLength = 0;
		
		if(paramsTo != null && paramsFrom != null)
			paramsLength = paramsFrom.length < paramsTo.length ? paramsFrom.length : paramsTo.length;
		
		// assign data pointers 
		for(int i=0; i<paramsLength; i++) {
			
			if(paramsFrom[i] == null)
				continue;

			if(paramsTo[i] instanceof QAdapter) {
				QAdapter adapter = (QAdapter) paramsTo[i];
				adapter.eval(adapter.getDelegate());
			}
			else if(paramsTo[i] instanceof QBufferedData && paramsFrom[i] instanceof QBufferedData) {
				QBufferedData bufferedData = (QBufferedData)paramsTo[i];
				((QBufferedData) paramsFrom[i]).assign(bufferedData);				
			}
			else if(paramsTo[i] instanceof QList<?> && paramsFrom[i] instanceof QList<?>) {
				assignList(paramsFrom[i], paramsTo[i]);
			}
			else
				throw new OperatingSystemRuntimeProgramException("Unexpected condition: nxt057t024xn", null);
		}
	}
	
	@SuppressWarnings("unchecked")
	public <D extends QData> void assignList(QData from, QData to) {

		QList<D> listFrom = (QList<D>)from;
		QList<D> listTo = (QList<D>)to;

		listTo.eval(listFrom);		
	}


}
