package com.jf.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.jf.producer.impl.ProductServiceImpl;
import com.jf.producer.service.ProductService;

public class Main {
 public static void main(String[] agrs){
	 WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext(); 
     final ProductService producer1 = (ProductService) wac.getBean(ProductServiceImpl.class);
     producer1.registerUser("111");
 }
}
