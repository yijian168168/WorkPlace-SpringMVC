package com.springmvc.validator.validator;

import com.springmvc.validator.annotation.Money;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ZhangQingrong on 2017/6/7.
 */
public class MoneyValidator implements ConstraintValidator<Money, String> {

    public void initialize(Money constraintAnnotation) {

    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        Boolean isValid;
        if (null == value) {
            isValid = true;
        } else {
            if ("10.00".equals(value)){
                isValid = true;
            }else {
                isValid = false;
            }
        }
        return isValid;
    }
}
