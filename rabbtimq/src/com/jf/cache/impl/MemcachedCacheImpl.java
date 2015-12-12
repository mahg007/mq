package com.jf.cache.impl;

import org.springframework.cache.Cache;

import com.jf.cache.service.ICacheClient;

import net.spy.memcached.MemcachedClient;

public class MemcachedCacheImpl implements Cache, ICacheClient {
	private MemcachedClient memcachedClient;

	public void setMemcachedClient(MemcachedClient memcachedClient) {
		this.memcachedClient = memcachedClient;
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
	public ValueWrapper get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T get(Object arg0, Class<T> arg1) {
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

	@Override
	public MemcachedClient getClient() {

		return this.memcachedClient;
	}

}
