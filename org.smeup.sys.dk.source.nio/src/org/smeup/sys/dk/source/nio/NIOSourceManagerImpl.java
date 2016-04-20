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
package org.smeup.sys.dk.source.nio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.smeup.sys.dk.source.QDevelopmentKitSourceFactory;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QProjectDef;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.dk.source.QSourceNode;
import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QLogger;

public class NIOSourceManagerImpl implements QSourceManager {

	@Inject
	private QLockManager lockManager;
	@Inject
	private QLogger logger;

	private QApplication application;
	private String path;
	private String relativePath;

	@Inject
	public NIOSourceManagerImpl(QApplication application) {
		this(application, "asup-src");
	}

	public NIOSourceManagerImpl(QApplication application, String path) {
		String instanceArea = System.getProperty("osgi.instance.area");
		this.path = URI.create(instanceArea).getPath();
		//TODO: patch da eliminare
		if (this.path.charAt(2) == ':') this.path = this.path.substring(1);
		this.relativePath = path;
		this.application = application;
	}

	@PostConstruct
	@SuppressWarnings("resource")
	private void init() {

		QContext applicationContext = application.getContext();
		QContextDescription applicationContextDescription = applicationContext.getContextDescription();
		QProject rootProject = getProject(applicationContext, applicationContextDescription.getSystemLibrary());
		if (rootProject == null) {
			QProjectDef projectDef = QDevelopmentKitSourceFactory.eINSTANCE.createProjectDef();
			projectDef.setName(applicationContextDescription.getSystemLibrary());
			projectDef.setText("As.UP System Library");
			try {
				createProject(applicationContext, projectDef, false);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public QProject createProject(QContext context, QProjectDef projectDef, boolean replace) throws IOException {

		Path project = Paths.get(path, projectDef.getName());

		QObjectLocker<QProject> projectLocker = lockManager.getLocker(context, project.toUri());
		projectLocker.lock(LockType.WRITE);

		try {
			boolean exists = Files.exists(project);
			if (exists && !replace)
				throw new IOException("Project already exists: " + projectDef.getName());

			if (exists)
				deletePath(project);

			project = Files.createDirectories(project);

			UserDefinedFileAttributeView view = Files.getFileAttributeView(project, UserDefinedFileAttributeView.class);
			view.write("text", Charset.defaultCharset().encode(projectDef.getText()));

		} finally {
			projectLocker.unlock(LockType.WRITE);
		}

		return new NIOProjectAdapter(project);
	}

	@Override
	public void deleteProject(QContext context, QProject qProject) throws IOException {

		Path project = Paths.get(qProject.getLocation());
		if (!Files.exists(project))
			return;

		QObjectLocker<QProject> projectLocker = lockManager.getLocker(context, project.toUri());
		projectLocker.lock(LockType.WRITE);

		try {
			deletePath(project);
		} finally {
			projectLocker.unlock(LockType.WRITE);
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

		if (!name.equals(content.getName()))
			throw new IOException("Invalid name: " + name);

		ByteArrayOutputStream output = getObjectSerializer(context).serialize(project, klass, name, content);

		return createObjectEntry(context, project, klass, name, replace, new ByteArrayInputStream(output.toByteArray()));
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

		Path project = Paths.get(path, projectName);
		if (!Files.exists(project))
			return null;

		return new NIOProjectAdapter(project);
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

		// return
		// Files.list(Paths.get(path)).sorted().filter(p->Files.isDirectory(p)).map(p->
		// new NIOProjectAdapter(p)).collect(Collectors.toList());

		try {
			List<QProject> projects = new ArrayList<QProject>();
			for (Path path : Files.newDirectoryStream(Paths.get(path))) {
				if (Files.isDirectory(path))
					projects.add(new NIOProjectAdapter(path));
			}

			Collections.sort(projects, new Comparator<QProject>() {
				@Override
				public int compare(QProject o1, QProject o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			return projects;
		} catch (IOException e) {
			throw new IntegratedLanguageCoreRuntimeException(e);
		}
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
	public void removeEntry(QContext context, QSourceEntry entry) throws IOException {

		Path file = Paths.get(entry.getLocation());

		if (!Files.exists(file))
			return;

		QObjectLocker<QProject> fileLocker = lockManager.getLocker(context, file.toUri());
		fileLocker.lock(LockType.WRITE);

		try {
			deletePath(file);
		} finally {
			fileLocker.unlock(LockType.WRITE);
		}

	}

	private <T extends QObjectNameable> QSourceEntry createEntry(QContext context, QSourceNode parent, Class<T> type, String name, boolean replace, InputStream content) throws IOException {

		Path file = getFolder(context, parent, type, true).resolve(name);

		QObjectLocker<QProject> fileLocker = lockManager.getLocker(context, file.toUri());
		fileLocker.lock(LockType.WRITE);

		try {
			boolean exists = Files.exists(file);
			if (exists && !replace)
				throw new IOException("Source entry already exists: " + file.toUri());

			if (exists)
				Files.copy(content, file, StandardCopyOption.REPLACE_EXISTING);
			else {
				if (!Files.exists(file.getParent()))
					Files.createDirectories(file.getParent());
				
				Files.copy(content, file);
			}

		} finally {
			fileLocker.unlock(LockType.WRITE);
		}

		return new NIOSourceEntryFileAdapter(getObjectSerializer(context), parent.getProject(), file);
	}

	private <T extends QObjectNameable> QSourceEntry getChildEntry(QContext context, QSourceNode parent, Class<T> type, String name) {

		Path folder = getFolder(context, parent, type, false);
		if (folder == null)
			return null;

		Path file = folder.resolve(name);
		if (!Files.exists(file))
			return null;

		return new NIOSourceEntryFileAdapter(getObjectSerializer(context), parent.getProject(), file);
	}

	private <T extends QObjectNameable> List<QSourceEntry> listChildEntries(QContext context, QSourceNode parent, Class<T> type, String nameFilter) {

		List<QSourceEntry> entries = new ArrayList<QSourceEntry>();
		Path folder = getFolder(context, parent, type, false);
		if (folder == null)
			return entries;

		try {
			for (Path path : Files.newDirectoryStream(folder)) {
				if (Files.isDirectory(path))
					continue;

				String resourceName = path.getFileName().toString();

				// XMI extension
				if (!resourceName.endsWith(".XMI"))
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

				entries.add(new NIOSourceEntryFileAdapter(getObjectSerializer(context), parent.getProject(), path));

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Collections.sort(entries, new Comparator<QSourceEntry>() {

			@Override
			public int compare(QSourceEntry o1, QSourceEntry o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		return entries;
	}

	private <T extends QObjectNameable> Path getFolder(QContext context, QSourceNode parent, Class<T> type, boolean create) {

		java.net.URI location = URIUtil.removeFileExtension(parent.getLocation());

		if (type != null) {
			location = URIUtil.append(location, relativePath);
			location = URIUtil.append(location, type.getSimpleName().substring(1));
		}

		Path folder = Paths.get(location);
		if (Files.exists(folder))
			return folder;

		if (!create)
			return null;

		try {
			Files.createDirectories(folder);
		} catch (FileAlreadyExistsException e) {
			return folder;
		} catch (IOException e) {
			logger.error(e);
			return null;
		}

		return folder;
	}

	private NIOObjectSerializer getObjectSerializer(QContext context) {

		NIOObjectSerializer objectSerializer = context.get(NIOObjectSerializer.class);
		if (objectSerializer == null) {
			synchronized (context) {
				objectSerializer = context.get(NIOObjectSerializer.class);
				if (objectSerializer == null) {

					ResourceSetImpl resourceSet = new ResourceSetImpl();
					resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);

					Resource.Factory resourceFatory = new NIOResourceFactory();
					resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().put("asup", resourceFatory);

					objectSerializer = new NIOObjectSerializer(application, resourceSet);
					context.set(NIOObjectSerializer.class, objectSerializer);
				}
			}
		}
		return objectSerializer;
	}

	private void deletePath(Path path) throws IOException {
		Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				Files.delete(file);
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				Files.delete(dir);
				return FileVisitResult.CONTINUE;
			}

		});
	}
}
