/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.co.shell.base;

import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.smeup.sys.co.shell.QCommunicationShellPackage;
import org.smeup.sys.co.shell.QShellOutputWrapper;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.java.QStrings;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.term.QDataTerm;

public class BaseShellObjectWriterImpl implements QObjectWriter {

	@Inject
	private QShellOutputWrapper outputWrapper;
	@Inject
	private QDataManager dataManager;
	@Inject
	private QStrings strings;

	private EClass eClass = null;
	private QDataContainer dataContainer = null;
	private QDataFactory dataFactory = null;

	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	private QContext context;

	protected void setContext(QContext context) {
		this.context = context;
	}
	
	@Override
	public synchronized void write(QObject object) throws IOException {

		EObject eObject = (EObject) object;
		EClass eClass = eObject.eClass();

		// dataContext changed
		if (this.eClass != eClass) {
			streamWrite("\n");

			this.eClass = eClass;
			dataContainer = dataManager.createDataContainer(context, object, QCommunicationShellPackage.eINSTANCE.getShellData());
			dataFactory = dataManager.createFactory(context);

			for (QDataTerm<?> dataTerm : dataContainer.getTerms()) {
				
				QData data = dataContainer.getData(dataTerm);
				if (data instanceof QString) {
					data.accept(dataWriter.set(strings.firstToUpper(dataTerm.getName())));
					streamWrite(data + "|");
				} else if (data instanceof QNumeric) {
					QCharacter character = dataFactory.createCharacter(dataTerm.getName().length(), false, true);
					character.eval(strings.firstToUpper(dataTerm.getName()));
					streamWrite(character + "|");
				} else
					streamWrite(strings.firstToUpper(dataTerm.getName()) + "|");
			}
			streamWrite("\n");
		}

		dataContainer.clearData();

		for (QDataTerm<?> dataTerm : dataContainer.getTerms()) {
			QData data = dataContainer.getData(dataTerm);

			Object value = eObject.eGet(eClass.getEStructuralFeature(dataTerm.getName()));
			if (value == null) {
				data.clear();
				streamWrite(data + "|");
				
				continue;
			}
			
			/*else if (value instanceof QCreationInfo) {
				QCreationInfo qCreationInfo = (QCreationInfo) value;
				data.accept(dataWriter.set(qCreationInfo.getCreationDate()));
				streamWrite(data + "|");
			}
			*/
			
			if (value instanceof QObjectNameable) {
				QObjectNameable qValue = (QObjectNameable) value;
				data.accept(dataWriter.set(qValue.getName()));
				streamWrite(data + "|");
			} else if (value instanceof QObject) {
				QObject qValue = (QObject) value;
				data.accept(dataWriter.set(qValue.toString()));
				streamWrite(data + "|");
			} else if (value instanceof Enumerator) {
				Enumerator eEnumerator = (Enumerator) value;
				data.accept(dataWriter.set(eEnumerator.getName()));
				streamWrite(data + "|");
			} else if (value instanceof Number) {
				QCharacter character = dataFactory.createCharacter(dataTerm.getName().length(), false, true);
				character.accept(dataWriter.set(value.toString()));
				streamWrite(character + "|");
			} else {
				data.accept(dataWriter.set(value.toString()));
				streamWrite(data + "|");
			}
		}

		streamWrite("\n");
		streamFlush();
	}

	@Override
	public void flush() {
		try {
			streamFlush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void streamWrite(String data) throws IOException {

		// if (outputWrapper.contains(contextID.getID())) {
		outputWrapper.write(context.getID(), data);
		/*
		 * } else { System.err.println("Unexpected condition 98sedr2q38sedhrf");
		 * sysout.write(data); }
		 */
	}

	private void streamFlush() throws IOException {

		// if (outputWrapper.contains(contextID.getID())) {
		outputWrapper.flush(context.getID());
		/*
		 * } else{
		 * System.err.println("Unexpected condition 38sedr2q38se8756hrf");
		 * sysout.flush(); }
		 */
	}

	@Override
	public void initialize() {

		this.eClass = null;
	}
}