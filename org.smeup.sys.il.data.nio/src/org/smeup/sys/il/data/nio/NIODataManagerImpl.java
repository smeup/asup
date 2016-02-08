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
package org.smeup.sys.il.data.nio;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.meta.QCardinality;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QFrameManager;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaFactory;
import org.smeup.sys.il.core.meta.QSlot;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QScrollerDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.data.term.QDataTerm;

public class NIODataManagerImpl implements QDataManager {

	@Inject
	private QFrameManager frameManager;

	@Override
	public QDataContext createDataContext(QContext context) {

		NIODataContextImpl nioDataContextImpl = new NIODataContextImpl(context);
		
		return nioDataContextImpl;
	}

	@Override
	public QDataContainer createDataContainer(QDataContext dataContext, Map<String, QDataTerm<?>> dataTerms) {
		return new NIODataContainerImpl((NIODataContextImpl) dataContext, dataTerms);
	}

	@Override
	public QDataContainer createDataContainer(QContext context, Map<String, QDataTerm<?>> dataTerms) {
		return new NIODataContainerImpl(new NIODataContextImpl(context), dataTerms);
	}

	@Override
	public QDataContainer createDataContainer(QContext context, QObject object, EClass term) {

		QFrame<?> frame = frameManager.getFrame(object);

		Map<String, QDataTerm<?>> dataTerms = buildDataTerms(frame, frameManager.getFrame(term));

		return new NIODataContainerImpl(new NIODataContextImpl(context), dataTerms);
	}

	@Override
	public void validateDataContainer(QDataContainer dataContainer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings({ "unchecked" })
	private <DD extends QDataDef<?>> Map<String, QDataTerm<?>> buildDataTerms(QFrame<?> frame, QFrame<?> term) {

		Map<String, QDataTerm<?>> dataTerms = new LinkedHashMap<String, QDataTerm<?>>();

		for (QSlot slot : frame.getSlots()) {

			// cardinality
			QCardinality cardinality = slot.getCardinality();

			if (cardinality.isMultiple())
				continue;

//			if (slot.getName().equals("content"))
//				continue;

			if (slot.getName().equals("source"))
				continue;

			// dataDef
			DD dataDef = (DD) buildDataDef(slot);

			// dataTerm
			QDataTerm<DD> dataTerm = (QDataTerm<DD>) frameManager.createObject(term);

			// multiple
			if (cardinality.isMultiple())
				if (dataDef instanceof QUnaryAtomicBufferedDataDef) {
					QScrollerDef<?> scrollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createScrollerDef();
					scrollerDef.setDimension(cardinality.getMax());
					scrollerDef.setArgument((QUnaryAtomicBufferedDataDef<?>) dataDef);
					dataDef = (DD) scrollerDef;

				} else if (dataDef instanceof QCompoundDataDef) {
					QStrollerDef<?> strollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createStrollerDef();
					strollerDef.setDimension(cardinality.getMax());
					dataDef = (DD) strollerDef;

				} else
					throw new RuntimeException("Unexpected condition dwe765lkdg87dsfsd0 " + dataDef);

			// name
			dataTerm.setName(slot.getName());

			// definition
			dataTerm.setDefinition(dataDef);

			// default
			if (slot.getDefaultValue() != null && !slot.getDefaultValue().toString().isEmpty()) {
				QDefault default_ = QIntegratedLanguageCoreMetaFactory.eINSTANCE.createDefault();
				if (dataTerm.getDataTermType().isUnary())
					default_.setValue(slot.getDefaultValue().toString());
				else
					default_.getValues().add(slot.getDefaultValue().toString());
			}

			dataTerms.put(slot.getName(), dataTerm);
		}

		return dataTerms;
	}

	private QDataDef<?> buildDataDef(QSlot slot) {

		QDataDef<?> dataDef = (QDataDef<?>) slot.getValue(QIntegratedLanguageDataPackage.eNS_PREFIX);
		if (dataDef == null) {

			// TODO build dataDef from java primitive
			QCharacterDef characterDefinition = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
			characterDefinition.setLength(slot.getName().length());

			dataDef = characterDefinition;
		}
		return dataDef;
	}
}