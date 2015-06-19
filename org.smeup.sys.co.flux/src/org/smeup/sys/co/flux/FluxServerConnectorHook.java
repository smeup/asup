package org.smeup.sys.co.flux;

import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.impl.ServiceRefImpl;


public class FluxServerConnectorHook extends ServiceRefImpl {

	private FluxServerConnector fluxServerConnector;
			
	@ComponentStarted
	public void start(QApplication application) {

		/*
		FluxServerConnectionConfig config = (FluxServerConnectionConfig) getConfig();
		
		fluxServerConnector = new FluxServerConnector(config);
		*/						

	}
}
