package org.smeup.sys.dk.test.base;

import java.util.ArrayList;
import java.util.Collection;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.wiring.BundleWiring;
import org.smeup.sys.dk.test.QAssertionFailed;
import org.smeup.sys.dk.test.QTestLauncher;
import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.impl.DevelopmentKitTestFactoryImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.rt.core.QApplication;

public class TestLauncherHelper {
	
	
	public static Collection<QTestLauncher> findTestLauncher(String component) {
		return findTestLauncher(component, null);
	}
	
	public static Collection<QTestLauncher> findTestLauncher(String component, String module) {
		
		component = component.trim();
		module = module.trim();
		
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
			
			if (module != null && module.length() > 0) {
				if (module.equalsIgnoreCase(testAnnotation.category())) {
					testLauncherList.add(testRef);
				}			
			} else {
				testLauncherList.add(testRef);
			}
		}

		return testLauncherList;
	}
	
	public static Collection<Class<?>> findTestClasses(QTestLauncher testLauncher, String resourcePath, String object) {
		
		ArrayList<Class<?>> testRunnerList = new ArrayList<Class<?>>();
		
		Bundle bundle = FrameworkUtil.getBundle(testLauncher.getClass());
		
		BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);	
		
		String bundlePath = "/" + bundle.getSymbolicName().replace('.', '/') + resourcePath;

		for(String resource: bundleWiring.listResources(bundlePath , "*.*", BundleWiring.LISTRESOURCES_LOCAL)) {
			Class<?> klass = null;
			try {
				String resourceURI = resource.replace(".class", "").replace('/', '.');
				if(resourceURI.contains("$"))
					continue;
				klass = bundle.loadClass(resourceURI);
			} catch (ClassNotFoundException e) {
				continue;
			}
				
			
			Test annotation = klass.getAnnotation(Test.class);
			
			if (annotation != null) {
				
				if (object != null && object.length()>0) {
					// Filter by object
					if (object.equalsIgnoreCase(annotation.object())) {
						testRunnerList.add(klass);
					}
				} else {
					
					testRunnerList.add(klass);
				}
			}
		}
		
		return testRunnerList;
	}

	public static void notifyLauncherStarted(QContext context, QTestLauncher testLauncher) {
		
		for (QTestLauncherListener listener: testLauncher.getListeners(context)) {
			listener.launcherStarted(testLauncher);
		}		
	}
	
	public static void notifyResultAdded(QContext context, QTestLauncher testLauncher, QTestRunner testRunner, QTestResult testResult) {
		
		for (QTestLauncherListener listener: testLauncher.getListeners(context)) {
			listener.resultAdded(testRunner, testResult);
		}
		
	}
	
	public static void notifyLauncherStopped(QContext context, QTestLauncher testLauncher) {
		
		for (QTestLauncherListener listener: testLauncher.getListeners(context)) {
			listener.launcherStopped(testLauncher);
		}		
	}
	
	public static QTestResult createErrorResult(QTestLauncher testLauncher, QTestRunner testRunner, Class<?> testClass, String errorMessage) {
		
		QTestResult errorResult = DevelopmentKitTestFactoryImpl.eINSTANCE.createTestResult();
		
		errorResult.setFailed(true);
		
		errorResult.setRunner("");
		if (testRunner != null) {
			errorResult.setRunner(testRunner.getClass().getSimpleName());
		}
		
		errorResult.setObject("");		
		if (testClass != null) {
			Test testClassAnnotation = testClass.getAnnotation(Test.class);
			if (testClassAnnotation != null) {
				errorResult.setObject(testClassAnnotation.object());
			} 
		} 
		
		errorResult.setCategory("");
		// Read category from testLauncher
		Test annotation = testLauncher.getClass().getAnnotation(Test.class);		
		if (annotation != null) {
			errorResult.setCategory(annotation.category());
		}
		
		QAssertionFailed assertionFailed = DevelopmentKitTestFactoryImpl.eINSTANCE.createAssertionFailed();
		assertionFailed.setMessage(errorMessage);
		assertionFailed.setTime(0);
		
		errorResult.getAssertResults().add(assertionFailed);
		
		return errorResult;
	}
	
	
}
