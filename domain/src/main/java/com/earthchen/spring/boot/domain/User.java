package com.earthchen.spring.boot.domain;

import lombok.Data;


/**
 * 用户实体
 *
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Data
public class User extends SuperEntity<User> {

    private static final long serialVersionUID = -8809586545737483788L;

    private String name;

    private Integer age;


}
