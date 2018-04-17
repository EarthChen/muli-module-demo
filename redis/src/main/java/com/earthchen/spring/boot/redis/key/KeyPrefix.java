package com.earthchen.spring.boot.redis.key;

/**
 * redis缓存前缀
 *
 * @author: EarthChen
 * @date: 2018/04/16
 */
public interface KeyPrefix {

    /**
     * 过期时间
     *
     * @return
     */
    int expireSeconds();

    /**
     * 前缀
     *
     * @return
     */
    String getPrefix();

}
