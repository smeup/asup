package org.smeup.sys.dk.test.base.api;

import java.io.IOException;
import java.util.Collection;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.test.QAssertionResult;
import org.smeup.sys.dk.test.QTestLauncher;
import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.base.TestLauncherHelper;
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
public @Supported class TestCaller implements QTestLauncherListener{
		
	@Inject
	private QJob job;
	
	@Inject
	private QOutputManager outputManager;

	private OUTPUTEnum outputEnum;
	
	public static enum QCPFMSG {
	}

	public @Entry void main(@Supported @DataDef(length=32) QCharacter component,  
							@Supported @DataDef(length=32) QCharacter module,  
							@Supported @DataDef(length=32) QCharacter object,  
							@Supported @DataDef(length=1) QEnum<OUTPUTEnum, QCharacter> output) {

		
		this.outputEnum = output.asEnum();
		
		Collection<QTestLauncher> testLauncherList = TestLauncherHelper.findTestLauncher(component.toString(), module.toString());
		
		if (testLauncherList != null) {
		
			for (QTestLauncher testLauncher: testLauncherList) {
				testLauncher.addListener(this);
				testLauncher.launch(object.toString().trim());
				testLauncher.removeListener(this);
			}
		}				
	}

	private void writeToFile(QTestResult testResults) {
		// TODO Auto-generated method stub
		
	}

	public static enum OUTPUTEnum {
		@Special(value = "*") TERM_STAR, @Special(value = "F") FILE, @Special(value = "P") PRINT
	}
	
	// Implements QTestLauncherListener methods

	@Override
	public void launcherStopped(QTestLauncher launcher) {
	}

	@Override
	public void launcherStarted(QTestLauncher launcher) {		
		
	}

	@Override
	public void resultAdded(QTestRunner runner, QTestResult result) {
		
		QObjectWriter objectWriter = null;
		
		switch(outputEnum){
		case FILE:
			writeToFile(result);
			break;
			
		case PRINT:
				objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
			break;
			
		case TERM_STAR:				
		default:
			objectWriter = outputManager.getDefaultWriter(job.getContext());
			break;
		
		}
		
		if (objectWriter != null) {
											
			objectWriter.initialize();
			try {
				objectWriter.write(result);
										
				for (QAssertionResult assertionResult : result.getAssertResults()) {
					
					objectWriter.write(assertionResult);
							
				}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
