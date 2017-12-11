package com.springmvc.validator.annotation;

/**
 * Created by ZhangQingrong on 2017/6/7.
 */

import com.springmvc.validator.validator.MoneyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=MoneyValidator.class)
public @interface Money {

    String message() default"不是金额形式";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
