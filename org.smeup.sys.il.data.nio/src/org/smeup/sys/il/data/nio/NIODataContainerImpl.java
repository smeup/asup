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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaFactory;
import org.smeup.sys.il.core.term.QNode;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataAreaDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermFactory;
import org.smeup.sys.il.data.term.QOverlay;
import org.smeup.sys.il.data.term.QSpecial;
import org.smeup.sys.il.data.term.QSpecialElement;
import org.smeup.sys.il.data.term.impl.DataTermImpl;

public class NIODataContainerImpl extends ObjectImpl implements QDataContainer, Serializable {

	private static final long serialVersionUID = 1L;

	private QDataContext dataContext;

	private Map<String, QDataTerm<?>> dataTerms;

	private Map<String, QData> datas;
	private long memorySize = 0;

	protected NIODataContainerImpl(NIODataContextImpl dataContext) {
		this.dataTerms = new LinkedHashMap<String, QDataTerm<?>>();
		this.datas = new HashMap<String, QData>();
		this.dataContext = dataContext;
	}

	@Override
	public void close() {
		this.dataContext = null;
		this.datas = new HashMap<String, QData>();
		this.dataTerms = new HashMap<String, QDataTerm<?>>();
	}

	@Override
	public void addDataTerm(QDataTerm<?> dataTerm) {
		this.dataTerms.put(getKey(dataTerm), dataTerm);
	}

	@SuppressWarnings("unchecked")
	@Override
	public QDataTerm<?> addDataTerm(String name, Type type, List<Annotation> annotations) {

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
				for (Field field : NIODataStructHelper.getFields((Class<? extends QStruct<?>>) previousData.getClass())) {
					if (QData.class.isAssignableFrom(field.getType()))
						datas.remove(field.getName());
				}
			}

			// redefined module variable
			if (previousData instanceof QBufferedData) {
				QBufferedData previousBuffered = (QBufferedData) previousData;
				QData data = createData(dataTerm, false);
				QOverlay overlay = dataTerm.getFacet(QOverlay.class);
				if (overlay == null) {
					overlay = QIntegratedLanguageDataTermFactory.eINSTANCE.createOverlay();
					overlay.setName("*PREVIOUS");
					dataTerm.getFacets().add(overlay);
				}

				previousBuffered.assign((QBufferedData) data);
				getDataContext().removeSnap(previousBuffered);

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
				return dataParent.getElement(getKey(dataTerm));
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

		for (QDataTerm<?> dataTerm : dataTerms.values()) {
			QData data = getOrCreateData(dataTerm);
			data.clear();
		}
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

	@Override
	public void removeDataTerm(QDataTerm<?> dataTerm) {

		this.dataTerms.remove(getKey(dataTerm));
		QData data = this.datas.remove(getKey(dataTerm));
		if (data instanceof QBufferedData) {
			QBufferedData bufferedData = (QBufferedData) data;
			if (bufferedData.isStoreOwner())
				this.memorySize -= bufferedData.getSize();
			getDataContext().removeSnap(bufferedData);
		}
	}

	@Override
	public QDataContext getDataContext() {
		return dataContext;
	}

	private QData getOrCreateData(String key) {

		QData data = datas.get(key);
		if (data == null) {
			QDataTerm<?> dataTerm = getDataTerm(key);
			if (dataTerm != null)
				data = getOrCreateData(dataTerm);
		}

		return data;
	}

	@SuppressWarnings("unchecked")
	private QData getOrCreateData(QDataTerm<?> dataTerm) {

		QData data = datas.get(getKey(dataTerm));
		if (data != null)
			return data;

		data = createData(dataTerm, true);
		datas.put(getKey(dataTerm), data);

		if (data instanceof QBufferedData) {
			QBufferedData bufferedData = (QBufferedData) data;
			if (bufferedData.isStoreOwner())
				this.memorySize += bufferedData.getSize();
		}

		if (data instanceof QStruct<?> && dataTerm.getDefinition() instanceof QCompoundDataDef<?, ?>) {
			QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();

			for (Field field : NIODataStructHelper.getFields((Class<? extends QStruct<?>>) data.getClass())) {
				if (!QData.class.isAssignableFrom(field.getType()))
					continue;

				try {
					QData element = (QData) field.get(data);
					if (compoundDataDef.isQualified())
						datas.put(getKey(dataTerm) + "." + field.getName(), element);
					else
						datas.put(field.getName(), element);

				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new IntegratedLanguageDataRuntimeException(e);
				}
			}
		}

		return data;
	}

	private QData createData(QDataTerm<?> dataTerm, boolean allocate) {

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
				data = dataFactory.createData(dataTerm, allocate);
			} else {

				if (Overlay.NAME_OWNER.equalsIgnoreCase(overlay.getName())) {
					throw new IntegratedLanguageDataRuntimeException("Invalid owner data: " + dataTerm);
				} else {
					data = dataFactory.createData(dataTerm, false);
					// TODO remove lowerCase
					QData overlayedData = getData(overlay.getName().toLowerCase());
					((QBufferedData) overlayedData).assign((QBufferedData) data);
				}
			}

			if (allocate)
				writeDefault(dataTerm, data);
		}

