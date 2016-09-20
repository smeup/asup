/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.common.util.Enumerator;
import org.smeup.sys.co.core.QOutputWrapper;
import org.smeup.sys.co.shell.QCommunicationShellPackage;
import org.smeup.sys.co.shell.QShellOutputWrapper;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.core.QObjectRegistry;
import org.smeup.sys.il.core.QObjectRegistryFactory;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QFrameManager;
import org.smeup.sys.il.core.meta.QSlot;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.mi.core.util.QStrings;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobReference;

public class BaseShellObjectWriterImpl implements QObjectWriter {

	@Inject
	private QJob job;
	@Inject
	private QJobCapability jobCapability;
	@Inject
	private QDataManager dataManager;
	@Inject
	private QFrameManager frameManager;
	@Inject
	private QStrings strings;
	@Inject
	private QObjectRegistryFactory objectRegistryFactory;;

	private QFrame<?> qFrame = null;
	private QDataContainer dataContainer = null;
	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	private QOutputWrapper outputWrapper;

	@PostConstruct
	private void init() {
		QObjectRegistry<QShellOutputWrapper> shellOutputWrapperRegistry = objectRegistryFactory.createObjectRegistry(QShellOutputWrapper.class);

		for (QShellOutputWrapper shellOutputWrapper : shellOutputWrapperRegistry.list()) {
			if (shellOutputWrapper.contains(jobCapability)) {
				outputWrapper = shellOutputWrapper;
				break;
			}
		}
	}

	@Override
	public synchronized void write(QObject object) throws IOException {

		QFrame<?> qFrame = frameManager.getFrame(object);

		// dataContext changed
		if (this.qFrame == null || !this.qFrame.getName().equals(qFrame.getName())) {
			streamWrite("\n");

			this.qFrame = qFrame;
			dataContainer = dataManager.createDataContainer(job.getContext(), object, QCommunicationShellPackage.eINSTANCE.getShellData());

			for (QDataTerm<?> dataTerm : dataContainer.getTerms()) {

				QData data = dataContainer.getData(dataTerm);
				if (data instanceof QString) {
					data.accept(dataWriter.set(strings.firstToUpper(dataTerm.getName())));
					streamWrite(data + "|");
				} else if (data instanceof QNumeric) {
					QCharacter character = dataContainer.getDataContext().getDataFactory().createCharacter(((QDecimalDef) dataTerm.getDefinition()).getPrecision(), false, true);
					character.move(strings.firstToUpper(dataTerm.getName()));
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
			} else if (value instanceof Enumerator) {
				Enumerator eEnumerator = (Enumerator) value;
				data.accept(dataWriter.set(eEnumerator.getName()));
				streamWrite(data + "|");
			} else if (value instanceof Number) {
				if (dataTerm.getDefinition() instanceof QDecimalDef) {
					QDecimal decimal = dataContainer.getDataContext().getDataFactory().createData((QDecimalDef) dataTerm.getDefinition(), true);
					decimal.eval(((Number) value).doubleValue());
					streamWrite(strings.rSet(decimal.toString(), decimal.getLength()) + "|");
				} else {
					QCharacter character = dataContainer.getDataContext().getDataFactory().createCharacter(((QCharacterDef) dataTerm.getDefinition()).getLength(), false, true);
					character.move(value.toString());
					streamWrite(character + "|");
				}
			} else if (value instanceof QJobReference) {
				QJobReference jobReference = ((QJobReference) value);
				QCharacter character = dataContainer.getDataContext().getDataFactory().createCharacter(((QCharacterDef) dataTerm.getDefinition()).getLength(), false, true);
				character.eval(jobReference.getJobNumber() + "/" + jobReference.getJobUser() + "/" + jobReference.getJobName());
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
		outputWrapper.write(jobCapability, data);
	}

	private void streamFlush() throws IOException {
		outputWrapper.flush(jobCapability);
	}

	@Override
	public void initialize() {
		this.qFrame = null;
	}
}