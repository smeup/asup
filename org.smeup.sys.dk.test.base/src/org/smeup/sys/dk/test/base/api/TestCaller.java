package org.smeup.sys.dk.test.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.test.QAssertionResult;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QRUNTEST")
public @Supported class TestCaller {
	
	@Inject
	private QTestManager testManager;
	
	@Inject
	private QJob job;
	
	@Inject
	private QOutputManager outputManager;

	public static enum QCPFMSG {
	}

	public @Entry void main(@Supported @DataDef(length = 256, varying = true) QCharacter comp,
			@Supported @DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {

		QTestResult testResult = null;
		
		QContext context = job.getContext();
		
		Class<?> klass = context.loadClassByName(comp.toString());
		
		try {

			QContext testContext = testManager.prepareContext(klass);
			QTestRunner testRunner = testManager.prepareRunner(testContext, klass);					
			testResult = testRunner.call();
			
			QObjectWriter objectWriter = null;
			
			switch(output.asEnum()){
			case FILE:
				writeToFile(testResult);
				break;
				
			case PRINT:
					objectWriter = outputManager.getObjectWriter(context, "P");
				break;
				
			case TERM_STAR:				
			default:
				objectWriter = outputManager.getDefaultWriter(context);
				break;
			
			}
			
			if (objectWriter != null) {
												
				objectWriter.initialize();
				objectWriter.write(testResult);				
				
				for (QAssertionResult assertionResult : testResult.getAssertResults()) {
					
					objectWriter.write(assertionResult);
							
				}
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void writeToFile(QTestResult testResults) {
		// TODO Auto-generated method stub
		
	}

	public static enum OUTPUTEnum {
		@Special(value = "*") TERM_STAR, @Special(value = "F") FILE, @Special(value = "P") PRINT
	}
}
