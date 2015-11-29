/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.test.base.api;

import java.util.Collection;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.test.QTestLauncher;
import org.smeup.sys.dk.test.base.TestLauncherHelper;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QRUNTEST")
public @Supported class TestCaller {
		
	@Inject
	private QJob job;
	
	@Inject
	private QOutputManager outputManager;

	private OUTPUTEnum outputEnum;
	
	public static enum QCPFMSG {
	}

	@Main 
	public void main(@Supported @DataDef(length=32) QCharacter component,  
							@Supported @DataDef(length=32) QCharacter module,  
							@Supported @DataDef(length=32) QCharacter object,  
							@Supported @DataDef(length=1) QEnum<OUTPUTEnum, QCharacter> output) {

		
		this.outputEnum = output.asEnum();
		
		Collection<QTestLauncher> testLauncherList = TestLauncherHelper.findTestLauncher(component.toString(), module.toString());
		
		if (testLauncherList != null) {
		
			QContext context = job.getContext();
			
			AbstractTestResultWriter resultWriter = null;
			
			QContext childContext = job.getContext().createChildContext("TestResultWriter");
			
			QObjectWriter objectWriter;
			
			switch(outputEnum){
			case FILE:
				
				resultWriter = context.make(FileTestResultWriter.class);
				break;
				
			case PRINT:
				objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
				childContext.set(QObjectWriter.class, objectWriter);
				resultWriter = childContext.make(TestResultWriter.class);				
			break;	
				
			case TERM_STAR:		
				objectWriter = outputManager.getDefaultWriter(job.getContext());
				childContext.set(QObjectWriter.class, objectWriter);
				resultWriter = childContext.make(TestResultWriter.class);
			break;
			}
			
			resultWriter.initialize();
			
			for (QTestLauncher testLauncher: testLauncherList) {
				testLauncher.registerListener(context, resultWriter);
				testLauncher.init(context);
				testLauncher.launch(context, object.toString().trim());
				testLauncher.destroy(context);
				testLauncher.removeListener(context, resultWriter);
			}
			
			resultWriter.flush();
		}				
	}
	
	public static enum OUTPUTEnum {
		@Special(value = "*") TERM_STAR, @Special(value = "F") FILE, @Special(value = "P") PRINT
	}
}
