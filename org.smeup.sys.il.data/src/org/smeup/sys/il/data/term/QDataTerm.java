/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.term;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.term.QTerm;
import org.smeup.sys.il.data.def.QDataDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Term</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.term.QDataTerm#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.QDataTerm#getDefault <em>Default</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.QDataTerm#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.QDataTerm#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.QDataTerm#getLike <em>Like</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.QDataTerm#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.QDataTerm#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.QDataTerm#isRestricted <em>Restricted</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.term.QDataTerm#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage#getDataTerm()
 * @model abstract="true"
 * @generated
 */
public interface QDataTerm<DD extends QDataDef<?>> extends QObject, QTerm {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataTerm_Constant()
	 * @model
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QDataTerm#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage#getDataTerm_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QDataTerm#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(QDataDef)
	 * @see org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage#getDataTerm_Definition()
	 * @model containment="true"
	 * @generated
	 */
	DD getDefinition();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QDataTerm#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(DD value);

	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialized</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataTerm_Initialized()
	 * @model required="true"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QDataTerm#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * Returns the value of the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Like</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Like</em>' attribute.
	 * @see #setLike(String)
	 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataTerm_Like()
	 * @model
	 * @generated
	 */
	String getLike();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QDataTerm#getLike <em>Like</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Like</em>' attribute.
	 * @see #getLike()
	 * @generated
	 */
	void setLike(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataTerm_Name()
	 * @model required="true"
	 * @generated
	 */
	@Override
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QDataTerm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage#getDataTerm_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QDataTerm#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Restricted</em>' attribute.
	 * @see #setRestricted(boolean)
	 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataTerm_Restricted()
	 * @model
	 * @generated
	 */
	boolean isRestricted();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QDataTerm#isRestricted <em>Restricted</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Restricted</em>' attribute.
	 * @see #isRestricted()
	 * @generated
	 */
	void setRestricted(boolean value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataTerm_Text()
	 * @model
	 * @generated
	 */
	@Override
	String getText();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.term.QDataTerm#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	DataTermType getDataTermType();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model visitorRequired="true"
	 * @generated
	 */
	void accept(QDataTermVisitor visitor);

} // QDataTerm
