/**
 */
package org.smeup.sys.dk.source;

import java.io.IOException;
import java.util.List;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QSource Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.source.QDevelopmentKitSourcePackage#getSourceManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QSourceManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.il.core.java.JavaIOException" contextRequired="true" projectRequired="true"
	 * @generated
	 */
	QProject createProject(QContext context, QProjectDef project, boolean replace) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.il.core.java.JavaIOException" contextRequired="true" parentRequired="true" nameRequired="true"
	 * @generated
	 */
	QSourceEntry createChildEntry(QContext context, QSourceNode parent, String name, boolean replace) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.il.core.java.JavaIOException" contextRequired="true" projectRequired="true" typeRequired="true" nameRequired="true" replaceRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QSourceEntry createObjectEntry(QContext context, String project, Class<T> type, String name, boolean replace) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.il.core.java.JavaIOException" contextRequired="true" projectRequired="true" typeRequired="true" nameRequired="true" replaceRequired="true" contentRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QSourceEntry createObjectEntry(QContext context, String project, Class<T> type, String name, boolean replace, T content) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" parentRequired="true" nameRequired="true"
	 * @generated
	 */
	QSourceEntry getChildEntry(QContext context, QSourceNode parent, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" projectRequired="true" typeRequired="true" nameRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> QSourceEntry getObjectEntry(QContext context, String project, Class<T> type, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" projectRequired="true"
	 * @generated
	 */
	QProject getProject(QContext context, String project);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" parentRequired="true"
	 * @generated
	 */
	List<QSourceEntry> listChildEntries(QContext context, QSourceNode parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" projectRequired="true" typeRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> List<QSourceEntry> listObjectEntries(QContext context, String project, Class<T> type, String nameFilter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	List<QProject> listProjects(QContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" entryRequired="true"
	 * @generated
	 */
	void refreshEntry(QContext context, QSourceEntry entry);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.il.core.java.JavaIOException" contextRequired="true" entryRequired="true"
	 * @generated
	 */
	void removeEntry(QContext context, QSourceEntry entry) throws IOException;

} // QSourceManager
