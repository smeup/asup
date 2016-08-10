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
import org.smeup.sys.il.data.QStorable;
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

public final class NIODataContainerImpl extends ObjectImpl implements QDataContainer, Serializable {

	private static final long serialVersionUID = 1L;

	private QDataContext dataContext;

	private Map<String, QDataTerm<?>> dataTerms;

	private Map<String, QData> datas;
	private long memorySize = 0;

	protected NIODataContainerImpl(final NIODataContextImpl dataContext) {
		this.dataTerms = new LinkedHashMap<String, QDataTerm<?>>();
		this.datas = new HashMap<String, QData>();
		this.dataContext = dataContext;
	}

	@Override
	public final void close() {
		this.dataContext = null;
		this.datas = new HashMap<String, QData>();
		this.dataTerms = new HashMap<String, QDataTerm<?>>();
	}

	@Override
	public final void addDataTerm(final QDataTerm<?> dataTerm) {
		this.dataTerms.put(getKey(dataTerm), dataTerm);
	}

	@Override
	public final QDataTerm<?> addDataTerm(final String name, final Type type, List<Annotation> annotations) {

		if (annotations == null)
			annotations = new ArrayList<Annotation>();

		final QDataTerm<QDataDef<?>> dataTerm = new DataTermImpl<QDataDef<?>>() {
			private static final long serialVersionUID = 1L;
		};

		dataTerm.setName(name);
		dataTerm.setDefinition(getDataContext().getDataFactory().createDataDef(type, annotations));

		for (final Annotation annotation : annotations) {
			if (annotation instanceof DataDef) {
				final DataDef dataDef = (DataDef) annotation;

				final QDefault _default = QIntegratedLanguageCoreMetaFactory.eINSTANCE.createDefault();
				if (!dataDef.value().isEmpty()) {
					String value = dataDef.value();

					// TODO remove me
					if (value.length() > 1 && value.startsWith("'") && value.endsWith("'"))
						value = value.substring(1, value.length() - 1);

					_default.setValue(value);
				} else
					_default.getValues().addAll(Arrays.asList(dataDef.values()));

				if (!_default.isEmpty())
					dataTerm.setDefault(_default);

				if (!dataDef.based().isEmpty())
					dataTerm.setBased(dataDef.based());
			}

			if (annotation instanceof Overlay) {
				final Overlay overlay = (Overlay) annotation;
				final QOverlay qOverlay = QIntegratedLanguageDataTermFactory.eINSTANCE.createOverlay();
				qOverlay.setName(overlay.name());
				qOverlay.setPosition(overlay.position());
				dataTerm.getFacets().add(qOverlay);
			}
		}

		this.dataTerms.put(dataTerm.getName(), dataTerm);

		final QData previousData = this.datas.remove(dataTerm.getName());
		if (previousData != null)
			replaceData(dataTerm, previousData);

		return dataTerm;
	}

	@Override
	public final QData getData(final String name) {

		final String[] qualifiers = name.split("\\.");

		QData data = null;
		for (String qualifier : qualifiers) {

			int index = 0;
			final int i = qualifier.indexOf("(");
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

				final QStruct<?> struct = (QStruct<?>) data;
				data = struct.getElement(qualifier);
			}

			// list
			if (index > 0) {

				if (!(data instanceof QList))
					return null;

				final QList<?> list = (QList<?>) data;
				data = list.get(index);
			}
		}

