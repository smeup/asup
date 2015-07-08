/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.java.impl;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.Dictionary;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl;
import org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl;
import org.smeup.sys.il.core.java.QFiles;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaFactory;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage;
import org.smeup.sys.il.core.java.QLists;
import org.smeup.sys.il.core.java.QStreams;
import org.smeup.sys.il.core.java.QStrings;
import org.smeup.sys.il.core.java.QURIs;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage;
import org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;
import org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class IntegratedLanguageCoreJavaPackageImpl extends EPackageImpl implements QIntegratedLanguageCoreJavaPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaCallableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaEnumEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaNumberEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass filesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass streamsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass listsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass stringsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass urIsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaAnnotationEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaCloseableEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaDictionaryEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaInputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaIOExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaIterableEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaIteratorEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaMapEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaOutputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaPropertiesEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaRunnableEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaThrowableEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaURIEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaURLEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaWriterEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageCoreJavaPackageImpl() {
		super(eNS_URI, QIntegratedLanguageCoreJavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize
	 * {@link QIntegratedLanguageCoreJavaPackage#eINSTANCE} when that field is
	 * accessed. Clients should not invoke it directly. Instead, they should
	 * simply access that field to obtain the package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageCoreJavaPackage init() {
		if (isInited)
			return (QIntegratedLanguageCoreJavaPackage) EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreJavaPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageCoreJavaPackageImpl theIntegratedLanguageCoreJavaPackage = (IntegratedLanguageCoreJavaPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageCoreJavaPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new IntegratedLanguageCoreJavaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IntegratedLanguageCorePackageImpl theIntegratedLanguageCorePackage = (IntegratedLanguageCorePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI) instanceof IntegratedLanguageCorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(QIntegratedLanguageCorePackage.eNS_URI) : QIntegratedLanguageCorePackage.eINSTANCE);
		IntegratedLanguageCoreCtxPackageImpl theIntegratedLanguageCoreCtxPackage = (IntegratedLanguageCoreCtxPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI) instanceof IntegratedLanguageCoreCtxPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI) : QIntegratedLanguageCoreCtxPackage.eINSTANCE);
		IntegratedLanguageCoreMetaPackageImpl theIntegratedLanguageCoreMetaPackage = (IntegratedLanguageCoreMetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) instanceof IntegratedLanguageCoreMetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) : QIntegratedLanguageCoreMetaPackage.eINSTANCE);
		IntegratedLanguageCoreOutPackageImpl theIntegratedLanguageCoreOutPackage = (IntegratedLanguageCoreOutPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI) instanceof IntegratedLanguageCoreOutPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI) : QIntegratedLanguageCoreOutPackage.eINSTANCE);
		IntegratedLanguageCoreTermPackageImpl theIntegratedLanguageCoreTermPackage = (IntegratedLanguageCoreTermPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) instanceof IntegratedLanguageCoreTermPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) : QIntegratedLanguageCoreTermPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegratedLanguageCoreJavaPackage.createPackageContents();
		theIntegratedLanguageCorePackage.createPackageContents();
		theIntegratedLanguageCoreCtxPackage.createPackageContents();
		theIntegratedLanguageCoreMetaPackage.createPackageContents();
		theIntegratedLanguageCoreOutPackage.createPackageContents();
		theIntegratedLanguageCoreTermPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageCoreJavaPackage.initializePackageContents();
		theIntegratedLanguageCorePackage.initializePackageContents();
		theIntegratedLanguageCoreCtxPackage.initializePackageContents();
		theIntegratedLanguageCoreMetaPackage.initializePackageContents();
		theIntegratedLanguageCoreOutPackage.initializePackageContents();
		theIntegratedLanguageCoreTermPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageCoreJavaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageCoreJavaPackage.eNS_URI, theIntegratedLanguageCoreJavaPackage);
		return theIntegratedLanguageCoreJavaPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getJavaCallable() {
		return javaCallableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getJavaEnum() {
		return javaEnumEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getJavaList() {
		return javaListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getJavaNumber() {
		return javaNumberEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getFiles() {
		return filesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStreams() {
		return streamsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getLists() {
		return listsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getStrings() {
		return stringsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getURIs() {
		return urIsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaAnnotation() {
		return javaAnnotationEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaCloseable() {
		return javaCloseableEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaDictionary() {
		return javaDictionaryEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaException() {
		return javaExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaInputStream() {
		return javaInputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaIOException() {
		return javaIOExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaIterable() {
		return javaIterableEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaIterator() {
		return javaIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaMap() {
		return javaMapEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaOutputStream() {
		return javaOutputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaProperties() {
		return javaPropertiesEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaRunnable() {
		return javaRunnableEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaThrowable() {
		return javaThrowableEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaType() {
		return javaTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaURI() {
		return javaURIEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaURL() {
		return javaURLEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getJavaWriter() {
		return javaWriterEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QIntegratedLanguageCoreJavaFactory getIntegratedLanguageCoreJavaFactory() {
		return (QIntegratedLanguageCoreJavaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		javaCallableEClass = createEClass(JAVA_CALLABLE);

		javaEnumEClass = createEClass(JAVA_ENUM);

		javaListEClass = createEClass(JAVA_LIST);

		javaNumberEClass = createEClass(JAVA_NUMBER);

		filesEClass = createEClass(FILES);

		streamsEClass = createEClass(STREAMS);

		listsEClass = createEClass(LISTS);

		stringsEClass = createEClass(STRINGS);

		urIsEClass = createEClass(UR_IS);

		// Create data types
		javaAnnotationEDataType = createEDataType(JAVA_ANNOTATION);
		javaCloseableEDataType = createEDataType(JAVA_CLOSEABLE);
		javaDictionaryEDataType = createEDataType(JAVA_DICTIONARY);
		javaExceptionEDataType = createEDataType(JAVA_EXCEPTION);
		javaInputStreamEDataType = createEDataType(JAVA_INPUT_STREAM);
		javaIOExceptionEDataType = createEDataType(JAVA_IO_EXCEPTION);
		javaIterableEDataType = createEDataType(JAVA_ITERABLE);
		javaIteratorEDataType = createEDataType(JAVA_ITERATOR);
		javaMapEDataType = createEDataType(JAVA_MAP);
		javaOutputStreamEDataType = createEDataType(JAVA_OUTPUT_STREAM);
		javaPropertiesEDataType = createEDataType(JAVA_PROPERTIES);
		javaRunnableEDataType = createEDataType(JAVA_RUNNABLE);
		javaThrowableEDataType = createEDataType(JAVA_THROWABLE);
		javaTypeEDataType = createEDataType(JAVA_TYPE);
		javaURIEDataType = createEDataType(JAVA_URI);
		javaURLEDataType = createEDataType(JAVA_URL);
		javaWriterEDataType = createEDataType(JAVA_WRITER);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(javaCallableEClass, "V");
		addETypeParameter(javaDictionaryEDataType, "K");
		addETypeParameter(javaDictionaryEDataType, "V");
		addETypeParameter(javaMapEDataType, "K");
		addETypeParameter(javaMapEDataType, "V");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(javaCallableEClass, Callable.class, "JavaCallable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaEnumEClass, Enum.class, "JavaEnum", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Enum<E>");

		initEClass(javaListEClass, List.class, "JavaList", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<E>");

		initEClass(javaNumberEClass, Number.class, "JavaNumber", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(filesEClass, QFiles.class, "Files", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(filesEClass, ecorePackage.getEString(), "getBaseName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(streamsEClass, QStreams.class, "Streams", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(streamsEClass, null, "copy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInputStream(), "input", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listsEClass, QLists.class, "Lists", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(listsEClass, null, "addFirst", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		addEParameter(op, this.getJavaList(), "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addLast", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		addEParameter(op, this.getJavaList(), "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringsEClass, QStrings.class, "Strings", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "appendChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "chars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "times", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "before", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "firstToUpper", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "removeFirstChar", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "removeLastChar", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "trimL", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "trimR", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(urIsEClass, QURIs.class, "URIs", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(urIsEClass, ecorePackage.getEString(), "getBaseName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaURI(), "uri", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(javaAnnotationEDataType, Annotation.class, "JavaAnnotation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaCloseableEDataType, Closeable.class, "JavaCloseable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaDictionaryEDataType, Dictionary.class, "JavaDictionary", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaExceptionEDataType, Exception.class, "JavaException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaInputStreamEDataType, InputStream.class, "JavaInputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaIOExceptionEDataType, IOException.class, "JavaIOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaIterableEDataType, Iterable.class, "JavaIterable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Iterable<T>");
		initEDataType(javaIteratorEDataType, Iterator.class, "JavaIterator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Iterator<T>");
		initEDataType(javaMapEDataType, Map.class, "JavaMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaOutputStreamEDataType, OutputStream.class, "JavaOutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaPropertiesEDataType, Properties.class, "JavaProperties", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaRunnableEDataType, Runnable.class, "JavaRunnable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaThrowableEDataType, Throwable.class, "JavaThrowable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaTypeEDataType, Type.class, "JavaType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaURIEDataType, URI.class, "JavaURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaURLEDataType, URL.class, "JavaURL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaWriterEDataType, Writer.class, "JavaWriter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} // IntegratedLanguageCoreJavaPackageImpl
