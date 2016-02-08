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
package org.smeup.sys.il.esam.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.constraints.IndexMember;
import org.smeup.sys.il.esam.QIndex;
import org.smeup.sys.il.esam.QIndexColumn;

public class JDBCIndexAdapter implements QIndex {

	private List<QIndexColumn> columns;

	@SuppressWarnings("unchecked")
	public JDBCIndexAdapter(Index index) {

		this.columns = new ArrayList<QIndexColumn>();

		for (IndexMember indexMember : (List<IndexMember>) index.getMembers()) {
			QIndexColumn indexColumn = new JDBCIndexColumnAdapter(indexMember);
			this.columns.add(indexColumn);
		}
	}

	@Override
	public List<QIndexColumn> getColumns() {
		return columns;
	}

}
