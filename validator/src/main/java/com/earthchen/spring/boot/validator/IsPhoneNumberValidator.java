package com.earthchen.spring.boot.validator;

import com.earthchen.spring.boot.validator.annotation.IsPhoneNumber;
import com.earthchen.spring.boot.validator.util.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */
public class IsPhoneNumberValidator implements ConstraintValidator<IsPhoneNumber, String> {

    private boolean required = false;

    @Override
    public void initialize(IsPhoneNumber constraintAnnotation) {
        required = constraintAnnotation.required();
    }


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (required) {
            return ValidatorUtils.isPhoneNumber(value);
        } else {
            return StringUtils.isEmpty(value) || ValidatorUtils.isPhoneNumber(value);
        }
    }
}
