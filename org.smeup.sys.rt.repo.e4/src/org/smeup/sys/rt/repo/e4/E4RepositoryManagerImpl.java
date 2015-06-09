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
package org.smeup.sys.rt.repo.e4;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.IProvisioningAgentProvider;
import org.eclipse.equinox.p2.engine.IProfileRegistry;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.operations.InstallOperation;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.Update;
import org.eclipse.equinox.p2.operations.UpdateOperation;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.query.QueryUtil;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.repo.QRepositoryManager;

public class E4RepositoryManagerImpl implements QRepositoryManager {

	@SuppressWarnings("unused")
	@Inject
	private QApplication application;
	@Inject
	public IProvisioningAgentProvider agentProvider;

	// private static String eclipse_site =
	// "http://download.eclipse.org/releases/helios";
	private static String asup_site = "http://smeup.github.io/org.smeup.sys.p2.site";

	@Override
	public void checkUpdates(QApplication application) {
		String path = System.getProperty("osgi.instance.area");

		IProvisioningAgent agent = null;
		try {
			agent = agentProvider.createAgent(new URI(path + "/p2"));

			IProfileRegistry profileRegistry = (IProfileRegistry) agent.getService(IProfileRegistry.SERVICE_NAME);
			if(profileRegistry.getProfile("ASUP") == null)
				profileRegistry.addProfile("ASUP");
						
			IMetadataRepositoryManager manager = (IMetadataRepositoryManager) agent.getService(IMetadataRepositoryManager.SERVICE_NAME);
			IMetadataRepository repository = manager.loadRepository(new URI(asup_site), null);
			
			// repository
			System.out.println(repository.getName() + "/" + repository.getDescription() + "/" + repository.getLocation() + "/" + repository.getProvider());

			// groups
			IQuery<IInstallableUnit> query = QueryUtil.createLatestQuery(QueryUtil.createIUGroupQuery());
			IQueryResult<IInstallableUnit> queryResult = repository.query(query, null);
			
			try {					
				List<IInstallableUnit> installableGroup = new ArrayList<IInstallableUnit>();
				for(IInstallableUnit installableUnit: queryResult) {
					if(installableUnit.getId().contains("lang.base")) {
						System.out.println(installableUnit);
						installableGroup.add(installableUnit);
//						break;
					}
				}
				
				InstallOperation installOperation = new InstallOperation(new ProvisioningSession(agent), installableGroup);
				installOperation.setProfileId("ASUP");
				
				IStatus result = installOperation.resolveModal(null);
				if (result.isOK()) {
					installOperation.getProvisioningJob(null).runModal(null);
				}
				else
					System.out.println(result.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}

			
			UpdateOperation updateOperation = new UpdateOperation(new ProvisioningSession(agent));
			updateOperation.setProfileId("ASUP");

			try {
				IStatus result = updateOperation.resolveModal(null);
				if (result.isOK()) {
					Update[] possibleUpdates = updateOperation.getPossibleUpdates();

					System.out.println("Possible updates:" + possibleUpdates.length);

					for(Update update: possibleUpdates) {
						System.out.println(update);
					}
					
	/*				if (possibleUpdates.length > 100000) {
						updateOperation.setSelectedUpdates(possibleUpdates);
						Update[] selectedUpdates = updateOperation.getSelectedUpdates();

						System.out.println("Updates: " + selectedUpdates);
						updateOperation.getProvisioningJob(null).runModal(null);
					}*/
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (agent != null)
				agent.stop();
		}
	}
}
