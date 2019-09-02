package com.test;

import org.springframework.stereotype.Service;

@Service
public class MessageConverter {
	public String convertMessage(String str) {
		if (str==null)
			throw new IllegalArgumentException("parameter should not be null");
		return "msg converted " + str;
	}

	public static void main(String[] args) {
		MessageConverter mc = new MessageConverter();
		System.out.println(mc.convertMessage("hello"));
	}
}
