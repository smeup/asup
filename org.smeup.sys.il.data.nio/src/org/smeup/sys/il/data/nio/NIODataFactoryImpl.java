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
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataAreaFactory;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QFloating;
import org.smeup.sys.il.data.QGraphic;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QString;
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
import org.smeup.sys.il.data.def.QGraphicDef;
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

public final class NIODataFactoryImpl implements QDataFactory {

	private final QDataAreaFactory dataAreaFactory;
	private final QDataContext dataContext;
	private final Object owner;

//	private static Map<Class<?>, QDataStruct> cachedClasses = new HashMap<Class<?>, QDataStruct>();

	protected NIODataFactoryImpl(final QDataContext dataContext, final Object owner, final QDataAreaFactory dataAreaFactory) {
		this.dataContext = dataContext;
		this.owner = owner;
		this.dataAreaFactory = dataAreaFactory;
	}

	@Override
	public final QData createData(final QDataTerm<?> dataTerm, final boolean allocate) {
		return createData((QDataDef<?>) dataTerm.getDefinition(), allocate);
	}

	protected QDataAreaFactory getDataAreaFactory() {
		return this.dataAreaFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public final <D extends QData> D createData(final QDataDef<D> dataDef, final boolean allocate) {

		D data = null;

		// array
		if (dataDef instanceof QArrayDef) {
			final QArrayDef<?> arrayDef = (QArrayDef<?>) dataDef;
			final QBufferedData bufferedData = createArray(arrayDef.getArgument(), arrayDef.getDimension(), arrayDef.getOrder(), allocate);
			data = (D) bufferedData;
		}
		// scroller
		else if (dataDef instanceof QScrollerDef<?>) {
			final QScrollerDef<?> scrollerDef = (QScrollerDef<?>) dataDef;
			data = (D) createScroller(scrollerDef.getArgument(), scrollerDef.getDimension(), allocate);
		}
		// dataStroller
		else if (dataDef instanceof QStrollerDef<?>) {
			final QStrollerDef<?> strollerDef = (QStrollerDef<?>) dataDef;
			data = (D) createStroller(strollerDef, strollerDef.getDimension(), allocate);
		}
		// list
		else if (dataDef instanceof QListDef<?>) {
			final QListDef<?> listDef = (QListDef<?>) dataDef;
			data = (D) createList(listDef.getArgument(), listDef.getDimension());
		}
		// dataStruct
		else if (dataDef instanceof QDataStructDef) {
			final QDataStructDef dataStructDef = (QDataStructDef) dataDef;

			Class<? extends QDataStruct> delegator = null;
			if (dataStructDef.getClassDelegator() != null) {

				if (!dataStructDef.getElements().isEmpty())
					throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdf9dfg7574c2dn");

				delegator = (Class<? extends QDataStruct>) dataContext.getContext().loadClass(dataStructDef.getClassDelegator());

				final QDataStruct bufferedData = createDataStruct(delegator, dataStructDef.getLength(), allocate);
				data = (D) bufferedData;
			} else {
				final List<QDataTerm<QBufferedDataDef<?>>> arguments = dataStructDef.getElements();
				final QDataStruct bufferedData = createDataStruct(arguments, dataStructDef.getLength(), allocate);
				data = (D) bufferedData;
			}
		}
		// base
		else if (dataDef instanceof QAdapterDef)
			// QAdapterDef adapterDef = (QAdapterDef)dataDef;
			data = (D) new NIOAdapterImpl(getDataContext());
		else if (dataDef instanceof QBinaryDef) {
			final QBinaryDef binaryDef = (QBinaryDef) dataDef;
			data = (D) createBinary(binaryDef.getType(), binaryDef.isUnsigned(), allocate);
		} else if (dataDef instanceof QCharacterDef) {
			final QCharacterDef characterDef = (QCharacterDef) dataDef;
			data = (D) createCharacter(characterDef.getLength(), characterDef.isVarying(), allocate);
		} else if (dataDef instanceof QGraphicDef) {
			final QGraphicDef graphicDef = (QGraphicDef) dataDef;
			data = (D) createGraphic(graphicDef.getLength(), allocate);
		}
		else if (dataDef instanceof QDatetimeDef) {
			final QDatetimeDef datetimeDef = (QDatetimeDef) dataDef;
			data = (D) createDate(datetimeDef.getType(), datetimeDef.getDateFormat(), datetimeDef.getTimeFormat(), allocate);
		} else if (dataDef instanceof QDecimalDef) {
			final QDecimalDef decimalDef = (QDecimalDef) dataDef;
			data = (D) createDecimal(decimalDef.getPrecision(), decimalDef.getScale(), decimalDef.getType(), allocate);
		} else if (dataDef instanceof QEnumDef<?, ?>)
			data = _createData(dataDef, allocate);
		else if (dataDef instanceof QFloatingDef) {
			final QFloatingDef floatingDef = (QFloatingDef) dataDef;
			data = (D) createFloating(floatingDef.getType(), allocate);
		} else if (dataDef instanceof QHexadecimalDef) {
			final QHexadecimalDef hexadecimalDef = (QHexadecimalDef) dataDef;
			data = (D) createHexadecimal(hexadecimalDef.getLength(), allocate);
		} else if (dataDef instanceof QIndicatorDef)
			data = (D) createIndicator(allocate);
		else if (dataDef instanceof QPointerDef)
			data = (D) createPointer(0);
		else if (dataDef instanceof QDataAreaDef) {
			final QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) dataDef;
			
			QString externalName = createCharacter(21, false, true);
			if(dataAreaDef.getExternalName().startsWith("#")) {
				
			}
			else {
				externalName.eval(dataAreaDef.getExternalName());
			}
			data = (D) createDataArea(dataAreaDef.getArgument(), externalName, allocate);
		} else
			throw new IntegratedLanguageCoreRuntimeException("Unknown dataType: " + dataDef);

		return data;
	}

