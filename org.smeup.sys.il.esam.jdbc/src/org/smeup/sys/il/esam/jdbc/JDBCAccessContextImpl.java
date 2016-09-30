package org.smeup.sys.il.esam.jdbc;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.esam.QAccessContext;
import org.smeup.sys.il.esam.QAccessFactory;

public class JDBCAccessContextImpl implements QAccessContext {

	private QDataContext dataContext;
	private QAccessFactory accessFactory;

	public JDBCAccessContextImpl(QConnection connection, QDataContext dataContext) {
		this.dataContext = dataContext;
		this.accessFactory = new JDBCAccessFactoryImpl(connection, this);
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
	public QAccessFactory getAccessFactory() {
		return accessFactory;
	}
}
