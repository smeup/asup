package org.smeup.sys.os.core.base.api.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.smeup.sys.os.core.jobs.JobDateFormat;

public class JobDateFormatter {

	public DateFormat ddMMyy() {
		return new SimpleDateFormat("ddMMyy");
	}

	public DateFormat yyMMdd() {
		return new SimpleDateFormat("yyMMdd");
	}

	public DateFormat mmDDyy() {
		return new SimpleDateFormat("MMddyy");
	}

	public DateFormat julian() {
		return new SimpleDateFormat("yyD");
	}

	public static DateFormat forType(JobDateFormat format) {
		switch (format) {
		case DAY_MONTH_YEAR:
			return new JobDateFormatter().ddMMyy();
		case MONTH_DAY_YEAR:
			return new JobDateFormatter().mmDDyy();
		case YEAR_MONTH_DAY:
			return new JobDateFormatter().yyMMdd();
		case JULIAN:
			return new JobDateFormatter().julian();
		default:
			throw new RuntimeException("Unknokwn date format: " + format);
		}
	}
}
