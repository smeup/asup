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

public class NIODataStructBuilder {

	private QDataFactory dataFactory = null;
	private NIOAbstractDataStruct dataStruct = null;
	
	private Map<QBufferedData, QDecimal> overlayedToNextPos = new HashMap<QBufferedData, QDecimal>();
	private int ownerNextPos = 1;
	
	public NIODataStructBuilder(QDataFactory dataFactory, NIOAbstractDataStruct dataStruct) {
		this.dataFactory = dataFactory;
		this.dataStruct = dataStruct;
	}
	
	public void addElement(Field field, QBufferedData dataElement) {

		org.smeup.sys.il.data.annotation.Overlay overlay = field.getAnnotation(org.smeup.sys.il.data.annotation.Overlay.class);
		if (overlay == null) {
			dataStruct.addElement(field.getName(), dataElement, ownerNextPos);		
			ownerNextPos += dataElement.getSize();
			return;
		} else {
			addElement(field.getName(), dataElement, overlay.name(), overlay.position());
		} 		
	}

	public void addElement(QDataTerm<?> dataTerm, QBufferedData dataElement) {
		
		QOverlay overlay = dataTerm.getFacet(QOverlay.class);
		if (overlay == null) {
			dataStruct.addElement(dataTerm.getName(), dataElement, ownerNextPos);		
			ownerNextPos += dataElement.getSize();
		} else {
			addElement(dataTerm.getName(), dataElement, overlay.getName(), overlay.getPosition());
		} 		
 	}
	
	private void addElement(String name, QBufferedData dataElement, String overlayName, int overlayPosition) {
		
		if (overlayName == null || overlayName.equalsIgnoreCase(org.smeup.sys.il.data.annotation.Overlay.NAME_OWNER)) {

			if (overlayPosition >= 1)
				ownerNextPos = overlayPosition;

			dataStruct.addElement(name, dataElement, ownerNextPos);
			ownerNextPos += dataElement.getSize();
		} else {

			NIOBufferedDataImpl overlayedData = (NIOBufferedDataImpl) dataStruct.getElement(overlayName);
			
			if (overlayedData == null)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: s87rfysd8fsd");
			
			QDecimal overlayedNextPos = overlayedToNextPos.get(overlayedData);
			if (overlayedNextPos == null) {
				overlayedNextPos = dataFactory.createDecimal(5, 0, DecimalType.PACKED, true);
				overlayedNextPos.plus(overlayedData.getPosition() + 1);
				overlayedToNextPos.put(overlayedData, overlayedNextPos);
			}

			if (overlayPosition >= 1)
				overlayedNextPos.eval(overlayPosition);

			dataStruct.addElement(name, dataElement, overlayedNextPos.i());

			if (overlayedData instanceof NIOBufferedListImpl<?>) {
				NIOBufferedListImpl<?> arrayOverlayed = (NIOBufferedListImpl<?>) overlayedData;
				NIOBufferedListImpl<?> arrayData = (NIOBufferedListImpl<?>) dataElement;
				arrayData.setListOwner(arrayOverlayed);
				arrayOverlayed.assign(dataElement, overlayedNextPos.asInteger());
				overlayedNextPos.plus(arrayData.getModel().getSize());				
			} else {
				overlayedNextPos.plus(dataElement.getSize());
			}
		}

	}
}
