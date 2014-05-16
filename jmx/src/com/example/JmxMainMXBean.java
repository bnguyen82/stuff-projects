package com.example;

import java.lang.management.ManagementFactory;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class JmxMainMXBean {

	public static void main(String[] args) throws Exception{
		MBeanServer server = ManagementFactory.getPlatformMBeanServer();
		ObjectName name = new ObjectName("com.example", "type", "QueueSampler");
		Queue<String> queue = new ArrayBlockingQueue(10);
		queue.add("Row - 1");
		queue.add("Row - 2");
		queue.add("Row - 3");
		QueueSampler sampler = new QueueSampler(queue);
		server.registerMBean(sampler, name);
		
		Thread.sleep(Long.MAX_VALUE);
		
	}

}
