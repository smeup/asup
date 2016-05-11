package org.smeup.sys.dk.compiler.rpj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.smeup.sys.il.core.term.QNode;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QOverlay;
import org.smeup.sys.il.data.term.impl.DataTermImpl;

public class RPJDataStructureHelper {

	public static String getNameFromElement(QDataTerm<?> element) {
		
		QDataTerm<?> dataTerm = null;

		QNode node = element.getParent();
		while (dataTerm == null) {
			if (node instanceof QDataTerm<?>) {
				dataTerm = (QDataTerm<?>) node;
				break;
			} else
				node = node.getParent();

			if (node == null)
				break;
		}

		return dataTerm.getName();
	}
	
	public static void relativizePositions(QCompoundDataDef<?, QDataTerm<?>> dataStructDef) {

		if(isReorderable(dataStructDef))
			reorderDataStruct(dataStructDef);
		
		setFillers(dataStructDef);

		setRelativePositions(dataStructDef);
	}

	public static boolean isReorderable(QCompoundDataDef<?, QDataTerm<?>> dataStructDef) {

		boolean result = true;
		
		for (QDataTerm<?> element : dataStructDef.getElements()) {

			QOverlay overlay = element.getFacet(QOverlay.class);
			if (overlay == null) {
				result = false;
				break;
			}
			
			if(overlay.getPosition() == 0) {
				result = false;
				break;
			}
		}
		
		return result;
	}

	public static void reorderDataStruct(QCompoundDataDef<?, QDataTerm<?>> dataStructDef) {
		
		List<QDataTerm<?>> listElements = new ArrayList<QDataTerm<?>>(dataStructDef.getElements());
		Collections.sort(listElements, new Comparator<QDataTerm<?>>() {

			@Override
			public int compare(QDataTerm<?> paramT1, QDataTerm<?> paramT2) {
				
				QOverlay overlay1 = paramT1.getFacet(QOverlay.class);
				QOverlay overlay2 = paramT2.getFacet(QOverlay.class);
				if(overlay1 == null || overlay2 == null)
					throw new RuntimeException("Unexpected condition: wse98rfvw8e76rv8sd");

				return 	Integer.compare(overlay1.getPosition(), overlay2.getPosition());
			}
		});
		
		dataStructDef.getElements().clear();
		dataStructDef.getElements().addAll(listElements);
	}

	public static void setFillers(QCompoundDataDef<?, QDataTerm<?>> dataStructDef) {

		int expectedPosition = 1;
		
		// set filler
		List<QDataTerm<?>> listElements = new ArrayList<QDataTerm<?>>(dataStructDef.getElements());
		int fillerProg = 0;
		int elementProg = 0;
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

				filler.setName("filler_" + fillerProg);
				QCharacterDef characterDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
				characterDef.setLength(overlay.getPosition() - expectedPosition);
				filler.setDefinition(characterDef);
				dataStructDef.getElements().add(elementProg, filler);
				expectedPosition += characterDef.getLength();
				fillerProg++;
				elementProg++;
				overlay.setPosition(0);
				expectedPosition += bufferedDataDef.getSize();
			}
			
			elementProg++;
		}		
	}

	public static void setRelativePositions(QCompoundDataDef<?, QDataTerm<?>> dataStructDef) {

		List<QDataTerm<?>> listElements = new ArrayList<QDataTerm<?>>(dataStructDef.getElements());
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

			if(element.getDataTermType().isMultiple())
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

	public static Object[] searchOverlayedByPosition(QCompoundDataDef<?, QDataTerm<?>> dataStructDef, int position) {

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
}
