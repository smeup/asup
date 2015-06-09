/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dml.impl;

import java.util.Collection;

import org.eclipse.datatools.modelbase.sql.query.GroupingSpecification;
import org.eclipse.datatools.modelbase.sql.query.QueryResultSpecification;
import org.eclipse.datatools.modelbase.sql.query.QuerySearchCondition;
import org.eclipse.datatools.modelbase.sql.query.QuerySelect;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;
import org.eclipse.datatools.modelbase.sql.query.TableReference;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionVariable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage;
import org.smeup.sys.db.syntax.dml.QExtendedQuerySelect;

@SuppressWarnings("rawtypes")

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Query Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl#getHavingClause <em>Having Clause</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl#getGroupByClause <em>Group By Clause</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dml.impl.ExtendedQuerySelectImpl#getIntoClause <em>Into Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedQuerySelectImpl extends ExtendedQueryExpressionBodyImpl implements QExtendedQuerySelect {
	/**
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected boolean distinct = DISTINCT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHavingClause() <em>Having Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHavingClause()
	 * @generated
	 * @ordered
	 */
	protected QuerySearchCondition havingClause;

	/**
	 * This is true if the Having Clause containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean havingClauseESet;

	/**
	 * The cached value of the '{@link #getWhereClause() <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClause()
	 * @generated
	 * @ordered
	 */
	protected QuerySearchCondition whereClause;

	/**
	 * This is true if the Where Clause containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean whereClauseESet;

	/**
	 * The cached value of the '{@link #getGroupByClause() <em>Group By Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupByClause()
	 * @generated
	 * @ordered
	 */
	
	protected EList groupByClause;

	/**
	 * The cached value of the '{@link #getSelectClause() <em>Select Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectClause()
	 * @generated
	 * @ordered
	 */
	protected EList selectClause;

	/**
	 * The cached value of the '{@link #getFromClause() <em>From Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromClause()
	 * @generated
	 * @ordered
	 */
	protected EList fromClause;

	/**
	 * The cached value of the '{@link #getIntoClause() <em>Into Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntoClause()
	 * @generated
	 * @ordered
	 */
	protected EList intoClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedQuerySelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDMLPackage.Literals.EXTENDED_QUERY_SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistinct(boolean newDistinct) {
		boolean oldDistinct = distinct;
		distinct = newDistinct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__DISTINCT, oldDistinct, distinct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySearchCondition getHavingClause() {
		return havingClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHavingClause(QuerySearchCondition newHavingClause, NotificationChain msgs) {
		QuerySearchCondition oldHavingClause = havingClause;
		havingClause = newHavingClause;
		boolean oldHavingClauseESet = havingClauseESet;
		havingClauseESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE, oldHavingClause, newHavingClause, !oldHavingClauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHavingClause(QuerySearchCondition newHavingClause) {
		if (newHavingClause != havingClause) {
			NotificationChain msgs = null;
			if (havingClause != null)
				msgs = ((InternalEObject)havingClause).eInverseRemove(this, SQLQueryModelPackage.QUERY_SEARCH_CONDITION__QUERY_SELECT_HAVING, QuerySearchCondition.class, msgs);
			if (newHavingClause != null)
				msgs = ((InternalEObject)newHavingClause).eInverseAdd(this, SQLQueryModelPackage.QUERY_SEARCH_CONDITION__QUERY_SELECT_HAVING, QuerySearchCondition.class, msgs);
			msgs = basicSetHavingClause(newHavingClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHavingClauseESet = havingClauseESet;
			havingClauseESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE, newHavingClause, newHavingClause, !oldHavingClauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetHavingClause(NotificationChain msgs) {
		QuerySearchCondition oldHavingClause = havingClause;
		havingClause = null;
		boolean oldHavingClauseESet = havingClauseESet;
		havingClauseESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE, oldHavingClause, null, oldHavingClauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHavingClause() {
		if (havingClause != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)havingClause).eInverseRemove(this, SQLQueryModelPackage.QUERY_SEARCH_CONDITION__QUERY_SELECT_HAVING, QuerySearchCondition.class, msgs);
			msgs = basicUnsetHavingClause(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldHavingClauseESet = havingClauseESet;
			havingClauseESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE, null, null, oldHavingClauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHavingClause() {
		return havingClauseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySearchCondition getWhereClause() {
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereClause(QuerySearchCondition newWhereClause, NotificationChain msgs) {
		QuerySearchCondition oldWhereClause = whereClause;
		whereClause = newWhereClause;
		boolean oldWhereClauseESet = whereClauseESet;
		whereClauseESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE, oldWhereClause, newWhereClause, !oldWhereClauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereClause(QuerySearchCondition newWhereClause) {
		if (newWhereClause != whereClause) {
			NotificationChain msgs = null;
			if (whereClause != null)
				msgs = ((InternalEObject)whereClause).eInverseRemove(this, SQLQueryModelPackage.QUERY_SEARCH_CONDITION__QUERY_SELECT_WHERE, QuerySearchCondition.class, msgs);
			if (newWhereClause != null)
				msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, SQLQueryModelPackage.QUERY_SEARCH_CONDITION__QUERY_SELECT_WHERE, QuerySearchCondition.class, msgs);
			msgs = basicSetWhereClause(newWhereClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWhereClauseESet = whereClauseESet;
			whereClauseESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE, newWhereClause, newWhereClause, !oldWhereClauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetWhereClause(NotificationChain msgs) {
		QuerySearchCondition oldWhereClause = whereClause;
		whereClause = null;
		boolean oldWhereClauseESet = whereClauseESet;
		whereClauseESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE, oldWhereClause, null, oldWhereClauseESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWhereClause() {
		if (whereClause != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)whereClause).eInverseRemove(this, SQLQueryModelPackage.QUERY_SEARCH_CONDITION__QUERY_SELECT_WHERE, QuerySearchCondition.class, msgs);
			msgs = basicUnsetWhereClause(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldWhereClauseESet = whereClauseESet;
			whereClauseESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE, null, null, oldWhereClauseESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWhereClause() {
		return whereClauseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGroupByClause() {
		if (groupByClause == null) {
			groupByClause = new EObjectContainmentWithInverseEList<GroupingSpecification>(GroupingSpecification.class, this, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE, SQLQueryModelPackage.GROUPING_SPECIFICATION__QUERY_SELECT);
		}
		return groupByClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSelectClause() {
		if (selectClause == null) {
			selectClause = new EObjectContainmentWithInverseEList<QueryResultSpecification>(QueryResultSpecification.class, this, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__SELECT_CLAUSE, SQLQueryModelPackage.QUERY_RESULT_SPECIFICATION__QUERY_SELECT);
		}
		return selectClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFromClause() {
		if (fromClause == null) {
			fromClause = new EObjectContainmentWithInverseEList<TableReference>(TableReference.class, this, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__FROM_CLAUSE, SQLQueryModelPackage.TABLE_REFERENCE__QUERY_SELECT);
		}
		return fromClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIntoClause() {
		if (intoClause == null) {
			intoClause = new EObjectContainmentWithInverseEList<ValueExpressionVariable>(ValueExpressionVariable.class, this, QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__INTO_CLAUSE, SQLQueryModelPackage.VALUE_EXPRESSION_VARIABLE__QUERY_SELECT);
		}
		return intoClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE:
				if (havingClause != null)
					msgs = ((InternalEObject)havingClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE, null, msgs);
				return basicSetHavingClause((QuerySearchCondition)otherEnd, msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE:
				if (whereClause != null)
					msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE, null, msgs);
				return basicSetWhereClause((QuerySearchCondition)otherEnd, msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupByClause()).basicAdd(otherEnd, msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__SELECT_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectClause()).basicAdd(otherEnd, msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__FROM_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromClause()).basicAdd(otherEnd, msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__INTO_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntoClause()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE:
				return basicUnsetHavingClause(msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE:
				return basicUnsetWhereClause(msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE:
				return ((InternalEList<?>)getGroupByClause()).basicRemove(otherEnd, msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__SELECT_CLAUSE:
				return ((InternalEList<?>)getSelectClause()).basicRemove(otherEnd, msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__FROM_CLAUSE:
				return ((InternalEList<?>)getFromClause()).basicRemove(otherEnd, msgs);
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__INTO_CLAUSE:
				return ((InternalEList<?>)getIntoClause()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__DISTINCT:
				return isDistinct();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE:
				return getHavingClause();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE:
				return getWhereClause();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE:
				return getGroupByClause();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__SELECT_CLAUSE:
				return getSelectClause();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__FROM_CLAUSE:
				return getFromClause();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__INTO_CLAUSE:
				return getIntoClause();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE:
				setHavingClause((QuerySearchCondition)newValue);
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE:
				setWhereClause((QuerySearchCondition)newValue);
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE:
				getGroupByClause().clear();
				getGroupByClause().addAll((Collection<? extends GroupingSpecification>)newValue);
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__SELECT_CLAUSE:
				getSelectClause().clear();
				getSelectClause().addAll((Collection<? extends QueryResultSpecification>)newValue);
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__FROM_CLAUSE:
				getFromClause().clear();
				getFromClause().addAll((Collection<? extends TableReference>)newValue);
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__INTO_CLAUSE:
				getIntoClause().clear();
				getIntoClause().addAll((Collection<? extends ValueExpressionVariable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE:
				unsetHavingClause();
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE:
				unsetWhereClause();
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE:
				getGroupByClause().clear();
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__SELECT_CLAUSE:
				getSelectClause().clear();
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__FROM_CLAUSE:
				getFromClause().clear();
				return;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__INTO_CLAUSE:
				getIntoClause().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__DISTINCT:
				return distinct != DISTINCT_EDEFAULT;
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE:
				return isSetHavingClause();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE:
				return isSetWhereClause();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE:
				return groupByClause != null && !groupByClause.isEmpty();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__SELECT_CLAUSE:
				return selectClause != null && !selectClause.isEmpty();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__FROM_CLAUSE:
				return fromClause != null && !fromClause.isEmpty();
			case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__INTO_CLAUSE:
				return intoClause != null && !intoClause.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QuerySelect.class) {
			switch (derivedFeatureID) {
				case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__DISTINCT: return SQLQueryModelPackage.QUERY_SELECT__DISTINCT;
				case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE: return SQLQueryModelPackage.QUERY_SELECT__HAVING_CLAUSE;
				case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE: return SQLQueryModelPackage.QUERY_SELECT__WHERE_CLAUSE;
				case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE: return SQLQueryModelPackage.QUERY_SELECT__GROUP_BY_CLAUSE;
				case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__SELECT_CLAUSE: return SQLQueryModelPackage.QUERY_SELECT__SELECT_CLAUSE;
				case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__FROM_CLAUSE: return SQLQueryModelPackage.QUERY_SELECT__FROM_CLAUSE;
				case QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__INTO_CLAUSE: return SQLQueryModelPackage.QUERY_SELECT__INTO_CLAUSE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QuerySelect.class) {
			switch (baseFeatureID) {
				case SQLQueryModelPackage.QUERY_SELECT__DISTINCT: return QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__DISTINCT;
				case SQLQueryModelPackage.QUERY_SELECT__HAVING_CLAUSE: return QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__HAVING_CLAUSE;
				case SQLQueryModelPackage.QUERY_SELECT__WHERE_CLAUSE: return QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__WHERE_CLAUSE;
				case SQLQueryModelPackage.QUERY_SELECT__GROUP_BY_CLAUSE: return QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__GROUP_BY_CLAUSE;
				case SQLQueryModelPackage.QUERY_SELECT__SELECT_CLAUSE: return QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__SELECT_CLAUSE;
				case SQLQueryModelPackage.QUERY_SELECT__FROM_CLAUSE: return QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__FROM_CLAUSE;
				case SQLQueryModelPackage.QUERY_SELECT__INTO_CLAUSE: return QDatabaseSyntaxDMLPackage.EXTENDED_QUERY_SELECT__INTO_CLAUSE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (distinct: ");
		result.append(distinct);
		result.append(')');
		return result.toString();
	}

} //ExtendedQuerySelectImpl
