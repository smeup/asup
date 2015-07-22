package org.smeup.sys.co.flux.hook;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.flux.core.Repository;
import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.QApplication;


public class FluxConnectorHook {

	@ComponentStarted
	public void start(QApplication application) throws Exception {

		initProjectConnections();		
//		ResourcesPlugin.getWorkspace().addResourceChangeListener(new WorkspaceClientListener());		
		
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

}
