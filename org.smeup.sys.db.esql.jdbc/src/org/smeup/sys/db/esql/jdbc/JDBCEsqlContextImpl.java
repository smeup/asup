package org.smeup.sys.db.esql.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QDescriptorArea;
import org.smeup.sys.db.esql.QESqlFactory;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.db.esql.impl.DescriptorAreaImpl;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QDataContext;

public class JDBCEsqlContextImpl implements QEsqlContext {

	private QDataContext dataContext;
	private QESqlFactory esqlFactory;
	private QCommunicationArea communicationArea;
	private Map<String, QDescriptorArea> descriptorAreas;

	public JDBCEsqlContextImpl(QConnection connection, QDataContext dataContext, QCommunicationArea communicationArea) {
		this.dataContext = dataContext;
		this.esqlFactory = new JDBCESqlFactoryImpl(connection, this);
		this.communicationArea = communicationArea;
		this.descriptorAreas = new HashMap<String, QDescriptorArea>();
	}
	
	@Override
	public QContext getContext() {
		return dataContext.getContext();
	}

	@Override
	public QDataContext getDataContext() {
		return dataContext;
	}

	@Override
	public QESqlFactory getEsqlFactory() {
		return esqlFactory;
	}

	@Override
	public QCommunicationArea getCommunicationArea() {
		return communicationArea;
	}	
	
	@Override
	public QDescriptorArea getDescriptorArea(String name) {
		return descriptorAreas.get(name);
	}
	
	@Override
	public QDescriptorArea allocateDescriptorArea(String name, int numColumns) {

		DescriptorAreaImpl descriptorArea = (DescriptorAreaImpl) getDescriptorArea(name);
		if (descriptorArea != null)
			throw new DatabaseCoreRuntimeException("Descriptor already defined: " + descriptorArea);
		
		descriptorArea = dataContext.getDataFactory().createDataStruct(DescriptorAreaImpl.class, 0, true);
		descriptorArea.sqld.eval(numColumns);
		descriptorArea.sqln.eval(numColumns);
		
		descriptorAreas.put(name, descriptorArea);
		
		return descriptorArea;
	}
	
	@Override
	public QDescriptorArea deallocateDescriptorArea(String name) {

		QDescriptorArea descriptorArea = getDescriptorArea(name);
		if (descriptorArea == null)
			throw new DatabaseCoreRuntimeException("Descriptor not found: " + name);

		descriptorAreas.remove(descriptorArea);
		
		return descriptorArea;
	}
}
