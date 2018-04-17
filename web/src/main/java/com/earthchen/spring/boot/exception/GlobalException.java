package com.earthchen.spring.boot.exception;

import com.earthchen.spring.boot.enums.ResultEnum;
import lombok.Getter;

/**
 * 全局异常
 *
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Getter
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = -6620560161409377265L;

    private Integer code;

    public GlobalException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public GlobalException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
