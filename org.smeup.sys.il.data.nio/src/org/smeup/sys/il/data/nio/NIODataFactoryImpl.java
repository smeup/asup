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

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.core.QIntegratedLanguageCoreFactory;
import org.smeup.sys.il.core.QOverlay;
import org.smeup.sys.il.core.annotation.Overlay;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedDataDelegator;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QFloating;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.annotation.DataType;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.def.FloatingType;
import org.smeup.sys.il.data.def.QAdapterDef;
import org.smeup.sys.il.data.def.QArrayDef;
import org.smeup.sys.il.data.def.QAtomicDataDef;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDataStructDef;
import org.smeup.sys.il.data.def.QDatetimeDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QEnumDef;
import org.smeup.sys.il.data.def.QFloatingDef;
import org.smeup.sys.il.data.def.QHexadecimalDef;
import org.smeup.sys.il.data.def.QIndicatorDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.QListDef;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.def.QScrollerDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;
import org.smeup.sys.il.data.def.impl.EnumDefImpl;
import org.smeup.sys.il.data.def.impl.ListDefImpl;
import org.smeup.sys.il.data.term.QDataTerm;

public class NIODataFactoryImpl implements QDataFactory {

	private QContext context;

	protected NIODataFactoryImpl(QContext context) {
		this.context = context;
	}

	protected QContext getContext() {
		return context;
	}

