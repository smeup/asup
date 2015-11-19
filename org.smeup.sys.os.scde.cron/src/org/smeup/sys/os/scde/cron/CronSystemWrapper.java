package org.smeup.sys.os.scde.cron;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CronSystemWrapper {
	
	String webServiceAddress = "127.0.0.1";
	
	public void addCronTask(String taskName, String taskID, String mask, String user, String command){

		executeBashScript("addcron",
						  mask,
						  webServiceAddress,
						  taskID,
						  user,
						  command,
						  taskName);
	}
	
	public void removeCronTask(String taskName){
		
		executeBashScript("removeCron",
						 taskName);
	}
	
	public String lookupCronTask(String taskName) {
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
	

}
