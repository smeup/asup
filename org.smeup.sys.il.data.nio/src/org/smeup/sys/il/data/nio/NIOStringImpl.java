package org.smeup.sys.il.data.nio;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public abstract class NIOStringImpl extends NIOBufferedDataImpl implements QString {

	private static final long serialVersionUID = 1L;

	public NIOStringImpl(QDataContext dataContext) {
		super(dataContext);
	}

	@Override
	public QCharacter qSubst(QNumeric start, QNumeric length) {
		return qSubst(start.i(), length.i());
	}

	@Override
	public QCharacter qSubst(QNumeric start) {
		return qSubst(start.i());
	}

	@Override
	public QCharacter qSubst(QNumeric start, Number length) {
		return qSubst(start.i(), length);
	}

	@Override
	public QCharacter qSubst(Number start, QNumeric length) {
		return qSubst(start, length.i());
	}

	@Override
	public QCharacter qSubst(Number start) {
		return qSubst(start, 0);
	}

	@Override
	public QCharacter qSubst(Number start, Number length) {

		if (start == null)
			start = 1;

		if (length == null || length.equals(0))
			length = getLength() - start.intValue() + 1;

		QCharacter character = new NIOCharacterImpl(getDataContext(), length.intValue());
		assign(character, start.intValue());

		return character;
	}
}
