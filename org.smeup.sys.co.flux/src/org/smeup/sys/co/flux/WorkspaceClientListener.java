package org.smeup.sys.co.flux;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.flux.core.Repository;

public class WorkspaceClientListener implements IResourceChangeListener {

	private boolean log = true;

	@Override
	public void resourceChanged(IResourceChangeEvent event) {

		switch (event.getType()) {

		case IResourceChangeEvent.POST_BUILD:

			break;

		case IResourceChangeEvent.POST_CHANGE:
			if (event.getSource() instanceof IWorkspace) {
				IResourceDelta delta = event.getDelta();
				try {
					delta.accept(new DeltaVisitor());
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else
				"".toCharArray();

			break;

		case IResourceChangeEvent.PRE_BUILD:

			break;

		case IResourceChangeEvent.PRE_CLOSE:

			break;

		case IResourceChangeEvent.PRE_DELETE:

			break;

		case IResourceChangeEvent.PRE_REFRESH:

			break;
		default:
			"".toCharArray();

		}
	}

	class DeltaVisitor implements IResourceDeltaVisitor {
		public boolean visit(IResourceDelta delta) {

			IResource resource = delta.getResource();

			String type = "";
			switch (resource.getType()) {

			case IResource.ROOT:
				type = "WORKSPACE";
				break;

			case IResource.PROJECT:
				type = "PROJECT";
				break;

			case IResource.FILE:
				type = "FILE";
				break;

			case IResource.FOLDER:
				type = "FOLDER";
				break;

			default:
				"".toCharArray();
			}

			switch (delta.getKind()) {

			case IResourceDelta.ADDED:
				if (log)
					System.out.println("ADDED " + type + ": " + delta.toString());

				if (delta.getResource().getType() == IResource.PROJECT) {
					IProject project = (IProject) delta.getResource();
					Repository repository = org.eclipse.flux.core.Activator.getDefault().getRepository();
					if (repository.getProject(project.getName()) == null) {
						repository.addProject(project);
					}
				}

				break;
			case IResourceDelta.REMOVED:
				if (log)
					System.out.println("REMOVED " + type + ": " + delta);
				break;
			case IResourceDelta.CHANGED:
				if (log)
					System.out.println("CHANGED " + type + ": " + delta);
				break;
			default:
				"".toCharArray();				
			}
			return true;
		}
	}

}
