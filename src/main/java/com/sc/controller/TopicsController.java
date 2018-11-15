package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sc.producter.TopicsProducter;

@RestController
@RequestMapping("/topic")
public class TopicsController {

	@Autowired
	private TopicsProducter topicsProducter;
	
	/**
	 * 路由模式发送接收消息
	 * @param msg
	 */
	@RequestMapping("/test")
	public void topicsTest(String msg) {
		if(StringUtils.isEmpty(msg)) {
			msg = "SpringBoot-RabbitMQ Topics Hello !";
		}
		topicsProducter.send(msg);
	}
}
