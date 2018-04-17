package com.earthchen.spring.boot.dao;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.earthchen.spring.boot.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Slf4j
public class UserDaoTest extends ApplicationTests {

    @Autowired
    private UserDao userInfoDao;

    @Test
    public void testInsert() {
        User userInfo = new User();
//        userInfo.setId(1L);
        userInfo.setName("test3");
        userInfo.setAge(8);
        log.info(userInfo.toString());
        int num = userInfoDao.insert(userInfo);
        log.info("num={}   userinfo.getId()={}", num, userInfo.getId());
        assertEquals(1, num);
    }

    @Test
    public void testSelectById() {
        User userInfo = userInfoDao.selectById(985719455193505794L);
        log.info(userInfo.toString());
        assertEquals("test2", userInfo.getName());
    }

    @Test
    public void testSelectOne() {
        User userInfo1 = new User();
//        userInfo.setId(1L);
        userInfo1.setName("test3");
        userInfo1.setAge(8);
        User userInfo = userInfoDao.selectOne(userInfo1);
        log.info(userInfo.toString());
        assertEquals("test", userInfo.getName());
    }


    @Test
    public void testSelectPage() {
        // 分页查询 10 条姓名为‘张三’的用户记录
        List<User> userList = userInfoDao.selectPage(new Page<UserDao>(1, 4),
                new EntityWrapper<User>().eq("name", "test3"));
        log.info(userList.toString());
        assertEquals("test", userList.get(0).getName());
    }

}