	@Override
	public QData createData(QDataTerm<?> dataTerm, boolean initialize) {
		return createData((QDataDef<?>) dataTerm.getDefinition(), initialize);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <D extends QData> D createData(QDataDef<D> dataDef, boolean initialize) {

		D data = null;

		// array
		if (dataDef instanceof QArrayDef) {
			QArrayDef<?> arrayDef = (QArrayDef<?>) dataDef;
			QUnaryAtomicDataDef<QBufferedData> argument = (QUnaryAtomicDataDef<QBufferedData>) arrayDef.getArgument();

			QBufferedData bufferedData = createArray(argument, arrayDef.getDimension(), initialize);
			data = (D) bufferedData;
		}
		// scroller
		else if (dataDef instanceof QScrollerDef<?>) {
			QScrollerDef<?> scrollerDef = (QScrollerDef<?>) dataDef;
			QUnaryAtomicBufferedDataDef<?> argument = scrollerDef.getArgument();

			data = (D) createScroller(argument, scrollerDef.getDimension(), initialize);
		}
		// dataStroller
		else if (dataDef instanceof QStrollerDef<?>) {
			QStrollerDef<?> strollerDef = (QStrollerDef<?>) dataDef;

			data = (D) createStroller(strollerDef, strollerDef.getDimension(), initialize);
		}
		// list
		else if (dataDef instanceof QListDef<?>) {
			QListDef<?> listDef = (QListDef<?>) dataDef;

			NIODataImpl model = (NIODataImpl) createData(listDef.getArgument(), false);

			data = (D) new NIOListImpl<>(model, listDef.getDimension());
		}
		// dataStruct
		else if (dataDef instanceof QDataStructDef) {
			QDataStructDef dataStructDef = (QDataStructDef) dataDef;

			Class<? extends QDataStruct> delegator = null;
			if (dataStructDef.getClassDelegator() != null) {

				if (!dataStructDef.getElements().isEmpty())
					throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdf9dfg7574c2dn");

				delegator = (Class<? extends QDataStruct>) context.loadClass(dataStructDef.getClassDelegator());

				QDataStruct bufferedData = createDataStruct(delegator, dataStructDef.getLength(), initialize);
				data = (D) bufferedData;
			} else {
				List<QDataTerm<QBufferedDataDef<?>>> arguments = dataStructDef.getElements();
				QDataStruct bufferedData = createDataStruct(arguments, dataStructDef.getLength(), initialize);
				data = (D) bufferedData;
			}
		}
		// base
		else if (dataDef instanceof QAdapterDef)
			// QAdapterDef adapterDef = (QAdapterDef)dataDef;
			data = (D) new NIOAdapterImpl();
		else if (dataDef instanceof QBinaryDef) {
			QBinaryDef binaryType = (QBinaryDef) dataDef;
			data = (D) createBinary(binaryType.getType(), binaryType.isUnsigned(), initialize);
		} else if (dataDef instanceof QCharacterDef) {
			QCharacterDef characterType = (QCharacterDef) dataDef;
			data = (D) createCharacter(characterType.getLength(), characterType.isVarying(), initialize);
		} else if (dataDef instanceof QDatetimeDef) {
			QDatetimeDef datetimeType = (QDatetimeDef) dataDef;
			data = (D) createDate(datetimeType.getType(), datetimeType.getFormat(), initialize);
		} else if (dataDef instanceof QDecimalDef) {
			QDecimalDef decimalType = (QDecimalDef) dataDef;
			data = (D) createDecimal(decimalType.getPrecision(), decimalType.getScale(), decimalType.getType(), initialize);
		} else if (dataDef instanceof QEnumDef<?, ?>)
			data = _createData(dataDef, initialize);
		else if (dataDef instanceof QFloatingDef) {
			QFloatingDef floatingType = (QFloatingDef) dataDef;
			data = (D) createFloating(floatingType.getType(), initialize);
		} else if (dataDef instanceof QHexadecimalDef) {
			QHexadecimalDef hexadecimalDef = (QHexadecimalDef) dataDef;
			data = (D) createHexadecimal(hexadecimalDef.getLength(), initialize);
		} else if (dataDef instanceof QIndicatorDef)
			data = (D) createIndicator(initialize);
		else if (dataDef instanceof QPointerDef) {
			QPointerDef pointerDef = (QPointerDef) dataDef;
			pointerDef.toString();
			// TODO
			data = (D) createPointer(null, initialize);
		} else
			throw new IntegratedLanguageCoreRuntimeException("Unknown dataType: " + dataDef);

		return data;
	}

	@SuppressWarnings("unchecked")
	private <E extends Enum<E>, BD extends QBufferedData, D extends QData> D _createData(QDataDef<D> dataDef, boolean initialize) {

		QEnumDef<E, BD> enumDef = (QEnumDef<E, BD>) dataDef;
		return (D) createEnum(enumDef.getKlass(), createData(enumDef.getDelegate(), false), initialize);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public QDataDef<?> createDataDef(Type type, List<Annotation> annotations) {

		// annotations
		if (annotations == null)
			annotations = new ArrayList<Annotation>();

		// arguments
		List<Type> arguments = new ArrayList<Type>();

		// complete
		Class<? extends QData> klass = completeMetadata(type, arguments, annotations);

		QDataDef<?> dataDef = null;

		// dataStructureDelegator
		if (QDataStructWrapper.class.isAssignableFrom(klass)) {
			QDataStructDef dataStructDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDataStructDef();

			// delegator
			String address = "asup:/omac/" + FrameworkUtil.getBundle(klass).getSymbolicName() + "/" + klass.getName();
			dataStructDef.setClassDelegator(address);

			dataDef = dataStructDef;
		}
		// array
		else if (QArray.class.isAssignableFrom(klass)) {

			QArrayDef<?> arrayDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createArrayDef();

			// argument
			QUnaryAtomicBufferedDataDef<?> argument = (QUnaryAtomicBufferedDataDef<?>) createDataDef(arguments.get(0), annotations);
			arrayDef.setArgument(argument);

			dataDef = arrayDef;
		}
		// stroller
		else if (QStroller.class.isAssignableFrom(klass)) {
			QStrollerDef<?> strollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createStrollerDef();

			// argument
			QDataStructDef argument = (QDataStructDef) createDataDef(arguments.get(0), annotations);
			strollerDef.setClassDelegator(argument.getClassDelegator());
			strollerDef.setPrefix(argument.getPrefix());
			strollerDef.setQualified(argument.isQualified());
			strollerDef.getElements().addAll(argument.getElements());

			dataDef = strollerDef;
		}
		// scroller
		else if (QScroller.class.isAssignableFrom(klass)) {
			QScrollerDef<?> scrollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createScrollerDef();

			// argument
			QUnaryAtomicBufferedDataDef<?> argument = (QUnaryAtomicBufferedDataDef<?>) createDataDef(arguments.get(0), annotations);
			scrollerDef.setArgument(argument);

			dataDef = scrollerDef;
		}
		// list
		else if (QList.class.isAssignableFrom(klass)) {

			class MyDef<D extends QData> extends ListDefImpl<QList<D>> {
				private static final long serialVersionUID = 1L;

			}

			QListDef<?> listDef = new MyDef();
			QUnaryAtomicDataDef<?> argument = (QUnaryAtomicDataDef<?>) createDataDef(arguments.get(0), annotations);
			listDef.setArgument(argument);

			dataDef = listDef;
		}
		// enum
		else if (QEnum.class.isAssignableFrom(klass)) {

			class MyDef<E extends Enum<E>> extends EnumDefImpl<E, QBufferedData> {
				private static final long serialVersionUID = 1L;

				public MyDef(Class<E> klass, List<Annotation> annotations, Type delegate) {

					setDelegate((QBufferedDataDef<QBufferedData>) createDataDef(delegate, annotations));
					setKlass(klass);
				}

				@Override
				public Class<?> getJavaClass() {
					return getKlass();
				}

				@Override
				public Class<QBufferedData> getDataClass() {
					return getDelegate().getDataClass();
				}

				@Override
				public DataDefType getDataDefType() {
					return getDelegate().getDataDefType();
				}

			}
			dataDef = new MyDef((Class<?>) arguments.get(0), annotations, arguments.get(1));
		}

		// other
		else {
			// EMF reflection
			EClassifier eClassifier = QIntegratedLanguageDataDefPackage.eINSTANCE.getEClassifier(klass.getSimpleName().substring(1) + "Def");
			if (eClassifier != null)
				dataDef = (QDataDef<?>) QIntegratedLanguageDataDefFactory.eINSTANCE.create((EClass) eClassifier);
		}

		if (dataDef == null)
			throw new IntegratedLanguageCoreRuntimeException("Unknown class: " + klass);

		injectAnnotations(annotations, dataDef);

		return dataDef;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <D extends QBufferedData> QArray<D> createArray(QUnaryAtomicDataDef<D> argument, int dimension, boolean initialize) {

		NIOBufferedDataImpl model = (NIOBufferedDataImpl) createData(argument, false);

		QArray<D> array = new NIOArrayImpl(model, dimension);

		if (initialize)
			initialize(array);

		return array;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <D extends QBufferedData> QScroller<D> createScroller(QAtomicDataDef<D> argument, int dimension, boolean initialize) {

		QBufferedData model = createData(argument, false);

		QScroller<D> scroller = new NIOScrollerImpl(model, dimension);

		if (initialize)
			initialize(scroller);

		return scroller;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <D extends QDataStruct> QStroller<D> createStroller(QStrollerDef<?> argument, int dimension, boolean initialize) {

		QDataStruct model = null;

		Class<? extends QDataStruct> delegator = null;
		if (argument.getClassDelegator() != null) {

			if (!argument.getElements().isEmpty())
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdf9dfg7574c2dn");

			delegator = (Class<? extends QDataStruct>) context.loadClass(argument.getClassDelegator());

			QDataStruct bufferedData = createDataStruct(delegator, 0, false);
			model = bufferedData;
		} else {
			List<QDataTerm<QBufferedDataDef<?>>> arguments = argument.getElements();
			QDataStruct bufferedData = createDataStruct(arguments, 0, false);
			model = bufferedData;
		}

		QStroller<D> stroller = new NIOStrollerImpl(model, dimension);

		if (initialize)
			initialize(stroller);

		return stroller;
	}

	@Override
	public <D extends QDataStruct> D createDataStruct(Class<D> classDelegator, int length, boolean initialize) {

		// data structure
		D dataStructure = null;

		try {
			dataStructure = classDelegator.newInstance();
		} catch (InstantiationException | IllegalAccessException | SecurityException e) {
			e.printStackTrace();
			return null;
		}

		NIODataStructWrapperHandler dataStructureDelegate = new NIODataStructWrapperHandler(length, dataStructure);

		int p = 1;
		for (Field field : classDelegator.getFields()) {

			// annotations field
			List<Annotation> annotations = new ArrayList<Annotation>();
			for (Annotation annotation : field.getAnnotations())
				annotations.add(annotation);

			QDataDef<?> dataDef = createDataDef(field.getGenericType(), annotations);

			QBufferedData dataElement = (QBufferedData) createData(dataDef, false);

			// facets
			for (Annotation annotation : field.getAnnotations())
				if (annotation instanceof Overlay) {
					Overlay overlay = (Overlay) annotation;

					// TODO check name
					String position = null;
					if (overlay != null)
						position = overlay.position();

					if (position != null)
						if (position.equalsIgnoreCase("*NEXT")) {

						} else
							p = Integer.parseInt(position);

				}

			dataStructureDelegate.addElement(field.getName(), dataElement, p - 1);
			dataStructureDelegate.slice(dataElement, p - 1);

			p += dataElement.getSize();
		}

		if (dataStructure instanceof QDataStructWrapper)
			((QDataStructWrapper) dataStructure).setDelegate(dataStructureDelegate);

		if (initialize)
			initialize(dataStructure);

		return dataStructure;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public <D extends QDataStruct> D createDataStruct(List<QDataTerm<QBufferedDataDef<?>>> dataTerms, int length, boolean initialize) {

		NIODataStructImpl dataStructureDelegate = new NIODataStructImpl(length);

		int p = 1;
		for (QDataTerm<?> dataTerm : dataTerms) {

			QBufferedData dataElement = (QBufferedData) createData(dataTerm, false);

			QOverlay overlay = dataTerm.getFacet(QOverlay.class);
			String position = null;
			if (overlay != null)
				position = overlay.getPosition();

			if (position != null)
				if (position.equalsIgnoreCase("*NEXT")) {

				} else
					p = Integer.parseInt(position);

			dataStructureDelegate.addElement(dataTerm.getName(), dataElement, p - 1);
			dataStructureDelegate.slice(dataElement, p - 1);

			p += dataElement.getSize();

		}

		if (initialize)
			initialize(dataStructureDelegate);

		return (D) dataStructureDelegate;
	}

	@Override
	public <E extends Enum<E>, D extends QBufferedData> QEnum<E, D> createEnum(Class<E> classEnumerator, D dataDelegate, boolean initialize) {
		return new NIOEnumImpl<E, D>(classEnumerator, dataDelegate);
	}

	@Override
	public QCharacter createCharacter(int length, boolean varying, boolean initialize) {

		QCharacter character = null;
		if (varying)
			character = new NIOCharacterVaryingImpl(length);
		else
			character = new NIOCharacterImpl(length);

		if (initialize)
			initialize(character);

		return character;
	}

	@Override
	public QBinary createBinary(BinaryType type, boolean unsigned, boolean initialize) {

		QBinary binary = new NIOBinaryImpl(type, unsigned);

		if (initialize)
			initialize(binary);

		return binary;
	}

	@Override
	public QDecimal createDecimal(int precision, int scale, DecimalType type, boolean initialize) {

		QDecimal decimal = null;

		switch (type) {
		case ZONED:
			decimal = new NIODecimalImpl(precision, scale);
			break;
		case PACKED:
			break;
		}

		if (initialize)
			initialize(decimal);

		return decimal;
	}

	@Override
	public QIndicator createIndicator(boolean initialize) {

		QIndicator indicator = new NIOIndicatorImpl();

		if (initialize)
			initialize(indicator);

		return indicator;
	}

	@Override
	public QDatetime createDate(DatetimeType type, String format, boolean initialize) {

		NIODatetimeImpl datetime = new NIODatetimeImpl(type, format);

		if (initialize)
			initialize(datetime);

		return datetime;
	}

	@Override
	public QFloating createFloating(FloatingType type, boolean initialize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QHexadecimal createHexadecimal(int length, boolean initialize) {

		QHexadecimal hexadecimal = new NIOHexadecimalImpl(length);

		if (initialize)
			initialize(hexadecimal);

		return hexadecimal;
	}

	@Override
	public QPointer createPointer(QBufferedData target, boolean initialize) {
		return new NIOPointerImpl(target);
	}

	@Override
	public QDatetime createTime(boolean initialize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QDatetime createTimestamp(boolean initialize) {
		// TODO Auto-generated method stub
		return null;
	}

	private void initialize(QData data) {

		NIOBufferedDataImpl nioBufferedData = null;
		if (data instanceof NIOBufferedDataImpl)
			nioBufferedData = (NIOBufferedDataImpl) data;
		else if (data instanceof QBufferedDataDelegator)
			nioBufferedData = (NIOBufferedDataImpl) ((QBufferedDataDelegator) data).getDelegate();
		else
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: khsd87sd74c2dn");
		nioBufferedData.allocate();
	}

	@SuppressWarnings("unchecked")
	private Class<? extends QData> completeMetadata(Type type, List<Type> arguments, List<Annotation> annotations) {

		// klass
		Class<? extends QData> klass = null;
		if (type instanceof ParameterizedType) {
			ParameterizedType pType = (ParameterizedType) type;
			klass = (Class<? extends QData>) pType.getRawType();
			for (Type argument : pType.getActualTypeArguments())
				arguments.add(argument);
		} else
			klass = (Class<? extends QData>) type;

		// append class annotation
		for (Annotation annotation : klass.getAnnotations()) {
			// dataType filter
			if (!annotation.annotationType().isAnnotationPresent(DataType.class))
				continue;
			annotations.add(annotation);
		}

		return klass;
	}

	private void injectAnnotations(List<Annotation> annotations, Object target) {

		EObject eObject = (EObject) target;
		EClass eClass = eObject.eClass();

		// merge annotations by reflection
		for (Annotation annotation : annotations)
			for (Method method : annotation.getClass().getDeclaredMethods()) {

				// EMF reflection
				// TODO Java reflection
				EStructuralFeature eFeature = null;

				// if default field (value) use annotation name
				// if (method.getName().equals("value"))
				// eFeature =
				// eClass.getEStructuralFeature(annotation.annotationType().getSimpleName().toLowerCase());
				// else
				eFeature = eClass.getEStructuralFeature(method.getName());

				if (eFeature == null)
					if (eClass.getName().replaceAll("Def", "").equalsIgnoreCase(method.getName().replace("Type", "")))
						eFeature = eClass.getEStructuralFeature("type");
					else if (eClass.getName().replaceAll("Def", "").equalsIgnoreCase(method.getName().replace("Format", "")))
						eFeature = eClass.getEStructuralFeature("format");

				if (eFeature != null)
					try {
						Object object = method.invoke(annotation, new Object[] {});
						if (object instanceof Overlay) {
							Overlay overlay = (Overlay) object;
							QOverlay qOverlay = QIntegratedLanguageCoreFactory.eINSTANCE.createOverlay();
							qOverlay.setName(overlay.name());
							qOverlay.setPosition(overlay.position());
							object = qOverlay;
						}

						if (!(object instanceof Class<?>))
							if (object != null && object.getClass().isArray()) {
								List<Object> objects = new ArrayList<>();
								for (Object element : (Object[]) object)
									objects.add(element);
								eObject.eSet(eFeature, objects);
							} else
								eObject.eSet(eFeature, object);

					} catch (Exception e) {
						throw new IntegratedLanguageCoreRuntimeException(e);
					}
			}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <D extends QData> QList<D> createList(QUnaryAtomicDataDef<D> argument, int dimension, boolean initialize) {

		NIODataImpl model = (NIODataImpl) createData(argument, initialize);

		QList<D> list = new NIOListImpl(model, dimension);

		return list;

	}
}
