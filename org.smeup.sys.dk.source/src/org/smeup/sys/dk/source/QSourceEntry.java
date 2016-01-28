/**
 */
package org.smeup.sys.dk.source;

import java.io.IOException;
import java.io.InputStream;
import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QSource Entry</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.source.QDevelopmentKitSourcePackage#getSourceEntry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QSourceEntry extends QSourceNode {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.mi.core.JavaInputStream" exceptions="org.smeup.sys.mi.core.JavaIOException"
	 * @generated
	 */
	InputStream getInputStream() throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException" typeRequired="true"
	 * @generated
	 */
	<T extends QObjectNameable> T load(Class<T> type) throws IOException;

} // QSourceEntry
