package org.smeup.sys.os.scde.cron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CronSystemWrapper
 {
	
	String webServiceAddress = "127.0.0.1";
	
	public void addCronTask(String taskName, String taskDescription, String taskID, String mask, String user, String command){

		executeBashScript("addcron",
						  mask,
						  webServiceAddress,
						  taskID,
						  user,
						  command,
						  taskName, 
						  taskDescription
						  );
	}
	
	public void removeCronTask(String taskName){
		
		executeBashScript("removeCron",
						 taskName);
	}
	
	public String lookupCronTask(String taskName) {
		String result = null;
		
		List<String> listCronTasks = listCronTasks();
		
		for (String task: listCronTasks) {
			if (task.contains(taskName)) {
				result = task;
				break;
			}
		}
		
		return result;
	}
	
	
	public List<String> listCronTasks() {
		
		List<String> result = new ArrayList<String>();

		List<String> parms = new ArrayList<String>();
		parms.add("crontab");
		parms.add("-l");
		
		ProcessBuilder pb = new ProcessBuilder(parms);
        pb.inheritIO();
        try {
        	
	        Process process = pb.start();
	        process.waitFor();			
	        
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			while ( (line = reader.readLine()) != null) {
			   result.add(line);		   
			}
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        
	    }
		
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
