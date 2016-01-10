package org.smeup.sys.il.data.enums;

import org.smeup.sys.il.data.annotation.Special;

public enum YesNoEnum {
	@Special(value = "N")
	NO {
		@Override
		public boolean asBoolean() {
			return false;
		}
	}, 
	@Special(value = "Y")
	YES {
		@Override
		public boolean asBoolean() {
			return true;
		}
	};
	
	public abstract boolean asBoolean();
}