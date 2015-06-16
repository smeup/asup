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
package org.smeup.sys.dk.compiler.ibmi;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.inject.Inject;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.smeup.sys.dk.compiler.QUnitConverter;
import org.smeup.sys.dk.source.QSourceEntry;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.java.QStreams;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionException;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.flow.QSetupSection;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberRow;
import org.smeup.sys.os.pgm.QProgramSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CLUnitConverterImpl implements QUnitConverter {

	@Inject
	private QSourceManager sourceManager;
	@Inject
	private QStreams streams;

	@Override
	public QModule convertModule(QJob job, org.smeup.sys.os.module.QModule module) {
		return null;
	}

	@Override
	public QProgram convertProgram(QJob job, org.smeup.sys.os.pgm.QProgram program) {

		// lookup program source entry
		QSourceEntry programEntry = sourceManager.getObjectEntry(job.getContext(), program.getLibrary(), org.smeup.sys.os.pgm.QProgram.class, program.getName());
		if (programEntry == null)
			// TODO create and extract(materialize program source)
			throw new OperatingSystemRuntimeException("Null resource for object " + program.getName(), null);

		try {

			// extract and save
			InputStream inputStream = extractContent(program.getSource());
			QSourceEntry memberExtracted = sourceManager.createChildEntry(job.getContext(), programEntry, program.getName() + "_extracted.XML", true);
			streams.copy(inputStream, memberExtracted.getOutputStream());

			Document docFrom = loadDocument(memberExtracted.getInputStream());
			StringBuffer source = extractSource(job, docFrom);

			// save
			QSourceEntry memberSourced = sourceManager.createChildEntry(job.getContext(), programEntry, program.getName() + "_sourced.TXT", true);
			streams.copy(new ByteArrayInputStream(source.toString().getBytes("ISO-8859-1")), memberSourced.getOutputStream());

			QProgram flowProgram = QIntegratedLanguageFlowFactory.eINSTANCE.createProgram();
			flowProgram.setName(program.getName());

			// setup
			QSetupSection setupSection = QIntegratedLanguageFlowFactory.eINSTANCE.createSetupSection();
			setupSection.setExpressionType("CL");
			setupSection.setApplication(program.getApplication());
			flowProgram.setSetupSection(setupSection);

			XMICLProgramWriter clProgramWriter = new XMICLProgramWriter(flowProgram);
			clProgramWriter.writeProgram(source);

			return flowProgram;

		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	private StringBuffer extractSource(QJob job, Document document) throws ParserConfigurationException, SAXException, IOException, OperatingSystemRuntimeException,
	IntegratedLanguageExpressionException {

		StringBuffer src = null;

		// search reference
		NodeList nl = document.getElementsByTagName("reference");
		if (nl.getLength() > 0) {

			Element reference = (Element) nl.item(0);

			String fileName = reference.getAttribute("file");
			String memberName = reference.getAttribute("member");

			QSourceEntry source = null;
			for (String library : job.getLibraries()) {
				QSourceEntry file = sourceManager.getObjectEntry(job.getContext(), library, QFile.class, fileName);
				if (file == null)
					continue;

				source = sourceManager.getChildEntry(job.getContext(), file, memberName + ".XMI");
				if (source != null)
					break;
			}
			if (source == null)
				throw new IOException("Invalid SRC reference: " + fileName + "/" + memberName + ".XMI");

			Resource resource = new XMIResourceImpl();
			resource.load(source.getInputStream(), null);
			QFileMember qFileMember = (QFileMember) resource.getContents().get(0);

			src = loadMember(qFileMember);

		}

		return src;
	}

	private StringBuffer loadMember(QFileMember fileMember) throws FileNotFoundException, IOException, OperatingSystemRuntimeException, IntegratedLanguageExpressionException {

		StringBuffer source = new StringBuffer();

		String tmp = "";
		boolean trimL = false;
		for (QFileMemberRow qFileMemberRow : fileMember.getRows()) {

			// Manage row concatenation in source
			if (trimL)
				tmp += trimL(qFileMemberRow.getContent());
			else
				tmp += qFileMemberRow.getContent();

			trimL = false;

			if (tmp.endsWith("-"))
				tmp = tmp.substring(0, tmp.length() - 1);
			else if (tmp.endsWith("+")) {
				tmp = tmp.substring(0, tmp.length() - 1);
				trimL = true;
			} else {
				source.append(tmp).append(System.getProperty("line.separator"));
				tmp = "";
			}
		}

		return source;

	}

	public InputStream extractContent(QProgramSource programSource) throws UnsupportedEncodingException {

		String content = programSource.getContent().trim();
		// if(!content.startsWith("<?xml") && !content.startsWith("\n<?xml") )
		// content = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>"+content;

		byte[] programSourceContent = content.replaceAll("\n", "").getBytes("ISO-8859-1");

		InputStream stream = new ByteArrayInputStream(programSourceContent);

		return stream;
	}

	public static String trimL(String str) {
		int i = 0;
		while (i < str.length() && (Character.isWhitespace(str.charAt(i)) || str.charAt(i) == 0))
			i++;
		return str.substring(i);
	}

	public static Document loadDocument(java.io.InputStream input) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(input);
	}
}
