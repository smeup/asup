package org.smeup.sys.co.flux;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Executors;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.flux.client.FluxClient;
import org.eclipse.flux.client.IChannelListener;
import org.eclipse.flux.client.MessageConnector;
import org.eclipse.flux.client.MessageConstants;
import org.eclipse.flux.client.config.SocketIOFluxConfig;
import org.eclipse.flux.core.ChannelSwitcher;
import org.eclipse.flux.core.IRepositoryListener;
import org.eclipse.flux.core.LiveEditCoordinator;
import org.eclipse.flux.core.Repository;
import org.osgi.service.prefs.BackingStoreException;

public class FluxServerConnector {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.flux.jdt"; //$NON-NLS-1$  //NB: non cambiare!
	private static final String CONNECTED_PROJECTS_ID = "connected.projects";

	private Repository repository;

	private ChannelSwitcher channelSwitcher;
	
	public static String getPluginId() {
		return PLUGIN_ID;
	}

	public static String getConnectedProjectsId() {
		return CONNECTED_PROJECTS_ID;
	}

	public IChannelListener getSERVICE_STARTER() {
		return SERVICE_STARTER;
	}

	private MessageConnector messageConnector;
	private LiveEditCoordinator liveEditCoordinator;

	private IRepositoryListener repositoryListener;
	private IResourceChangeListener workspaceListener;
	// private CloudSyncResourceListener resourceListener;
	// private CloudSyncMetadataListener metadataListener;

	private String host;
	private String userName;
	private String token;
	private String channel;
	private boolean lazyStart;


	
	FluxServerConnector(FluxServerConnectionConfig config) {

		host = config.getHost();
		userName = config.getUserName();
		token = config.getToken();
		channel = config.getChannelID();
		lazyStart = config.isLazyStart();
		if (channel == null) {
			channel = userName;
		}
		
		startConnector();
	}

	private void startConnector() {
		
		if (! host.isEmpty()) {
			try {
				this.messageConnector = new FluxClient(Executors.newFixedThreadPool(1)).connect(new SocketIOFluxConfig(
						host, 
						userName, 
						token));

				this.channelSwitcher = new ChannelSwitcher(this.messageConnector);
				this.messageConnector.addChannelListener(SERVICE_STARTER);

				final String userChannel = lazyStart ? MessageConstants.SUPER_USER : channel;

				// Connecting to channel done asynchronously (to avoid blocking
				// plugin state initialization).
				FluxClient.DEFAULT_INSTANCE.getExecutor().execute(new Runnable() {
					@Override
					public void run() {
						try {
							channelSwitcher.switchToChannel(userChannel);
						} catch (Exception e) {
						}
					}
				});
			} catch (Exception e1) {
				// TODO: manage FluxClient exception
			}
		}
	}

