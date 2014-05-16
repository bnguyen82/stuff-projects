package com.example;

import java.util.Date;
import java.util.Queue;

public class QueueSampler implements QueueSimplerMXBean {
	private Queue<String> queue;
	public QueueSampler(Queue<String> queue) {
		this.queue = queue;
	}
	@Override
	public synchronized QueueSample getQueueSample() {
		synchronized (queue) {
			return new QueueSample(new Date(), queue.size(), queue.peek());
		}
	}

	@Override
	public void clearQueue() {

	}

}