		return data;
	}

	@Override
	public final QData getData(final QDataTerm<?> dataTerm) {

		final QNode parent = dataTerm.getParent();
		if (parent == null)
			return getData(getKey(dataTerm));
		else if (parent instanceof QDataTerm) {
			final QDataTerm<?> dataTermParent = (QDataTerm<?>) parent;
			if (dataTermParent.getDataTermType().isCompound()) {
				final QStruct<?> dataParent = (QStruct<?>) getData(dataTermParent);
				return dataParent.getElement(getKey(dataTerm));
			} else
				return null;
		} else
			return null;
	}

	@Override
	public final List<QDataTerm<?>> getTerms() {
		return new ArrayList<QDataTerm<?>>(dataTerms.values());
	}

	@Override
	public final void clearData() {

		for (final QDataTerm<?> dataTerm : dataTerms.values()) {
			final QData data = getOrCreateData(dataTerm);
			data.clear();
		}
	}

	@Override
	public final QDataTerm<?> getDataTerm(final String key) {

		final QDataTerm<?> dataTerm = dataTerms.get(key);

		return dataTerm;
	}

	@Override
	public final List<String> getKeys() {
		return new ArrayList<String>(dataTerms.keySet());
	}

	@Override
	public final void removeDataTerm(final QDataTerm<?> dataTerm) {

		this.dataTerms.remove(getKey(dataTerm));
		final QData data = this.datas.remove(getKey(dataTerm));
		if (data instanceof QBufferedData) {
			final QBufferedData bufferedData = (QBufferedData) data;
			if (bufferedData.isStoreOwner())
				this.memorySize -= bufferedData.getSize();
		}
	}

	@Override
	public final QDataContext getDataContext() {
		return dataContext;
	}

	private final QData getOrCreateData(final String key) {

		QData data = datas.get(key);
		if (data == null) {
			final QDataTerm<?> dataTerm = getDataTerm(key);
			if (dataTerm != null)
				data = getOrCreateData(dataTerm);
		}

		return data;
	}

	@SuppressWarnings("unchecked")
	private final QData getOrCreateData(final QDataTerm<?> dataTerm) {

		QData data = datas.get(getKey(dataTerm));
		if (data != null)
			return data;

		data = createData(dataTerm, true);

		datas.put(getKey(dataTerm), data);

		if (data instanceof QBufferedData) {
			final QBufferedData bufferedData = (QBufferedData) data;
			if (bufferedData.isStoreOwner())
				this.memorySize += bufferedData.getSize();
		}

		if (data instanceof QStruct<?> && dataTerm.getDefinition() instanceof QCompoundDataDef<?, ?>) {
			final QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();

			for (final Field field : NIODataStructHelper.getFields((Class<? extends QStruct<?>>) data.getClass())) {
				if (!QData.class.isAssignableFrom(field.getType()))
					continue;

				try {
					final NIOBufferedDataImpl element = NIOBufferHelper.getNIOBufferedDataImpl((QStorable) field.get(data));

					String fieldName = field.getName();
					if (compoundDataDef.getPrefix() != null && !compoundDataDef.getPrefix().isEmpty())
						fieldName = compoundDataDef.getPrefix() + fieldName;

					QData previousData = null;
					if (compoundDataDef.isQualified())
						previousData = datas.put(getKey(dataTerm) + "." + fieldName, element);
					else
						previousData = datas.put(fieldName, element);

					// TODO remove filler_
					if (previousData != null && !field.getName().startsWith("filler_")) {
						final NIOBufferedDataImpl previousBufferedData = NIOBufferHelper.getNIOBufferedDataImpl((QStorable) previousData);

						// sliced precedence
						if (element.isSliced() && !previousBufferedData.isSliced())
							element.assign(previousBufferedData);
						else
							previousBufferedData.assign(element);
					}

				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new IntegratedLanguageDataRuntimeException(e);
				}
			}
		}

		return data;
	}

	private final QData createData(final QDataTerm<?> dataTerm, final boolean allocate) {

		final QDataFactory dataFactory = getDataContext().getDataFactory();

		QData data;
		if (dataTerm.getBased() != null) {
			data = dataFactory.createData(dataTerm, false);

			final QPointer basedPointer = (QPointer) getData(dataTerm.getBased());
			if (basedPointer == null || !(data instanceof QBufferedData))
				throw new IntegratedLanguageDataRuntimeException("Invalid based data: " + dataTerm);

			basedPointer.assign((QBufferedData) data);
		} else {
			final QOverlay overlay = dataTerm.getFacet(QOverlay.class);
			if (overlay == null)
				data = dataFactory.createData(dataTerm, allocate);
			else if (Overlay.NAME_OWNER.equalsIgnoreCase(overlay.getName()))
				data = dataFactory.createData(dataTerm, true);
			// TODO
			// throw new IntegratedLanguageDataRuntimeException("Invalid
			// owner data: " + dataTerm);
			else {
				data = dataFactory.createData(dataTerm, false);
				final QData overlayedData = getData(overlay.getName().toLowerCase());
				if (overlayedData == null)
					throw new IntegratedLanguageDataRuntimeException("Invalid overlay data: " + overlay);

				((QBufferedData) overlayedData).assign((QBufferedData) data);
			}

			if (allocate)
				writeDefault(dataTerm, data);
		}

		return data;
	}

	@SuppressWarnings("unchecked")
	private final void writeDefault(final QDataTerm<?> dataTerm, final QData data) {

		switch (dataTerm.getDataTermType()) {
		case UNARY_ATOMIC: {

			if (dataTerm.getDefault() != null && dataTerm.getDefault().getValue() != null && !dataTerm.getDefault().getValue().isEmpty()) {
				if (data instanceof QPointer) {
					final QPointer pointer = (QPointer) data;
					writeDefault(pointer, dataTerm.getDefault().getValue());
				} else {
					final QBufferedElement bufferedElement = (QBufferedElement) data;

					final QSpecialElement specialElement = getSpecialElement(dataTerm, dataTerm.getDefault().getValue());
					if (specialElement != null)
						NIOBufferHelper.writeDefault(bufferedElement, specialElement.getValue());
					else
						NIOBufferHelper.writeDefault(bufferedElement, dataTerm.getDefault().getValue());
				}
			} else
				data.clear();

			break;
		}
		case UNARY_COMPOUND:

			QDataStruct dataStruct = null;
			QCompoundDataDef<?, QDataTerm<?>> compoundDataDef = null;
			if (data instanceof QDataArea<?>) {
				final QDataArea<?> dataArea = (QDataArea<?>) data;
				dataStruct = (QDataStruct) dataArea.get();
				final QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) dataTerm.getDefinition();
				compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataAreaDef.getArgument();
			} else {
				dataStruct = (QDataStruct) data;
				compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataTerm.getDefinition();
			}

			if (dataTerm.getDefault() == null && compoundDataDef.getClassDelegator() != null) {
				// if(compoundDataDef.isInitialized())
				if (dataTerm.getFacet(QOverlay.class) == null)
					try {
						dataStruct.reset();
					} catch (final Exception e) {
						e.toString();
					}
			} else {
				if (dataTerm.getDefault() != null) {
					final QSpecialElement specialElement = getSpecialElement(dataTerm, dataTerm.getDefault().getValue());
					if (specialElement != null)
						NIOBufferHelper.writeDefault(dataStruct, specialElement.getValue());
					else
						NIOBufferHelper.writeDefault(dataStruct, dataTerm.getDefault().getValue());
				}

				for (final QDataTerm<?> element : compoundDataDef.getElements())
					if (element.getDefault() != null)
						writeDefault(element, dataStruct.getElement(element.getName()));
					else if (dataTerm.getDefault() == null)
						dataStruct.getElement(element.getName()).clear();
			}
			break;
		case MULTIPLE_ATOMIC:
			final QList<?> list = (QList<?>) data;
			if (dataTerm.getDefault() != null) {
				if (dataTerm.getDefault().getValue() != null && !dataTerm.getDefault().getValue().isEmpty()) {
					final QSpecialElement specialElement = getSpecialElement(dataTerm, dataTerm.getDefault().getValue());
					if (specialElement != null)
						NIOBufferHelper.writeDefault(list, specialElement.getValue());
					else
						NIOBufferHelper.writeDefault(list, dataTerm.getDefault().getValue());
				} else {
					int i = 1;
					for (final String value : dataTerm.getDefault().getValues()) {

						final QSpecialElement specialElement = getSpecialElement(dataTerm, value);
						if (specialElement != null)
							NIOBufferHelper.writeDefault((QBufferedElement) list.get(i), specialElement.getValue());
						else
							NIOBufferHelper.writeDefault((QBufferedElement) list.get(i), value);
						i++;
					}
				}
			} else
				list.clear();

			break;
		case MULTIPLE_COMPOUND:
			final QStroller<?> stroller = (QStroller<?>) data;
			compoundDataDef = (QCompoundDataDef<?, QDataTerm<?>>) dataTerm.getDefinition();

			// set default on first element
			dataStruct = stroller.first();

			if (dataTerm.getDefault() == null && compoundDataDef.getClassDelegator() != null)
				// if(compoundDataDef.isInitialized())
				dataStruct.reset();
			else {
				if (dataTerm.getDefault() != null) {
					final QSpecialElement specialElement = getSpecialElement(dataTerm, dataTerm.getDefault().getValue());
					if (specialElement != null)
						NIOBufferHelper.writeDefault(dataStruct, specialElement.getValue());
					else
						NIOBufferHelper.writeDefault(dataStruct, dataTerm.getDefault().getValue());
				}

				for (final QDataTerm<?> element : compoundDataDef.getElements())
					if (element.getDefault() != null)
						writeDefault(element, dataStruct.getElement(element.getName()));
					else if (dataTerm.getDefault() == null)
						dataStruct.getElement(element.getName()).clear();
			}

			// dereference stroller element
			final QCharacter character = getDataContext().getDataFactory().createCharacter(dataStruct.getLength(), false, true);
			character.eval(dataStruct);

			// set default for all elements
			for (final QDataStruct strollerDataStruct : stroller)
				strollerDataStruct.eval(character);

			break;
		}

	}

	@Override
	public final List<QData> getDatas() {
		return new ArrayList<QData>(datas.values());
	}

	@Override
	public final long getMemorySize() {
		return this.memorySize;
	}

	@Override
	public final boolean hasDefaultValue(final String key) {

		final QData data = getData(key);

		if (!(data instanceof QBufferedData))
			return false;

		final QBufferedData bufferedData = (QBufferedData) data;

		if (NIOBufferHelper.getNIOBufferedDataImpl(bufferedData)._reset != null)
			return true;

		if (bufferedData instanceof QDataStruct) {
			final QDataStruct dataStruct = (QDataStruct) bufferedData;
			for (final QBufferedData element : dataStruct.getElements())
				if (NIOBufferHelper.getNIOBufferedDataImpl(element)._reset != null)
					return true;
		}

		return false;
	}

	private final String getKey(final QDataTerm<?> dataTerm) {
		if (dataTerm.getKey() != null)
			return dataTerm.getKey();
		else
			return dataTerm.getName();
	}

	private final QSpecialElement getSpecialElement(final QDataTerm<?> dataTerm, final String value) {

		final QSpecial special = dataTerm.getFacet(QSpecial.class);

		if (special != null)
			for (final QSpecialElement specialElem : special.getElements())
				if (specialElem.getName().equals(value))
					return specialElem;

		return null;
	}

	public final void writeDefault(final QPointer pointer, final String source) {

		String value = source;
		
		if (value.trim().toUpperCase().startsWith("%ADDR")) {
			value = value.trim().toUpperCase();
			value = value.substring(6, value.length() - 1).toLowerCase().replaceAll("§", "ç");
			final QBufferedData bufferedData = (QBufferedData) getData(value.trim());
			if (bufferedData == null || !(bufferedData instanceof QBufferedData))
				throw new IntegratedLanguageDataRuntimeException("Invalid address data: " + value);

			pointer.eval(bufferedData.qAddr());
		} else if (value.trim().toUpperCase().equals("*NULL")) {
			// TODO
			// System.err.println("Unexpected condition *NULL: ew8vr6888t67ew");
		} else
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition: ixretcretrtscv8dtf");
	}

	private final void replaceData(final QDataTerm<QDataDef<?>> dataTerm, final QData previousData) {

		// remove child data
/*		if (previousData instanceof QStruct<?>)
			for (final Field field : NIODataStructHelper.getFields((Class<? extends QStruct<?>>) previousData.getClass()))
				if (QData.class.isAssignableFrom(field.getType())) {
					datas.remove(field.getName());
				}*/

		if (!(previousData instanceof QBufferedData))
			return;

		final QBufferedData previousBuffered = (QBufferedData) previousData;

		final QData data = createData(dataTerm, false);
		QOverlay overlay = dataTerm.getFacet(QOverlay.class);
		if (overlay == null) {
			overlay = QIntegratedLanguageDataTermFactory.eINSTANCE.createOverlay();
			overlay.setName("*PREVIOUS");
			dataTerm.getFacets().add(overlay);
		}

		previousBuffered.assign(((QBufferedData) data));

		datas.put(dataTerm.getName(), data);
	}
}