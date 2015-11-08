package org.smeup.sys.il.mind.gnu;

import gnu.prolog.database.Predicate;
import gnu.prolog.term.CompoundTermTag;
import gnu.prolog.vm.Environment;
import gnu.prolog.vm.PrologCode;
import gnu.prolog.vm.PrologException;
import gnu.prolog.vm.interpreter.InterpretedCodeCompiler;

public class GNUEnvironment extends Environment {

	@Override
	public synchronized PrologCode loadPrologCode(CompoundTermTag tag) throws PrologException {
		// simple variant, later I will need to add compilation.
		Predicate p = prologTextLoaderState.getModule().getDefinedPredicate(tag);
		if (p == null) // case of undefined predicate
		{
			return getUndefinedPredicateCode(tag);
		}
		switch (p.getType()) {
		case CONTROL:
			// really only call should be loaded in this way
		case BUILD_IN:
		case EXTERNAL: {
			try {
				Class<?> cls = Class.forName(p.getJavaClassName());
				PrologCode code = (PrologCode) cls.newInstance();
				code.install(this);
				if (code instanceof GNUPredicate)
					((GNUPredicate) code).setPredicate(p);

				return code;
			} catch (/* ClassNotFound */Exception ex)
			// Maybe it will be needed to separate different cases later
			{
				ex.printStackTrace();
				return getUndefinedPredicateCode(tag);
			}
		}
		case USER_DEFINED: {
			PrologCode code = InterpretedCodeCompiler.compile(p.getClauses());
			code.install(this);
			return code;
		}
		default:
			return getUndefinedPredicateCode(tag);
		}
	}
}