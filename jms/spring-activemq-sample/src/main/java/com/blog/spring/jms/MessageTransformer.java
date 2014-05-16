package com.blog.spring.jms;

public class MessageTransformer {
	public String transform(String message){
		return message + " Signed by Bao Nguyen";
	}
}
