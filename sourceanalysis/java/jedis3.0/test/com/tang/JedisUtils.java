package com.tang;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtils {
	private static JedisPool pool = null;
	
	static {
		try{
			JedisPoolConfig config = new JedisPoolConfig();
			config.setMaxIdle(5);
			config.setMaxWaitMillis(1000*1000);
			config.setTestOnBorrow(true);
			pool = new JedisPool(config, "", 8888);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized static Jedis getJedis(){
		try{
			if(pool != null){
				Jedis jedis = pool.getResource();
				return jedis;
			}else{
				return null;
			}
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}



























