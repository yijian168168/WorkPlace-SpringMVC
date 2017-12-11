package com.springmvc.validator.controller;

import com.springmvc.validator.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by ZhangQingrong on 2017/6/7.
 */
@Controller
@RequestMapping(value = "person")
public class PersonController {

    @ResponseBody
    @RequestMapping(value = "addPerson")
    public String addPerson(@Valid Person person, BindingResult result) {
        System.out.println(person);
        StringBuilder errors = new StringBuilder();
        String responseMsg = "success";
        if (result.hasErrors()) {
            for (FieldError fieldError : result.getFieldErrors()) {
                errors.append(fieldError.getField())
                        .append("[")
                        .append(fieldError.getDefaultMessage())
                        .append("],");
            }
            responseMsg = errors.toString();
            System.out.println(responseMsg);
        }
        return responseMsg;
    }
}