		return data;
	}

	@SuppressWarnings("unchecked")
	private void writeDefault(QDataTerm<?> dataTerm, QData data) {

		switch (dataTerm.getDataTermType()) {
		case UNARY_ATOMIC: {
			
			if (dataTerm.getDefault() != null && dataTerm.getDefault().getValue() != null && !dataTerm.getDefault().getValue().isEmpty()) {
				if(data instanceof QPointer) {
					QPointer pointer = (QPointer)data;
					writeDefault(pointer, dataTerm.getDefault().getValue());
				}
				else {
					QBufferedElement bufferedElement = (QBufferedElement) data;
					
					QSpecialElement specialElement = getSpecialElement(dataTerm, dataTerm.getDefault().getValue());
					if (specialElement != null)
						NIOBufferHelper.writeDefault(bufferedElement, specialElement.getValue());
					else {
						NIOBufferHelper.writeDefault(bufferedElement, dataTerm.getDefault().getValue());
					}
				}
			} else
				data.clear();

			break;
		}
		case UNARY_COMPOUND:

			QDataStruct dataStruct = null;
			QCompoundDataDef<?, QDataTerm<?>> compoundDataDef = null;
			if (data instanceof QDataArea<?>) {
				QDataArea<?> dataArea = (QDataArea<?>) data;
				dataStruct = (QDataStruct) dataArea.get();
				QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) dataTerm.getDefinition();
				compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataAreaDef.getArgument();
			} else {
				dataStruct = (QDataStruct) data;
				compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataTerm.getDefinition();
			}

			if (dataTerm.getDefault() == null && compoundDataDef.getClassDelegator() != null) {
				// if(compoundDataDef.isInitialized())
				dataStruct.reset();
			} else {
				if (dataTerm.getDefault() != null) {
					QSpecialElement specialElement = getSpecialElement(dataTerm, dataTerm.getDefault().getValue());
					if (specialElement != null)
						NIOBufferHelper.writeDefault(dataStruct, specialElement.getValue());
					else {
						NIOBufferHelper.writeDefault(dataStruct, dataTerm.getDefault().getValue());
					}
				}

				for (QDataTerm<?> element : compoundDataDef.getElements()) {
					if (element.getDefault() != null)
						writeDefault(element, dataStruct.getElement(element.getName()));
					else if (dataTerm.getDefault() == null)
						dataStruct.getElement(element.getName()).clear();
				}
			}
			break;
		case MULTIPLE_ATOMIC:
			QList<?> list = (QList<?>) data;
			if (dataTerm.getDefault() != null) {
				if (dataTerm.getDefault().getValue() != null && !dataTerm.getDefault().getValue().isEmpty()) {
					QSpecialElement specialElement = getSpecialElement(dataTerm, dataTerm.getDefault().getValue());
					if (specialElement != null)
						NIOBufferHelper.writeDefault(list, specialElement.getValue());
					else
						NIOBufferHelper.writeDefault(list, dataTerm.getDefault().getValue());
				} else {
					int i = 1;
					for (String value : dataTerm.getDefault().getValues()) {

						QSpecialElement specialElement = getSpecialElement(dataTerm, value);
						if (specialElement != null) {
							NIOBufferHelper.writeDefault((QBufferedElement) list.get(i), specialElement.getValue());
						} else {
							NIOBufferHelper.writeDefault((QBufferedElement) list.get(i), value);
						}
						i++;
					}
				}
			} else
				list.clear();

			break;
		case MULTIPLE_COMPOUND:
			QStroller<?> stroller = (QStroller<?>) data;
			compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataTerm.getDefinition();

			// set default on first element
			dataStruct = stroller.first();

			if (dataTerm.getDefault() == null && compoundDataDef.getClassDelegator() != null) {
				// if(compoundDataDef.isInitialized())
				dataStruct.reset();
			} else {
				if (dataTerm.getDefault() != null) {
					QSpecialElement specialElement = getSpecialElement(dataTerm, dataTerm.getDefault().getValue());
					if (specialElement != null)
						NIOBufferHelper.writeDefault(dataStruct, specialElement.getValue());
					else {
						NIOBufferHelper.writeDefault(dataStruct, dataTerm.getDefault().getValue());
					}
				}

				for (QDataTerm<?> element : compoundDataDef.getElements()) {
					if (element.getDefault() != null)
						writeDefault(element, dataStruct.getElement(element.getName()));
					else if (dataTerm.getDefault() == null)
						dataStruct.getElement(element.getName()).clear();
				}
			}

			// dereference stroller element
			QCharacter character = getDataContext().getDataFactory().createCharacter(dataStruct.getLength(), false, true);
			character.eval(dataStruct);

			// set default for all elements
			for (QDataStruct strollerDataStruct : stroller)
				strollerDataStruct.eval(character);

			break;
		}

	}

	@Override
	public List<QData> getDatas() {
		return new ArrayList<QData>(datas.values());
	}

	@Override
	public long getMemorySize() {
		return this.memorySize;
	}

	@Override
	public boolean hasDefaultValue(String key) {

		QData data = getData(key);

		if (!(data instanceof QBufferedData))
			return false;

		QBufferedData bufferedData = (QBufferedData) data;

		if (getDataContext().getSnap(bufferedData) != null)
			return true;

		if (bufferedData instanceof QDataStruct) {
			QDataStruct dataStruct = (QDataStruct) bufferedData;
			for (QBufferedData element : dataStruct.getElements()) {
				if (getDataContext().getSnap(element) != null)
					return true;
			}
		}

		return false;
	}

	private String getKey(QDataTerm<?> dataTerm) {
		if (dataTerm.getKey() != null)
			return dataTerm.getKey();
		else
			return dataTerm.getName();
	}

	private QSpecialElement getSpecialElement(QDataTerm<?> dataTerm, String value) {

		QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null)
			for (QSpecialElement specialElem : special.getElements())
				if (specialElem.getName().equals(value))
					return specialElem;

		return null;
	}
	

	public void writeDefault(QPointer pointer, String value) {

		if(value.trim().toUpperCase().startsWith("%ADDR")) {
			value = value.trim().toUpperCase();
			value = value.substring(6, value.length()-1).toLowerCase();
			QBufferedData bufferedData = (QBufferedData)getData(value);
			if (bufferedData == null || !(bufferedData instanceof QBufferedData))
				throw new IntegratedLanguageDataRuntimeException("Invalid address data: " + value);

			pointer.eval(bufferedData.qAddr());
		}
		else
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition: ixretcretrtscv8dtf");
	}

}