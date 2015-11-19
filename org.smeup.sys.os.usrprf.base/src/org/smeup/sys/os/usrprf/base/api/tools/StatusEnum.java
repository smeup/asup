package org.smeup.sys.os.usrprf.base.api.tools;

import org.smeup.sys.il.data.annotation.Special;

public enum StatusEnum {
	@Special(value = "S")
	SAME {
		@Override
		public boolean isEnabled() {
			throw new UnsupportedOperationException("'SAME' status hasn't a boolean value");
		}
	},
	@Special(value = "X'40'")
	ENABLED {
		@Override
		public boolean isEnabled() {
			return true;
		}
	},
	@Special(value = "D")
	DISABLED {
		@Override
		public boolean isEnabled() {
			return false;
		}
	};

	public abstract boolean isEnabled();
}
