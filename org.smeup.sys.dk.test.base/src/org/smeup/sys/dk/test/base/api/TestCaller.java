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
import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.base.TestLauncherHelper;
import org.smeup.sys.il.core.ctx.QContext;
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

	private OUTPUTEnum outputEnum;
	
	public static enum QCPFMSG {
	}

	public @Main void main(@Supported @DataDef(length=32) QCharacter component,  
							@Supported @DataDef(length=32) QCharacter module,  
							@Supported @DataDef(length=32) QCharacter object,  
							@Supported @DataDef(length=1) QEnum<OUTPUTEnum, QCharacter> output) {

		
		this.outputEnum = output.asEnum();
		
		Collection<QTestLauncher> testLauncherList = TestLauncherHelper.findTestLauncher(component.toString(), module.toString());
		
		if (testLauncherList != null) {
		
			QContext context = job.getContext();
			
			QTestLauncherListener resultWriter = null;
			
			switch(outputEnum){
			case FILE:
				resultWriter = context.make(FileTestResultWriter.class);
				break;
				
			case PRINT:
				resultWriter = context.make(TestResultWriter.class);
				((TestResultWriter)resultWriter).setOutputWriterName("P");
			case TERM_STAR:				
			default:
				resultWriter = context.make(TestResultWriter.class);
				break;
			
			}

			for (QTestLauncher testLauncher: testLauncherList) {
				testLauncher.registerListener(context, resultWriter);
				testLauncher.init(context);
				testLauncher.launch(context, object.toString().trim());
				testLauncher.destroy(context);
				testLauncher.removeListener(context, resultWriter);
			}
		}				
	}
	
	public static enum OUTPUTEnum {
		@Special(value = "*") TERM_STAR, @Special(value = "F") FILE, @Special(value = "P") PRINT
	}
}
