package org.smeup.sys.co.flux;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.flux.core.Repository;

public class WorkspaceListener implements IResourceChangeListener{

	@Override
	public void resourceChanged(IResourceChangeEvent event) {

		switch (event.getType()) {
		
		case IResourceChangeEvent.POST_BUILD:
			
			break;
			
		case IResourceChangeEvent.POST_CHANGE:
			if (event.getResource() instanceof IProject) {
				IResourceDelta delta = event.getDelta();
				if (delta == null) {
					return;
				}
				if (delta.getKind() == IResourceDelta.REMOVED) {
					// Notify project remove
					IProject project = (IProject) event.getResource();
					
					//TODO: manage project deletion
					
				} else if (delta.getKind() == IResourceDelta.ADDED) {
					// Notify project added
					IProject project = (IProject) event.getResource();
					Repository repository = org.eclipse.flux.core.Activator.getDefault().getRepository();
					if (repository.getProject(project.getName()) == null) {
						repository.addProject(project);
					}
				}
			}
			
			break;	
		
		case IResourceChangeEvent.PRE_BUILD:
			
			break;	
		
		case IResourceChangeEvent.PRE_CLOSE:
			
			break;	
			
		case IResourceChangeEvent.PRE_DELETE:
				
				break;
	
		case IResourceChangeEvent.PRE_REFRESH:
		
		break;	
		
		}
	}

}
