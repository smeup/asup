package org.smeup.sys.co.osgi.ecf.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.service.remoteserviceadmin.EndpointDescription;
import org.smeup.sys.co.core.QEndPoint;

public class ECFEndPointAdapterImpl implements QEndPoint {

	private EndpointDescription endpointDescription;

	public ECFEndPointAdapterImpl(EndpointDescription endpointDescription) {
		this.endpointDescription = endpointDescription;
	}

	@Override
	public String getEndPointID() {
		return endpointDescription.getId();
	}

	@Override
	public String getApplicationID() {
		return endpointDescription.getFrameworkUUID();
	}

	@Override
	public long getServiceID() {
		return endpointDescription.getServiceId();
	}

	@Override
	public List<String> getInterfaces() {
		return new ArrayList<String>(endpointDescription.getInterfaces());
	}

	@Override
	public Map<String, String> getProperties() {

		Map<String, String> properties = new HashMap<String, String>();

		for (Map.Entry<String, Object> entry : endpointDescription.getProperties().entrySet())
			properties.put(entry.getKey(), entry.getValue().toString());

		return properties;
	}

}