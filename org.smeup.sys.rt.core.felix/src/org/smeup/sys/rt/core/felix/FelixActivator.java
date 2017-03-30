package org.smeup.sys.rt.core.felix;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.smeup.sys.rt.core.QApplicationManager;

public class FelixActivator implements BundleActivator {

	private static BundleContext context;
	
	private ServiceRegistration<QApplicationManager> applicationManagerRegistration;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		FelixActivator.context = bundleContext;
		this.applicationManagerRegistration = context.registerService(QApplicationManager.class, new FelixApplicationManagerImpl(), null);
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
