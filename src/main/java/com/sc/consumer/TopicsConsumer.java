package com.sc.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RabbitListener(queues="SpringbootRabbitMQ-Topics-Queue")
@Component
public class TopicsConsumer {
	
	@RabbitHandler
	public void receive(String msg) {
		System.out.println("消费者消费消息："+msg);
	}

}
