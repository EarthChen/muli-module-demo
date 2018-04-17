package com.earthchen.spring.boot.handler;

import com.earthchen.spring.boot.exception.GlobalException;
import com.earthchen.spring.boot.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 全局异常处理器
 *
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GlobalException.class)
    @ResponseBody
    public ResultVO handlerSellerException(GlobalException e) {
        return ResultVO.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public ResultVO handlerBindException(BindException e) {

        log.info("[参数校验]---绑定异常");
        List<String> errorsMessageList = new ArrayList<>();

        List<ObjectError> errors = e.getAllErrors();
        errors.forEach(error -> errorsMessageList.add(error.getDefaultMessage()));

        log.info(errorsMessageList.toString());
        return ResultVO.error(500100, String.format("参数校验异常：%s", errorsMessageList.toString()));
    }
}
