package org.smeup.sys.os.core.base.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QWCDLYJB")
public @Supported class JobDelayer {
	
	private static final int MILLIS_IN_ONE_DAY = 1000 * 60 * 60 * 24;

	public static enum QCPFMSG {
	}

	public @Entry void main(@Supported @DataDef(binaryType = BinaryType.INTEGER) QBinary seconds,
							@Supported @DataDef(length = 8) QCharacter resumeTime) {
		int nrOfSeconds = seconds.asInteger();
		if (nrOfSeconds > 0) {
			delay(nrOfSeconds * 1000);
		} else {
			Date resumeDate = toDate(resumeTime);
			if(resumeDate != null) { 
				delay(nrOfMillisUntilTime(resumeDate));
			} else {
				throw new RuntimeException("You must specify DLY or  RSMTIME");
			}
		}
	}

	private long nrOfMillisUntilTime(Date resumeDate) {
		return (resumeDate.getTime() - new Date().getTime()) ;
	}

	private synchronized Date toDate(QCharacter resumeTime) {
		try {
			String resumeTimeString = 
					resumeTime
					.trimR()
					.replaceAll("[^\\d.]", "");  //Just numeric chars
			Date todayHour = hourFormatter().parse(todayString() + resumeTimeString);
			if (todayHour.after(new Date())) {
				return todayHour;
			} else {
				return addOneDay(todayHour);
			}
		} catch (ParseException e) {
			return null;
		}
	}

	private Date addOneDay(Date date) {
	    return new Date(date.getTime() + MILLIS_IN_ONE_DAY); 
	}


	private String todayString() {
		return new SimpleDateFormat("ddMMyyyy").format(new Date());
	}

	private SimpleDateFormat hourFormatter() {
	    SimpleDateFormat dfOre = new SimpleDateFormat("ddMMyyyyHHmmss");
	    dfOre.setLenient(false);
	    return dfOre;		
	}

	private void delay(long nrOfMillis) {
		if (nrOfMillis > 0) {
			System.out.println("Introducing a delay of " + (nrOfMillis/1000) + " seconds...");
			try {
				Thread.sleep(nrOfMillis);
			} catch (InterruptedException e) {
			}
			System.out.println("...done!");
		}
	}
}
