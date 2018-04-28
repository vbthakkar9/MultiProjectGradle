package com.test.gradle.web;

import com.test.gradle.api.MessageService;
import com.test.gradle.api.MessageServiceImpl;

public class HelloWorld {
	public static void main(String[] args) {
		MessageService messageService = new MessageServiceImpl();
		String message = messageService.getMessage();
        System.out.println(message);        
        
	}
}
