package org.smeup.sys.il.mind.gnu;

import gnu.prolog.database.Predicate;
import gnu.prolog.term.JavaObjectTerm;
import gnu.prolog.term.Term;
import gnu.prolog.term.VariableTerm;
import gnu.prolog.vm.Environment;
import gnu.prolog.vm.Interpreter;
import gnu.prolog.vm.PrologCode;
import gnu.prolog.vm.PrologException;

public abstract class GNUPredicate implements PrologCode {

	private Environment environment = null;
	private Predicate predicate = null;

	@Override
	public void install(Environment environment) {
		this.environment = environment;
	}

	@Override
	public void uninstall(Environment environment) {
		this.environment = null;
	}

	public Environment getEnvironment() {
		return this.environment;
	}

	public void setPredicate(Predicate predicate) {
		this.predicate = predicate;
	}

	public Predicate getPredicate() {
		return predicate;
	}

	@Override
	public int execute(Interpreter interpreter, boolean backtrackMode, Term[] vars) throws PrologException {

		Object object;
		if (!backtrackMode) {
			try {
				if (!prepare(vars))
					return PrologCode.FAIL;
			} catch (Exception e) {
				System.out.println("ERR->" + e.getMessage());
				return PrologCode.FAIL;
			}

			object = next();
			if (object == null)
				return PrologCode.SUCCESS_LAST;
		} else {
			object = next();
		}

		if (object == null)
			return PrologCode.FAIL;

		JavaObjectTerm ot = new JavaObjectTerm(object);
		for (int x = 0; x < vars.length; x++) {
			if (vars[x] instanceof VariableTerm)
				interpreter.simpleUnify(vars[x], ot);
			// interpreter.unify(vars[x], ot);
		}

		if (hasNext())
			return PrologCode.SUCCESS;

		return PrologCode.SUCCESS_LAST;
	}

	public abstract boolean prepare(Term[] vars);

	public abstract boolean hasNext();

	public abstract Object next();

}
