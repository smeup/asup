package org.smeup.sys.os.type.base.api.tools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.type.QTypedObject;

public class IndexList {

	private QTypedObject objToRename;
	private List<String> indexNames;
	private QJob job;
	
	public IndexList(QJob job, QTypedObject objToRename) {
		this.job = job;
		this.objToRename = objToRename;
		this.indexNames = findIndexes();
	}
	
	@SuppressWarnings("unchecked")
	private List<String> findIndexes() {
		List<String> indexNames = new ArrayList<String>();
		if (objToRename instanceof QPhysicalFile) {
			QConnection connection = job.getContext().getAdapter(job, QConnection.class);
			Table table = connection.getCatalogMetaData().getTable(objToRename.getLibrary(), objToRename.getName());
			for (Index newIndex : (List<Index>) table.getIndex()) {
				if (!newIndex.isSystemGenerated()) {
					indexNames.add(newIndex.getName());
				}
			}
		}
		return indexNames;
	}

	public void adjustIndexes(QResourceWriter<QTypedObject> resourceWriter, String newName) {
		adjustIndexes(resourceWriter, resourceWriter, newName);
	}
	
	public void adjustIndexes(QResourceWriter<QTypedObject> resourceWriterFrom, QResourceWriter<QTypedObject> resourceWriterTo, String newName) {
		for (String indexName : indexNames) {
			QLogicalFile logical = (QLogicalFile) resourceWriterFrom.lookup(indexName);
			String creationStmt = logical.getCreationStatement();
			if (creationStmt != null) {
				String newSQL;
				if(!objToRename.getName().equals(newName)) {
					newSQL = creationStmt.replace(objToRename.getName(), newName);
				} else {
					newSQL = creationStmt.replace(objToRename.getLibrary(), resourceWriterTo.getName());					
				}
				logical.setCreationStatement(newSQL);
			}
			if (!objToRename.getName().equals(newName)) {
				List<String> tables = logical.getTables();
				tables.remove(objToRename.getName());
				tables.add(newName);
			}	
			resourceWriterFrom.delete(logical);
			resourceWriterTo.save(logical);
		}
	}


}
