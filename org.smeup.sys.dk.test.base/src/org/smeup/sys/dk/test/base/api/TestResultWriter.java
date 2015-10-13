package org.smeup.sys.dk.test.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.test.AssertionState;
import org.smeup.sys.dk.test.QAssertionResult;
import org.smeup.sys.dk.test.QTestLauncher;
import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.os.core.jobs.QJob;

public class TestResultWriter implements QTestLauncherListener {
	
	private String outputWriterName = "*";
	
	@Inject
	QOutputManager outputManager;

	@Inject
	QJob job;

	private QObjectWriter objectWriter;
	
	public void setOutputWriterName(String outputWriterName) {
		this.outputWriterName = outputWriterName;
	}

		
	
	// Implements QTestLauncherListener methods

	@Override
	public void launcherStopped(QTestLauncher launcher) {
		objectWriter.flush();				
	}

	@Override
	public void launcherStarted(QTestLauncher launcher) {	
		objectWriter = outputManager.getObjectWriter(job.getContext(), outputWriterName);	
		objectWriter.initialize();
	}

	@Override
	public void resultAdded(QTestRunner runner, QTestResult result) {
		if (objectWriter != null) {									
			
			try {
				objectWriter.write(result);
										
				for (QAssertionResult assertionResult : result.getAssertResults()) {
					if (assertionResult.getAssertionState().equals(AssertionState.FAILED)) {
						objectWriter.write(assertionResult);
					}
				}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
