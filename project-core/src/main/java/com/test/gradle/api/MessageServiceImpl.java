package com.test.gradle.api;

import com.test.gradle.api.MessageService;

public class MessageServiceImpl extends MessageService{

	@Override
	public String getMessage() {
		 return "Hello World!";
	}

}
