package com.blog.spring.jms;

import java.util.Arrays;
import java.util.List;


public class MessageSplitter {
	public List<String> split(String message){
		return Arrays.asList(message.split("\\s"));
	}
}
