package com.earthchen.spring.boot.enums;

import lombok.Getter;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Getter
public enum ResultEnum {

    SUCCESS(0, "success");


    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
