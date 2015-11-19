package org.smeup.sys.os.scde.cron;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.os.scde.QScheduleEntry;

public class CronSystemWrapper {
	
	public static String REBOOT = "@reboot";		// Lancia il comando all'avvio del sistema
	public static String YEARLY = "@yearly";		// Lancia il comando una volta all'anno. Uguale a "0 0 1 1 *"
	public static String ANNUALLY= "@annually"; 	// come @yearly
	public static String MONTLY = "@monthly";  		// Lancia il comando una volta al mese. Uguale a "0 0 1 * *"
	public static String WEEKLY = "@weekly";		// Lancia il comando una volta alla settimana. Uguale a "0 0 * * 0"
	public static String DAiLY = "@daily";			// Lancia il comando una volta al giorno. Uguale a "0 0 * * *"
	public static String MIDNIGHT = "@midnight";	// come @daily
	public static String HOURLY = "@hourly";		// Lancia il comando una volta all'ora. Uguale a "0 * * * *"
	

	public void addCronTask(String name, String server, String mask, String user, String command){

		executeBashScript("addcron",
				mask,
				server,
				buildID(),
				user,
				command,
				name);
	}
	
	public void removeCronTask(String name){
		
		executeBashScript("removeCron",
						 name);
	}
	
	public String lookupCronTask(String name) {
		String result = null;
		
		return result;
	}
	
		
	private void executeBashScript(String... command){
		
		try {
			
			List<String> parms = new ArrayList<String>();
			parms.add("bash");
			for (int i = 0; i < command.length; i++) {
				parms.add(command[i]);
			}
			
	        ProcessBuilder pb = new ProcessBuilder(parms);
	        pb.inheritIO();
	        Process process = pb.start();
	        process.waitFor();
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        
	    }
	}
	
	private String buildID() {
		return "" + Math.round(Math.random()*1000000);
	}
}
