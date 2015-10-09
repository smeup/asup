package org.smeup.sys.dk.test.base;

import java.util.ArrayList;
import java.util.Collection;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.wiring.BundleWiring;
import org.smeup.sys.dk.test.QTestLauncher;
import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.os.core.QSystem;

public class TestLauncherHelper {
	
	
	public static Collection<QTestLauncher> findTestLauncher(String component) {
		return findTestLauncher(component, null);
	}
	
	public static Collection<QTestLauncher> findTestLauncher(String component, String module) {
		
		BundleContext bundleContext = FrameworkUtil.getBundle(QSystem.class).getBundleContext();
		
		// Search QTestLauncher services for specific component
		String filter = "";
		
		if (component != null && component.length() >0) {			
			filter += "(org.smeup.sys.rt.core.component=" + component.toLowerCase() + ")";
		} else {
			filter = null;
		}
		
		Collection<ServiceReference<QTestLauncher>> serviceReferences;
		try {
			serviceReferences = bundleContext.getServiceReferences(QTestLauncher.class, filter);			
		} catch (InvalidSyntaxException e) {
			return null;
		}
		
		ArrayList<QTestLauncher> testLauncherList = new ArrayList<QTestLauncher>();
		
		for (ServiceReference<QTestLauncher> serviceRef: serviceReferences) {
			QTestLauncher testRef = bundleContext.getService(serviceRef);
			
			// Filter for category (defined in QTestLauncer class annotation
			Test testAnnotation = testRef.getClass().getAnnotation(Test.class);
			
			if (module != null) {
				if (module.equals(testAnnotation.category())) {
					testLauncherList.add(testRef);
				}			
			} else {
				testLauncherList.add(testRef);
			}
		}

		return testLauncherList;
	}
	
	
	@SuppressWarnings("unchecked")
	public static Collection<Class<QTestRunner>> findTestRunners(QTestLauncher testLauncher, String resourcePath, String object) {
		
		ArrayList<Class<QTestRunner>> testRunnerList = new ArrayList<Class<QTestRunner>>();
		
		Bundle bundle = FrameworkUtil.getBundle(testLauncher.getClass());
		
		BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);		
		for(String resource: bundleWiring.listResources(resourcePath, null, BundleWiring.LISTRESOURCES_LOCAL)) {
			Class<?> klass = null;
			try {
				String resourceURI = resource.replace(".class", "").replace('/', '.');
				if(resourceURI.contains("$"))
					continue;
				klass = bundle.loadClass(resourceURI);
			} catch (ClassNotFoundException e) {
				continue;
			}
			
			//TODO: da rivedere
			
			if(QTestRunner.class.isAssignableFrom(klass)) {
				if (object != null && object.length()>0) {
					
					Test annotation = klass.getAnnotation(Test.class);
					
					if (object.equals(annotation.object())) {
						testRunnerList.add((Class<QTestRunner>)klass);
					}
				} else {
					testRunnerList.add((Class<QTestRunner>)klass);
				}

			}						
		}
		
		return testRunnerList;
	}

	public static void notifyLauncherStarted(QTestLauncher testLauncher) {
		
		for (QTestLauncherListener listener: testLauncher.getListeners()) {
			listener.launcherStarted(testLauncher);
		}		
	}
	
	public static void notifyResultAdded(QTestLauncher testLauncher,	QTestRunner testRunner, QTestResult testResult) {
		
		for (QTestLauncherListener listener: testLauncher.getListeners()) {
			listener.resultAdded(testRunner, testResult);
		}
		
	}
	
	public static void notifyLauncherStopped(QTestLauncher testLauncher) {
		
		for (QTestLauncherListener listener: testLauncher.getListeners()) {
			listener.launcherStopped(testLauncher);
		}		
	}
	

}
