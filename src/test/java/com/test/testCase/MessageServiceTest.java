package com.test.testCase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.MessageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceTest {

	@Autowired
	private MessageService service;

	@Test
	public void whenGetMessageCalledSuccessCase(){
		Assert.assertEquals("Hello World !!", service.getMessage());
	}
	

	@Test
	public void whenGetMessageCalledNegativeCase(){
		Assert.assertNotEquals("Dhananjaya", service.getMessage());
	} 
}
