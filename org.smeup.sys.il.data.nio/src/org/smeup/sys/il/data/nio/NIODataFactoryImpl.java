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

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataAreaFactory;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QFloating;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.SortDirection;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.DataType;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.def.FloatingType;
import org.smeup.sys.il.data.def.QAdapterDef;
import org.smeup.sys.il.data.def.QArrayDef;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDataAreaDef;
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
import org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.def.QScrollerDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;
import org.smeup.sys.il.data.def.QUnaryBufferedDataDef;
import org.smeup.sys.il.data.def.TimeFormat;
import org.smeup.sys.il.data.def.impl.EnumDefImpl;
import org.smeup.sys.il.data.def.impl.ListDefImpl;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermFactory;
import org.smeup.sys.il.data.term.QOverlay;

public class NIODataFactoryImpl implements QDataFactory {

	private QDataAreaFactory dataAreaFactory;
	private QDataContext dataContext;
	private QDataWriter dataWriter;

	protected NIODataFactoryImpl(QDataContext dataContext, QDataAreaFactory dataAreaFactory) {
		this.dataContext = dataContext;
		this.dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
		this.dataAreaFactory = dataAreaFactory;
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
			QBufferedData bufferedData = createArray(arrayDef.getArgument(), arrayDef.getDimension(), arrayDef.getOrder(), initialize);
			data = (D) bufferedData;
		}
		// scroller
		else if (dataDef instanceof QScrollerDef<?>) {
			QScrollerDef<?> scrollerDef = (QScrollerDef<?>) dataDef;
			data = (D) createScroller(scrollerDef.getArgument(), scrollerDef.getDimension(), initialize);
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

			data = (D) new NIOListImpl<>(getDataContext(), model, listDef.getDimension());
		}
		// dataStruct
		else if (dataDef instanceof QDataStructDef) {
			QDataStructDef dataStructDef = (QDataStructDef) dataDef;

			Class<? extends QDataStruct> delegator = null;
			if (dataStructDef.getClassDelegator() != null) {

				if (!dataStructDef.getElements().isEmpty())
					throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdf9dfg7574c2dn");

				delegator = (Class<? extends QDataStruct>) dataContext.getContext().loadClass(dataStructDef.getClassDelegator());

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
			data = (D) new NIOAdapterImpl(getDataContext());
		else if (dataDef instanceof QBinaryDef) {
			QBinaryDef binaryDef = (QBinaryDef) dataDef;
			data = (D) createBinary(binaryDef.getType(), binaryDef.isUnsigned(), initialize);
		} else if (dataDef instanceof QCharacterDef) {
			QCharacterDef characterDef = (QCharacterDef) dataDef;
			data = (D) createCharacter(characterDef.getLength(), characterDef.isVarying(), initialize);
		} else if (dataDef instanceof QDatetimeDef) {
			QDatetimeDef datetimeDef = (QDatetimeDef) dataDef;
			data = (D) createDate(datetimeDef.getType(), datetimeDef.getDateFormat(), datetimeDef.getTimeFormat(), initialize);
		} else if (dataDef instanceof QDecimalDef) {
			QDecimalDef decimalDef = (QDecimalDef) dataDef;
			data = (D) createDecimal(decimalDef.getPrecision(), decimalDef.getScale(), decimalDef.getType(), initialize);
		} else if (dataDef instanceof QEnumDef<?, ?>)
			data = _createData(dataDef, initialize);
		else if (dataDef instanceof QFloatingDef) {
			QFloatingDef floatingDef = (QFloatingDef) dataDef;
			data = (D) createFloating(floatingDef.getType(), initialize);
		} else if (dataDef instanceof QHexadecimalDef) {
			QHexadecimalDef hexadecimalDef = (QHexadecimalDef) dataDef;
			data = (D) createHexadecimal(hexadecimalDef.getLength(), initialize);
		} else if (dataDef instanceof QIndicatorDef)
			data = (D) createIndicator(initialize);
		else if (dataDef instanceof QPointerDef) {
			data = (D) createPointer(0);
		} else if (dataDef instanceof QDataAreaDef) {
			QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) dataDef;
			data = (D) createDataArea(dataAreaDef.getArgument(), dataAreaDef.getExternalName(), initialize);
		} else
			throw new IntegratedLanguageCoreRuntimeException("Unknown dataType: " + dataDef);

		return data;
	}

