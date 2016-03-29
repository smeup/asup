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
package org.smeup.sys.os.file.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMembered;

public class BaseFileMemberManagerImpl implements QFileMemberManager {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QSourceManager sourceManager;

	@Override
	public List<QFileMember> list(QContextProvider contextProvider, QFileMembered file) {

		QSourceEntry fileEntry = sourceManager.getObjectEntry(contextProvider.getContext(), file.getLibrary(), QFile.class, file.getName());

		List<QSourceEntry> entries = sourceManager.listChildEntries(contextProvider.getContext(), fileEntry);

		ResourceSet resSet = new ResourceSetImpl();
		List<QFileMember> members = new ArrayList<QFileMember>();
		for (QSourceEntry entry : entries)
			try {
				Resource resource = resSet.createResource(URI.createURI(fileEntry.getLocation().toString()));
				resource.load(entry.getInputStream(), null);
				QFileMember fileMember = (QFileMember) resource.getContents().get(0);
				fileMember.setFile(file);
				members.add(fileMember);

			} catch (IOException e) {
				e.printStackTrace();
			}
		return members;
	}

	@Override
	public QFileMember lookup(QContextProvider contextProvider, String resource, String file, String name) {

		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(contextProvider, QFile.class, resource);
		QFile qFile = fileReader.lookup(file);
		if (qFile == null)
			return null;
		
		return lookup(contextProvider, (QFileMembered) qFile, name);
	}

	@Override
	public QFileMember lookup(QContextProvider contextProvider, QFileMembered file, String name) {

		QSourceEntry sourceFile = sourceManager.getObjectEntry(contextProvider.getContext(), file.getLibrary(), QFile.class, file.getName());
		if (sourceFile == null)
			return null;

		QSourceEntry sourceMember = sourceManager.getChildEntry(contextProvider.getContext(), sourceFile, name + ".XMI");
		if (sourceMember == null)
			return null;

		QFileMember fileMember = null;
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(sourceFile.getLocation().toString()));

		try {
			resource.load(sourceMember.getInputStream(), null);
			fileMember = (QFileMember) resource.getContents().get(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		fileMember.setFile(file);
		return fileMember;
	}

	@Override
	public QFileMember lookup(QContextProvider contextProvider, Scope scope, String library, String file, String name) {

		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(contextProvider, QFile.class, scope, library);
		if(fileReader == null)
			return null;
		
		QFileMember fileMember = null;
		try (QObjectIterator<QFile> fileList = fileReader.find(file);) {
			while (fileList.hasNext()) {
				QFile qFile = fileList.next();
				fileMember = lookup(contextProvider, (QFileMembered) qFile, name);
				if (fileMember != null)
					break;
			}
		}

		return fileMember;
	}

	@Override
	public boolean delete(QContextProvider contextProvider, QFileMembered file, String member) {

		QSourceEntry sourceFile = sourceManager.getObjectEntry(contextProvider.getContext(), file.getLibrary(), QFile.class, file.getName());
		if (sourceFile == null)
			return false;

		QSourceEntry sourceMember = sourceManager.getChildEntry(contextProvider.getContext(), sourceFile, member + ".XMI");
		if (sourceMember == null)
			return false;

		try {
			sourceManager.removeEntry(contextProvider.getContext(), sourceMember);
			return true;
		} catch (IOException e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}
}