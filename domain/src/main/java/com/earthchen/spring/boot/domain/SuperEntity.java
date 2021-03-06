package com.earthchen.spring.boot.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Getter
@Setter
public class SuperEntity<T extends Model> extends Model<T> {

    private static final long serialVersionUID = -4263419124367119871L;

    /**
     * 主键ID , 这里故意演示注解可以无
     */
    private Long id;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
