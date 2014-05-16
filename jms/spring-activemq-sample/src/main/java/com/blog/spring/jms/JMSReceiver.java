package com.blog.spring.jms;
public class JMSReceiver {

    public String onMessage(String message) throws  Exception{
        System.out.println("In onMessage");
        System.out.println(message);
        
        String payload1 = message;
//        if (1==1) throw new Exception("Bao exc");
        return payload1;
    }
}