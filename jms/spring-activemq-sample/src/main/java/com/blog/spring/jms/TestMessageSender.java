package com.blog.spring.jms;

import javax.jms.JMSException;
import javax.jms.Queue;
import org.apache.log4j.Logger;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * The TestMessageSender class uses the injected JMSTemplate to send a message
 * to a specified Queue. In our case we're sending messages to 'TestQueueTwo'
 */
@Service
public class TestMessageSender
{
	private JmsTemplate jmsTemplate;
	private Queue testQueue;
	private static final Logger logger = Logger .getLogger(TestMessageSender.class);

	/**
	 * Sends message using JMS Template.
	 *
	 * @param message the message
	 * @throws JMSException the jMS exception
	 */
	public void sendMessage(String message) throws JMSException
	{
		logger.debug("About to put message on queue. Queue[" + testQueue.toString() + "] Message[" + message + "]");
		jmsTemplate.convertAndSend(testQueue, message);
	}

	/**
	 * Sets the jms template.
	 *
	 * @param template the jms template
	 */
	public void setJmsTemplate(JmsTemplate tmpl)
	{
		this.jmsTemplate = tmpl;
	}

	/**
	 * Sets the test queue.
	 *
	 * @param queue the new test queue
	 */
	public void setTestQueue(Queue queue)
	{
		this.testQueue = queue;
	}
}