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
package org.smeup.sys.db.core.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.db.core.QDatabaseContainer;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.db.syntax.QDefinitionWriterRegistry;
import org.smeup.sys.db.syntax.QQueryWriter;
import org.smeup.sys.db.syntax.QQueryWriterRegistry;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.rt.core.QApplication;

public class BaseDatabaseLoader {

	@Inject
	private QApplication application;
	@Inject
	private QQueryWriterRegistry queryWriterRegistry;
	@Inject
	private QDefinitionWriterRegistry definitionWriterRegistry;

	public void loadDatabase(QDatabaseContainer databaseContainer) {

		// prepare catalog containers
		List<QCatalogContainer> catalogContainers = new ArrayList<QCatalogContainer>();
		catalogContainers.addAll(databaseContainer.getCatalogContainers());

		for (QCatalogContainer catalogContainer : catalogContainers) {

			if (!catalogContainer.isActive())
				continue;

			// build catalog context
			QContext catalogContext = application.getContext().createChildContext(catalogContainer.getName());

			QConnectionConfig connectionConfig = catalogContainer.getConnectionConfig();
			QQueryWriter queryWriter = queryWriterRegistry.lookup(connectionConfig);
			catalogContext.set(QQueryWriter.class, queryWriter);
			QDefinitionWriter definitionWriter = definitionWriterRegistry.lookup(connectionConfig);
			catalogContext.set(QDefinitionWriter.class, definitionWriter);

			try {
				// initialize new container
				BaseCatalogContainerImpl newCatalogContainer = new BaseCatalogContainerImpl(catalogContext);
				newCatalogContainer.setName(catalogContainer.getName());
				newCatalogContainer.setActive(true);
				newCatalogContainer.setGenerationStrategy(catalogContainer.getGenerationStrategy());
				newCatalogContainer.setConnectionConfig(catalogContainer.getConnectionConfig());
				newCatalogContainer.setSupportsGuestAccess(catalogContainer.isSupportsGuestAccess());
				newCatalogContainer.initialize();

				// update references
				databaseContainer.getCatalogContainers().remove(catalogContainer);
				databaseContainer.getCatalogContainers().add(newCatalogContainer);
				if (databaseContainer.getDefaultCatalogContainer() == catalogContainer)
					databaseContainer.setDefaultCatalogContainer(newCatalogContainer);

			} catch (Exception e) {
				System.err.println(e.getMessage());
				continue;
			}

		}

		// printDatabase(databaseContainer);
	}

	@SuppressWarnings("unchecked")
	protected void printDatabase(QDatabaseContainer databaseContainer) {

		for (QCatalogContainer catalogContainer : databaseContainer.getCatalogContainers()) {
			System.out.println(catalogContainer);
			for (Schema schema : catalogContainer.getMetaData().getSchemas()) {
				System.out.println("\t" + schema);
				for (Table table : (List<Table>) schema.getTables())
					System.out.println("\t\t" + table);
			}
		}
	}
}