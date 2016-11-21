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
package org.smeup.sys.os.type.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;

@Program(name = "QWCCALOC")
public class ObjectAllocator {

	@Inject
	private QJob job;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QLockManager lockManager;
	
	@SuppressWarnings("unused")
	@Main
	public void main(@ToDo @DataDef(dimension = 50) QStroller<ObjectSpecification> objectSpecifications, @ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<WaitTimeEnum, QBinary> waitTime,
			@ToDo @DataDef(length = 1) QEnum<LockScopeEnum, QCharacter> lockScope, @ToDo @DataDef(length = 1) QEnum<LockConflictActionEnum, QCharacter> lockConflictAction) {

		// TODO attesa bug 
		if(true)
			return;
		
		for (ObjectSpecification objectSpecification : objectSpecifications) {

			if (objectSpecification.isEmpty())
				continue;

			switch (lockScope.asEnum()) {
			case JOB:
				break;
			case LCKSPC:
				break;
			case THREAD:
				break;
			}
			
			QType<?> type = typeRegistry.lookup(objectSpecification.objectType.trimR());
			
			QResourceReader<?> resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), objectSpecification.object.library.asEnum(), objectSpecification.object.library.asData().trimR());
			QObjectNameable objectNameable = resourceReader.lookup(objectSpecification.object.name.trimR());

			QObjectLocker<?> objectLocker = lockManager.getLocker(job, objectNameable);

			LockType lockType = null;
			switch (objectSpecification.lockState.asEnum()) {
			case EXCL:
				lockType = LockType.READ;
				break;
			case EXCLRD:
				lockType = LockType.READ;
				break;
			case SHRNUP:
				lockType = LockType.WRITE;
				break;
			case SHRRD:
				lockType = LockType.READ;
				break;
			case SHRUPD:
				lockType = LockType.WRITE;
				break;
			}

			objectLocker.tryLock(waitTime.asData().asLong(), lockType);
		}
	}

	public static class ObjectSpecification extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(qualified = true)
		public Object object;
		@DataDef(length = 7)
		public QCharacter objectType;
		@DataDef(binaryType = BinaryType.SHORT)
		public QEnum<LockStateEnum, QBinary> lockState;
		@DataDef(length = 10)
		public QEnum<MemberIfDataBaseFileEnum, QCharacter> memberIfDataBaseFile;

		public static class Object extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 10)
			public QCharacter name;
			@DataDef(length = 10, value = "*LIBL")
			public QEnum<Scope, QCharacter> library;
		}

		public static enum LockStateEnum {
			@Special(value = "1")
			SHRRD, @Special(value = "2")
			SHRNUP, @Special(value = "3")
			SHRUPD, @Special(value = "4")
			EXCLRD, @Special(value = "5")
			EXCL
		}

		public static enum MemberIfDataBaseFileEnum {
			@Special(value = "X'40'")
			FIRST, OTHER
		}
	}

	public static enum WaitTimeEnum {
		@Special(value = "-1")
		CLS, OTHER
	}

	public static enum LockScopeEnum {
		@Special(value = "J")
		JOB, @Special(value = "T")
		THREAD, @Special(value = "L")
		LCKSPC
	}

	public static enum LockConflictActionEnum {
		@Special(value = "N")
		NORQSRLS, @Special(value = "Y")
		RQSRLS
	}

}