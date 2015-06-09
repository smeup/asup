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
import java.lang.Iterable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.Dictionary;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaFactory;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageCoreJavaFactoryImpl extends EFactoryImpl implements QIntegratedLanguageCoreJavaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageCoreJavaFactory init() {
		try {
			QIntegratedLanguageCoreJavaFactory theIntegratedLanguageCoreJavaFactory = (QIntegratedLanguageCoreJavaFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageCoreJavaPackage.eNS_URI);
			if (theIntegratedLanguageCoreJavaFactory != null) {
				return theIntegratedLanguageCoreJavaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageCoreJavaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageCoreJavaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageCoreJavaPackage.JAVA_ANNOTATION:
				return createJavaAnnotationFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_CLOSEABLE:
				return createJavaCloseableFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_DICTIONARY:
				return createJavaDictionaryFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_EXCEPTION:
				return createJavaExceptionFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_INPUT_STREAM:
				return createJavaInputStreamFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_IO_EXCEPTION:
				return createJavaIOExceptionFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_ITERABLE:
				return createJavaIterableFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_ITERATOR:
				return createJavaIteratorFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_MAP:
				return createJavaMapFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_OUTPUT_STREAM:
				return createJavaOutputStreamFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_PROPERTIES:
				return createJavaPropertiesFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_RUNNABLE:
				return createJavaRunnableFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_THROWABLE:
				return createJavaThrowableFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_TYPE:
				return createJavaTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_URI:
				return createJavaURIFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_URL:
				return createJavaURLFromString(eDataType, initialValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_WRITER:
				return createJavaWriterFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageCoreJavaPackage.JAVA_ANNOTATION:
				return convertJavaAnnotationToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_CLOSEABLE:
				return convertJavaCloseableToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_DICTIONARY:
				return convertJavaDictionaryToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_EXCEPTION:
				return convertJavaExceptionToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_INPUT_STREAM:
				return convertJavaInputStreamToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_IO_EXCEPTION:
				return convertJavaIOExceptionToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_ITERABLE:
				return convertJavaIterableToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_ITERATOR:
				return convertJavaIteratorToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_MAP:
				return convertJavaMapToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_OUTPUT_STREAM:
				return convertJavaOutputStreamToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_PROPERTIES:
				return convertJavaPropertiesToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_RUNNABLE:
				return convertJavaRunnableToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_THROWABLE:
				return convertJavaThrowableToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_TYPE:
				return convertJavaTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_URI:
				return convertJavaURIToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_URL:
				return convertJavaURLToString(eDataType, instanceValue);
			case QIntegratedLanguageCoreJavaPackage.JAVA_WRITER:
				return convertJavaWriterToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createJavaAnnotationFromString(EDataType eDataType, String initialValue) {
		return (Annotation)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaAnnotationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Closeable createJavaCloseableFromString(EDataType eDataType, String initialValue) {
		return (Closeable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaCloseableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary<?, ?> createJavaDictionaryFromString(EDataType eDataType, String initialValue) {
		return (Dictionary<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaDictionaryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createJavaExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createJavaInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createJavaIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Iterable<Object> createJavaIterableFromString(EDataType eDataType, String initialValue) {
		return (Iterable<Object>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIterableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Iterator<Object> createJavaIteratorFromString(EDataType eDataType, String initialValue) {
		return (Iterator<Object>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIteratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createJavaMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createJavaOutputStreamFromString(EDataType eDataType, String initialValue) {
		return (OutputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaOutputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createJavaPropertiesFromString(EDataType eDataType, String initialValue) {
		return (Properties)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaPropertiesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Runnable createJavaRunnableFromString(EDataType eDataType, String initialValue) {
		return (Runnable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaRunnableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createJavaThrowableFromString(EDataType eDataType, String initialValue) {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaThrowableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Type createJavaTypeFromString(EDataType eDataType, String initialValue) {
		return (Type)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URI createJavaURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URL createJavaURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Writer createJavaWriterFromString(EDataType eDataType, String initialValue) {
		return (Writer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaWriterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageCoreJavaPackage getIntegratedLanguageCoreJavaPackage() {
		return (QIntegratedLanguageCoreJavaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageCoreJavaPackage getPackage() {
		return QIntegratedLanguageCoreJavaPackage.eINSTANCE;
	}

} // IntegratedLanguageCoreJavaFactoryImpl
