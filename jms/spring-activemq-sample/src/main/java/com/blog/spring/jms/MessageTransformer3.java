package com.blog.spring.jms;

public class MessageTransformer3 {
	public String transform(String message){
		System.out.println("Print: " + message);
		return message + " Passed at Bao Nguyen";
	}
}
