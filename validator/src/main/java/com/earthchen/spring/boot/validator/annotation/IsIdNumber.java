package com.earthchen.spring.boot.validator.annotation;

import com.earthchen.spring.boot.validator.IsIdNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 判断身份证号
 *
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {IsIdNumberValidator.class})
public @interface IsIdNumber {

    boolean required() default true;

    String message() default "身份证号格式错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
