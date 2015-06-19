package org.smeup.sys.co.flux;

import org.eclipse.flux.client.IChannelListener;
import org.eclipse.flux.client.MessageConnector;
import org.eclipse.flux.client.MessageConstants;
import org.eclipse.flux.core.ChannelSwitcher;
import org.eclipse.flux.core.KeepAliveConnector;
import org.eclipse.flux.core.LiveEditCoordinator;
import org.eclipse.flux.core.Repository;
import org.eclipse.flux.core.ServiceDiscoveryConnector;
import org.eclipse.flux.jdt.services.ContentAssistService;
import org.eclipse.flux.jdt.services.InitializeServiceEnvironment;
import org.eclipse.flux.jdt.services.JavaDocService;
import org.eclipse.flux.jdt.services.LiveEditUnits;
import org.eclipse.flux.jdt.services.NavigationService;
import org.eclipse.flux.jdt.services.QuickAssistService;
import org.eclipse.flux.jdt.services.RenameService;

public class FluxServerListener {

	private static long WAIT_TIME_PERIOD = 100;

	protected Repository repository;

	private FluxServerConnector fluxServerConnector;

	public FluxServerListener(FluxServerConnector fluxServerConnector) {
		this.fluxServerConnector = fluxServerConnector;
		this.repository = fluxServerConnector.getRepository();
		startListener();
	}

	private void startListener() {
		final boolean lazyStart = fluxServerConnector.isLazyStart();

		final ChannelSwitcher channelSwitcher = fluxServerConnector.getChannelSwitcher();
		final MessageConnector messagingConnector = fluxServerConnector.getMessageConnector();

		if (messagingConnector != null) {
			new Thread() {

				@Override
				public void run() {

					String userChannel = channelSwitcher.getChannel();
					JdtChannelListener jdtChannelListener = new JdtChannelListener(repository);
					for (; userChannel == null; userChannel = channelSwitcher.getChannel()) {
						try {
							sleep(WAIT_TIME_PERIOD);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					new ServiceDiscoveryConnector(channelSwitcher, messagingConnector, FluxServerConnector.PLUGIN_ID,
							lazyStart);

					if (lazyStart) {
						new KeepAliveConnector(channelSwitcher, messagingConnector, FluxServerConnector.PLUGIN_ID);
					}

					jdtChannelListener.connected(userChannel);
					messagingConnector.addChannelListener(jdtChannelListener);
				}

			}.start();

		}
	}

	private class JdtChannelListener implements IChannelListener {

		private LiveEditUnits liveEditUnits;
		private ContentAssistService contentAssistService;
		private NavigationService navigationService;
		private RenameService renameService;
		private JavaDocService javadocService;
		private QuickAssistService quickAssistService;
		private InitializeServiceEnvironment initializer;
		private Repository repository;
		
		public JdtChannelListener(Repository repository) {
			this.repository = repository;
		}

		@Override
		public void connected(String userChannel) {
			boolean lazyStart = fluxServerConnector.isLazyStart();
			if (lazyStart && MessageConstants.SUPER_USER.equals(userChannel)) {
				return;
			}
			MessageConnector messagingConnector = fluxServerConnector.getMessageConnector();

			LiveEditCoordinator liveEditCoordinator = fluxServerConnector.getLiveEditCoordinator();

			this.liveEditUnits = new LiveEditUnits(messagingConnector, liveEditCoordinator, this.repository);
			this.contentAssistService = new ContentAssistService(messagingConnector, liveEditUnits);
			this.navigationService = new NavigationService(messagingConnector, liveEditUnits);
			this.renameService = new RenameService(messagingConnector, liveEditUnits);
			this.javadocService = new JavaDocService(messagingConnector, liveEditUnits);
			this.quickAssistService = new QuickAssistService(messagingConnector, liveEditUnits);

			//String initJdtStr = System.getProperty("flux-initjdt") == null ? System.getenv("FLUX_INIT_JDT") : System.getProperty("flux-initjdt");
			//if (initJdtStr != null && Boolean.valueOf(initJdtStr)) {
			if (true) {
				this.initializer = new InitializeServiceEnvironment(messagingConnector, repository);
				initializer.start();
			}
		}

		@Override
		public void disconnected(String userChannel) {
			boolean lazyStart = fluxServerConnector.isLazyStart();
			if (lazyStart && MessageConstants.SUPER_USER.equals(userChannel)) {
				return;
			}
			liveEditUnits.dispose();
			contentAssistService.dispose();
			navigationService.dispose();
			renameService.dispose();
			javadocService.dispose();
			quickAssistService.dispose();
			if (initializer != null) {
				initializer.dispose();
			}
		}

	}
}
