package com.test.testCase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.MessageConverter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageCoverterTest {
	@Autowired
	private MessageConverter converter;

	@Test
	public void whenConvertMessageCalledSuccessCase() {
		
		String result = converter.convertMessage("hello");
		Assert.assertEquals("msg converted hello",result);
	}
	@Test
	public void whenConvertMessageCalledNegativeCase() {
		
		String result = converter.convertMessage("hello");
		Assert.assertNotEquals("test", result);
	}
	@Test(expected=IllegalArgumentException.class)
	public void whenConvertMessageCalledExceptionCase() {
		converter.convertMessage(null);
	}

}
