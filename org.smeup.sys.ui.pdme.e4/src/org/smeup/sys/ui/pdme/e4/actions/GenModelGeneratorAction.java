package org.smeup.sys.ui.pdme.e4.actions;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class GenModelGeneratorAction implements IObjectActionDelegate {

	private Shell shell;
	private IFile ecoreFile;
	private IProject project;
	
	private Resource resource;
	
	/**
	 * Constructor for Action1.
	 */
	public GenModelGeneratorAction() {
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

		IPath ecoreLocation = ecoreFile.getLocation();

		String ecorePath = ecoreFile.getFullPath().toString();		
		
		String genModelName = ecorePath.substring(0, ecorePath.lastIndexOf("."));
		genModelName = genModelName.substring(genModelName.lastIndexOf("/")+1);
		String genModelLocation = ecorePath.substring(0, ecorePath.lastIndexOf(".")) + ".genmodel";

		GenModel genModel = createGenModel(resource, ecoreLocation, genModelName);
		writeGenModel(genModel, genModelLocation);
		
		
		MessageDialog.openInformation(
			shell,
			"As.UP",
			"Create genmodel file was executed.");
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
				this.ecoreFile = (IFile)object;		
				this.project = ecoreFile.getProject();
				try {	
					this.resource = loadEcore(ecoreFile);
				} catch (Exception e) {
					MessageDialog.openError(shell, "Load ecore file", e.getMessage());
				}
			}	
		}
		
		action.setEnabled(true);
		
	}
		

	private Resource loadEcore(IFile ecoreFile) throws IOException {
		
		ResourceSet resourceSet = new ResourceSetImpl(); 
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl()); 			 
	    URI uri = URI.createURI(ecoreFile.getLocationURI().toString());
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.EMPTY_MAP);	
		return resource;
	}
	
	private GenModel createGenModel(Resource resource, IPath ecoreLocation, String genModelName) {
		
		// Get root package
		EPackage rootPackage = (EPackage)resource.getContents().get(0);
	
		// Create genModel and initialize with referred ecore model
        GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
        genModel.getForeignModel().add(ecoreLocation.lastSegment());       
        genModel.initialize(Collections.singleton(rootPackage));

        // Set properties for GenModel	                
        genModel.setComplianceLevel(GenJDKLevel.JDK70_LITERAL);
        genModel.setCopyrightText("");
        genModel.setLanguage("EN");
        genModel.setModelName(genModelName + " genmodel");
        genModel.setModelDirectory(project.getName() + "/src");
        genModel.setModelPluginID(project.getName());
        genModel.setRootExtendsInterface("");
        genModel.setSuppressEMFTypes(true);
        genModel.setImportOrganizing(true);
        
        // Set properties for generated package
        GenPackage genPackage = (GenPackage)genModel.getGenPackages().get(0);
        genPackage.setPrefix(genModelName);
        genPackage.setBasePackage(project.getName().substring(0, project.getName().lastIndexOf('.')));
        
        genPackage.getEcorePackage().setName("");		//TODO
        genPackage.getEcorePackage().setNsPrefix(""); 	//TODO
        genPackage.getEcorePackage().setNsURI("");   	//TODO
        
        
        
        
        return genModel;

	 }
	
	
	
		
	 private void writeGenModel(GenModel genModel, final String genModelLocation) {
		 try {
	            org.eclipse.emf.common.util.URI genModelURI = URI.createFileURI(genModelLocation);
	            final XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
	            //genModelResource.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, Constants.GEN_MODEL_XML_ENCODING.getValue());
	            genModelResource.getContents().add(genModel);
	            genModelResource.save(Collections.EMPTY_MAP);
	        } catch (IOException e) {
	        	MessageDialog.openError(shell, "Write Gen Model", e.getMessage());
	        }

	 }


}
