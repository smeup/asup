/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.osgi.ecf.impl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.remoteserviceadmin.EndpointDescription;
import org.smeup.sys.co.osgi.QCommunicationManager;
import org.smeup.sys.co.osgi.QEndPoint;
import org.smeup.sys.co.osgi.ecf.hook.ECFClientActivatorHook;

public class ECFCommunicationManagerImpl implements QCommunicationManager {

	@Override
	public List<QEndPoint> find(String contextID) {

		List<QEndPoint> endPoints = new ArrayList<QEndPoint>();

		for (final EndpointDescription endpointDescription : ECFClientActivatorHook.getEndPoints())
			endPoints.add(new ECFEndPointAdapterImpl(endpointDescription));

		return endPoints;

	}

	@Override
	public QEndPoint lookup(String contextID, String endPointID) {

		QEndPoint endPoint = null;

		for (final EndpointDescription endpointDescription : ECFClientActivatorHook.getEndPoints())
			if (endpointDescription.getId().equals(endPointID)) {
				endPoint = new ECFEndPointAdapterImpl(endpointDescription);
				break;
			}

		return endPoint;
	}
} // ECFCommunicationManagerImpl
