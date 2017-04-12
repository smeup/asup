package org.smeup.sys.rt.core.felix;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QApplicationManager;
import org.smeup.sys.rt.core.QRuntimeCorePackage;

public class FelixActivator implements BundleActivator {

	private static BundleContext context;	
	private ServiceRegistration<QApplicationManager> applicationManagerRegistration;
	private QApplication application;	
	private QApplicationManager applicationManager = null;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		FelixActivator.context = bundleContext;
		applicationManager = new FelixApplicationManagerImpl();
		this.applicationManagerRegistration = context.registerService(QApplicationManager.class, applicationManager, null);
		
		String applicationConfig = FelixActivator.context.getProperty("asup.config");
		String applicationName = FelixActivator.context.getProperty("asup.application.name");
		String applicationPort = FelixActivator.context.getProperty("asup.application.port");
		
		QRuntimeCorePackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = null;
		
		if(applicationConfig.startsWith("http"))
			uri = URI.createURI(applicationConfig);
		else
			uri = URI.createFileURI(applicationConfig);
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.EMPTY_MAP);
		application = (QApplication) resource.getContents().get(0);

		if(applicationName != null)
			application.setName(applicationName);
		
		if(applicationPort != null)
			application.setPort(Integer.parseInt(applicationPort));
		
		System.out.println("Starting " + application);
		
		ServiceReference<QApplicationManager> applicationManagerReference = bundleContext.getServiceReference(QApplicationManager.class);

		applicationManager = getContext().getService(applicationManagerReference);
		applicationManager.start(this.getClass(), application, System.out);
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		FelixActivator.context = null;
		
		if (this.applicationManagerRegistration != null)
			context.ungetService(applicationManagerRegistration.getReference());
	}

}
