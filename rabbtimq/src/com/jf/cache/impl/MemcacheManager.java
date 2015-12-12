package com.jf.cache.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.Cache;
import org.springframework.util.StringUtils;

import com.jf.cache.constant.CacheConstant;
import com.jf.cache.service.ICacheManager;

public class MemcacheManager implements ICacheManager {

	public Cache getCache(String cacheName) {
		if (StringUtils.isEmpty(cacheName)) {
			if (cacheName.equals(CacheConstant.MEMCACHE_CACHE)) {
				return memcahcedCache;
			}
		}
		return null;
	}

	public Collection<String> getCacheNames() {
		return allCache.keySet();
	}

	private Cache memcahcedCache;

	private Map<String, Cache> allCache = new HashMap<String, Cache>();

	public Cache getMemcahcedCache() {
		return memcahcedCache;
	}

	public void setMemcahcedCache(Cache memcahcedCache) {
		this.memcahcedCache = memcahcedCache;
		allCache.put(CacheConstant.MEMCACHE_CACHE, memcahcedCache);

	}

}
