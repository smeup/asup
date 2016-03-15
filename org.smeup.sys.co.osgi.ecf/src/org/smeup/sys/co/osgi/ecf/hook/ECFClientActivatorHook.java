/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.co.osgi.ecf.hook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.ecf.core.ContainerCreateException;
import org.eclipse.ecf.core.IContainerFactory;
import org.eclipse.ecf.server.generic.GenericServerContainerGroupCreateException;
import org.eclipse.ecf.server.generic.IGenericServerContainerGroupFactory;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.remoteserviceadmin.EndpointDescription;
import org.osgi.service.remoteserviceadmin.EndpointEvent;
import org.osgi.service.remoteserviceadmin.EndpointEventListener;
import org.osgi.service.remoteserviceadmin.RemoteServiceAdminEvent;
import org.osgi.service.remoteserviceadmin.RemoteServiceAdminListener;
import org.osgi.util.tracker.ServiceTracker;
import org.smeup.sys.rt.core.ApplicationStarting;

public class ECFClientActivatorHook {

	@SuppressWarnings("unused")
	@Inject
	private IGenericServerContainerGroupFactory genericServerFactory;

	private static InternalEndPointEventListener endpointListener;

	@ApplicationStarting
	public void init() throws GenericServerContainerGroupCreateException, ContainerCreateException, IOException {

		BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		
		bundleContext.registerService(RemoteServiceAdminListener.class.getName(),new InternalRemoteServiceAdminListener(),null);
		
		endpointListener = new InternalEndPointEventListener();

		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put("endpoint.listener.scope", "(endpoint.id=*)");
		bundleContext.registerService(EndpointEventListener.class, endpointListener, props);

		IContainerFactory containerFactory = getContainerFactory(bundleContext);
		containerFactory.createContainer("ecf.generic.client");
	}

	private IContainerFactory getContainerFactory(BundleContext bundleContext) {
		
		ServiceTracker<Object, Object> containerFactoryServiceTracker = new ServiceTracker<Object, Object>(bundleContext, IContainerFactory.class.getName(), null);
		containerFactoryServiceTracker.open();
		return (IContainerFactory) containerFactoryServiceTracker.getService();
	}
	
	public static List<EndpointDescription> getEndPoints() {
		return endpointListener.getEndpointDescriptions();
	}

	private static class InternalRemoteServiceAdminListener implements RemoteServiceAdminListener {

		@Override
		public void remoteAdminEvent(RemoteServiceAdminEvent event) {

			switch (event.getType()) {
			case RemoteServiceAdminEvent.EXPORT_ERROR:
			case RemoteServiceAdminEvent.EXPORT_REGISTRATION:
			case RemoteServiceAdminEvent.EXPORT_UNREGISTRATION:
			case RemoteServiceAdminEvent.EXPORT_UPDATE:
			case RemoteServiceAdminEvent.EXPORT_WARNING:

				break;
			case RemoteServiceAdminEvent.IMPORT_ERROR:
			case RemoteServiceAdminEvent.IMPORT_REGISTRATION:
			case RemoteServiceAdminEvent.IMPORT_UNREGISTRATION:
			case RemoteServiceAdminEvent.IMPORT_UPDATE:
			case RemoteServiceAdminEvent.IMPORT_WARNING:

				break;
			}
			
		}
		
	}
	
	private static class InternalEndPointEventListener implements EndpointEventListener {

		protected static List<EndpointDescription> endpointDescriptions = new ArrayList<EndpointDescription>();
		
		protected List<EndpointDescription> getEndpointDescriptions() {
			return InternalEndPointEventListener.endpointDescriptions;
		}

		@Override
		public void endpointChanged(EndpointEvent event, String filter) {
						
			switch (event.getType()) {
			case EndpointEvent.ADDED:
				System.out.println("Added \t"+event.getEndpoint().getProperties().get("org.smeup.sys.rt.core.component.name"));
				InternalEndPointEventListener.endpointDescriptions.add(event.getEndpoint());
				break;
			case EndpointEvent.MODIFIED:
			case EndpointEvent.MODIFIED_ENDMATCH:
				System.out.println("Modified \t"+event.getEndpoint().getProperties().get("org.smeup.sys.rt.core.component.name"));
				break;
	
			case EndpointEvent.REMOVED:
				System.out.println("Removed \t"+event.getEndpoint().getProperties().get("org.smeup.sys.rt.core.component.name"));
				InternalEndPointEventListener.endpointDescriptions.remove(event.getEndpoint());
				break;
			}			
			
		}
	}
}