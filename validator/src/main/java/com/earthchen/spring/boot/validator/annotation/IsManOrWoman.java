package com.earthchen.spring.boot.validator.annotation;

import com.earthchen.spring.boot.validator.IsManOrWomanValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 是男还是女
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {IsManOrWomanValidator.class})
public @interface IsManOrWoman {

    boolean required() default true;

    String message() default "性别错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
