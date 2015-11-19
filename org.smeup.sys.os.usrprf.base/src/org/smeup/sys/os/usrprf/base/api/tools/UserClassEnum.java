package org.smeup.sys.os.usrprf.base.api.tools;

import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.usrprf.UserClass;

public enum UserClassEnum {
	@Special(value = "-1")
	SAME {
		@Override
		public UserClass getUserClass() {
			return null;
		}
	},

	@Special(value = "100")
	USER {
		@Override
		public UserClass getUserClass() {
			return UserClass.USER;
		}
	},

	@Special(value = "200")
	SYSOPR {
		@Override
		public UserClass getUserClass() {
			return UserClass.SYSOPR;
		}
	},

	@Special(value = "300")
	PGMR {
		@Override
		public UserClass getUserClass() {
			return UserClass.PGMR;
		}
	},

	@Special(value = "400")
	SECADM {
		@Override
		public UserClass getUserClass() {
			return UserClass.SECADM;
		}
	},

	@Special(value = "500")
	SECOFR {
		@Override
		public UserClass getUserClass() {
			return UserClass.SECOFR;
		}
	};

	public abstract UserClass getUserClass();
}
