package com.earthchen.spring.boot.validator;


import com.earthchen.spring.boot.validator.annotation.IsIdNumber;
import com.earthchen.spring.boot.validator.util.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 身份证号校验
 *
 * @author: EarthChen
 * @date: 2018/04/16
 */
public class IsIdNumberValidator implements ConstraintValidator<IsIdNumber, String> {

    private boolean required = false;

    @Override
    public void initialize(IsIdNumber constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (required) {
            return ValidatorUtils.isIdNumber(value);
        } else {
            return StringUtils.isEmpty(value) || ValidatorUtils.isIdNumber(value);
        }
    }
}