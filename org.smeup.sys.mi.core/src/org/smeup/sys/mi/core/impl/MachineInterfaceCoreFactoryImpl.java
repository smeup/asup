/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.mi.core.impl;

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
import java.util.Map;
import java.util.Properties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.mi.core.QMachineInterfaceCoreFactory;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MachineInterfaceCoreFactoryImpl extends EFactoryImpl implements QMachineInterfaceCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QMachineInterfaceCoreFactory init() {
		try {
			QMachineInterfaceCoreFactory theMachineInterfaceCoreFactory = (QMachineInterfaceCoreFactory)EPackage.Registry.INSTANCE.getEFactory(QMachineInterfaceCorePackage.eNS_URI);
			if (theMachineInterfaceCoreFactory != null) {
				return theMachineInterfaceCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MachineInterfaceCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineInterfaceCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QMachineInterfaceCorePackage.JAVA_ANNOTATION:
				return createJavaAnnotationFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_DICTIONARY:
				return createJavaDictionaryFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_EXCEPTION:
				return createJavaExceptionFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_INPUT_STREAM:
				return createJavaInputStreamFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_IO_EXCEPTION:
				return createJavaIOExceptionFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_ITERABLE:
				return createJavaIterableFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_MAP:
				return createJavaMapFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_OUTPUT_STREAM:
				return createJavaOutputStreamFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_PROPERTIES:
				return createJavaPropertiesFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_THROWABLE:
				return createJavaThrowableFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_TYPE:
				return createJavaTypeFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_URI:
				return createJavaURIFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_URL:
				return createJavaURLFromString(eDataType, initialValue);
			case QMachineInterfaceCorePackage.JAVA_WRITER:
				return createJavaWriterFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QMachineInterfaceCorePackage.JAVA_ANNOTATION:
				return convertJavaAnnotationToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_DICTIONARY:
				return convertJavaDictionaryToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_EXCEPTION:
				return convertJavaExceptionToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_INPUT_STREAM:
				return convertJavaInputStreamToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_IO_EXCEPTION:
				return convertJavaIOExceptionToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_ITERABLE:
				return convertJavaIterableToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_MAP:
				return convertJavaMapToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_OUTPUT_STREAM:
				return convertJavaOutputStreamToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_PROPERTIES:
				return convertJavaPropertiesToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_THROWABLE:
				return convertJavaThrowableToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_TYPE:
				return convertJavaTypeToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_URI:
				return convertJavaURIToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_URL:
				return convertJavaURLToString(eDataType, instanceValue);
			case QMachineInterfaceCorePackage.JAVA_WRITER:
				return convertJavaWriterToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createJavaAnnotationFromString(EDataType eDataType, String initialValue) {
		return (Annotation)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaAnnotationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary<?, ?> createJavaDictionaryFromString(EDataType eDataType, String initialValue) {
		return (Dictionary<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaDictionaryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createJavaExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createJavaInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createJavaIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Iterable<Object> createJavaIterableFromString(EDataType eDataType, String initialValue) {
		return (Iterable<Object>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIterableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createJavaMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createJavaOutputStreamFromString(EDataType eDataType, String initialValue) {
		return (OutputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaOutputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createJavaPropertiesFromString(EDataType eDataType, String initialValue) {
		return (Properties)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaPropertiesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createJavaThrowableFromString(EDataType eDataType, String initialValue) {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaThrowableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createJavaTypeFromString(EDataType eDataType, String initialValue) {
		return (Type)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createJavaURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createJavaURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writer createJavaWriterFromString(EDataType eDataType, String initialValue) {
		return (Writer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaWriterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMachineInterfaceCorePackage getMachineInterfaceCorePackage() {
		return (QMachineInterfaceCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QMachineInterfaceCorePackage getPackage() {
		return QMachineInterfaceCorePackage.eINSTANCE;
	}

} //MachineInterfaceCoreFactoryImpl
