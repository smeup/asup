/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import javax.inject.Inject;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QProjectDef;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.dk.source.QSourceNode;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.rt.core.QApplication;

public class JDTSourceManagerImpl implements QSourceManager {

	private String path;

	private QApplication application;

	@Inject
	public JDTSourceManagerImpl(QApplication application) {
		this(application, "asup-src");
	}

	public JDTSourceManagerImpl(QApplication application, String path) {
		this.path = path;
		this.application = application;

		ResourcesPlugin.getWorkspace().getDescription().setAutoBuilding(false);
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

		try {
			if(!project.isOpen())
				project.open(null);
		} catch (CoreException e) {
			throw new IOException(e);
		}

		return new JDTProjectAdapter(project);
	}

	@Override
	public void deleteProject(QContext context, QProject project) throws IOException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject iProject = root.getProject(project.getName());
		if (iProject.exists()) {
			try {
				iProject.delete(true, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry createObjectEntry(QContext context, String projectName, Class<T> type, String name, boolean replace, T content) throws IOException {

		QProject project = getProject(context, projectName);
		if (project == null)
			throw new IOException("Invalid project: " + projectName);

		return createObjectEntry(context, project, type, name, replace, content);
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry createObjectEntry(QContext context, QProject project, Class<T> klass, String name, boolean replace, T content) throws IOException {

		ByteArrayOutputStream output = getObjectSerializer(context).serialize(project, klass, name, content);

		QSourceEntry sourceEntry = createObjectEntry(context, project, klass, name, replace, new ByteArrayInputStream(output.toByteArray()));
		return sourceEntry;

	}

	@Override
	public <T extends QObjectNameable> QSourceEntry createObjectEntry(QContext context, String projectName, Class<T> type, String name, boolean replace, InputStream content) throws IOException {

		QProject project = getProject(context, projectName);
		if (project == null)
			throw new IOException("Invalid project: " + projectName);

		return createObjectEntry(context, project, type, name, replace, content);
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry createObjectEntry(QContext context, QProject project, Class<T> type, String name, boolean replace, InputStream content) throws IOException {
		return createEntry(context, project, type, name + ".XMI", replace, content);
	}

	@Override
	public QSourceEntry createChildEntry(QContext context, QSourceNode parent, String name, boolean replace, InputStream content) throws IOException {
		return createEntry(context, parent, null, name, replace, content);
	}

	@Override
	public QProject getProject(QContext context, String projectName) {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(projectName);
		if (resource == null || !resource.exists() || !(resource instanceof IProject))
			return null;

		IProject project = (IProject) resource;
		try {
			if(!project.isOpen())
				project.open(null);
		} catch (CoreException e) {
			return null;
		}

		/*
		 * try { project.refreshLocal(IContainer.DEPTH_INFINITE, null); } catch
		 * (CoreException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); }
		 */

		return new JDTProjectAdapter(project);
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry getObjectEntry(QContext context, String project, Class<T> type, String name) {

		QProject projectEntry = getProject(context, project);
		if (projectEntry == null)
			return null;

		return getObjectEntry(context, projectEntry, type, name);
	}

	@Override
	public <T extends QObjectNameable> QSourceEntry getObjectEntry(QContext context, QProject project, Class<T> type, String name) {
		return getChildEntry(context, project, type, name + ".XMI");
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

		return listObjectEntries(context, project, type, nameFilter);
	}

	@Override
	public <T extends QObjectNameable> List<QSourceEntry> listObjectEntries(QContext context, QProject project, Class<T> type, String nameFilter) {
		return listChildEntries(context, project, type, nameFilter);
	}

	@Override
	public List<QSourceEntry> listChildEntries(QContext context, QSourceNode parent) {
		return listChildEntries(context, parent, null, null);
	}

	@Override
	public void refreshNode(QContext context, QSourceNode node) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (IContainer container : root.findContainersForLocationURI(node.getLocation())) {
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

	private <T extends QObjectNameable> QSourceEntry createEntry(QContext context, QSourceNode parent, Class<T> type, String name, boolean replace, InputStream content) throws IOException {

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
				file.create(content, true, null);
			} catch (CoreException e) {
				throw new IOException(e);
			}
		}

		return new JDTSourceEntryFileAdapter(getObjectSerializer(context), parent.getProject(), file);
	}

	private <T extends QObjectNameable> QSourceEntry getChildEntry(QContext context, QSourceNode parent, Class<T> type, String name) {
		IFolder folder = getFolder(parent, type, true);
		if (folder == null)
			return null;

		IFile file = folder.getFile(name);
		if (!file.exists())
			return null;

		return new JDTSourceEntryFileAdapter(getObjectSerializer(context), parent.getProject(), file);
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

				entries.add(new JDTSourceEntryFileAdapter(getObjectSerializer(context), parent.getProject(), (IFile) resource));
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
		try {
			if(!project.isOpen())
				project.open(null);
		} catch (CoreException e) {
			return null;
		}

		// TODO da eliminare
		if (parent.isRoot() && type == null)
			return project.getFolder("src");

		java.net.URI location = URIUtil.removeFileExtension(parent.getLocation());

		if (type != null) {
			location = URIUtil.append(location, path);
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

	private <T extends QObjectNameable> String getFolderName(Class<T> type) {
		return type.getSimpleName().substring(1);
	}

	private void mkDirs(IResource file) throws CoreException {

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

	private JDTObjectSerializer getObjectSerializer(QContext context) {

		JDTObjectSerializer objectSerializer = context.get(JDTObjectSerializer.class);
		if (objectSerializer == null) {
			synchronized (context) {
				objectSerializer = context.get(JDTObjectSerializer.class);
				if (objectSerializer == null) {

					ResourceSetImpl resourceSet = new ResourceSetImpl();
					resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);

					Resource.Factory resourceFatory = new JDTResourceFactory();
					resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().put("asup", resourceFatory);

					objectSerializer = new JDTObjectSerializer(application, resourceSet);
					context.set(JDTObjectSerializer.class, objectSerializer);
				}
			}
		}
		return objectSerializer;
	}
}