	private final IChannelListener SERVICE_STARTER = new IChannelListener() {		

		@Override
		public void connected(String userChannel) {
			
			if (!(lazyStart && MessageConstants.SUPER_USER.equals(userChannel))) {
				try {
					FluxServerConnector.this.initCoreService(userChannel);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}

		@Override
		public void disconnected(String userChannel) {
			
			if (!(lazyStart && MessageConstants.SUPER_USER.equals(userChannel))) {
				disposeCoreServices(userChannel);
			}
		}
	};

	private void initCoreService(String userChannel) throws CoreException {

		this.repository = new Repository(this.messageConnector, userChannel);
		
		new FluxServerListener(this);
		
		liveEditCoordinator = new LiveEditCoordinator(this.messageConnector);

		// TODO: qual'è il workspace da usare?
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		/*
		 * 
		 * resourceListener = new CloudSyncResourceListener(repository);
		 * workspace.addResourceChangeListener(resourceListener,
		 * IResourceChangeEvent.POST_CHANGE);
		 * 
		 * metadataListener = new CloudSyncMetadataListener(repository);
		 * workspace.addResourceChangeListener(metadataListener,
		 * IResourceChangeEvent.POST_BUILD);
		 */

		this.repositoryListener = new IRepositoryListener() {
			@Override
			public void projectDisconnected(IProject project) {
				removeConnectedProjectPreference(project.getName());
			}

			@Override
			public void projectConnected(IProject project) {
				addConnectedProjectPreference(project.getName());
			}

			@Override
			public void resourceChanged(IResource resource) {
				// nothing
			}
		};

		repository.addRepositoryListener(repositoryListener);

		workspaceListener = new IResourceChangeListener() {

			public void resourceChanged(IResourceChangeEvent event) {
				if (event.getResource() instanceof IProject) {
					IResourceDelta delta = event.getDelta();
					if (delta == null) {
						return;
					}
					if (delta.getKind() == IResourceDelta.REMOVED) {
						IProject project = (IProject) event.getResource();
						removeConnectedProjectPreference(project.getName());
					} else if (delta.getKind() == IResourceDelta.CHANGED) {
						// TODO, we aren't handling project renaming yet
						// IProject project = (IProject) event.getResource();
						// String oldName =
						// delta.getMovedFromPath().lastSegment();
						// removeConnectedProjectPreference(oldName);
						// addConnectedProjectPreference(project.getName());
					}
				}
			}
		};
		workspace.addResourceChangeListener(workspaceListener);

		updateProjectConnections();
	}

	private void disposeCoreServices(String userChannel) {
		if (userChannel.equals(repository.getUsername())) {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			workspace.removeResourceChangeListener(workspaceListener);
			// workspace.removeResourceChangeListener(resourceListener);
			// workspace.removeResourceChangeListener(metadataListener);
			repository.removeRepositoryListener(repositoryListener);
			liveEditCoordinator.dispose();
			repository.dispose();
		}
	}

	private void updateProjectConnections() throws CoreException {
		String[] projects = getConnectedProjectPreferences();
		for (String projectName : projects) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = root.getProject(projectName);
			if (project.exists()) {
				if (!project.isOpen()) {
					project.open(null);
				}
				
				repository.addProject(project);
			}
		}
	}

	private String[] getConnectedProjectPreferences() {
		IEclipsePreferences preferences = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
		String[] projects = StringUtils.split(preferences.get(CONNECTED_PROJECTS_ID, ""), ";");
		return projects;
	}

	private void addConnectedProjectPreference(String projectName) {
		IEclipsePreferences preferences = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
		String currentPreferences = preferences.get(CONNECTED_PROJECTS_ID, "");
		String[] projects = StringUtils.split(currentPreferences, ";");
		for (String existingProjectName : projects) {
			if (existingProjectName.equals(projectName)) {
				return;
			}
		}
		currentPreferences += ";" + projectName;
		preferences.put(CONNECTED_PROJECTS_ID, currentPreferences);
		try {
			
			preferences.flush();
			
		} catch (BackingStoreException e) {
			// We really don't care that much..
		}
	}

	private void removeConnectedProjectPreference(String projectName) {
		IEclipsePreferences preferences = InstanceScope.INSTANCE.getNode(PLUGIN_ID);
		String currentPreferences = preferences.get(CONNECTED_PROJECTS_ID, "");

		String[] projects = StringUtils.split(currentPreferences, ";");
		Collection<String> retainedProjects = new HashSet<String>();
		for (String existingProjectName : projects) {
			if (!existingProjectName.equals(projectName)) {
				retainedProjects.add(existingProjectName);
			}
		}

		String newPreferences = StringUtils.join(retainedProjects, ";");
		preferences.put(CONNECTED_PROJECTS_ID, newPreferences);

		try {
			preferences.flush();
		} catch (BackingStoreException e) {

			e.printStackTrace();
		}
	}
	
	
	public Repository getRepository() {
		return this.repository;
	}
	
	public ChannelSwitcher getChannelSwitcher() {
		return channelSwitcher;
	}

	public MessageConnector getMessageConnector() {
		return messageConnector;
	}

	public LiveEditCoordinator getLiveEditCoordinator() {
		return liveEditCoordinator;
	}

	public IRepositoryListener getRepositoryListener() {
		return repositoryListener;
	}

	public IResourceChangeListener getWorkspaceListener() {
		return workspaceListener;
	}

	public String getHost() {
		return host;
	}

	public String getUserName() {
		return userName;
	}

	public String getToken() {
		return token;
	}

	public String getChannel() {
		return channel;
	}

	public boolean isLazyStart() {
		return lazyStart;
	}

}
