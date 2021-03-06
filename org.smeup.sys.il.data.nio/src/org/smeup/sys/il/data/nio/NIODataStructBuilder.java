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

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QOverlay;

public final class NIODataStructBuilder {

	private QDataFactory dataFactory = null;
	private NIOAbstractDataStruct dataStruct = null;

	private final Map<QBufferedData, QDecimal> overlayedToNextPos = new HashMap<QBufferedData, QDecimal>();
	private int ownerNextPos = 1;

	public NIODataStructBuilder(final QDataFactory dataFactory, final NIOAbstractDataStruct dataStruct) {
		this.dataFactory = dataFactory;
		this.dataStruct = dataStruct;
	}

	public final void addElement(final Field field, final QBufferedData dataElement) {

		final org.smeup.sys.il.data.annotation.Overlay overlay = field.getAnnotation(org.smeup.sys.il.data.annotation.Overlay.class);
		if (overlay == null) {
			dataStruct.addElement(field.getName(), dataElement, ownerNextPos);
			ownerNextPos += dataElement.getSize();
			return;
		} else
			addElement(field.getName(), dataElement, overlay.name(), overlay.position());
	}

	public final void addElement(final QDataTerm<?> dataTerm, final QBufferedData dataElement) {

		final QOverlay overlay = dataTerm.getFacet(QOverlay.class);
		if (overlay == null) {
			dataStruct.addElement(dataTerm.getName(), dataElement, ownerNextPos);
			ownerNextPos += dataElement.getSize();
		} else
			addElement(dataTerm.getName(), dataElement, overlay.getName(), overlay.getPosition());
	}

	private final void addElement(final String name, final QBufferedData dataElement, final String overlayName, final int overlayPosition) {

		if (overlayName == null || overlayName.equalsIgnoreCase(org.smeup.sys.il.data.annotation.Overlay.NAME_OWNER)) {

			if (overlayPosition >= 1)
				ownerNextPos = overlayPosition;

			dataStruct.addElement(name, dataElement, ownerNextPos);
			ownerNextPos += dataElement.getSize();
		} else {

			final NIOBufferedDataImpl overlayedData = (NIOBufferedDataImpl) dataStruct.getElement(overlayName);

			if (overlayedData == null)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: s87rfysd8fsd");

			QDecimal overlayedNextPos = overlayedToNextPos.get(overlayedData);
			if (overlayedNextPos == null) {
				overlayedNextPos = dataFactory.createDecimal(5, 0, DecimalType.PACKED, true);
				overlayedNextPos.eval(1);
				overlayedToNextPos.put(overlayedData, overlayedNextPos);
			}

			if (overlayPosition >= 1) { 
				int overlayedPosition = overlayedData.getPosition();
				if (overlayedPosition == 0)
					overlayedPosition = 1;

				dataStruct.addElement(name, dataElement, overlayedPosition - 1 + overlayPosition);
				overlayedNextPos.eval(overlayPosition);
			} else {
				int overlayedPosition = overlayedData.getPosition();
				dataStruct.addElement(name, dataElement, overlayedPosition + overlayedNextPos.i());
			}

			if (overlayedData instanceof NIOBufferedListImpl<?>) {
				final NIOBufferedListImpl<?> arrayOverlayed = (NIOBufferedListImpl<?>) overlayedData;
				final NIOBufferedListImpl<?> arrayData = (NIOBufferedListImpl<?>) dataElement;
//				arrayData.setListOwner(arrayOverlayed);
				arrayData.setListOwner(getDeepListOwner(arrayOverlayed));
				arrayOverlayed.slice(arrayData, overlayedNextPos.asInteger());
				overlayedNextPos.plus(arrayData.getModel().getSize());
			} else
				overlayedNextPos.plus(dataElement.getSize());
		}
	}

	private NIOBufferedListImpl<?> getDeepListOwner(NIOBufferedListImpl<?> arrayOverlayed) {
		if(arrayOverlayed.getListOwner()==null){
			return arrayOverlayed;
		} else {
			return getDeepListOwner(arrayOverlayed.getListOwner());
		}
	}
}
