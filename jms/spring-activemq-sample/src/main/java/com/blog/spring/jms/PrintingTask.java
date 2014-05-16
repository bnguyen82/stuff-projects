package com.blog.spring.jms;

import org.springframework.stereotype.Service;

/**
 * The TestMessageSender class uses the injected JMSTemplate to send a message
 * to a specified Queue. In our case we're sending messages to 'TestQueueTwo'
 */
@Service
public class PrintingTask
{
	
	public void printing()
	{
		System.out.println("Printing ...");
		new PrintingExecutor().greeting();
	}
	public void greeting()
	{
		System.out.println("Hello");
	}
}