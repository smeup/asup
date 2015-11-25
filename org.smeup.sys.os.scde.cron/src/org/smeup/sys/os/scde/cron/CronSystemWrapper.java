package org.smeup.sys.os.scde.cron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
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
		
		executeBashScript("removecron",
						 taskName);
	}
	
	public String lookupCronTask(String taskName) {
		String result = null;
		
		List<String> listCronTasks = listCronTasks(taskName);
		
		if (listCronTasks.size() > 0) {
			result = listCronTasks.get(0);
		}
		
		return result;
	}
	
	/*
	 * "*" listing all cron tasks
	 */
	public List<String> listCronTasks(String nameFilter) {
		
		List<String> result = new ArrayList<String>();

		List<String> parms = new ArrayList<String>();
		parms.add("crontab");
		parms.add("-l");
		
		ProcessBuilder pb = new ProcessBuilder(parms);

		BufferedReader br = null;
		try {
        	
	        Process process = pb.start();
		
	        //Read out dir output
	        InputStream is = process.getInputStream();
	        InputStreamReader isr = new InputStreamReader(is);
	        br = new BufferedReader(isr);
	        String line;
        
	        while ((line = br.readLine()) != null) {	
	        	
	        	if (line.length() > 0 && ("*".equalsIgnoreCase(nameFilter) || line.contains(nameFilter))) {
					result.add(line);
				}
	        }
        
	        //Wait process exit	        
	        process.waitFor();
	        
		} catch(IOException e){
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
