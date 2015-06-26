package org.smeup.sys.co.flux;

import org.eclipse.flux.client.IChannelListener;
import org.eclipse.flux.client.MessageConnector;
import org.eclipse.flux.client.MessageConstants;
import org.eclipse.flux.core.ChannelSwitcher;
import org.eclipse.flux.core.KeepAliveConnector;
import org.eclipse.flux.core.LiveEditCoordinator;
import org.eclipse.flux.core.Repository;
import org.eclipse.flux.core.ServiceDiscoveryConnector;

public class FluxComponent {
	public static final String JDT_SERVICE_ID = "org.eclipse.flux.jdt";
	private static long WAIT_TIME_PERIOD = 100;

	private ServiceDiscoveryConnector discoveryConnector;
	private KeepAliveConnector keepAliveConnector;

	public void activate() throws Exception {
		final boolean lazyStart = org.eclipse.flux.core.Activator.getDefault().isLazyStart();

		final ChannelSwitcher channelSwitcher = org.eclipse.flux.core.Activator.getDefault().getChannelSwitcher();
		final MessageConnector messagingConnector = org.eclipse.flux.core.Activator.getDefault().getMessageConnector();

		if (messagingConnector != null) {
			new Thread() {

				@Override
				public void run() {

					String userChannel = channelSwitcher.getChannel();
					JdtChannelListener jdtChannelListener = new JdtChannelListener();
					for (; userChannel == null; userChannel = channelSwitcher.getChannel()) {
						try {
							sleep(WAIT_TIME_PERIOD);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					discoveryConnector = new ServiceDiscoveryConnector(channelSwitcher, messagingConnector, JDT_SERVICE_ID, lazyStart);
					if (lazyStart) {
						keepAliveConnector = new KeepAliveConnector(channelSwitcher, messagingConnector, JDT_SERVICE_ID);
					}

					jdtChannelListener.connected(userChannel);
					messagingConnector.addChannelListener(jdtChannelListener);
				}

			}.start();

		}

	}

	public synchronized void deactivate() {
		if (discoveryConnector != null) {
			discoveryConnector.dispose();
		}
		if (keepAliveConnector != null) {
			keepAliveConnector.dispose();
		}
	}

	/**
	 * Flux Channel listener for JDT service (supports lazy start option)
	 * 
	 * @author aboyko
	 *
	 */
	private class JdtChannelListener implements IChannelListener {

		private LiveEditUnits liveEditUnits;
		private InitializeServiceEnvironment initializer;

		@Override
		public void connected(String userChannel) {
			boolean lazyStart = org.eclipse.flux.core.Activator.getDefault().isLazyStart();
			if (lazyStart && MessageConstants.SUPER_USER.equals(userChannel)) {
				return;
			}
			MessageConnector messagingConnector = org.eclipse.flux.core.Activator.getDefault().getMessageConnector();
			Repository repository = org.eclipse.flux.core.Activator.getDefault().getRepository();
			LiveEditCoordinator liveEditCoordinator = org.eclipse.flux.core.Activator.getDefault().getLiveEditCoordinator();

			this.liveEditUnits = new LiveEditUnits(messagingConnector, liveEditCoordinator, repository);

			String initJdtStr = System.getProperty("flux-initjdt") == null ? System.getenv("FLUX_INIT_JDT") : System.getProperty("flux-initjdt");
			if (initJdtStr != null && Boolean.valueOf(initJdtStr)) {
				this.initializer = new InitializeServiceEnvironment(messagingConnector, repository);
				initializer.start();
			}
		}

		@Override
		public void disconnected(String userChannel) {
			boolean lazyStart = org.eclipse.flux.core.Activator.getDefault().isLazyStart();
			if (lazyStart && MessageConstants.SUPER_USER.equals(userChannel)) {
				return;
			}
			liveEditUnits.dispose();
			if (initializer != null) {
				initializer.dispose();
			}
		}

	}
}