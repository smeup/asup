/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx;

import java.lang.annotation.Annotation;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Context</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface QContext {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close() throws IntegratedLanguageCoreRuntimeException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	QContext createChildContext(String name) throws IntegratedLanguageCoreRuntimeException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true" injectionStrategyRequired="true"
	 * @generated
	 */
	QContext createChildContext(String name, ContextInjectionStrategy injectionStrategy) throws IntegratedLanguageCoreRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextDescriptionRequired="true" injectionStrategyRequired="true"
	 * @generated
	 */
	QContext createChildContext(QContextDescription contextDescription, ContextInjectionStrategy injectionStrategy);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" clazzRequired="true"
	 * @generated
	 */
	<T> T get(Class<T> clazz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model adaptableRequired="true" adapterRequired="true" TBounds="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	<T extends Object> T getAdapter(Object adaptable, Class<T> adapter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QContextDescription getContextDescription();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getID();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model objectRequired="true"
	 * @generated
	 */
	void inject(Object object) throws IntegratedLanguageCoreRuntimeException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" addressRequired="true"
	 * @generated
	 */
	Class<?> loadClass(String address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" classNameRequired="true"
	 * @generated
	 */
	Class<?> loadClassByName(String className);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model objectRequired="true" qualifierRequired="true" ABounds="org.smeup.sys.mi.core.JavaAnnotation"
	 * @generated
	 */
	<A extends Annotation> void invoke(Object object, Class<A> qualifier) throws IntegratedLanguageCoreRuntimeException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" klassRequired="true"
	 * @generated
	 */
	<T> T make(Class<T> klass) throws IntegratedLanguageCoreRuntimeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model factoryRequired="true" adapterTypeRequired="true" TBounds="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	<T extends Object> void registerAdapterFactory(QAdapterFactory factory, Class<T> adapterType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model klassRequired="true" objectRequired="true"
	 * @generated
	 */
	<T> void set(Class<T> klass, T object) throws IntegratedLanguageCoreRuntimeException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model nameRequired="true" objectRequired="true"
	 * @generated
	 */
	<T> void set(String name, T object) throws IntegratedLanguageCoreRuntimeException;

} // QContext
