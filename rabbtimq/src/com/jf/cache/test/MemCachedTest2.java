package com.jf.cache.test;

import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jf.cache.impl.MemcachedCacheImpl;
import com.jf.model.User;

public class MemCachedTest2 {
	private static MemcachedCacheImpl memcachedCache;

	@BeforeClass
	public static void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-cache.xml");
		memcachedCache = context.getBean(MemcachedCacheImpl.class);
	}

	@Test
	public void testCache() {
		User user = new User(UUID.randomUUID()+"", "zhaoqing", 26, "13681274622");
		memcachedCache.put("zhaoqing", 20, user);
		System.out.println(memcachedCache.get("zhaoqing").toString());

	}
}
