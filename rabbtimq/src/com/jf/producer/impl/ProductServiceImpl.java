package com.jf.producer.impl;

import org.apache.camel.Produce;
import org.springframework.stereotype.Component;

import com.jf.producer.service.ProductService;
import com.jf.producer.service.RegisterService;

@Component
public class ProductServiceImpl implements ProductService {
	@Produce(uri = "direct:publish")
	private RegisterService registerService;

	@Override
	public String registerUser(String username) {

		return registerService.register(username);
	}

}
