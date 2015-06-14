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
package org.smeup.sys.os.file.jdt;

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
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMembered;

public class JDTFileMemberManagerImpl implements QFileMemberManager {

	@Inject
	private QSourceManager sourceManager;

	@Override
	public List<QFileMember> list(QJob job, String library, QFileMembered file) {

		QSourceEntry fileEntry = sourceManager.getObjectEntry(job.getContext(), library, QFile.class, file.getName());

		List<QSourceEntry> entries = sourceManager.listChildEntries(job.getContext(), fileEntry);

		ResourceSet resSet = new ResourceSetImpl();
		List<QFileMember> members = new ArrayList<QFileMember>();
		for (QSourceEntry entry : entries)
			try {
				Resource resource = resSet.createResource(URI.createURI(fileEntry.getLocation().toString()));
				resource.load(entry.getInputStream(), null);
				members.add((QFileMember) resource.getContents().get(0));

			} catch (IOException e) {
				e.printStackTrace();
			}
		return members;
	}

	@Override
	public QFileMember lookup(QJob job, String library, QFileMembered file, String name) {

		QSourceEntry sourceFile = sourceManager.getObjectEntry(job.getContext(), library, QFile.class, file.getName());
		if (sourceFile == null)
			return null;

		QSourceEntry sourceMember = sourceManager.getChildEntry(job.getContext(), sourceFile, name);
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
		return fileMember;
	}
}