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
package org.smeup.sys.db.core.base;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.datatools.connectivity.ConnectionProfileException;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.sqm.core.SQMServices;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionFilter;
import org.eclipse.datatools.connectivity.sqm.core.mappings.ProviderIDMappingRegistry;
import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogObject;
import org.eclipse.datatools.connectivity.sqm.internal.core.connection.ConnectionInfo;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Catalog;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.core.QConnectionConfig;
import org.smeup.sys.db.core.QConnectionCredentials;
import org.smeup.sys.db.core.impl.CatalogContainerImpl;
import org.smeup.sys.il.core.ctx.QContext;

public class BaseCatalogContainerImpl extends CatalogContainerImpl {

	private QContext catalogContext;
	private QCatalogMetaData catalogMetaData;

	private IConnectionProfile iConnectionProfile;
	private ConnectionInfo connectionGraph;
	private ConnectionInfo connectionWork;

	private Map<String, Schema> schemas;

	private boolean nativeCatalogSupport;

	private BaseSchemaFilterImpl schemaFilter;
	private BaseTableFilterImpl tableFilter;
	private BaseViewFilterImpl viewFilter;

	public BaseCatalogContainerImpl(QContext catalogContext) {
		this.catalogContext = catalogContext;
	}

	@Override
	public Schema loadSchema(String name) {

		synchronized (this) {
			Schema schema = loadSchema(name, true);

			// activate lazy loading if needed
			schema.getTables();

			return schema;
		}
	}

	@SuppressWarnings("unchecked")
	private Schema loadSchema(String name, boolean update) {

		ICatalogObject iCatalogWork = getCatalogWork();

		schemaFilter.setSchemaName(name);
		iCatalogWork.refresh();

		Schema schema = null;

		if (nativeCatalogSupport) {
			Catalog catalog = (Catalog) getCatalogWork();
			for (Schema newSchema : (List<Schema>) catalog.getSchemas())
				schema = newSchema;

			// update container
			if (update && schema != null)
				schema.setCatalog((Catalog) getCatalogGraph());
		} else {
			Database database = (Database) getCatalogWork();
			for (Schema newSchema : (List<Schema>) database.getSchemas())
				schema = newSchema;

			// update container
			if (update && schema != null)
				schema.setDatabase((Database) getCatalogGraph());
		}

		if (update && schema != null)
			this.schemas.put(schema.getName(), schema);

		return schema;
	}

	@Override
	public Table loadTable(Schema schema, String name) {

		synchronized (this) {

			Table table = loadTable(schema, name, true);

			// activate lazy loading if needed
			table.getIndex();

			return table;
		}
	}

	@SuppressWarnings("unchecked")
	private Table loadTable(Schema schema, String name, boolean update) {

		Schema schemaWork = loadSchema(schema.getName(), false);
		tableFilter.setTableName(name);
		viewFilter.setViewName("*NONE");
		((ICatalogObject) schemaWork).refresh();

		Table table = null;

		for (Table newTable : (List<Table>) schemaWork.getTables())
			table = newTable;

		// update container
		if (update && table != null)
			table.setSchema(schema);

		return table;
	}

	@Override
	public ViewTable loadView(Schema schema, String name) {

		synchronized (this) {

			ViewTable view = loadView(schema, name, true);

			// activate lazy loading if needed
			view.getIndex();

			return view;
		}
	}

