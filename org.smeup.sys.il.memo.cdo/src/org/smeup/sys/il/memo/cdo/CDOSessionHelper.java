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
package org.smeup.sys.il.memo.cdo;

import java.util.Map.Entry;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.jvm.JVMUtil;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;

public class CDOSessionHelper {

	public static CDONet4jSession openSession(String description, String repository) {

		// org.eclipse.emf.cdo.util.CDOUtil.setLegacyModeDefault(true);

		// Create connector
		IConnector connector = TCPUtil.getConnector(createClientContainer(), description);

		// Create configuration
		CDONet4jSessionConfiguration configuration = CDONet4jUtil.createNet4jSessionConfiguration();
		// configuration.setSignalTimeout(60000);
		configuration.setConnector(connector);
		configuration.setRepositoryName(repository);
		/*
		 * configuration.setIDGenerator(new CDOIDGenerator() {
		 *
		 * @Override public void reset() { // TODO Auto-generated method stub }
		 *
		 * @Override public CDOID generateCDOID(EObject object) {
		 *
		 * // QTypedObject if(object instanceof QTypedObject) { QTypedObject
		 * typedObject = (QTypedObject)object; String id =
		 * typedObject.eClass().getClassifierID
		 * ()+"/"+typedObject.getLibrary()+"/"+typedObject.getName(); return
		 * CDOIDUtil.createString(id); } //QSystem else if(object instanceof
		 * QSystem) { QSystem qSystem = (QSystem)object; String id =
		 * qSystem.eClass().getClassifierID()+"/"+qSystem.getName(); return
		 * CDOIDUtil.createString(id); } else return UUID.generateCDOID(object);
		 * } });
		 */

		// Open session
		CDONet4jSession session = configuration.openNet4jSession();

		for (Entry<String, Object> key : EPackage.Registry.INSTANCE.entrySet())
			session.getPackageRegistry().put(key.getKey(), key.getValue());

		// System.out.println(session.options().isPassiveUpdateEnabled());

		// CDOCollectionLoadingPolicy policy =
		// CDOUtil.createCollectionLoadingPolicy(10000, 10000);
		// session.options().setCollectionLoadingPolicy(policy);
		return session;
	}

	private static IManagedContainer createClientContainer() {

		IManagedContainer container = ContainerUtil.createContainer();
		Net4jUtil.prepareContainer(container);
		JVMUtil.prepareContainer(container);
		TCPUtil.prepareContainer(container);
		CDONet4jUtil.prepareContainer(container);

		LifecycleUtil.activate(container);

		return container;
	}

}