package com.springmvc.validator.util;

import com.springmvc.validator.dto.Person;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * 校验工具
 * hibernate JSR-303 标准
 *
 * Created by ZhangQingrong on 2017/6/7.
 */
public class ValidateUtils {

    private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    public static String validate(Object value) {
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(value);
        StringBuilder errors = new StringBuilder();
        for (ConstraintViolation constraintViolation : constraintViolations) {
            errors.append(constraintViolation.getPropertyPath()).append(":")
                    .append(constraintViolation.getMessage()).append(",");
        }
        return errors.toString();
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("qingrong");
        person.setMoney("10.00");
        person.setPhone("18826481278");
        person.setAge("18");
        String validateResult = ValidateUtils.validate(person);
        if (validateResult.length() > 0){
            System.out.println(validateResult);
        }else {
            System.out.println("校验通过");
        }
    }
}
