package com.test;

import org.springframework.stereotype.Service;

@Service
public class MessageConverter {
	public String convertMessage(String str) {
		if (str==null)
			throw new IllegalArgumentException("parameter should not be null");
		return "msg converted " + str;
	}
}