	@SuppressWarnings("unchecked")
	private <E extends Enum<E>, BD extends QBufferedElement, D extends QData> D _createData(QDataDef<D> dataDef, boolean initialize) {

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
			QDataDef<?> argumentDef = createDataDef(arguments.get(0), annotations);
			arrayDef.setArgument((QUnaryAtomicBufferedDataDef<?>) argumentDef);

			dataDef = arrayDef;
		}
		// dataArea
		else if (QDataArea.class.isAssignableFrom(klass)) {

			QDataAreaDef<QBufferedElement> dataAreaDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDataAreaDef();
			// argument
			QUnaryBufferedDataDef<QBufferedElement> argument = (QUnaryBufferedDataDef<QBufferedElement>) createDataDef(arguments.get(0), annotations);
			dataAreaDef.setArgument(argument);

			dataDef = dataAreaDef;
		}
		// stroller
		else if (QStroller.class.isAssignableFrom(klass)) {
			QStrollerDef<?> strollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createStrollerDef();

			// argument
			QDataStructDef argument = (QDataStructDef) createDataDef(arguments.get(0), annotations);
			strollerDef.setClassDelegator(argument.getClassDelegator());
			strollerDef.setPrefix(argument.getPrefix());
			strollerDef.setQualified(argument.isQualified());
			strollerDef.setInitialized(argument.isInitialized());
			strollerDef.getElements().addAll(argument.getElements());

			dataDef = strollerDef;
		}
		// scroller
		else if (QScroller.class.isAssignableFrom(klass)) {
			QScrollerDef<?> scrollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createScrollerDef();

			// argument
			QDataDef<?> argumentDef = createDataDef(arguments.get(0), annotations);
			scrollerDef.setArgument((QUnaryAtomicBufferedDataDef<?>) argumentDef);

			dataDef = scrollerDef;
		}
		// list
		else if (QList.class.isAssignableFrom(klass)) {

			class MyDef<D extends QData> extends ListDefImpl<QList<D>> {
				private static final long serialVersionUID = 1L;

			}

			QListDef<?> listDef = new MyDef();
			QDataDef<?> argumentDef = (QUnaryAtomicDataDef<?>) createDataDef(arguments.get(0), annotations);
			listDef.setArgument((QUnaryAtomicDataDef<?>) argumentDef);

			dataDef = listDef;
		}
		// enum
		else if (QEnum.class.isAssignableFrom(klass)) {

			class MyDef<E extends Enum<E>> extends EnumDefImpl<E, QBufferedElement> {
				private static final long serialVersionUID = 1L;

				public MyDef(Class<E> klass, List<Annotation> annotations, Type delegate) {

					setDelegate((QBufferedDataDef<QBufferedElement>) createDataDef(delegate, annotations));
					setKlass(klass);
				}

				@Override
				public Class<?> getJavaClass() {
					return getKlass();
				}

				@Override
				public Class<QBufferedElement> getDataClass() {
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
	public <D extends QBufferedElement> QDataArea<D> createDataArea(QUnaryBufferedDataDef<D> argument, String externalName, boolean initialize) {

		D argumentData = (D) createData(argument, initialize);
		QDataArea<D> nioDataAreaImpl = dataAreaFactory.createDataArea(getDataContext(), argumentData, externalName);

		return nioDataAreaImpl;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <D extends QBufferedElement> QScroller<D> createScroller(QUnaryAtomicBufferedDataDef<D> argument, int dimension, boolean initialize) {

		QBufferedElement model = createData(argument, false);

		QScroller<D> scroller = new NIOScrollerImpl(getDataContext(), model, dimension);

		if (initialize)
			initialize(scroller);

		return scroller;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <D extends QBufferedElement> QArray<D> createArray(QUnaryAtomicBufferedDataDef<D> argument, int dimension, SortDirection sortDirection, boolean initialize) {

		QBufferedElement model = (QBufferedElement) createData(argument, false);

		QArray<D> array = new NIOArrayImpl(getDataContext(), model, dimension, sortDirection);

		if (initialize)
			initialize(array);

		return array;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <D extends QDataStruct> QStroller<D> createStroller(QStrollerDef<?> argument, int dimension, boolean initialize) {

		QDataStruct model = null;

		Class<? extends QDataStruct> delegator = null;
		if (argument.getClassDelegator() != null) {

			if (!argument.getElements().isEmpty())
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdf9dfg7574c2dn");

			delegator = (Class<? extends QDataStruct>) dataContext.getContext().loadClass(argument.getClassDelegator());

			QDataStruct bufferedData = createDataStruct(delegator, 0, false);
			model = bufferedData;
		} else {
			List<QDataTerm<QBufferedDataDef<?>>> arguments = argument.getElements();
			QDataStruct bufferedData = createDataStruct(arguments, 0, false);
			model = bufferedData;
		}

		QStroller<D> stroller = new NIOStrollerImpl(getDataContext(), model, dimension);

		if (initialize)
			initialize(stroller);

		return stroller;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R extends QRecord> R createRecord(Class<R> wrapper, boolean initialize) {

		Class<? extends QDataStruct> classDataStruct = (Class<? extends QDataStruct>) wrapper;
		return (R) createDataStruct(classDataStruct, 0, initialize);
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

		NIODataStructWrapperHandler dataStructureDelegate = new NIODataStructWrapperHandler(getDataContext(), length, dataStructure);

		NIODataStructBuilder dataStructBuilder = new NIODataStructBuilder(this, dataStructureDelegate);
		List<Field> fields = NIODataStructHelper.getFields(classDelegator);
		for (Field field : fields) {

			// annotations field
			List<Annotation> annotations = new ArrayList<Annotation>();
			for (Annotation annotation : field.getAnnotations())
				annotations.add(annotation);

			// create element
			QDataDef<?> dataDef = createDataDef(field.getGenericType(), annotations);
			QBufferedData dataElement = (QBufferedData) createData(dataDef, false);
			
			dataStructBuilder.addElement(field, dataElement);
		}

		if (dataStructure instanceof QDataStructWrapper)
			((QDataStructWrapper) dataStructure).setDelegate(dataStructureDelegate);

		if (initialize) {
			initialize(dataStructure);

			// default
			for (Field field : fields) {

				DataDef annotationDef = field.getAnnotation(DataDef.class);
				if (annotationDef == null)
					continue;

				QData dataElement = dataStructure.getElement(field.getName());
				if (dataElement == null)
					continue; // TODO throw Exception

				// default
				if (dataElement instanceof QBufferedList<?>) {
					QBufferedList<?> array = (QBufferedList<?>) dataElement;
					int i = 1;
					if (annotationDef.values().length > 0) {
						for (String value : annotationDef.values()) {
							array.get(i).accept(dataWriter.set(value));
							i++;
						}
					} else if (!annotationDef.value().isEmpty()) {
						String value = annotationDef.value();
						if (value.startsWith("*")) {
							DataSpecial dataSpecial = DataSpecial.get(value);
							array.eval(dataSpecial);
						} else
							array.eval(value);
					}
				} else if (dataElement instanceof QBufferedElement) {
					QBufferedElement element = (QBufferedElement) dataElement;
					if (!annotationDef.value().isEmpty()) {
						String value = annotationDef.value();
						if (value.startsWith("*")) {
							DataSpecial dataSpecial = DataSpecial.get(value);
							if (dataSpecial == null)
								element.movel(value, true);
							else
								element.movel(dataSpecial, true);
						} else
							element.movel(value, true);
					}
				} else
					throw new IntegratedLanguageCoreRuntimeException("Unexpected condition wueyrow34tfdsh");
			}
		}

		return dataStructure;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <D extends QDataStruct> D createDataStruct(List<QDataTerm<QBufferedDataDef<?>>> dataTerms, int length, boolean initialize) {

		NIODataStructImpl dataStructureDelegate = new NIODataStructImpl(getDataContext(), length);
		
		NIODataStructBuilder dataStructBuilder = new NIODataStructBuilder(this, dataStructureDelegate);

		for (QDataTerm<?> dataTerm : dataTerms) {

			QBufferedData dataElement = (QBufferedData) createData(dataTerm, false);
			dataStructBuilder.addElement(dataTerm, dataElement);
		}

		if (initialize)
			initialize(dataStructureDelegate);

		return (D) dataStructureDelegate;
	}

	@Override
	public <E extends Enum<E>, D extends QBufferedElement> QEnum<E, D> createEnum(Class<E> classEnumerator, D dataDelegate, boolean initialize) {
		return new NIOEnumImpl<E, D>(getDataContext(), classEnumerator, dataDelegate);
	}

	@Override
	public QCharacter createCharacter(int length, boolean varying, boolean initialize) {

		QCharacter character = null;
		if (varying)
			character = new NIOCharacterVaryingImpl(getDataContext(), length);
		else
			character = new NIOCharacterImpl(getDataContext(), length);

		if (initialize)
			initialize(character);

		return character;
	}

	@Override
	public QBinary createBinary(BinaryType type, boolean unsigned, boolean initialize) {

		QBinary binary = new NIOBinaryImpl(getDataContext(), type, unsigned);

		if (initialize)
			initialize(binary);

		return binary;
	}

	@Override
	public QDecimal createDecimal(int precision, int scale, DecimalType type, boolean initialize) {

		QDecimal decimal = null;

		switch (type) {
		case ZONED:
			decimal = new NIODecimalZonedImpl(getDataContext(), precision, scale);
			break;
		case PACKED:
			decimal = new NIODecimalPackedImpl(getDataContext(), precision, scale);
			break;
		}

		if (initialize)
			initialize(decimal);

		return decimal;
	}

	@Override
	public QIndicator createIndicator(boolean initialize) {

		QIndicator indicator = new NIOIndicatorImpl(getDataContext());

		if (initialize)
			initialize(indicator);

		return indicator;
	}

	@Override
	public QDatetime createDate(DatetimeType type, DateFormat dateFormat, TimeFormat timeFormat, boolean initialize) {

		NIODatetimeImpl datetime = new NIODatetimeImpl(getDataContext(), type, dateFormat, timeFormat);

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

		QHexadecimal hexadecimal = new NIOHexadecimalImpl(getDataContext(), length);

		if (initialize)
			initialize(hexadecimal);

		return hexadecimal;
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

		NIOBufferedDataImpl nioBufferedData = NIOBufferHelper.getNIOBufferedDataImpl(data);
		if (nioBufferedData == null)
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
		for (Annotation annotation : annotations) {

			if (annotation instanceof DataDef) {
				DataDef dataDef = (DataDef) annotation;
				if (dataDef.packed()) {
					if (eObject instanceof QMultipleAtomicBufferedDataDef<?>) {
						QMultipleAtomicBufferedDataDef<?> multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) eObject;
						QDecimalDef decimalDef = (QDecimalDef) multipleAtomicBufferedDataDef.getArgument();
						decimalDef.setType(DecimalType.PACKED);
					} else {
						if (eObject instanceof QDataAreaDef<?>) {
							QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) eObject;
							QDecimalDef decimalDef = (QDecimalDef) dataAreaDef.getArgument();
							decimalDef.setType(DecimalType.PACKED);
						} else {
							QDecimalDef decimalDef = (QDecimalDef) eObject;
							decimalDef.setType(DecimalType.PACKED);
						}
					}
				}
			}
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

				if (eFeature == null)
					continue;

				try {
					Object object = method.invoke(annotation, new Object[] {});
					if (object instanceof Overlay) {
						Overlay overlay = (Overlay) object;
						QOverlay qOverlay = QIntegratedLanguageDataTermFactory.eINSTANCE.createOverlay();
						if (!overlay.name().equalsIgnoreCase(Overlay.NAME_OWNER))
							// TODO remove lowerCase
							qOverlay.setName(overlay.name().toLowerCase());
						if (overlay.position() != 0)
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
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <D extends QData> QList<D> createList(QUnaryAtomicDataDef<D> argument, int dimension, boolean initialize) {

		NIODataImpl model = (NIODataImpl) createData(argument, initialize);

		QList<D> list = new NIOListImpl(getDataContext(), model, dimension);

		return list;
	}

	@Override
	public QPointer createPointer(final int bufferLength) {

		if (bufferLength < 0)
			throw new IntegratedLanguageDataRuntimeException("Invalid bufferLength");

		return new NIOPointerImpl(getDataContext(), new NIOStorageImpl(bufferLength));
	}

	@Override
	public QPointer createPointer(QPointer pointer, int newSize) {

		NIOPointerImpl oldPointer = (NIOPointerImpl) pointer;
		ByteBuffer oldBuffer = oldPointer.getBuffer();

		NIOPointerImpl newPointer = (NIOPointerImpl) createPointer(newSize);
		ByteBuffer newBuffer = newPointer.getBuffer();

		NIOBufferHelper.movel(newBuffer, 0, newSize, oldBuffer.array(), false, (byte) 0);

		return newPointer;
	}

	public QDataContext getDataContext() {
		return this.dataContext;
	}
}
