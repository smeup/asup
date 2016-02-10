package org.smeup.sys.il.mind.base;

import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.meta.QFrame;
import org.smeup.sys.il.core.meta.QFrameManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.mind.QGoal;
import org.smeup.sys.il.mind.QMindManager;
import org.smeup.sys.il.mind.QMindTerm;
import org.smeup.sys.il.mind.QReasoner;
import org.smeup.sys.il.mind.QTheory;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;

@Program(name = "QASMINDR")
public class BaseMindQuery {

	@Inject
	private QJob job;
	@Inject
	private QFrameManager frameManager;
	@Inject
	private QMindManager mindManager;
	
	@Main
	public void main(@DataDef(length = 256) QCharacter question) {
		
		QFrame<?> frame = frameManager.getFrame(QOperatingSystemJobsPackage.eINSTANCE.getJob()); 
				
		QTheory theory = mindManager.buildTheory(job.getContext(), frame);
		
		for(QMindTerm mindTerm: theory.getFacts())
			System.out.println(mindTerm.getName());

		QReasoner reasoner = mindManager.createReasoner(job.getContext());
		reasoner.loadTheory(theory);
		
//		QQuestion question = reasoner.buildQuestion("? asup_has asup_slot address");
		
		System.err.println(question.trimR());
		List<QGoal> goals = reasoner.query(question.trimR());
		for(QGoal goal: goals) {
			System.err.print(goal.getTerms());
		}		
		System.err.println();
		reasoner.close();
	}
}