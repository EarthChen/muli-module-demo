package com.earthchen.spring.boot.validator;

import com.earthchen.spring.boot.validator.annotation.IsManOrWoman;
import com.earthchen.spring.boot.validator.util.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */
public class IsManOrWomanValidator implements ConstraintValidator<IsManOrWoman, String> {

    private boolean required = false;

    @Override
    public void initialize(IsManOrWoman constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (required) {
            return ValidatorUtils.IsManOrWoman(value);
        } else {
            return StringUtils.isEmpty(value) || ValidatorUtils.IsManOrWoman(value);
        }
    }
}
