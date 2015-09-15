/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.smeup.sys.il.memo.cdo.store.hook;

import java.util.Collections;

import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.mongodb.CDOMongoDBUtil;
import org.eclipse.emf.cdo.server.mongodb.IMongoDBStore;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.om.OMPlatform;
import org.smeup.sys.rt.core.ComponentStarted;

public class CDOStoreMongoActivatorHook {
	
	@ComponentStarted
	public void start() {
		
		try {
			OMPlatform.INSTANCE.setDebugging(true); 
			OMPlatform.INSTANCE.addLogHandler(org.eclipse.net4j.util.om.log.PrintLogHandler.CONSOLE); 
			OMPlatform.INSTANCE.addTraceHandler(org.eclipse.net4j.util.om.trace.PrintTraceHandler.CONSOLE); 
			
			Net4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the Net4j kernel
		    
			TCPUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the TCP support
		    
		    CDONet4jServerUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the CDO server
			    		    
			IMongoDBStore store = CDOMongoDBUtil.createStore("mongodb://localhost", "asup_test");
	
			@SuppressWarnings("unchecked")
			IRepository repository = CDOServerUtil.createRepository("AS400A", store, Collections.EMPTY_MAP);
			try {
				CDOServerUtil.addRepository(IPluginContainer.INSTANCE, repository);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			CDOMongoDBUtil.prepareContainer(IPluginContainer.INSTANCE);			
			Net4jUtil.getAcceptor(IPluginContainer.INSTANCE, "tcp", "localhost:2036");

			
			System.out.println("CDO activated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}