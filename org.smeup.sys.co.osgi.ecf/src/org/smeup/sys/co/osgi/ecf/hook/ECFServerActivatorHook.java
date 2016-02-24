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

import java.net.UnknownHostException;
import java.util.Dictionary;

import javax.inject.Named;

import org.eclipse.ecf.osgi.services.distribution.IDistributionConstants;
import org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig;
import org.smeup.sys.rt.core.ServiceRegistering;

@SuppressWarnings("restriction")
public class ECFServerActivatorHook {
		
	@ServiceRegistering
	public void completeRegistration(@Named("org.smeup.sys.rt.core.service.name") String name, 
									 @Named("org.smeup.sys.rt.core.service.object") Object service,
									 @Named("org.smeup.sys.rt.core.service.properties") Dictionary<String, Object> properties, 
									 @Named("org.smeup.sys.rt.core.service.remoteExport") boolean remoteExport,
									 ECFServerContainerConfig config) throws UnknownHostException {

		if (remoteExport) {
			properties.put(IDistributionConstants.SERVICE_EXPORTED_INTERFACES, IDistributionConstants.SERVICE_EXPORTED_INTERFACES_WILDCARD);
			properties.put(IDistributionConstants.SERVICE_EXPORTED_CONFIGS, config.getServerContainerType());
			
			if(config.getContainerId() == null || config.getContainerId().isEmpty()) {
//				properties.put("ecf.generic.server.hostname", "localhost");
//				properties.put("ecf.generic.server.port", -1);				
//				properties.put("ecf.generic.server.path", "/"+application.getName());
//				properties.put("ecf.generic.server.bindAddress", InetAddress.getByName("0.0.0.0"));
			}
			else 
				properties.put(IDistributionConstants.SERVICE_EXPORTED_CONTAINER_FACTORY_ARGUMENTS, config.getContainerId());				
		}
	}

}