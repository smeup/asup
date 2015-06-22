package org.smeup.sys.co.flux;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.flux.core.Repository;
import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.impl.ServiceRefImpl;


public class FluxServerConnectorHook extends ServiceRefImpl {

	@ComponentStarted
	public void start(QApplication application, QFluxServerConnectionConfig config) {

		initProjectConnections();		
		ResourcesPlugin.getWorkspace().addResourceChangeListener(new WorkspaceListener());
		
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
