package com.sc.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sc.producter.TopicsProducter;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TopicsControllerTest {

	@Autowired
	private TopicsProducter topicsProducter;
	
	@Test
	public void testTopicsTest() {
		String msg = "SpringBoot-RabbitMQ Topics Hello !";
		topicsProducter.send(msg);
	}

}
