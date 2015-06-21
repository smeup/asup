/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.smeup.sys.dk.source.jdt;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QProjectDef;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.dk.source.QSourceNode;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;

public class JDTSourceManagerImpl implements QSourceManager {

	public static int EVENT_CREATE_ENTRY = 30;
	public static int EVENT_BUILD_ENTRY = 40;
	public static int EVENT_INSTALL_ENTRY = 60;

	private String bundlePath;
	private ResourceSet resourceSet;

	public JDTSourceManagerImpl() {
		this("asup-src");
	}

	public JDTSourceManagerImpl(String bundlePath) {
		ResourcesPlugin.getWorkspace().getDescription().setAutoBuilding(false);
		this.bundlePath = bundlePath;
		this.resourceSet = new ResourceSetImpl();
	}

	@Override
	public QProject createProject(QContext context, QProjectDef projectDef, boolean replace) throws IOException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectDef.getName());
		if (project.exists() && !replace)
			throw new IOException("Project already exists: " + projectDef.getName());

		if (project.exists() && replace)
			try {
				project.delete(true, null);
			} catch (CoreException e) {
				throw new IOException(e);
			}

		try {
			JDTProjectUtil.createAsupProject(project, projectDef);
		} catch (CoreException e) {
			throw new IOException(e);
		}

		return new JDTProjectAdapter(project);
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry createObjectEntry(QContext context, String project, Class<T> type, String name, boolean replace, T content) throws IOException {

		QSourceEntry sourceEntry = createObjectEntry(context, project, type, name, replace);

		OutputStream stream = sourceEntry.getOutputStream();
		writeToStream((EObject) content, stream);
		stream.close();

		return sourceEntry;
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry createObjectEntry(QContext context, String projectName, Class<T> type, String name, boolean replace) throws IOException {
		QProject project = getProject(context, projectName);
		
		return createEntry(project, type, name + ".XMI", replace);
	}

	@Override
	public QSourceEntry createChildEntry(QContext context, QSourceNode parent, String name, boolean replace) throws IOException {
		return createEntry(parent, null, name, replace);
	}

	@Override
	public QProject getProject(QContext context, String projectName) {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		IResource resource = root.findMember(projectName);
		if (resource == null || !resource.exists() || !(resource instanceof IProject))
			return null;

		IProject project = (IProject) resource;

/*		try {
			project.refreshLocal(IContainer.DEPTH_INFINITE, null);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		return new JDTProjectAdapter(project);
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry getObjectEntry(QContext context, String project, Class<T> type, String name) {

		QProject projectEntry = getProject(context, project);
		if (projectEntry == null)
			return null;
		
		return getChildEntry(context, projectEntry, type, name + ".XMI");
	}

	@Override
	public QSourceEntry getChildEntry(QContext context, QSourceNode parent, String name) {
		return getChildEntry(context, parent, null, name);
	}

	@Override
	public List<QProject> listProjects(QContext context) {

		List<QProject> projects = new ArrayList<QProject>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (IProject project : root.getProjects()) {
			projects.add(new JDTProjectAdapter(project));
		}
		return projects;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends QObjectNameable> List<QSourceEntry> listObjectEntries(QContext context, String projectName, Class<T> type, String nameFilter) {
		QProject project = getProject(context, projectName);
		if (project == null)
			return (List<QSourceEntry>) Collections.EMPTY_LIST;

		return listChildEntries(context, project, type, nameFilter);
	}

	@Override
	public List<QSourceEntry> listChildEntries(QContext context, QSourceNode parent) {
		return listChildEntries(context, parent, null, null);
	}

	@Override
	public void refreshEntry(QContext context, QSourceEntry entry) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (IContainer container : root.findContainersForLocationURI(entry.getLocation())) {
			try {
				container.refreshLocal(IContainer.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void removeEntry(QContext context, QSourceEntry entry) throws IOException {
		assert entry != null;

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(entry.getProject().getName());

		java.net.URI location = entry.getLocation(); // URIUtil.removeFileExtension(entry.getLocation());
		location = URIUtil.makeRelative(location, entry.getProject().getLocation());

		IFile file = project.getFile(location.getRawPath());

		if (file.exists()) {
			try {
				file.delete(true, null);
			} catch (CoreException e) {
				throw new IOException(e);
			}
		}
	}

	private <T extends QObjectNameable> QSourceEntry createEntry(QSourceNode parent, Class<T> type, String name, boolean replace) throws IOException {

		IFolder folder = getFolder(parent, type, true);
		IFile file = folder.getFile(name);
		if (file.exists() && !replace)
			throw new IOException("Source entry already exists: " + file.getLocation());

		if (file.exists() && replace) {
			try {
				file.delete(true, null);
			} catch (CoreException e) {
				throw new IOException(e);
			}
		}

		if (!file.exists()) {
			try {
				mkDirs(file);
				file.create(null, true, null);
			} catch (CoreException e) {
				throw new IOException(e);
			}
		}

		return new JDTSourceEntryFileAdapter(parent.getProject(), file);
	}

	private <T extends QObjectNameable> QSourceEntry getChildEntry(QContext context, QSourceNode parent, Class<T> type, String name) {
		IFolder folder = getFolder(parent, type, true);
		if (folder == null)
			return null;

		IFile file = folder.getFile(name);
		if (!file.exists())
			return null;

		return new JDTSourceEntryFileAdapter(parent.getProject(), file);
	}

	private <T extends QObjectNameable> List<QSourceEntry> listChildEntries(QContext context, QSourceNode parent, Class<T> type, String nameFilter) {

		List<QSourceEntry> entries = new ArrayList<QSourceEntry>();
		IFolder folder = getFolder(parent, type, false);
		if (folder == null)
			return entries;

		try {
			for (IResource resource : folder.members()) {

				// file type
				if (!(resource instanceof IFile))
					continue;

				String resourceName = resource.getName();

				// XMI extension
				if (!resourceName.toUpperCase().endsWith(".XMI"))
					continue;

				// remove extension
				resourceName = resourceName.substring(0, resourceName.length() - 4);

				// filter by name
				if (nameFilter != null) {

					// starts
					if (nameFilter.endsWith("*")) {

						if (!resourceName.startsWith(nameFilter.substring(0, nameFilter.length() - 1)))
							continue;

					}
					// equals
					else if (!resourceName.equals(nameFilter))
						continue;

				}

				entries.add(new JDTSourceEntryFileAdapter(parent.getProject(), (IFile) resource));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return entries;
	}

	private <T extends QObjectNameable> IFolder getFolder(QSourceNode parent, Class<T> type, boolean create) {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(parent.getProject().getName());
		
		// TODO da eliminare
		if (parent.isRoot() && type == null)
			return project.getFolder("src");

		java.net.URI location = URIUtil.removeFileExtension(parent.getLocation());

		if (type != null) {
			location = URIUtil.append(location, bundlePath);
			location = URIUtil.append(location, getFolderName(type));
		}

		location = URIUtil.makeRelative(location, parent.getProject().getLocation());

		IFolder folder = project.getFolder(location.toString());
		if (!folder.exists() && create) {
			try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				return null;
			}
		}
		if (!folder.exists())
			return null;

		return folder;
	}

	private void writeToStream(EObject object, OutputStream stream) throws IOException {

		// String uri =
		// "asup://"+job.getSystem().getName()+"/"+container+"/"+klass.getSimpleName().toLowerCase().substring(1);
		URI uri = EcoreUtil.getURI(object);

		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(object);

		resource.save(stream, Collections.EMPTY_MAP);
	}

	private <T extends QObjectNameable> String getFolderName(Class<T> type) {
		return type.getSimpleName().substring(1);
	}

	private void mkDirs(IFile file) throws CoreException {

		IContainer parent = file.getParent();
		if (parent != null && parent instanceof IFolder && !parent.exists()) {

			Stack<IFolder> parents = new Stack<>();
			while (parent != null && parent instanceof IFolder && !parent.exists()) {
				parents.push((IFolder) parent);
				parent = parent.getParent();
			}

			while (!parents.isEmpty()) {
				IFolder folder = parents.pop();
				folder.create(true, true, null);
			}
		}
	}
}