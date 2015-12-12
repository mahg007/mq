package com.jf.cache.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.jf.cache.impl.MemcachedCacheImpl;

//用于测试到数据库连接的
@ContextConfiguration(locations = { "classpath:/spring/spring-cache.xml" })
public class MemCacheTest extends AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private MemcachedCacheImpl memcachedCache;

	@Test
	public void testCache() {
		memcachedCache.getClient().add("username", 1, "mahg");
		memcachedCache.getClient().add("password", 1, "mahg007");
		System.out.println(memcachedCache.getClient().get("username"));
	}
}
