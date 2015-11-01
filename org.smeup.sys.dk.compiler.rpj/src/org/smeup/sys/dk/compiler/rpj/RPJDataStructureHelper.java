package org.smeup.sys.dk.compiler.rpj;

import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.il.core.QOverlay;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.impl.DataTermImpl;

public class RPJDataStructureHelper {

	public static void normalizePositions(QCompoundDataDef<?, QDataTerm<?>> dataStructDef) {

		int expectedPosition = 1;

		List<QDataTerm<?>> listElements = new ArrayList<QDataTerm<?>>(dataStructDef.getElements());

		int elemPos = 0;
		for (QDataTerm<?> element : listElements) {
			if (!(element.getDefinition() instanceof QBufferedDataDef))
				continue;

			QBufferedDataDef<?> bufferedDataDef = (QBufferedDataDef<?>) element.getDefinition();

			QOverlay overlay = element.getFacet(QOverlay.class);
			if (overlay == null) {
				expectedPosition += bufferedDataDef.getSize();
			}
			// TODO
			else if (overlay.getName() != null) {
			} else if (overlay.getPosition() == 0) {
				expectedPosition += bufferedDataDef.getSize();
			} else if (overlay.getPosition() == expectedPosition) {
				overlay.setPosition(0);
				expectedPosition += bufferedDataDef.getSize();
			} else if (overlay.getPosition() > expectedPosition) {

				// insert filler
				QDataTerm<QBufferedDataDef<?>> filler = new DataTermImpl<QBufferedDataDef<?>>() {
					private static final long serialVersionUID = 1L;
				};

				filler.setName("filler_" + elemPos);
				QCharacterDef characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
				characterDef.setLength(overlay.getPosition() - expectedPosition);
				filler.setDefinition(characterDef);
				dataStructDef.getElements().add(elemPos, filler);
				expectedPosition += characterDef.getLength();
				elemPos++;

				overlay.setPosition(0);
				expectedPosition += bufferedDataDef.getSize();
			}

			elemPos++;
		}

		listElements = new ArrayList<QDataTerm<?>>(dataStructDef.getElements());

		for (QDataTerm<?> element : listElements) {
			if (!(element.getDefinition() instanceof QBufferedDataDef))
				continue;

			QOverlay overlay = element.getFacet(QOverlay.class);
			if (overlay == null)
				continue;

			if (overlay.getPosition() == 0)
				continue;

			if (overlay.getName() != null)
				continue;

			Object[] objects = searchOverlayedByPosition(dataStructDef, overlay.getPosition());
			if (objects == null) {
				System.err.println("Unexpected condition: wiuey7rf8sfsdg");
				continue;
			}

			QDataTerm<?> overlayedTerm = (QDataTerm<?>) objects[0];
			overlay.setName(overlayedTerm.getName());

			Integer relativePosition = (Integer) objects[1];
			if (relativePosition == overlay.getPosition())
				overlay.setPosition(0);
			else {
				overlay.setPosition(overlay.getPosition() - relativePosition + 1);
			}
		}
	}

	private static Object[] searchOverlayedByPosition(QCompoundDataDef<?, QDataTerm<?>> dataStructDef, int position) {

		Object[] objects = null;

		int startPosition = 1;
		for (QDataTerm<?> element : dataStructDef.getElements()) {
			if (!(element.getDefinition() instanceof QBufferedDataDef))
				continue;

			QBufferedDataDef<?> bufferedDataDef = (QBufferedDataDef<?>) element.getDefinition();
			if (startPosition <= position && (startPosition + bufferedDataDef.getSize()) > position) {
				if (objects == null || (Integer) objects[1] < startPosition)
					objects = new Object[] { element, startPosition };
			}

			startPosition += bufferedDataDef.getSize();
		}

		return objects;
	}

	/*
	 * 
	 * public void writeElements(List<QDataTerm<?>> elements) throws IOException
	 * {
	 * 
	 * int recalculatedPosition = 1; int expectedPosition = 1; Map<String,
	 * Integer> nameToPosition = new HashMap<String, Integer>();
	 * 
	 * for (QDataTerm<?> element : elements) { if (!(element.getDefinition()
	 * instanceof QBufferedDataDef<?>)) continue;
	 * 
	 * QBufferedDataDef<?> bufferedDataDef = (QBufferedDataDef<?>)
	 * element.getDefinition();
	 * 
	 * QOverlay overlay = element.getFacet(QOverlay.class); if (overlay == null)
	 * { writeField(element, false, UnitScope.PUBLIC);
	 * 
	 * expectedPosition += bufferedDataDef.getSize(); recalculatedPosition +=
	 * bufferedDataDef.getLength();
	 * 
	 * nameToPosition.put(element.getName(), expectedPosition); continue; }
	 * 
	 * String position = overlay.getPosition(); if
	 * (position.equalsIgnoreCase(Overlay.POS_NEXT) || expectedPosition ==
	 * Integer.parseInt(position)) {
	 * 
	 * overlay.setPosition(Overlay.POS_NEXT); writeField(element, false,
	 * UnitScope.PUBLIC);
	 * 
	 * expectedPosition += bufferedDataDef.getSize(); recalculatedPosition +=
	 * bufferedDataDef.getLength();
	 * 
	 * nameToPosition.put(element.getName(), expectedPosition); } else { if
	 * (Integer.parseInt(position) > expectedPosition) { // TODO filler
	 * expectedPosition = Integer.parseInt(position);
	 * 
	 * if (expectedPosition < recalculatedPosition)
	 * System.err.println("Unexpected condition: wer89tvbrybvt87ysdfgs"); else
	 * recalculatedPosition = expectedPosition; } else {
	 * 
	 * QDataTerm<?> overlayedTerm = searchOverlayedByPosition(new
	 * ArrayList<QDataTerm<?>>(elements), Integer.parseInt(position));
	 * 
	 * if (overlayedTerm == null || (overlay.getName() != null &&
	 * !overlayedTerm.getName().equals(overlay.getName()))) {
	 * System.err.println("Unexpected condition: pntv9erytysreytgopsr");
	 * continue; } overlay.setName(overlayedTerm.getName());
	 * 
	 * if (Integer.parseInt(position) == 1)
	 * overlay.setPosition(Overlay.POS_NEXT); else {
	 * overlay.setPosition(position); } }
	 * 
	 * writeField(element, false, UnitScope.PUBLIC);
	 * 
	 * if (overlay.getName() == null) { expectedPosition +=
	 * bufferedDataDef.getSize(); recalculatedPosition +=
	 * bufferedDataDef.getLength();
	 * 
	 * nameToPosition.put(element.getName(), expectedPosition); continue; }
	 * 
	 * Integer overlayedExpectedPosition =
	 * nameToPosition.get(overlay.getName()); if (overlayedExpectedPosition ==
	 * null) System.err.println("Unexpected condition: lasdjhgfuysdfczxd");
	 * 
	 * if (overlayedExpectedPosition + bufferedDataDef.getSize() >=
	 * expectedPosition) { expectedPosition = overlayedExpectedPosition;
	 * recalculatedPosition = overlayedExpectedPosition;
	 * 
	 * nameToPosition.put(element.getName(), expectedPosition); } else {
	 * expectedPosition += bufferedDataDef.getSize(); recalculatedPosition +=
	 * bufferedDataDef.getLength();
	 * 
	 * nameToPosition.put(element.getName(), expectedPosition); }
	 * 
	 * } }
	 * 
	 * // elements for (QDataTerm<?> element : elements) writeInnerData(element,
	 * UnitScope.PUBLIC, true); }
	 */
}
