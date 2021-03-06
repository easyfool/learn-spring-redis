package com.wangfengbabe.learn.redis.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilsTest {

    @Autowired
    private RedisUtils redisUtils;

    /**
     * redis-cli  --raw
     * 客户端汉字查看
     */
    @Test
    public void testSetKey() {
        boolean set = redisUtils.set("key1", "赵池");
        System.out.println(set);
    }

    @Test
    public void testGetKey() {
        String value = (String) redisUtils.get("key1");
        System.out.println(value);

    }

    @Test
    public void test() {
        boolean expire = redisUtils.expire("key1", 10);
        System.out.println(expire);
    }

}