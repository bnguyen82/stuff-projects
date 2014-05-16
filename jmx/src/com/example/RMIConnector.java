package com.example;

import javax.management.AttributeChangeNotification;
import javax.management.JMX;
import javax.management.MBeanServerConnection;
import javax.management.Notification;
import javax.management.NotificationListener;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

public class RMIConnector {

	public static void main(String[] args) throws Exception{
		JMXServiceURL url = new JMXServiceURL("service:jmx:rmi://jndi/rmi:9999/jmxrmi");
		JMXConnector connector = JMXConnectorFactory.connect(url, null);
		
		MBeanServerConnection mbsc = connector.getMBeanServerConnection();
		for (String str : mbsc.getDomains()){
			System.out.println(str);
		}
		
		ObjectName name = new ObjectName("com.example", "type", "Hello");
		HelloMBean mBean = JMX.newMBeanProxy(mbsc, name, HelloMBean.class, true);
		mbsc.addNotificationListener(name, new ClientListener(), null, null);
		
		mBean.setCacheSize(110);
		Thread.sleep(2000);
		mBean.sayHello();
		
	}
	
	public static class ClientListener implements NotificationListener{
		@Override
		public void handleNotification(Notification notification,
				Object handback) {
			if (notification instanceof AttributeChangeNotification){
				AttributeChangeNotification acn = (AttributeChangeNotification) notification;
				System.out.println(acn.getAttributeName());
				System.out.println(acn.getAttributeType());
			}
		}
	}

}