	@SuppressWarnings("unchecked")
	private ViewTable loadView(Schema schema, String name, boolean update) {

		Schema schemaWork = loadSchema(schema.getName(), false);
		viewFilter.setViewName(name);
		tableFilter.setTableName("*NONE");
		((ICatalogObject) schemaWork).refresh();

		ViewTable view = null;

		for (Table newTable : (List<Table>) schemaWork.getTables())
			if (newTable instanceof ViewTable)
				view = (ViewTable) newTable;

		// update container
		if (update && view != null)
			view.setSchema(schema);

		return view;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Index loadIndex(Table table, String name) {

		synchronized (this) {

			Index index = null;

			if (table instanceof ViewTable) {

				ViewTable viewWork = loadView(table.getSchema(), table.getName(), false);

				viewFilter.setViewName(table.getName());
				tableFilter.setTableName("*NONE");
				((ICatalogObject) viewWork).refresh();

				for (Index newIndex : (List<Index>) viewWork.getIndex())
					if (newIndex.getName().equals(name)) {
						index = newIndex;
						break;
					}
			} else {

				Table tableWork = loadTable(table.getSchema(), table.getName(), false);

				tableFilter.setTableName(table.getName());
				viewFilter.setViewName("*NONE");
				((ICatalogObject) tableWork).refresh();

				for (Index newIndex : (List<Index>) tableWork.getIndex())
					if (newIndex.getName().equals(name)) {
						index = newIndex;
						break;
					}
			}

			// update container
			if (index != null) {
				index.setSchema(table.getSchema());
				index.setTable(table);
			}

			return index;
		}
	}

	@Override
	public void removeIndex(Index index) {
		index.setSchema(null);
		index.setTable(null);
	}

	@Override
	public void removeSchema(Schema schema) {
		this.schemas.remove(schema.getName());

		schema.setDatabase(null);
		schema.setCatalog(null);
	}

	@Override
	public void removeTable(Table table) {
		table.setSchema(null);
	}

	@Override
	public void removeView(ViewTable view) {
		view.setSchema(null);
	}

	@SuppressWarnings("unchecked")
	protected void initialize() throws SQLException {

		this.connectionGraph = null;
		this.connectionWork = null;
		this.schemas = new HashMap<String, Schema>();

		this.schemaFilter = new BaseSchemaFilterImpl();
		this.tableFilter = new BaseTableFilterImpl();
		this.viewFilter = new BaseViewFilterImpl();

		QConnectionCredentials credentials = getConnectionConfig().getCredentials();
		this.connectionGraph = (ConnectionInfo) createConnection(org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo.class, credentials.getUser(), credentials.getPassword());
		if (getConnectionConfig().getCatalog() != null && !getConnectionConfig().getCatalog().isEmpty())
			this.connectionGraph.getSharedConnection().setCatalog(getConnectionConfig().getCatalog());

		// load catalog metadata
		Database database = this.connectionGraph.getSharedDatabase();
		List<Catalog> databaseGraphCatalogs = database.getCatalogs();

		if (databaseGraphCatalogs.isEmpty()) {

			this.nativeCatalogSupport = false;

			for (Schema schema : (List<Schema>) database.getSchemas()) {

				// activate lazy loading if needed
				schema.getTables();

				this.schemas.put(schema.getName(), schema);
			}
		} else
			for (Catalog databaseCatalog : databaseGraphCatalogs)
				if (getConnectionConfig().getCatalog().equals(databaseCatalog.getName())) {

					this.nativeCatalogSupport = true;

					for (Schema schema : (List<Schema>) databaseCatalog.getSchemas()) {

						// activate lazy loading if needed
						schema.getTables();

						this.schemas.put(schema.getName(), schema);
					}

					break;
				}

		this.catalogMetaData = new BaseCatalogMetaDataImpl(schemas);
	}

	@Override
	public QContext getCatalogContext() {
		return catalogContext;
	}

	@Override
	public QCatalogMetaData getMetaData() {
		return catalogMetaData;
	}

	@Override
	public boolean isActive() {
		return getMetaData() != null;
	}

	@Override
	public <C> C createConnection(Class<C> factory) throws SQLException {

		if (!isSupportsGuestAccess())
			throw new SQLException("Invalid catalog access: " + this.getName());

		QConnectionCredentials credentials = getConnectionConfig().getCredentials();
		return createConnection(factory, credentials.getUser(), credentials.getPassword());
	}

	@Override
	@SuppressWarnings("unchecked")
	public <C> C createConnection(Class<C> factory, String user, String password) throws SQLException {

		IConnection iConnection = getConnectionProfile().createConnection(factory.getName(), user, password);
		if (iConnection.getConnectException() != null)
			throw new DatabaseCoreRuntimeException(iConnection.getConnectException());

		if (factory.isAssignableFrom(iConnection.getClass()))
			return (C) iConnection;
		else
			return (C) iConnection.getRawConnection();
	}

	private IConnectionProfile getConnectionProfile() {

		if (iConnectionProfile != null)
			return iConnectionProfile;

		synchronized (this) {

			if (iConnectionProfile != null)
				return iConnectionProfile;

			try {

				ProfileManager profileManager = ProfileManager.getInstance();
				QConnectionConfig connectionConfig = getConnectionConfig();

				ProviderIDMappingRegistry providerIDMappingRegistry = SQMServices.getProviderIDMappingRegistry();
				String providerID = providerIDMappingRegistry.getProviderIDforVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
				if (providerID == null)
					throw new DatabaseCoreRuntimeException("Invalid providerID for catalog container: " + this);

				if (connectionConfig.isPersistent()) {
					iConnectionProfile = ProfileManager.getInstance().getProfileByName(getName());
					if (iConnectionProfile == null) {
						Properties properties = BaseCatalogHelper.createPropertiesByConnectionConfig(connectionConfig);

						String text = "As.UP Catalog " + connectionConfig.getVendor() + "(" + connectionConfig.getVersion() + ")";
						iConnectionProfile = profileManager.createProfile(getName(), text, providerID, properties);
					}
				} else {
					Properties properties = BaseCatalogHelper.createPropertiesByConnectionConfig(connectionConfig);
					iConnectionProfile = profileManager.createTransientProfile(providerID, properties);
				}

			} catch (ConnectionProfileException e) {
				throw new DatabaseCoreRuntimeException(e);
			}
		}

		return iConnectionProfile;
	}

	private ConnectionInfo getConnectionWork() throws SQLException {
		if (this.connectionWork == null)
			synchronized (this) {
				if (this.connectionWork != null)
					return this.connectionWork;

				QConnectionCredentials credentials = getConnectionConfig().getCredentials();
				this.connectionWork = (ConnectionInfo) createConnection(org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo.class, credentials.getUser(), credentials.getPassword());

				if (getConnectionConfig().getCatalog() != null && !getConnectionConfig().getCatalog().isEmpty())
					this.connectionWork.getSharedConnection().setCatalog(getConnectionConfig().getCatalog());

				this.connectionWork.addFilter(ConnectionFilter.SCHEMA_FILTER, schemaFilter);
				this.connectionWork.addFilter(ConnectionFilter.TABLE_FILTER, tableFilter);
				this.connectionWork.addFilter(ConnectionFilter.VIEW_FILTER, viewFilter);
			}

		return this.connectionWork;
	}

	@SuppressWarnings("unchecked")
	private ICatalogObject getCatalogWork() {

		ICatalogObject iCatalogWork = null;
		try {
			if (nativeCatalogSupport) {

				for (Catalog databaseCatalogWork : (List<Catalog>) getConnectionWork().getSharedDatabase().getCatalogs())
					if (getConnectionConfig().getCatalog().equals(databaseCatalogWork.getName())) {
						iCatalogWork = (ICatalogObject) databaseCatalogWork;
						break;
					}

			} else
				iCatalogWork = (ICatalogObject) getConnectionWork().getSharedDatabase();
		} catch (SQLException e) {
			e.printStackTrace();

			return null;
		}

		return iCatalogWork;
	}

	@SuppressWarnings("unchecked")
	private ICatalogObject getCatalogGraph() {

		ICatalogObject iCatalogGraph = null;

		if (nativeCatalogSupport) {

			for (Catalog databaseCatalogGraph : (List<Catalog>) this.connectionGraph.getSharedDatabase().getCatalogs())
				if (getConnectionConfig().getCatalog().equals(databaseCatalogGraph.getName())) {
					iCatalogGraph = (ICatalogObject) databaseCatalogGraph;
					break;
				}

		} else
			iCatalogGraph = (ICatalogObject) connectionGraph.getSharedDatabase();

		return iCatalogGraph;
	}
}