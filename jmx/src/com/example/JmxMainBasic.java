package com.example;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class JmxMainBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		MBeanServer server = ManagementFactory.getPlatformMBeanServer();
//		MBeanServer server2 = ManagementFactory.getPlatformMBeanServer();
		
		ObjectName name = new ObjectName("com.example", "type", "Hello");
//		ObjectName name2 = new ObjectName("com.example", "type", "Hello");
		
		Hello hello = new Hello();
		server.registerMBean(hello, name);
		//Exception in thread "main" javax.management.InstanceAlreadyExistsException
//		server.registerMBean(hello, name2);
		
		System.out.println("Waiting forever..."); 
		Thread.sleep(Long.MAX_VALUE);
	}

}