	@SuppressWarnings("unchecked")
	private final <E extends Enum<E>, BD extends QBufferedElement, D extends QData> D _createData(final QDataDef<D> dataDef, final boolean allocate) {

		final QEnumDef<E, BD> enumDef = (QEnumDef<E, BD>) dataDef;
		return (D) createEnum(enumDef.getKlass(), createData(enumDef.getDelegate(), allocate));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public final QDataDef<?> createDataDef(final Type type, List<Annotation> annotations) {

		// annotations
		if (annotations == null)
			annotations = new ArrayList<Annotation>();

		// arguments
		final List<Type> arguments = new ArrayList<Type>();

		// complete
		final Class<? extends QData> klass = completeMetadata(type, arguments, annotations);

		QDataDef<?> dataDef = null;

		// dataStructureDelegator
		if (QDataStructWrapper.class.isAssignableFrom(klass)) {
			final QDataStructDef dataStructDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDataStructDef();

			// delegator
			final String address = "asup:/omac/" + FrameworkUtil.getBundle(klass).getSymbolicName() + "/" + klass.getName();
			dataStructDef.setClassDelegator(address);

			dataDef = dataStructDef;
		}
		// array
		else if (QArray.class.isAssignableFrom(klass)) {

			final QArrayDef<?> arrayDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createArrayDef();

			// argument
			final QDataDef<?> argumentDef = createDataDef(arguments.get(0), annotations);
			arrayDef.setArgument((QUnaryAtomicBufferedDataDef<?>) argumentDef);

			dataDef = arrayDef;
		}
		// dataArea
		else if (QDataArea.class.isAssignableFrom(klass)) {

			final QDataAreaDef<QBufferedElement> dataAreaDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createDataAreaDef();
			// argument
			final QUnaryBufferedDataDef<QBufferedElement> argument = (QUnaryBufferedDataDef<QBufferedElement>) createDataDef(arguments.get(0), annotations);
			dataAreaDef.setArgument(argument);

			dataDef = dataAreaDef;
		}
		// stroller
		else if (QStroller.class.isAssignableFrom(klass)) {
			final QStrollerDef<?> strollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createStrollerDef();

			// argument
			final QDataStructDef argument = (QDataStructDef) createDataDef(arguments.get(0), annotations);
			strollerDef.setClassDelegator(argument.getClassDelegator());
			strollerDef.setPrefix(argument.getPrefix());
			strollerDef.setQualified(argument.isQualified());
			strollerDef.setInitialized(argument.isInitialized());
			strollerDef.getElements().addAll(argument.getElements());

			dataDef = strollerDef;
		}
		// scroller
		else if (QScroller.class.isAssignableFrom(klass)) {
			final QScrollerDef<?> scrollerDef = QIntegratedLanguageDataDefFactory.eINSTANCE.createScrollerDef();

			// argument
			final QDataDef<?> argumentDef = createDataDef(arguments.get(0), annotations);
			scrollerDef.setArgument((QUnaryAtomicBufferedDataDef<?>) argumentDef);

			dataDef = scrollerDef;
		}
		// list
		else if (QList.class.isAssignableFrom(klass)) {

			class MyDef<D extends QData> extends ListDefImpl<QList<D>> {
				private static final long serialVersionUID = 1L;

			}

			final QListDef<?> listDef = new MyDef();
			final QDataDef<?> argumentDef = createDataDef(arguments.get(0), annotations);
			listDef.setArgument((QUnaryAtomicDataDef<?>) argumentDef);

			dataDef = listDef;
		}
		// enum
		else if (QEnum.class.isAssignableFrom(klass)) {

			class MyDef<E extends Enum<E>> extends EnumDefImpl<E, QBufferedElement> {
				private static final long serialVersionUID = 1L;

				public MyDef(final Class<E> klass, final List<Annotation> annotations, final Type delegate) {

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
			final EClassifier eClassifier = QIntegratedLanguageDataDefPackage.eINSTANCE.getEClassifier(klass.getSimpleName().substring(1) + "Def");
			if (eClassifier != null)
				dataDef = (QDataDef<?>) QIntegratedLanguageDataDefFactory.eINSTANCE.create((EClass) eClassifier);
		}

		if (dataDef == null)
			throw new IntegratedLanguageCoreRuntimeException("Unknown class: " + klass);

		injectAnnotations(annotations, dataDef);

		return dataDef;
	}

	@Override
	public final <D extends QBufferedElement> QDataArea<D> createDataArea(final QUnaryBufferedDataDef<D> argument, QString externalName, final boolean allocate) {

		final D argumentData = createData(argument, allocate);
		final QDataArea<D> nioDataAreaImpl = dataAreaFactory.createDataArea(getDataContext(), argumentData, externalName);

		return nioDataAreaImpl;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public final <D extends QBufferedElement> QScroller<D> createScroller(final QUnaryAtomicBufferedDataDef<D> argument, final int dimension, final boolean allocate) {

		final QBufferedElement model = createData(argument, false);

		final NIOScrollerImpl<D> scroller = new NIOScrollerImpl(getDataContext(), model, dimension, allocate);

		return scroller;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public final <D extends QBufferedElement> QArray<D> createArray(final QUnaryAtomicBufferedDataDef<D> argument, final int dimension, final SortDirection sortDirection, final boolean allocate) {

		final QBufferedElement model = createData(argument, false);

		final NIOArrayImpl<D> array = new NIOArrayImpl(getDataContext(), model, dimension, sortDirection, allocate);

		return array;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public final <D extends QDataStruct> QStroller<D> createStroller(final QStrollerDef<?> argument, final int dimension, final boolean allocate) {

		QDataStruct model = null;

		Class<? extends QDataStruct> delegator = null;
		if (argument.getClassDelegator() != null) {

			if (!argument.getElements().isEmpty())
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdf9dfg7574c2dn");

			delegator = (Class<? extends QDataStruct>) dataContext.getContext().loadClass(argument.getClassDelegator());

			final QDataStruct bufferedData = createDataStruct(delegator, 0, false);
			model = bufferedData;
		} else {
			final List<QDataTerm<QBufferedDataDef<?>>> arguments = argument.getElements();
			final QDataStruct bufferedData = createDataStruct(arguments, 0, false);
			model = bufferedData;
		}

		final NIOStrollerImpl<D> stroller = new NIOStrollerImpl(getDataContext(), model, dimension, allocate);

		return stroller;
	}

	@SuppressWarnings("unchecked")
	@Override
	public final <R extends QRecord> R createRecord(final Class<R> wrapper, final boolean allocate) {

		final Class<? extends QDataStruct> classDataStruct = (Class<? extends QDataStruct>) wrapper;
		return (R) createDataStruct(classDataStruct, 0, allocate);
	}

	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public final <D extends QDataStruct> D createDataStruct(final Class<D> classDelegator, final int length, final boolean allocate) {

		// data structure
		D dataStructure = null;

		final QDataStruct model = null; //getDataContext().deserialize(classDelegator, allocate, "factory");
		if (model != null) {
//			final NIOAbstractDataStruct nioDataStructure = (NIOAbstractDataStruct) NIOBufferHelper.getNIOBufferedDataImpl(model)._copyDef(getDataContext());
			NIOAbstractDataStruct nioDataStructure = (NIOAbstractDataStruct)NIOBufferHelper.getNIOBufferedDataImpl(model); 
			if (length != 0 && nioDataStructure._maxLength != length)
				nioDataStructure._maxLength = length;

//			if (allocate)
//				nioDataStructure._allocate();

			if (nioDataStructure instanceof NIODataStructWrapperHandler)
				dataStructure = (D) ((NIODataStructWrapperHandler) nioDataStructure)._wrapped;
			else
				dataStructure = (D) nioDataStructure;

			return dataStructure;
		}

		if (owner == null || Modifier.isStatic(classDelegator.getModifiers()))
			try {
				dataStructure = classDelegator.newInstance();

				if (dataStructure instanceof QDataStructWrapper) {
					final NIODataStructWrapperHandler dataStructureDelegate = new NIODataStructWrapperHandler(getDataContext(), length, dataStructure, allocate);
					((QDataStructWrapper) dataStructure).setDelegate(dataStructureDelegate);
				}

//				getDataContext().serialize(dataStructure, allocate, "factory");
//				cachedClasses.put(classDelegator, (QDataStruct) NIOBufferHelper.getNIOBufferedDataImpl(dataStructure)._copyDef(getDataContext()));
			} catch (final Exception e) {
				e.printStackTrace();
 				throw new IntegratedLanguageDataRuntimeException(e);
			}
		else {
			Constructor<?> constructor = null;
			try {
				constructor = classDelegator.getDeclaredConstructor(owner.getClass());
				constructor.setAccessible(true);
				dataStructure = (D) constructor.newInstance(owner);

				if (dataStructure instanceof QDataStructWrapper) {
					final NIODataStructWrapperHandler dataStructureDelegate = new NIODataStructWrapperHandler(getDataContext(), length, dataStructure, allocate);
					((QDataStructWrapper) dataStructure).setDelegate(dataStructureDelegate);
				}
			} catch (final Exception e) {
				throw new IntegratedLanguageDataRuntimeException(e);
			} finally {
				if (constructor != null)
					constructor.setAccessible(false);
			}

		}

		return dataStructure;
	}

	@SuppressWarnings("unchecked")
	@Override
	public final <D extends QDataStruct> D createDataStruct(final List<QDataTerm<QBufferedDataDef<?>>> dataTerms, final int length, final boolean allocate) {

		final NIODataStructImpl dataStructure = new NIODataStructImpl(getDataContext(), length, dataTerms, allocate);

		return (D) dataStructure;
	}

	@Override
	public <E extends Enum<E>, D extends QBufferedElement> QEnum<E, D> createEnum(final Class<E> classEnumerator, final D dataDelegate) {
		return new NIOEnumImpl<E, D>(getDataContext(), classEnumerator, dataDelegate);
	}

	@Override
	public final QCharacter createCharacter(final int length, final boolean varying, final boolean allocate) {

		NIOCharacterImpl character = null;
		if (varying)
			character = new NIOCharacterVaryingImpl(getDataContext(), length, allocate);
		else
			character = new NIOCharacterFixedImpl(getDataContext(), length, allocate);

		return character;
	}

	@Override
	public QGraphic createGraphic(int length, boolean allocate) {

		NIOCharacterGraphicImpl graphic = new NIOCharacterGraphicImpl(getDataContext(), length, allocate);		
		return graphic;
	}

	@Override
	public final QBinary createBinary(final BinaryType type, final boolean unsigned, final boolean allocate) {

		final NIOBinaryImpl binary = new NIOBinaryImpl(getDataContext(), type, unsigned, allocate);

		return binary;
	}

	@Override
	public QBinary createBinary(final boolean unsigned, final int value) {
		
		final NIOBinaryImpl binary = new NIOBinaryImpl(getDataContext(), unsigned, value);

		return binary;
	}

	@Override
	public final QDecimal createDecimal(final int precision, final int scale, final DecimalType type, final boolean allocate) {

		NIODecimalImpl decimal = null;

		switch (type) {
		case ZONED:
			decimal = new NIODecimalZonedImpl(getDataContext(), precision, scale, allocate);
			break;
		case PACKED:
			decimal = new NIODecimalPackedImpl(getDataContext(), precision, scale, allocate);
			break;
		}

		return decimal;
	}

	@Override
	public QDecimal createDecimal(DecimalType type, int value) {

		NIODecimalImpl decimal = null;

		switch (type) {
		case ZONED:
			decimal = new NIODecimalZonedImpl(getDataContext(), value);
			break;
		case PACKED:
			decimal = new NIODecimalPackedImpl(getDataContext(), value);
			break;
		}

		return decimal;
	}

	@Override
	public final QIndicator createIndicator(final boolean allocate) {

		final NIOIndicatorImpl indicator = new NIOIndicatorImpl(getDataContext(), true);

		return indicator;
	}

	@Override
	public final QDatetime createDate(final DatetimeType type, final DateFormat dateFormat, final TimeFormat timeFormat, final boolean allocate) {

		final NIODatetimeImpl datetime = new NIODatetimeImpl(getDataContext(), type, dateFormat, timeFormat, allocate);

		return datetime;
	}

	@Override
	public QFloating createFloating(final FloatingType type, final boolean allocate) {

		return new NIOFloatingImpl(getDataContext(), type, allocate);
	}

	@Override
	public final QHexadecimal createHexadecimal(final int length, final boolean allocate) {

		final NIOHexadecimalImpl hexadecimal = new NIOHexadecimalImpl(getDataContext(), length, allocate);

		return hexadecimal;
	}

	@SuppressWarnings("unchecked")
	private final Class<? extends QData> completeMetadata(final Type type, final List<Type> arguments, final List<Annotation> annotations) {

		// klass
		Class<? extends QData> klass = null;
		if (type instanceof ParameterizedType) {
			final ParameterizedType pType = (ParameterizedType) type;
			klass = (Class<? extends QData>) pType.getRawType();
			for (final Type argument : pType.getActualTypeArguments())
				arguments.add(argument);
		} else
			klass = (Class<? extends QData>) type;

		// append class annotation
		for (final Annotation annotation : klass.getAnnotations()) {
			// dataType filter
			if (!annotation.annotationType().isAnnotationPresent(DataType.class))
				continue;
			annotations.add(annotation);
		}

		return klass;
	}

	private final void injectAnnotations(final List<Annotation> annotations, final Object target) {

		final EObject eObject = (EObject) target;

		final EClass eClass = eObject.eClass();

		// merge annotations by reflection
		for (final Annotation annotation : annotations) {

			if (annotation instanceof DataDef) {
				final DataDef dataDef = (DataDef) annotation;
				if (dataDef.packed())
					if (eObject instanceof QMultipleAtomicBufferedDataDef<?>) {
						final QMultipleAtomicBufferedDataDef<?> multipleAtomicBufferedDataDef = (QMultipleAtomicBufferedDataDef<?>) eObject;
						final QDecimalDef decimalDef = (QDecimalDef) multipleAtomicBufferedDataDef.getArgument();
						decimalDef.setType(DecimalType.PACKED);
					} else if (eObject instanceof QDataAreaDef<?>) {
						final QDataAreaDef<?> dataAreaDef = (QDataAreaDef<?>) eObject;
						final QDecimalDef decimalDef = (QDecimalDef) dataAreaDef.getArgument();
						decimalDef.setType(DecimalType.PACKED);
					} else if (eObject instanceof QEnumDef<?, ?>) {
						final QEnumDef<?, ?> enumDef = (QEnumDef<?, ?>) eObject;
						final QDecimalDef decimalDef = (QDecimalDef) enumDef.getDelegate();
						decimalDef.setType(DecimalType.PACKED);
					} else {
						final QDecimalDef decimalDef = (QDecimalDef) eObject;
						decimalDef.setType(DecimalType.PACKED);
					}
			}
			for (final Method method : annotation.getClass().getDeclaredMethods()) {

				// EMF reflection
				// TODO Java reflection
				EStructuralFeature eFeature = null;

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
						final Overlay overlay = (Overlay) object;
						final QOverlay qOverlay = QIntegratedLanguageDataTermFactory.eINSTANCE.createOverlay();
						if (!overlay.name().equalsIgnoreCase(Overlay.NAME_OWNER))
							// TODO remove lowerCase
							qOverlay.setName(overlay.name().toLowerCase());
						if (overlay.position() != 0)
							qOverlay.setPosition(overlay.position());
						object = qOverlay;
					}

					if (!(object instanceof Class<?>))
						if (object != null && object.getClass().isArray()) {
							final List<Object> objects = new ArrayList<>();
							for (final Object element : (Object[]) object)
								objects.add(element);
							eObject.eSet(eFeature, objects);
						} else
							eObject.eSet(eFeature, object);

				} catch (final Exception e) {
					throw new IntegratedLanguageCoreRuntimeException(e);
				}
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public final <D extends QData> QList<D> createList(final QUnaryAtomicDataDef<D> argument, final int dimension) {

		final QBufferedData model = (QBufferedData) createData(argument, false);

		final QList<D> list = new NIOListImpl(getDataContext(), model, dimension);

		return list;
	}

	@Override
	public final QPointer createPointer(final int bufferLength) {

		if (bufferLength < 0)
			throw new IntegratedLanguageDataRuntimeException("Invalid bufferLength");

		return new NIOPointerImpl(getDataContext(), new NIOStorageImpl(bufferLength));
	}

	@Override
	public final QPointer createPointer(final QPointer pointer, final int newSize) {

		final NIOPointerImpl oldPointer = (NIOPointerImpl) pointer;
		final ByteBuffer oldBuffer = oldPointer.getBuffer();

		final NIOPointerImpl newPointer = (NIOPointerImpl) createPointer(newSize);
		final ByteBuffer newBuffer = newPointer.getBuffer();

		NIOBufferHelper.movel(newBuffer, 0, newSize, oldBuffer.array());

		return newPointer;
	}

	public final QDataContext getDataContext() {
		return this.dataContext;
	}
}
