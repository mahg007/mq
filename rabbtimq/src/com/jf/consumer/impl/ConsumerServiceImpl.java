package com.jf.consumer.impl;

import org.springframework.stereotype.Component;

import com.jf.consumer.service.ConsumerService;

@Component
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void login(String user) {

		System.out.println(System.currentTimeMillis() + "收到消息:" + user);
	}

}
