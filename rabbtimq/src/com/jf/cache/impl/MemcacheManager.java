package com.jf.cache.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.util.StringUtils;

import com.jf.cache.constant.CacheConstant;
import com.jf.cache.service.ICache;
import com.jf.cache.service.ICacheManager;

public class MemcacheManager implements ICacheManager {

	public ICache getCache(String cacheName) {
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

	private ICache memcahcedCache;

	private Map<String, ICache> allCache = new HashMap<String, ICache>();

	public ICache getMemcahcedCache() {
		return memcahcedCache;
	}

	public void setMemcahcedCache(ICache memcahcedCache) {
		this.memcahcedCache = memcahcedCache;
		allCache.put(CacheConstant.MEMCACHE_CACHE, memcahcedCache);

	}

}
