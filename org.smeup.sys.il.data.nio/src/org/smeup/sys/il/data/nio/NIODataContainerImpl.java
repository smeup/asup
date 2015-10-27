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

import org.smeup.sys.il.core.QIntegratedLanguageCoreFactory;
import org.smeup.sys.il.core.QNode;
import org.smeup.sys.il.core.QOverlay;
import org.smeup.sys.il.core.annotation.Overlay;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaFactory;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.impl.DataTermImpl;

public class NIODataContainerImpl extends ObjectImpl implements QDataContainer, Serializable {

	private static final long serialVersionUID = 1L;

	private QDataContext dataContext;

	private Map<String, QDataTerm<?>> dataTerms;

	private Map<String, QData> datas;

	private QDataWriter dataWriter;

	private boolean useDefault;

	protected NIODataContainerImpl(NIODataContextImpl dataContext, Map<String, QDataTerm<?>> dataTerms, boolean useDefault) {
		this.dataTerms = dataTerms;
		this.datas = new HashMap<String, QData>();
		this.dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
		this.useDefault = useDefault;

		this.dataContext = dataContext;
		
	}

	protected NIODataContainerImpl(NIODataFactoryImpl dataFactory, Map<String, QDataTerm<?>> dataTerms, boolean useDefault) {
		this.dataTerms = dataTerms;
		this.datas = new HashMap<String, QData>();
		this.dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
		this.useDefault = useDefault;

		this.dataContext = new NIODataContextImpl(dataFactory);
	}
	
	@Override
	public void close() {
		this.dataWriter = null;
		this.dataContext = null;
		this.datas = new HashMap<String, QData>();
		this.dataTerms = new HashMap<String, QDataTerm<?>>();
	}

	@Override
	public QDataTerm<?> createDataTerm(String name, Type type, List<Annotation> annotations) {

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
				_default.getValues().addAll(Arrays.asList(dataDef.values()));

				if (!_default.isEmpty())
					dataTerm.setDefault(_default);
			}

			if (annotation instanceof Overlay) {
				Overlay overlay = (Overlay) annotation;
				QOverlay qOverlay = QIntegratedLanguageCoreFactory.eINSTANCE.createOverlay();
				qOverlay.setName(overlay.name());
				qOverlay.setPosition(overlay.position());
				dataTerm.getFacets().add(qOverlay);
			}
		}

		this.dataTerms.put(name, dataTerm);

		QData previousData = this.datas.remove(name);
		if (previousData != null) {

			// remove child data
			if (previousData instanceof QStruct<?>) {
				for (Field field : previousData.getClass().getDeclaredFields()) {
					if (QData.class.isAssignableFrom(field.getType()))
						datas.remove(field.getName());
				}
			}

			if (previousData instanceof QBufferedData) {
				QData data = createData(dataTerm, false);
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
				if (data == null) {
					System.err.println("Unexpected condition: c59tb45b94t4er9");
					break;
				}
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

		NIODataResetter resetter = new NIODataResetter(data, dataWriter);
		dataTerm.accept(resetter);

		return data;
	}

	@Override
	public void removeDataTerm(QDataTerm<?> dataTerm) {
		String key = getKey(dataTerm);
		this.dataTerms.remove(key);
		this.datas.remove(key);
	}

	@Override
	public QDataContext getDataContext() {
		return dataContext;
	}

	@Override
	public boolean isDefault(String key) {

		QDataTerm<?> dataTerm = dataTerms.get(key);

		return isDefault(dataTerm);
	}

	@Override
	public boolean isDefault(QDataTerm<?> dataTerm) {
		boolean result = false;

		if (dataTerm == null)
			return false;

		QData data = getOrCreateData(dataTerm);
		data.clear();

		NIODataResetter resetter = new NIODataResetter(data, dataWriter);
		dataTerm.accept(resetter);

		try {

			String s1 = getData(dataTerm).toString();
			String s2 = data.toString();

			result = s1.equals(s2);
		} catch (Exception exc) {
			exc.printStackTrace();
			result = false;
		}
		return result;
	}

	@Override
	public boolean isSet(String key) {

		QDataTerm<?> dataTerm = dataTerms.get(key);

		return isSet(dataTerm);
	}

	@Override
	public boolean isSet(QDataTerm<?> dataTerm) {

		boolean result = false;

		if (dataTerm == null)
			return false;

		QData data = getOrCreateData(dataTerm);
		data.clear();

		if (useDefault) {
			NIODataResetter resetter = new NIODataResetter(data, dataWriter);
			dataTerm.accept(resetter);
		}

		try {

			String s1 = getData(dataTerm).toString();
			String s2 = data.toString();

			result = !s1.equals(s2);
		} catch (Exception exc) {
			exc.printStackTrace();
			result = false;
		}
		return result;
	}

	private QData getOrCreateData(QDataTerm<?> dataTerm) {
		return getOrCreateData(getKey(dataTerm), dataTerm);
	}

	private QData getOrCreateData(String key) {

		QData data = datas.get(key);
		if (data == null) {
			QDataTerm<?> dataTerm = getDataTerm(key);
			data = getOrCreateData(key, dataTerm);
		}

		return data;
	}

	private QData getOrCreateData(String key, QDataTerm<?> dataTerm) {

		QData data = datas.get(key);
		if (data != null)
			return data;

		data = createData(dataTerm, true);

		datas.put(key, data);
		if (data instanceof QStruct<?>) {
			for (Field field : data.getClass().getDeclaredFields()) {
				if (QData.class.isAssignableFrom(field.getType())) {
					try {
						QData element = (QData) field.get(data);
						if (element == null)
							System.err.println("Unexpected condition: ducvfs8dtrf8tse7rd8ftds");

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
			data = dataFactory.createData(dataTerm, initialize);

			QData rawData = getData(dataTerm.getBased());
			if (rawData == null || !(rawData instanceof QBufferedData) || !(data instanceof QBufferedData))
				throw new IntegratedLanguageDataRuntimeException("Invalid based data: " + dataTerm);

			QBufferedData rawBufferedData = (QBufferedData) rawData;
			rawBufferedData.assign((QBufferedData) data);
		} else {
			QOverlay overlay = dataTerm.getFacet(QOverlay.class);
			if (overlay == null) {
				data = dataFactory.createData(dataTerm, true);
			} else {
				data = dataFactory.createData(dataTerm, false);
				if (overlay.getName().equalsIgnoreCase("*PGMSTATUS")) {
					QDataStruct infoStruct = getDataContext().getInfoStruct();
					infoStruct.assign((QBufferedData) data);
				} else {
					QData overlayData = getData(overlay.getName());
					((QBufferedData)overlayData).assign((QBufferedData) data);
				}
			}
		}

		return data;
	}
}