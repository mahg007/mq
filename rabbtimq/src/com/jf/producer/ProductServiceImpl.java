package com.jf.producer;

import org.apache.camel.Produce;
public class ProductServiceImpl implements ProductService {
	@Produce(uri = "direct:publish")
	private RegisterService registerService;

	@Override
	public String registerUser(String username) {

		return registerService.register(username);
	}

}
