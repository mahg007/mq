package com.jf.cache.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jf.cache.impl.MemcachedCacheImpl;

public class MemCachedTest2 {
	private static MemcachedCacheImpl memcachedCache;

	@BeforeClass
	public static void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-cache.xml");
		memcachedCache=context.getBean(MemcachedCacheImpl.class);
	}

	@Test
	public void testCache() {
		memcachedCache.getClient().add("username", 20, "mahg");
		memcachedCache.getClient().set("username", 20, "mahiagang");
		memcachedCache.getClient().add("password", 1, "mahg007");
		//System.out.println(memcachedCache.getClient().get("username"));
		System.out.println(memcachedCache.getClient().get("username"));
		System.out.println(memcachedCache.getClient().get("username"));
		System.out.println(memcachedCache.getClient().get("username"));
	}
}
