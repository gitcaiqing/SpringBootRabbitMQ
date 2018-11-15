package com.sc;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringBootRabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRabbitMqApplication.class, args);
	}
	
	private static final String exchangeName = "SpringbootRabbitMQ-Topics-Exchange";
	private static final String queueName = "SpringbootRabbitMQ-Topics-Queue";
	
	//声明交换机
	@Bean
	TopicExchange exchange(){
		return new TopicExchange(exchangeName, true, false);
	}
	
	//声明队列
	@Bean
	Queue queue() {
		return new Queue(queueName, true);
	}
	
	//队列绑定
	@Bean
	Binding binding(Queue queue, TopicExchange exchange) {
		//绑定队列到交换机并指定routingKey
		return BindingBuilder.bind(queue).to(exchange).with("topic.#");
	}
	
}




















