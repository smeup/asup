/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.java;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageCoreJavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/core/java";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCoreJavaPackage eINSTANCE = org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link java.util.concurrent.Callable<V>
	 * <em>Java Callable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see java.util.concurrent.Callable<V>
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaCallable()
	 * @generated
	 */
	int JAVA_CALLABLE = 0;

	/**
	 * The number of structural features of the '<em>Java Callable</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CALLABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.nio.charset.Charset <em>Java Charset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.charset.Charset
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaCharset()
	 * @generated
	 */
	int JAVA_CHARSET = 1;

	/**
	 * The number of structural features of the '<em>Java Charset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CHARSET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Enum<E> <em>Java Enum</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.Enum<E>
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaEnum()
	 * @generated
	 */
	int JAVA_ENUM = 4;

	/**
	 * The meta object id for the '{@link java.util.List<E> <em>Java List</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.util.List<E>
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaList()
	 * @generated
	 */
	int JAVA_LIST = 6;

	/**
	 * The meta object id for the '{@link java.lang.Number <em>Java Number</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaNumber()
	 * @generated
	 */
	int JAVA_NUMBER = 7;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.java.QFiles <em>Files</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.java.QFiles
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getFiles()
	 * @generated
	 */
	int FILES = 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.java.QStreams <em>Streams</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.java.QStreams
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getStreams()
	 * @generated
	 */
	int STREAMS = 9;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.java.QLists <em>Lists</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.java.QLists
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getLists()
	 * @generated
	 */
	int LISTS = 10;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.java.QStrings <em>Strings</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.java.QStrings
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getStrings()
	 * @generated
	 */
	int STRINGS = 11;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.java.QURIs <em>UR Is</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.java.QURIs
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getURIs()
	 * @generated
	 */
	int UR_IS = 12;

	/**
	 * The meta object id for the '<em>Java Annotation</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.lang.annotation.Annotation
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaAnnotation()
	 * @generated
	 */
	int JAVA_ANNOTATION = 13;

	/**
	 * The meta object id for the '<em>Java Closeable</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.io.Closeable
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaCloseable()
	 * @generated
	 */
	int JAVA_CLOSEABLE = 2;

	/**
	 * The number of structural features of the '<em>Java Closeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLOSEABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.concurrent.ExecutorService <em>Java Executor Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ExecutorService
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaExecutorService()
	 * @generated
	 */
	int JAVA_EXECUTOR_SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Java Executor Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXECUTOR_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Java Enum</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int JAVA_ENUM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Java Dictionary</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.util.Dictionary
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaDictionary()
	 * @generated
	 */
	int JAVA_DICTIONARY = 14;

	/**
	 * The meta object id for the '<em>Java Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.lang.Exception
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaException()
	 * @generated
	 */
	int JAVA_EXCEPTION = 15;

	/**
	 * The meta object id for the '<em>Java Input Stream</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.io.InputStream
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaInputStream()
	 * @generated
	 */
	int JAVA_INPUT_STREAM = 16;

	/**
	 * The meta object id for the '<em>Java IO Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.io.IOException
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaIOException()
	 * @generated
	 */
	int JAVA_IO_EXCEPTION = 17;

	/**
	 * The meta object id for the '<em>Java Iterable</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.lang.Iterable
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaIterable()
	 * @generated
	 */
	int JAVA_ITERABLE = 18;

	/**
	 * The meta object id for the '<em>Java Iterator</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.util.Iterator
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaIterator()
	 * @generated
	 */
	int JAVA_ITERATOR = 5;

	/**
	 * The number of structural features of the '<em>Java Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ITERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Java List</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int JAVA_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Java Number</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NUMBER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Files</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FILES_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Streams</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STREAMS_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Lists</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LISTS_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Strings</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRINGS_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>UR Is</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UR_IS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Java Map</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.util.Map
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaMap()
	 * @generated
	 */
	int JAVA_MAP = 19;

	/**
	 * The meta object id for the '<em>Java Output Stream</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.io.OutputStream
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaOutputStream()
	 * @generated
	 */
	int JAVA_OUTPUT_STREAM = 20;

	/**
	 * The meta object id for the '<em>Java Properties</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.util.Properties
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaProperties()
	 * @generated
	 */
	int JAVA_PROPERTIES = 21;

	/**
	 * The meta object id for the '<em>Java Runnable</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.lang.Runnable
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaRunnable()
	 * @generated
	 */
	int JAVA_RUNNABLE = 22;

	/**
	 * The meta object id for the '<em>Java Throwable</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.lang.Throwable
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaThrowable()
	 * @generated
	 */
	int JAVA_THROWABLE = 23;

	/**
	 * The meta object id for the '<em>Java Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.lang.reflect.Type
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaType()
	 * @generated
	 */
	int JAVA_TYPE = 24;

	/**
	 * The meta object id for the '<em>Java URI</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.net.URI
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaURI()
	 * @generated
	 */
	int JAVA_URI = 25;

	/**
	 * The meta object id for the '<em>Java URL</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.net.URL
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaURL()
	 * @generated
	 */
	int JAVA_URL = 26;

	/**
	 * The meta object id for the '<em>Java Writer</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.io.Writer
	 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaWriter()
	 * @generated
	 */
	int JAVA_WRITER = 27;

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.Callable
	 * <V> <em>Java Callable</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Java Callable</em>'.
	 * @see java.util.concurrent.Callable<V>
	 * @model instanceClass="java.util.concurrent.Callable<V>"
	 *        typeParameters="V"
	 * @generated
	 */
	EClass getJavaCallable();

	/**
	 * Returns the meta object for class '{@link java.nio.charset.Charset <em>Java Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Charset</em>'.
	 * @see java.nio.charset.Charset
	 * @model instanceClass="java.nio.charset.Charset"
	 * @generated
	 */
	EClass getJavaCharset();

	/**
	 * Returns the meta object for class '{@link java.lang.Enum<E> <em>Java Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Enum</em>'.
	 * @see java.lang.Enum<E>
	 * @model instanceClass="java.lang.Enum<E>"
	 * @generated
	 */
	EClass getJavaEnum();

	/**
	 * Returns the meta object for class '{@link java.util.List<E> <em>Java List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java List</em>'.
	 * @see java.util.List<E>
	 * @model instanceClass="java.util.List<E>"
	 * @generated
	 */
	EClass getJavaList();

	/**
	 * Returns the meta object for class '{@link java.lang.Number <em>Java Number</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Number</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
	EClass getJavaNumber();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.java.QFiles <em>Files</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Files</em>'.
	 * @see org.smeup.sys.il.core.java.QFiles
	 * @generated
	 */
	EClass getFiles();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.java.QStreams <em>Streams</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Streams</em>'.
	 * @see org.smeup.sys.il.core.java.QStreams
	 * @generated
	 */
	EClass getStreams();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.java.QLists <em>Lists</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Lists</em>'.
	 * @see org.smeup.sys.il.core.java.QLists
	 * @generated
	 */
	EClass getLists();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.java.QStrings <em>Strings</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Strings</em>'.
	 * @see org.smeup.sys.il.core.java.QStrings
	 * @generated
	 */
	EClass getStrings();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.java.QURIs <em>UR Is</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>UR Is</em>'.
	 * @see org.smeup.sys.il.core.java.QURIs
	 * @generated
	 */
	EClass getURIs();

	/**
	 * Returns the meta object for data type '
	 * {@link java.lang.annotation.Annotation <em>Java Annotation</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>Java Annotation</em>'.
	 * @see java.lang.annotation.Annotation
	 * @model instanceClass="java.lang.annotation.Annotation"
	 * @generated
	 */
	EDataType getJavaAnnotation();

	/**
	 * Returns the meta object for class '{@link java.io.Closeable <em>Java Closeable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Closeable</em>'.
	 * @see java.io.Closeable
	 * @model instanceClass="java.io.Closeable"
	 * @generated
	 */
	EClass getJavaCloseable();

	/**
	 * Returns the meta object for class '{@link java.util.concurrent.ExecutorService <em>Java Executor Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Executor Service</em>'.
	 * @see java.util.concurrent.ExecutorService
	 * @model instanceClass="java.util.concurrent.ExecutorService"
	 * @generated
	 */
	EClass getJavaExecutorService();

	/**
	 * Returns the meta object for data type '{@link java.util.Dictionary <em>Java Dictionary</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Dictionary</em>'.
	 * @see java.util.Dictionary
	 * @model instanceClass="java.util.Dictionary" typeParameters="K V"
	 * @generated
	 */
	EDataType getJavaDictionary();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Java Exception</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getJavaException();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream
	 * <em>Java Input Stream</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for data type '<em>Java Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getJavaInputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException
	 * <em>Java IO Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for data type '<em>Java IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getJavaIOException();

	/**
	 * Returns the meta object for data type '{@link java.lang.Iterable <em>Java Iterable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Iterable</em>'.
	 * @see java.lang.Iterable
	 * @model instanceClass="java.lang.Iterable<java.lang.Object>"
	 * @generated
	 */
	EDataType getJavaIterable();

	/**
	 * Returns the meta object for class '{@link java.util.Iterator <em>Java Iterator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Iterator</em>'.
	 * @see java.util.Iterator
	 * @model instanceClass="java.util.Iterator" typeParameters="T"
	 * @generated
	 */
	EClass getJavaIterator();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Java Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getJavaMap();

	/**
	 * Returns the meta object for data type '{@link java.io.OutputStream
	 * <em>Java Output Stream</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for data type '<em>Java Output Stream</em>'.
	 * @see java.io.OutputStream
	 * @model instanceClass="java.io.OutputStream"
	 * @generated
	 */
	EDataType getJavaOutputStream();

	/**
	 * Returns the meta object for data type '{@link java.util.Properties <em>Java Properties</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Properties</em>'.
	 * @see java.util.Properties
	 * @model instanceClass="java.util.Properties"
	 * @generated
	 */
	EDataType getJavaProperties();

	/**
	 * Returns the meta object for data type '{@link java.lang.Runnable <em>Java Runnable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Runnable</em>'.
	 * @see java.lang.Runnable
	 * @model instanceClass="java.lang.Runnable"
	 * @generated
	 */
	EDataType getJavaRunnable();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Java Throwable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getJavaThrowable();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Type <em>Java Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Type</em>'.
	 * @see java.lang.reflect.Type
	 * @model instanceClass="java.lang.reflect.Type"
	 * @generated
	 */
	EDataType getJavaType();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>Java URI</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getJavaURI();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>Java URL</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getJavaURL();

	/**
	 * Returns the meta object for data type '{@link java.io.Writer <em>Java Writer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Writer</em>'.
	 * @see java.io.Writer
	 * @model instanceClass="java.io.Writer"
	 * @generated
	 */
	EDataType getJavaWriter();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageCoreJavaFactory getIntegratedLanguageCoreJavaFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link java.util.concurrent.Callable <em>Java Callable</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.util.concurrent.Callable
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaCallable()
		 * @generated
		 */
		EClass JAVA_CALLABLE = eINSTANCE.getJavaCallable();

		/**
		 * The meta object literal for the '{@link java.nio.charset.Charset <em>Java Charset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.nio.charset.Charset
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaCharset()
		 * @generated
		 */
		EClass JAVA_CHARSET = eINSTANCE.getJavaCharset();

		/**
		 * The meta object literal for the '{@link java.lang.Enum<E>
		 * <em>Java Enum</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see java.lang.Enum<E>
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaEnum()
		 * @generated
		 */
		EClass JAVA_ENUM = eINSTANCE.getJavaEnum();

		/**
		 * The meta object literal for the '{@link java.util.List<E>
		 * <em>Java List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see java.util.List<E>
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaList()
		 * @generated
		 */
		EClass JAVA_LIST = eINSTANCE.getJavaList();

		/**
		 * The meta object literal for the '{@link java.lang.Number <em>Java Number</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see java.lang.Number
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaNumber()
		 * @generated
		 */
		EClass JAVA_NUMBER = eINSTANCE.getJavaNumber();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.core.java.QFiles <em>Files</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.core.java.QFiles
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getFiles()
		 * @generated
		 */
		EClass FILES = eINSTANCE.getFiles();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.java.QStreams <em>Streams</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.java.QStreams
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getStreams()
		 * @generated
		 */
		EClass STREAMS = eINSTANCE.getStreams();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.core.java.QLists <em>Lists</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.core.java.QLists
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getLists()
		 * @generated
		 */
		EClass LISTS = eINSTANCE.getLists();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.java.QStrings <em>Strings</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.java.QStrings
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getStrings()
		 * @generated
		 */
		EClass STRINGS = eINSTANCE.getStrings();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.core.java.QURIs <em>UR Is</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.core.java.QURIs
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getURIs()
		 * @generated
		 */
		EClass UR_IS = eINSTANCE.getURIs();

		/**
		 * The meta object literal for the '<em>Java Annotation</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.annotation.Annotation
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaAnnotation()
		 * @generated
		 */
		EDataType JAVA_ANNOTATION = eINSTANCE.getJavaAnnotation();

		/**
		 * The meta object literal for the '{@link java.io.Closeable <em>Java Closeable</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.io.Closeable
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaCloseable()
		 * @generated
		 */
		EClass JAVA_CLOSEABLE = eINSTANCE.getJavaCloseable();

		/**
		 * The meta object literal for the '{@link java.util.concurrent.ExecutorService <em>Java Executor Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ExecutorService
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaExecutorService()
		 * @generated
		 */
		EClass JAVA_EXECUTOR_SERVICE = eINSTANCE.getJavaExecutorService();

		/**
		 * The meta object literal for the '<em>Java Dictionary</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.util.Dictionary
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaDictionary()
		 * @generated
		 */
		EDataType JAVA_DICTIONARY = eINSTANCE.getJavaDictionary();

		/**
		 * The meta object literal for the '<em>Java Exception</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaException()
		 * @generated
		 */
		EDataType JAVA_EXCEPTION = eINSTANCE.getJavaException();

		/**
		 * The meta object literal for the '<em>Java Input Stream</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaInputStream()
		 * @generated
		 */
		EDataType JAVA_INPUT_STREAM = eINSTANCE.getJavaInputStream();

		/**
		 * The meta object literal for the '<em>Java IO Exception</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaIOException()
		 * @generated
		 */
		EDataType JAVA_IO_EXCEPTION = eINSTANCE.getJavaIOException();

		/**
		 * The meta object literal for the '<em>Java Iterable</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.Iterable
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaIterable()
		 * @generated
		 */
		EDataType JAVA_ITERABLE = eINSTANCE.getJavaIterable();

		/**
		 * The meta object literal for the '{@link java.util.Iterator <em>Java Iterator</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaIterator()
		 * @generated
		 */
		EClass JAVA_ITERATOR = eINSTANCE.getJavaIterator();

		/**
		 * The meta object literal for the '<em>Java Map</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see java.util.Map
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaMap()
		 * @generated
		 */
		EDataType JAVA_MAP = eINSTANCE.getJavaMap();

		/**
		 * The meta object literal for the '<em>Java Output Stream</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaOutputStream()
		 * @generated
		 */
		EDataType JAVA_OUTPUT_STREAM = eINSTANCE.getJavaOutputStream();

		/**
		 * The meta object literal for the '<em>Java Properties</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.util.Properties
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaProperties()
		 * @generated
		 */
		EDataType JAVA_PROPERTIES = eINSTANCE.getJavaProperties();

		/**
		 * The meta object literal for the '<em>Java Runnable</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.Runnable
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaRunnable()
		 * @generated
		 */
		EDataType JAVA_RUNNABLE = eINSTANCE.getJavaRunnable();

		/**
		 * The meta object literal for the '<em>Java Throwable</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaThrowable()
		 * @generated
		 */
		EDataType JAVA_THROWABLE = eINSTANCE.getJavaThrowable();

		/**
		 * The meta object literal for the '<em>Java Type</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see java.lang.reflect.Type
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaType()
		 * @generated
		 */
		EDataType JAVA_TYPE = eINSTANCE.getJavaType();

		/**
		 * The meta object literal for the '<em>Java URI</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see java.net.URI
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaURI()
		 * @generated
		 */
		EDataType JAVA_URI = eINSTANCE.getJavaURI();

		/**
		 * The meta object literal for the '<em>Java URL</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see java.net.URL
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaURL()
		 * @generated
		 */
		EDataType JAVA_URL = eINSTANCE.getJavaURL();

		/**
		 * The meta object literal for the '<em>Java Writer</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see java.io.Writer
		 * @see org.smeup.sys.il.core.java.impl.IntegratedLanguageCoreJavaPackageImpl#getJavaWriter()
		 * @generated
		 */
		EDataType JAVA_WRITER = eINSTANCE.getJavaWriter();

	}

} // QIntegratedLanguageCoreJavaPackage
