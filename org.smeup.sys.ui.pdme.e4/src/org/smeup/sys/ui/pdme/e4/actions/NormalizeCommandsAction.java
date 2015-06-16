package org.smeup.sys.ui.pdme.e4.actions;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandContainer;

public class NormalizeCommandsAction implements IObjectActionDelegate {

	private Shell shell;
	
	private QCommandContainer commandContainer;
	
	/**
	 * Constructor for Action1.
	 */
	public NormalizeCommandsAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		for(QCommand command: commandContainer.getContents()) {
			System.out.println(command.getName());
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		action.setEnabled(false);		
		
		if(selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;

			Object object = treeSelection.getFirstElement();
			if(object instanceof IFile) {
				try {	
					this.commandContainer = loadEcore((IFile)object);
				} catch (Exception e) {
					MessageDialog.openError(shell, "Load commands file", e.getMessage());
				}
			}	
		}
		
		action.setEnabled(true);
		
	}
		
	private QCommandContainer loadEcore(IFile commandsFile) throws IOException {
		
		ResourceSet resourceSet = new ResourceSetImpl(); 
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl()); 			 
	    URI uri = URI.createURI(commandsFile.getLocationURI().toString());
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.EMPTY_MAP);
		
		QCommandContainer commandContainer = (QCommandContainer) resource.getContents().get(0);
		
		return commandContainer;
	}
}
