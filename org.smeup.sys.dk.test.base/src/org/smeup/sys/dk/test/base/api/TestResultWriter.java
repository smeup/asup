package org.smeup.sys.dk.test.base.api;

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestLauncher;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.os.core.jobs.QJob;

public class TestResultWriter extends AbstractTestResultWriter {
	
	@Inject
	QJob job;
	
	@Inject
	QObjectWriter objectWriter;

	@Override
	public void flush() {
		objectWriter.flush();		
	}

	@Override
	public void initialize() {		
		objectWriter.initialize();		
	}

	@Override
	public void write(QObject object) throws IOException {
		objectWriter.write(object);
		
	}	

	@Override
	public void launcherStopped(QTestLauncher launcher) {
						
	}

	@Override
	public void launcherStarted(QTestLauncher launcher) {	
		
	}

	@Override
	public void resultAdded(QTestRunner runner, QTestResult result) {

		try {
			write(result);
			
			/*
			for (QAssertionResult assertionResult : result.getAssertResults()) {
				if (assertionResult.getAssertionState().equals(AssertionState.FAILED) 
						||
					assertionResult instanceof QMessage	) {
					objectWriter.write(assertionResult);
				} 
			}
			*/

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
