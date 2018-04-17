package com.earthchen.spring.boot.dao;

import com.earthchen.spring.boot.SuperMapper;
import com.earthchen.spring.boot.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Repository
public interface UserDao extends SuperMapper<User> {

    int deleteAll();

    List<User> selectAll();

}
