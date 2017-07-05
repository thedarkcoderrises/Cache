package com.javabrain;

import java.util.Arrays;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableCaching
@ComponentScan("com.javabrain")
public class SpringConfig {
	
	
	@Bean
	public CacheManager cacheManager() {
  		SimpleCacheManager scm = new SimpleCacheManager();
  		scm.setCaches(Arrays.asList(
  				new ConcurrentMapCache("test", false)
  				));
  		return scm;
	}
}
