package com.jf.consumer;

import org.springframework.stereotype.Component;

public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void login(String user) {
		
      System.out.println(System.currentTimeMillis()+"收到消息:"+user);
	}

}
