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
import org.smeup.sys.il.core.meta.QCardinality;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaFactory;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.impl.DataTermVisitorImpl;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandContainer;
import org.smeup.sys.os.cmd.QCommandParameter;

public class NormalizeCommandsAction implements IObjectActionDelegate {

	private Shell shell;
	
	private Resource resource;
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
			
			for(QCommandParameter commandParameter: command.getParameters()) {
				commandParameter.getDataTerm().accept(new CommandsVisitor());
			}
		}
		
		try {
			this.resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			MessageDialog.openError(shell, "Save resource", e.getMessage());
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		action.setEnabled(false);		
		
		this.commandContainer = null;
		this.resource = null;
		
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
		
		this.resource = resource;
		
		return commandContainer;
	}
	
	private class CommandsVisitor extends DataTermVisitorImpl {

		@Override
		public boolean visit(QDataTerm<?> term) {
			
			if(term.isMandatory()) {
				System.out.println("\t"+term);
				
				QCardinality cardinality = term.getFacet(QCardinality.class);
				if(cardinality == null) {						
					cardinality = QIntegratedLanguageCoreMetaFactory.eINSTANCE.createCardinality();
					term.getFacets().add(cardinality);
				}
				
				if(cardinality.getMin()==0)
					cardinality.setMin(1);
				
				term.setMandatory(false);
			}
			
			if(term.getDefault() != null) {
				System.out.println("\t"+term);
				
				QDefault _default = term.getFacet(QDefault.class);
				if(_default == null) {
					_default = QIntegratedLanguageCoreMetaFactory.eINSTANCE.createDefault();
					term.getFacets().add(_default);
				}
				
				if(_default.getValue() == null) 
					_default.setValue(term.getDefault());

				term.setDefault(null);
			}
			
			return super.visit(term);
		}		
	}
}
