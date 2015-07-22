package org.smeup.sys.db.core.base;

import java.sql.ResultSet;

import org.smeup.sys.db.core.QConnections;
import org.smeup.sys.db.core.QStatement;

public class BaseConnectionsImpl implements QConnections {

	@Override
	public void close(QStatement stmt) {
		try {
			if (stmt != null) { 
				stmt.close(); 
			}
		} catch (Exception e) {
		}  	
	}

	@Override
	public void close(ResultSet rs) {
		try {
			if (rs != null) { 
				rs.close(); 
			}
		} catch (Exception e) {
		}  	
	}

	@Override
	public String getString(ResultSet rs, String fieldName) {
		try {
			return rs.getString(fieldName);
		} catch (Exception e) {
		}
		return "";
	}

}
