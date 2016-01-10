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
import org.smeup.sys.co.shell.QCommunicationShellPackage;
import org.smeup.sys.co.shell.QShellOutputWrapper;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QFrameManager;
import org.smeup.sys.il.core.meta.QSlot;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.mi.core.util.QStrings;

public class BaseShellObjectWriterImpl implements QObjectWriter {

	@Inject
	private QShellOutputWrapper outputWrapper;
	@Inject
	private QDataManager dataManager;
	@Inject
	private QFrameManager frameManager;
	
	@Inject
	private QStrings strings;
	
	private QFrame<?> qFrame = null;

	private QDataContainer dataContainer = null;

	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	private QContext context;

	protected void setContext(QContext context) {
		this.context = context;
	}

	@Override
	public synchronized void write(QObject object) throws IOException {

		QFrame<?> qFrame = frameManager.getFrame(object);

		// dataContext changed
		if (this.qFrame == null || !this.qFrame.getName().equals(qFrame.getName())) {
			streamWrite("\n");

			this.qFrame = qFrame;
			dataContainer = dataManager.createDataContainer(context, object, QCommunicationShellPackage.eINSTANCE.getShellData());

			for (QDataTerm<?> dataTerm : dataContainer.getTerms()) {

				QData data = dataContainer.getData(dataTerm);
				if (data instanceof QString) {
					data.accept(dataWriter.set(strings.firstToUpper(dataTerm.getName())));
					streamWrite(data + "|");
				} else if (data instanceof QNumeric) {
					QCharacter character = dataContainer.getDataContext().getDataFactory().createCharacter(((QDecimalDef) dataTerm.getDefinition()).getPrecision(), false, true);
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

			QSlot slot = qFrame.getSlot(dataTerm.getName());
			Object value = qFrame.getValue(object, slot);

			if (value == null) {
				data.clear();
				streamWrite(data + "|");

				continue;
			}

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
				QCharacter character = null;
				if(dataTerm.getDefinition() instanceof QDecimalDef)
					character = dataContainer.getDataContext().getDataFactory().createCharacter(((QDecimalDef) dataTerm.getDefinition()).getPrecision(), false, true);
				else
					character = dataContainer.getDataContext().getDataFactory().createCharacter(((QCharacterDef) dataTerm.getDefinition()).getLength(), false, true);	
				character.move(value.toString());
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
		 * } else{ System.err.println("Unexpected condition 38sedr2q38se8756hrf"
		 * ); sysout.flush(); }
		 */
	}

	@Override
	public void initialize() {
		this.qFrame = null;
	}
}