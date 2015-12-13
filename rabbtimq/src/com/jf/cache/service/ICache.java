package com.jf.cache.service;

import org.springframework.cache.Cache;

public interface ICache extends Cache {
	public Object get(String key);

	public void put(String key, Object vulue);
	
	public void put(String key,int exp, Object vulue);

	public void delete(String key);
}
