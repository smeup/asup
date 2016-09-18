/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.smeup.sys.os.pgm.rpj;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.il.data.InitStrategy;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobRunInfo;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramCallable;
import org.smeup.sys.os.pgm.QProgramInfo;
import org.smeup.sys.os.pgm.QProgramStatus;
import org.smeup.sys.os.pgm.impl.ProgramCallableImpl;

public abstract class RPJProgram extends ProgramCallableImpl {

	private static final long serialVersionUID = 1L;
	
	private transient QJob _job;
	private transient QDataContext _dataContext;
	private transient QProgram _program;
	private transient QProgramInfo _programInfo;
	private transient QProgramStatus _programStatus;
	private Map<String, RPJModule> _programModules = new HashMap<String, RPJModule>();
	private Map<String, QRecord> _programRecords = new HashMap<String, QRecord>();
	
	private boolean isOpen = false;
	private QIndicator _inlr = null;
	
	protected void _init(QJob job, QDataContext dataContext, QProgram program, QProgramInfo programInfo, QProgramStatus programStatus) {
		this._job = job;
		this._dataContext = dataContext;
		this._program = program;
		this._programInfo = programInfo;
		this._programStatus = programStatus;
	}
	
	protected Map<String, RPJModule> getModules() {
		return _programModules;
	}
	
	protected Map<String, QRecord> getRecords() {
		return _programRecords;
	}
	
	@Override
	public QDataContext getDataContext() {
		return _dataContext;
	}

	@Override
	public QProgram getProgram() {
		return _program;
	}

	public QProgramInfo getProgramInfo() {
		return _programInfo;
	}

	@Override
	public QProgramStatus getProgramStatus() {
		return _programStatus;
	}
	
	@Override
	public Object getRawProgram() {
		return this;
	}

	@Override
	public QData[] getParameters() {
		return _params();
	}

	public QData[] _params() {
		return null;
	}

	public void _entry() {
	}

	public abstract void _main();

	public void _exit() {
	}
	
	public void _snap() {
		
	}
	
	@Override
	public final QData[] call() throws Exception {

		if (!isOpen()) {
			Method openMethod = null;
			try {
				openMethod = this.getClass().getMethod("_open", new Class<?>[0]);
			}
			catch (SecurityException | NoSuchMethodException e) {
			}
			
			if(openMethod != null) {
				openMethod.invoke(this, new Object[0]);
			}
			else {
				try {
					Field £mubField = this.getClass().getDeclaredField("£Mub");
					£mubField.setAccessible(true);
					Object £mub = £mubField.get(this);
					InitStrategy initStrategy = InitStrategy.BASE;
					Program programAnnotation = this.getClass().getAnnotation(Program.class);
					if (programAnnotation != null)
						initStrategy = programAnnotation.initStrategy();

					switch (initStrategy) {
					case BASE:
						£mub.getClass().getMethod("£mu_inzsr").invoke(£mub);
						break;
					case LIGHT:
						£mub.getClass().getMethod("£mu_inzsrlt").invoke(£mub);
						break;
					}
					£mubField.setAccessible(false);

				} catch (NoSuchFieldException | SecurityException | NoSuchMethodException e) {
				} catch (InvocationTargetException e) {
					if (e.getTargetException() instanceof OperatingSystemMessageException)
						throw (OperatingSystemMessageException) e.getTargetException();
					if (e.getTargetException() instanceof OperatingSystemRuntimeException)
						throw (OperatingSystemRuntimeException) e.getTargetException();
					else
						throw new OperatingSystemRuntimeException(e.getTargetException());
				} catch (Exception e) {
					throw new OperatingSystemRuntimeException(e);
				}

			}
			_snap();
			
			try {
				Field qrpjField = this.getClass().getDeclaredField("qRPJ");
				if(qrpjField != null) {
					qrpjField.setAccessible(true);
					Object qrpj = qrpjField.get(this);
					Field inlrField = qrpj.getClass().getDeclaredField("qINLR");
					_inlr = (QIndicator) inlrField.get(qrpj);
					qrpjField.setAccessible(false);
				}

			} catch (Exception e) {
			}
			
			isOpen = true;
		}
		
		if (_inlr != null)
			_inlr.eval(false);

		_entry();

		_main();

		_exit();
		
		if (_inlr != null && _inlr.asBoolean())
			close();

		return _params();
	}

	
	@Override
	public void close() {

		try {
			QJobRunInfo jobRunInfo = _job.getJobRunInfo();
			if (jobRunInfo != null)
				jobRunInfo.setMemorySize(jobRunInfo.getMemorySize() - _programInfo.getMemorySize());
	
			QActivationGroup currentActivationGroup = getActivationGroup();
			setActivationGroup(null);
			
			if(currentActivationGroup != null && _program.getActivationGroup().equals("*NEW")) {
				for(QProgramCallable callableProgram: new ArrayList<QProgramCallable>(currentActivationGroup.getPrograms()))
					callableProgram.close();
			}
		}
		finally {
			isOpen = false;
		}
	}

	@Override
	public boolean isOpen() {
		return isOpen;
	}
}