package com.sc.producter;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicsProducter {
	
	private static final String exchangeName = "SpringbootRabbitMQ-Topics-Exchange";
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send(String message) {
		this.amqpTemplate.convertAndSend(exchangeName, "topic.message", message);;
	}

}
