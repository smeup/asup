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

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaFactory;
import org.smeup.sys.il.core.term.QNode;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermFactory;
import org.smeup.sys.il.data.term.QOverlay;
import org.smeup.sys.il.data.term.impl.DataTermImpl;

public class NIODataContainerImpl extends ObjectImpl implements QDataContainer, Serializable {

	private static final long serialVersionUID = 1L;

	private QDataContext dataContext;

	private Map<String, QDataTerm<?>> dataTerms;

	private Map<String, QData> datas;
	private long memorySize = 0;

	protected NIODataContainerImpl(NIODataContextImpl dataContext, Map<String, QDataTerm<?>> dataTerms) {
		this.dataTerms = dataTerms;
		this.datas = new HashMap<String, QData>();
		this.dataContext = dataContext;
	}

	@Override
	public void close() {
		this.dataContext = null;
		this.datas = new HashMap<String, QData>();
		this.dataTerms = new HashMap<String, QDataTerm<?>>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public QDataTerm<?> createDataTerm(String name, Type type, List<Annotation> annotations) {

		if (annotations == null)
			annotations = new ArrayList<Annotation>();

		QDataTerm<QDataDef<?>> dataTerm = new DataTermImpl<QDataDef<?>>() {
			private static final long serialVersionUID = 1L;
		};

		dataTerm.setName(name);

		dataTerm.setDefinition(getDataContext().getDataFactory().createDataDef(type, annotations));

		for (Annotation annotation : annotations) {
			if (annotation instanceof DataDef) {
				DataDef dataDef = (DataDef) annotation;

				QDefault _default = QIntegratedLanguageCoreMetaFactory.eINSTANCE.createDefault();
				if (!dataDef.value().isEmpty())
					_default.setValue(dataDef.value());
				else
					_default.getValues().addAll(Arrays.asList(dataDef.values()));

				if (!_default.isEmpty())
					dataTerm.setDefault(_default);

				if (!dataDef.based().isEmpty())
					dataTerm.setBased(dataDef.based());
			}

			if (annotation instanceof Overlay) {
				Overlay overlay = (Overlay) annotation;
				QOverlay qOverlay = QIntegratedLanguageDataTermFactory.eINSTANCE.createOverlay();
				// TODO remove lowerCase
				qOverlay.setName(overlay.name().toLowerCase());
				qOverlay.setPosition(overlay.position());
				dataTerm.getFacets().add(qOverlay);
			}
		}

		this.dataTerms.put(name, dataTerm);

		QData previousData = this.datas.remove(name);
		if (previousData != null) {

			// remove child data
			if (previousData instanceof QStruct<?>) {
				for (Field field : NIOStructHelper.getFields((Class<? extends QStruct<?>>) previousData.getClass())) {
					if (QData.class.isAssignableFrom(field.getType()))
						datas.remove(field.getName());
				}
			}

			if (previousData instanceof QBufferedData) {
				QData data = createData(dataTerm, false);
				QOverlay overlay = dataTerm.getFacet(QOverlay.class);
				if (overlay == null) {
					overlay = QIntegratedLanguageDataTermFactory.eINSTANCE.createOverlay();
					overlay.setName("*PREVIOUS");
					dataTerm.getFacets().add(overlay);
				}

				((QBufferedData) previousData).assign((QBufferedData) data);
				datas.put(name, data);
			}
		}

		return dataTerm;
	}

	@Override
	public QData getData(String name) {

		String[] qualifiers = name.split("\\.");

		QData data = null;
		for (String qualifier : qualifiers) {

			int index = 0;
			int i = qualifier.indexOf("(");
			if (i > 0) {
				index = Integer.parseInt(qualifier.substring(i + 1, qualifier.indexOf(")")));
				qualifier = qualifier.substring(0, i);
			}

			// root data
			if (data == null) {
				data = getOrCreateData(qualifier);
				if (data == null)
					break;
			} else {

				if (!(data instanceof QStruct))
					return null;

				QStruct<?> struct = (QStruct<?>) data;
				data = struct.getElement(qualifier);
			}

			// list
			if (index > 0) {

				if (!(data instanceof QList))
					return null;

				QList<?> list = (QList<?>) data;
				data = list.get(index);
			}
		}

		return data;
	}

	@Override
	public QData getData(QDataTerm<?> dataTerm) {

		QNode parent = dataTerm.getParent();
		if (parent == null)
			return getData(getKey(dataTerm));
		else if (parent instanceof QDataTerm) {
			QDataTerm<?> dataTermParent = (QDataTerm<?>) parent;
			if (dataTermParent.getDataTermType().isCompound()) {
				QStruct<?> dataParent = (QStruct<?>) getData(dataTermParent);
				return dataParent.getElement(dataTerm.getName());
			} else
				return null;
		} else
			return null;
	}

	@Override
	public List<QDataTerm<?>> getTerms() {
		return new ArrayList<QDataTerm<?>>(dataTerms.values());
	}

	@Override
	public void clearData() {

		for (Entry<String, QDataTerm<?>> entry : dataTerms.entrySet()) {
			QData data = getOrCreateData(entry.getKey(), entry.getValue());
			data.clear();
		}
	}

	@Override
	public void resetData() {

		for (Entry<String, QDataTerm<?>> entry : dataTerms.entrySet()) {
			if (entry.getValue().getParent() instanceof QDataTerm<?>) {
				QDataTerm<?> parentTerm = (QDataTerm<?>) entry.getValue().getParent();

				// exclude element of compound data
				if (parentTerm.getDataTermType().isCompound())
					continue;
			}
			resetData(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public QData resetData(QDataTerm<?> dataTerm) {
		return resetData(getKey(dataTerm), dataTerm);
	}

	@Override
	public QData resetData(String key) {

		QDataTerm<?> dataTerm = dataTerms.get(key);

		if (dataTerm == null)
			return null;

		return resetData(key, dataTerm);
	}

	@Override
	public QDataTerm<?> getDataTerm(String key) {

		QDataTerm<?> dataTerm = dataTerms.get(key);

		return dataTerm;
	}

	@Override
	public List<String> getKeys() {
		return new ArrayList<String>(dataTerms.keySet());
	}

	private String getKey(QDataTerm<?> dataTerm) {

		for (Entry<String, QDataTerm<?>> entry : dataTerms.entrySet())
			if (entry.getValue().equals(dataTerm))
				return entry.getKey();

		return dataTerm.getName();
	}

	private QData resetData(String key, QDataTerm<?> dataTerm) {

		QData data = getOrCreateData(key, dataTerm);

		QOverlay overlay = dataTerm.getFacet(QOverlay.class);
		if (overlay == null) {
			NIODataResetter resetter = new NIODataResetter(data);
			dataTerm.accept(resetter);
		}

		return data;
	}

	@Override
	public void removeDataTerm(QDataTerm<?> dataTerm) {
		String key = getKey(dataTerm);
		this.dataTerms.remove(key);
		QData data = this.datas.remove(key);
		if (data instanceof QBufferedData) {
			QBufferedData bufferedData = (QBufferedData) data;
			if (bufferedData.isStoreOwner())
				this.memorySize -= bufferedData.getSize();
		}
	}

	@Override
	public QDataContext getDataContext() {
		return dataContext;
	}

	@Override
	public boolean hasDefaultValue(String key) {

		QDataTerm<?> dataTerm = dataTerms.get(key);

		return hasDefaultValue(dataTerm);
	}

	@Override
	public boolean hasDefaultValue(QDataTerm<?> dataTerm) {

		if (dataTerm == null)
			return false;

		QData clearData = createData(dataTerm, true);
		QOverlay overlay = dataTerm.getFacet(QOverlay.class);
		if (overlay == null) {
			NIODataResetter resetter = new NIODataResetter(clearData);
			dataTerm.accept(resetter);
		}

		QData data = datas.get(getKey(dataTerm));

		return data.toString().equals(clearData.toString());
	}

	private QData getOrCreateData(String key) {

		QData data = datas.get(key);
		if (data == null) {
			QDataTerm<?> dataTerm = getDataTerm(key);
			if (dataTerm != null)
				data = getOrCreateData(key, dataTerm);
		}

		return data;
	}

	@SuppressWarnings("unchecked")
	private QData getOrCreateData(String key, QDataTerm<?> dataTerm) {

		QData data = datas.get(key);
		if (data != null)
			return data;

		data = createData(dataTerm, true);
		datas.put(key, data);

		if (data instanceof QBufferedData) {
			QBufferedData bufferedData = (QBufferedData) data;
			if (bufferedData.isStoreOwner())
				this.memorySize += bufferedData.getSize();
		}

		if (data instanceof QStruct<?> && dataTerm.getDefinition() instanceof QCompoundDataDef<?, ?>) {
			QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();

			for (Field field : NIOStructHelper.getFields((Class<? extends QStruct<?>>) data.getClass())) {
				if (QData.class.isAssignableFrom(field.getType())) {
					try {
						QData element = (QData) field.get(data);
						if (element == null)
							System.err.println("Unexpected condition: ducvfs8dtrf8tse7rd8ftds");

						if (compoundDataDef.isQualified())
							datas.put(dataTerm.getName()+"."+field.getName(), element);
						else
							datas.put(field.getName(), element);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						continue;
					}

				}
			}
		}

		return data;
	}

	private QData createData(QDataTerm<?> dataTerm, boolean initialize) {

		QDataFactory dataFactory = getDataContext().getDataFactory();

		QData data;
		if (dataTerm.getBased() != null) {
			data = dataFactory.createData(dataTerm, false);

			QPointer basedPointer = (QPointer) getData(dataTerm.getBased());
			if (basedPointer == null || !(data instanceof QBufferedData))
				throw new IntegratedLanguageDataRuntimeException("Invalid based data: " + dataTerm);

			basedPointer.assign((QBufferedData) data);
		} else {
			QOverlay overlay = dataTerm.getFacet(QOverlay.class);
			if (overlay == null) {
				data = dataFactory.createData(dataTerm, initialize);
			} else {

				if (Overlay.NAME_OWNER.equalsIgnoreCase(overlay.getName())) {
					data = dataFactory.createData(dataTerm, true);
					System.err.println("Unexpected condition 5qf7rva9cwerc5: " + dataTerm);
				} else {
					data = dataFactory.createData(dataTerm, false);
					// TODO remove lowerCase
					QData overlayedData = getData(overlay.getName().toLowerCase());
					((QBufferedData) overlayedData).assign((QBufferedData) data);
				}
			}
		}

		return data;
	}

	@Override
	public List<QData> getDatas() {
		return new ArrayList<QData>(datas.values());
	}

	@Override
	public long getMemorySize() {
		return this.memorySize;
	}
}