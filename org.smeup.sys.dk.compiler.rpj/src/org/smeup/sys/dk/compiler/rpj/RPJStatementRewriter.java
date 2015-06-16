/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 *   Mattia Rocchi - Implementation
 */
package org.smeup.sys.dk.compiler.rpj;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QBreak;
import org.smeup.sys.il.flow.QCall;
import org.smeup.sys.il.flow.QCommandExec;
import org.smeup.sys.il.flow.QContinue;
import org.smeup.sys.il.flow.QEval;
import org.smeup.sys.il.flow.QFor;
import org.smeup.sys.il.flow.QIf;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QJump;
import org.smeup.sys.il.flow.QLabel;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QMonitor;
import org.smeup.sys.il.flow.QOnError;
import org.smeup.sys.il.flow.QProcedureExec;
import org.smeup.sys.il.flow.QReset;
import org.smeup.sys.il.flow.QReturn;
import org.smeup.sys.il.flow.QRoutineExec;
import org.smeup.sys.il.flow.QSQLExec;
import org.smeup.sys.il.flow.QStatement;
import org.smeup.sys.il.flow.QUntil;
import org.smeup.sys.il.flow.QWhile;
import org.smeup.sys.il.flow.impl.StatementVisitorImpl;

public abstract class RPJStatementRewriter extends StatementVisitorImpl {

	private QStatement target = null;

	public RPJStatementRewriter() {
	}

	protected abstract RPJStatementRewriter copy();

	public QStatement getTarget() {
		return this.target;
	}

	@Override
	public boolean visit(QBlock statement) {

		RPJStatementRewriter newRewriter = copy();
		for (QStatement child : statement.getStatements())
			child.accept(newRewriter);

		write(newRewriter.getTarget());

		return false;
	}

	@Override
	public boolean visit(QFor statement) {

		QFor newFor = (QFor) EcoreUtil.copy((EObject) statement);

		if (statement.getBody() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getBody().accept(newRewriter);
			newFor.setBody(newRewriter.getTarget());
		}

		write(newFor);

		return false;
	}

	@Override
	public boolean visit(QUntil statement) {

		QUntil newUntil = (QUntil) EcoreUtil.copy((EObject) statement);

		if (statement.getBody() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getBody().accept(newRewriter);
			newUntil.setBody(newRewriter.getTarget());
		}

		write(newUntil);

		return false;
	}

	@Override
	public boolean visit(QWhile statement) {

		QWhile newWhile = (QWhile) EcoreUtil.copy((EObject) statement);

		if (statement.getBody() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getBody().accept(newRewriter);
			newWhile.setBody(newRewriter.getTarget());
		}

		write(newWhile);

		return false;
	}

	@Override
	public boolean visit(QIf statement) {

		QIf newIf = (QIf) EcoreUtil.copy((EObject) statement);

		if (statement.getThen() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getThen().accept(newRewriter);
			newIf.setThen(newRewriter.getTarget());
		}

		if (newIf.getElse() != null) {
			RPJStatementRewriter newRewriter = copy();
			newIf.getElse().accept(newRewriter);
			newIf.setElse(newRewriter.getTarget());
		}

		write(newIf);

		return false;
	}

	@Override
	public boolean visit(QMonitor statement) {

		QMonitor newMonitor = (QMonitor) EcoreUtil.copy((EObject) statement);

		if (statement.getBody() != null) {
			RPJStatementRewriter newRewriter = copy();
			statement.getBody().accept(newRewriter);
			newMonitor.setBody(newRewriter.getTarget());
		}

		for (QOnError onError : statement.getOnErrors()) {
			QOnError newOnError = (QOnError) EcoreUtil.copy((EObject) onError);

			RPJStatementRewriter newRewriter = copy();
			onError.getBody().accept(newRewriter);
			newOnError.setBody(newRewriter.getTarget());
		}

		write(newMonitor);

		return false;
	}

	@Override
	public boolean visit(QBreak statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QCall statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QCommandExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QContinue statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QEval statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QProcedureExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QJump statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QLabel statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QMethodExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QReturn statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QRoutineExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QSQLExec statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	@Override
	public boolean visit(QReset statement) {

		write((QStatement) EcoreUtil.copy((EObject) statement));

		return false;
	}

	protected void write(QStatement statement) {

		// append statement
		if (this.target instanceof QBlock) {
			QBlock blockTarget = (QBlock) this.target;
			blockTarget.getStatements().add(statement);
		}
		// switch statement to block
		else if (this.target != null) {
			QBlock newBlock = QIntegratedLanguageFlowFactory.eINSTANCE.createBlock();
			newBlock.getStatements().add(this.target);
			newBlock.getStatements().add(statement);
			this.target = newBlock;
		}
		// write statement
		else
			this.target = statement;
	}
}