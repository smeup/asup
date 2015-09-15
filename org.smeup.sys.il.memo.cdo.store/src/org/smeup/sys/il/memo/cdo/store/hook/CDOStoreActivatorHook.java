/**
 *  Copyright (c) 2012, 2014 Sme.UP and others.
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

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.IDBStore;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.db.DBUtil;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.IDBConnectionProvider;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.om.OMPlatform;
import org.osgi.service.jdbc.DataSourceFactory;
import org.smeup.sys.db.core.mysql.MySQLDataSourceFactory;
import org.smeup.sys.il.memo.cdo.store.CDOStoreConfig;
import org.smeup.sys.rt.core.ComponentStarted;

public class CDOStoreActivatorHook {
	
	@ComponentStarted
	public void start(CDOStoreConfig storeConfig) throws SQLException {
		
		try {
			OMPlatform.INSTANCE.setDebugging(true); 
			OMPlatform.INSTANCE.addLogHandler(org.eclipse.net4j.util.om.log.PrintLogHandler.CONSOLE); 
			OMPlatform.INSTANCE.addTraceHandler(org.eclipse.net4j.util.om.trace.PrintTraceHandler.CONSOLE); 
			
			Net4jUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the Net4j kernel
		    
			TCPUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the TCP support
		    
		    CDONet4jServerUtil.prepareContainer(IPluginContainer.INSTANCE); // Prepare the CDO server
			    
			IMappingStrategy strategy = createMappingStrategy(); 
	
			// adapter -> Adapter definito in db-core-cdo.xmi (per es. MySQLAdapter)
			IDBAdapter adapter = DBUtil.getDBAdapter(storeConfig.getAdapter());
	
			// provider
			Properties dataSourceProps = new Properties();
			dataSourceProps.put("class", storeConfig.getDriver());
			dataSourceProps.put("url", storeConfig.getUrl());
			dataSourceProps.put("user", storeConfig.getCredentials().getUser());
			dataSourceProps.put("password", storeConfig.getCredentials().getPassword());
			
			// TODO retrieve dataFactory by adapter
			DataSourceFactory dataSourceFactory = new MySQLDataSourceFactory();
			DataSource dataSource = dataSourceFactory.createDataSource(dataSourceProps);		
			IDBConnectionProvider provider = DBUtil.createConnectionProvider(dataSource); 
	
			// store 		
			Map<String, String> databaseProps = new HashMap<String, String>();
			databaseProps.put("readerPoolCapacity", "10");
			databaseProps.put("writerPoolCapacity", "10");
			
			IDBStore store = CDODBUtil.createStore(strategy, adapter, provider, databaseProps);		
			strategy.setStore(store); 
	
			// repository 
			Map<String, String> repositoryProps = new HashMap<String, String>(); 
			repositoryProps.put("overrideUUID", "");
			repositoryProps.put("supportingAudits", "false");
			repositoryProps.put("supportingBranches", "false");
			IRepository repository = CDOServerUtil.createRepository(storeConfig.getRepository(), store, repositoryProps); 
			CDOServerUtil.addRepository(IPluginContainer.INSTANCE, repository); 
						
			Net4jUtil.getAcceptor(IPluginContainer.INSTANCE, "tcp", storeConfig.getSocketConfig().getAddress()+":"+storeConfig.getSocketConfig().getPort());
			
			System.out.println("CDO activated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private IMappingStrategy createMappingStrategy() {
		
		IMappingStrategy strategy = new CDOHorizontalMappingStrategy();


		Map<String, String> mappingProps = new HashMap<String, String>();
		mappingProps.put("toManyReferences", "ONE_TABLE_PER_CLASS"); 
		mappingProps.put("qualifiedNames", "false");

		strategy.setProperties(mappingProps);

		return strategy;
	}
}