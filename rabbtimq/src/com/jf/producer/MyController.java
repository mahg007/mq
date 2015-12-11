package com.jf.producer;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.http.Part;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value = "/product")
	public ModelAndView product() {
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		final ProductService producer1 = (ProductService) wac.getBean(ProductServiceImpl.class);
		producer1.registerUser("mahg123");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userName", "123");
		return new ModelAndView("/hello", map);
		/*
		 * ExecutorService executor = Executors.newFixedThreadPool(30); r
		 * executor.shutdown();
		 */
	}

	@RequestMapping(value = "/product2")
	public String product2() {
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		final ProductService producer1 = (ProductService) wac.getBean(ProductServiceImpl.class);
		producer1.registerUser("mahg1232222");
		return "hello";
		/*
		 * ExecutorService executor = Executors.newFixedThreadPool(30); return
		 * executor.shutdown();
		 */

	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String handleFormUpload(@RequestParam("name") String name,@RequestParam("file") MultipartFile file) {
		System.out.println(name);
		try {
			if (!file.isEmpty()) {
				byte[] bytes = file.getBytes();
				System.out.println(bytes.length);
            
            // store the bytes somewhere
           return "hello1";
       } else {
           return "hello";
       }

	
	}catch (Exception e) {
		return "hello";
	}
	}
}
