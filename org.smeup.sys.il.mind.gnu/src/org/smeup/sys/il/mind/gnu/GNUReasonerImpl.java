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

import gnu.prolog.database.PrologTextLoader;
import gnu.prolog.database.PrologTextLoaderError;
import gnu.prolog.database.PrologTextLoaderState;
import gnu.prolog.vm.Environment;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.mind.QGoal;
import org.smeup.sys.il.mind.QIntegratedLanguageMindFactory;
import org.smeup.sys.il.mind.QQuestion;
import org.smeup.sys.il.mind.QReasoner;
import org.smeup.sys.il.mind.QTheory;

public class GNUReasonerImpl implements QReasoner {

	private QContext context;

	private Environment environment = null;
	private Map<String, QTheory> theories = null;

	public GNUReasonerImpl(QContext context) {
		this.context = context;

		theories = new HashMap<String, QTheory>();
	}

	@Override
	public QContext getContext() {
		return context;
	}

	@Override
	public void close() {
		if(environment != null)
			environment.closeStreams();
	}

	@Override
	public List<QGoal> query(String question) {

		QQuestion qQuestion = buildQuestion(question);
		
		return query(qQuestion);
	}

	@Override
	public List<QGoal> query(QQuestion question) {
		GNUQuestionResolver questionResolver = new GNUQuestionResolver(environment);
		return questionResolver.resolve(question);
	}

	@Override
	public void reload() {

		environment = new GNUEnvironment();

		URL resource = FrameworkUtil.getBundle(this.getClass()).getEntry("/theories/asup_base.pl");
		// environment.ensureLoaded(AtomTerm.get(resource.getFile()));

		PrologTextLoaderState ptls = environment.getPrologTextLoaderState();
		try {
			new PrologTextLoader(ptls, new InputStreamReader(resource.openStream()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		List<PrologTextLoaderError> errors = environment.getLoadingErrors();
		for (PrologTextLoaderError error : errors) {
			error.printStackTrace();
		}

		Iterator<QTheory> theory = theories.values().iterator();
		while (theory.hasNext())
			loadTheory(theory.next());

	}

	@Override
	public void loadTheory(QTheory theory) {

		GNUTheoryReader theoryReader = null;
		try {
			theoryReader = new GNUTheoryReader(theory);

			PrologTextLoaderState ptls = environment.getPrologTextLoaderState();
			new PrologTextLoader(ptls, theoryReader);

			List<PrologTextLoaderError> errors = environment.getLoadingErrors();
			for (PrologTextLoaderError error : errors) {
				error.printStackTrace();
			}

			if (!errors.isEmpty())
				throw new RuntimeException(errors.get(0));

			theories.put(theory.getName(), theory);
		} finally {
			if (theoryReader != null)
				try {
					theoryReader.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
		}
	}
	
	@Override
	public QQuestion buildQuestion(String question) {

		QQuestion qQuestion = QIntegratedLanguageMindFactory.eINSTANCE.createQuestion();
		
		StringTokenizer st = new StringTokenizer(question);

		for(int x=0; st.hasMoreTokens(); x++) {
			switch(x) {
				case 0:
					qQuestion.setSubject(GNUTheoryBuilder.buildTerm(st.nextToken()));
					break;
				case 1:
					qQuestion.setRelation(GNUTheoryBuilder.buildTerm(st.nextToken()));
					break;
				case 2:
					qQuestion.setObject(GNUTheoryBuilder.buildTerm(st.nextToken()));
					break;
				case 3:
					qQuestion.setRule(GNUTheoryBuilder.buildTerm(st.nextToken()));				
					break;
			}				
		}
		return qQuestion;		
	}
}