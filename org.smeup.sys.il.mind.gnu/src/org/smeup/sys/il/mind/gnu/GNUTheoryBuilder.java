/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.mind.gnu;

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QSlot;
import org.smeup.sys.il.mind.QIntegratedLanguageMindFactory;
import org.smeup.sys.il.mind.QMindTerm;
import org.smeup.sys.il.mind.QTheory;

public class GNUTheoryBuilder {

	public static <O extends QObject> QTheory buildTheory(QFrame<O> frame) {

		QTheory theory = QIntegratedLanguageMindFactory.eINSTANCE.createTheory();
		theory.getFacts().add(buildTerm(":- multifile(asup_frame/1)."));
		theory.getFacts().add(buildTerm(":- multifile(asup_ako/2)."));
		theory.getFacts().add(buildTerm(":- multifile(asup_slot/2)."));
		theory.getFacts().add(buildTerm(":- multifile(asup_domain/3)."));

		theory.getFacts().add(buildTerm("asup_frame(" + frame.getName() + ")."));

		if (frame.ako() != null)
			theory.getFacts().add(buildTerm("asup_ako(" + frame.getName() + ", " + frame.ako().getName() + ")."));

		for (QSlot slot : frame.getSlots())
			theory.getFacts().add(buildTerm("asup_slot(" + frame.getName() + ", " + slot.getName() + ")."));

		for (QSlot slot : frame.getSlots())
			theory.getFacts().add(buildTerm("asup_domain(" + frame.getName() + ", " + slot.getName() + ", " + slot.getDomain().getName() + ")."));

		return theory;
	}

	public static QMindTerm buildTerm(String s) {
		QMindTerm term = QIntegratedLanguageMindFactory.eINSTANCE.createMindTerm();
		term.setName(s);
		return term;
	}
}