package com.example;

import javax.management.AttributeChangeNotification;
import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class Hello extends NotificationBroadcasterSupport 
	implements HelloMBean {

	private static final int DEFAULT_CACHE_SIZE = 200;
	private final String name = "Bao";
	private int cacheSize = DEFAULT_CACHE_SIZE;
	private int sequenceNumber = 1;

	@Override
	public void sayHello() {
		System.out.println("hello, world");
	}
	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getCacheSize() {
		return this.cacheSize;
	}

	@Override
	public void setCacheSize(int size) {
		int oldCache = this.cacheSize;
		this.cacheSize = size;
		Notification notify = new AttributeChangeNotification(this, sequenceNumber ++, 
				System.currentTimeMillis(),  "CacheSize changed", "CacheSize", "int"
				, oldCache, this.cacheSize);
		sendNotification(notify);
	}
	@Override
	public MBeanNotificationInfo[] getNotificationInfo() {
		String[] types = new String[]{
	            AttributeChangeNotification.ATTRIBUTE_CHANGE
	        };

        String name = AttributeChangeNotification.class.getName();
        String description = "An attribute of this MBean has changed";
        MBeanNotificationInfo info = 
                new MBeanNotificationInfo(types, name, description);
        return new MBeanNotificationInfo[]{info};
	}

}
