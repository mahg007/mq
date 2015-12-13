package com.jf.cache.impl;

import com.jf.cache.constant.CacheConstant;
import com.jf.cache.service.ICache;
import com.jf.cache.service.ICacheClient;

import net.spy.memcached.MemcachedClient;

public class MemcachedCacheImpl implements ICache, ICacheClient {
	private MemcachedClient memcachedClient;

	public void setMemcachedClient(MemcachedClient memcachedClient) {
		this.memcachedClient = memcachedClient;
	}

	@Override
	public Object get(String key) {

		return memcachedClient.gets(key).getValue();
	}

	@Override
	public void put(String key, Object vulue) {
		memcachedClient.set(key, CacheConstant.DEFAULT_EXP, vulue);

	}

	@Override
	public MemcachedClient getClient() {
		return this.memcachedClient;
	}

	@Override
	public void put(String key, int exp, Object vulue) {
		memcachedClient.set(key, exp, vulue);

	}

	@Override
	public void delete(String key) {
		memcachedClient.delete(key);

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void evict(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T get(Object arg0, Class<T> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValueWrapper get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getNativeCache() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ValueWrapper putIfAbsent(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
