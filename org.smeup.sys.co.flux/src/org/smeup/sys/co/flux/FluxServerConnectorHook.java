package org.smeup.sys.co.flux;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.flux.core.Repository;
import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.QApplication;


public class FluxServerConnectorHook {

	@ComponentStarted
	public void start(QApplication application) throws Exception {

		initProjectConnections();		

//		Repository repository = org.eclipse.flux.core.Activator.getDefault().getRepository();
//		ResourcesPlugin.getWorkspace().addResourceChangeListener(new CloudSyncMetadataListener(repository));
//		ResourcesPlugin.getWorkspace().addResourceChangeListener(new CloudSyncResourceListener(repository));
		
		FluxComponent fluxComponent = new FluxComponent();
		fluxComponent.activate();
	}

	private void initProjectConnections() {
				
		/** 
		 * Lists the projects in active workspace and adds those not already connected to flux  
		 */
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = root.getProjects();
		
		for (IProject project : projects) {
			
			String projectName = project.getName();
			
			if (project.isOpen()) {

				Repository repository = org.eclipse.flux.core.Activator.getDefault().getRepository();
				if (repository.getProject(projectName) == null) {
					repository.addProject(project);
				}
			}
		}
	}

	
	public class CloudSyncMetadataListener implements IResourceChangeListener {
		private Repository repository;

		public CloudSyncMetadataListener(Repository repository) {
			this.repository = repository;
		}

		public void resourceChanged(IResourceChangeEvent event) {
			try {
				event.getDelta().accept(new IResourceDeltaVisitor() {
					public boolean visit(IResourceDelta delta) throws CoreException {
						CloudSyncMetadataListener.this.repository.metadataChanged(delta);
						return true;
					}
				});
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	public class CloudSyncResourceListener implements IResourceChangeListener {
		private Repository repository;

		public CloudSyncResourceListener(Repository repository) {
			this.repository = repository;
		}

		public void resourceChanged(IResourceChangeEvent event) {
			try {
				event.getDelta().accept(new IResourceDeltaVisitor() {
					public boolean visit(IResourceDelta delta) throws CoreException {
						CloudSyncResourceListener.this.repository.resourceChanged(delta);
						return true;
					}
				});
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
}
