package com.blog.spring.jms;

public class ErrorTransformer {
	public String transform(String message) throws Exception{
		if (1==1) throw new Exception("Bao Error");
		return message + " Signed by Bao Nguyen";
	}
}
