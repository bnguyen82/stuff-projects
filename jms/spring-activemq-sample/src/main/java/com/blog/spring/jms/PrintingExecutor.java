package com.blog.spring.jms;

import org.springframework.scheduling.annotation.Async;

/**
 * The TestMessageSender class uses the injected JMSTemplate to send a message
 * to a specified Queue. In our case we're sending messages to 'TestQueueTwo'
 */
public class PrintingExecutor
{
//	public static final void main(String[] args){
//		new PrintingExecutor().printing();
//	}
	public void printing()
	{
		System.out.println("Printing ...");
		greeting();
	}
	@Async
	public void greeting()
	{
		System.out.println("Hello");
	}
}