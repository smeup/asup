package org.smeup.sys.os.scde.cron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.os.core.OperatingSystemRuntimeException;

public class CronSystemWrapper
{
	
	public void addCronTask(String mask,
							String wsip,
							String wsport,
							String system,
							String user,
							String password,
							String env,
							String cmd,
							String id,
							String name,
							String description
							){
				
		executeBashScript("addcron",
						  mask,
						  wsip,						  
						  wsport,	
						  system,
						  user,
						  password,
						  env,
						  cmd,
						  id,						  
						  name, 
						  description
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
			throw new OperatingSystemRuntimeException(e);
		} catch (InterruptedException e) {			
			
		}
		finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					throw new OperatingSystemRuntimeException(e);
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
	    	throw new OperatingSystemRuntimeException(e);
		} catch (InterruptedException e) {

		} finally {
	        
	    }
	}
	
	
} 
