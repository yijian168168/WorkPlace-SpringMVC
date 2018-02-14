package com.spring.demo.exception.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 *
 * @author ZhangQingrong
 * @date 2018/2/3 17:40
 */
@ControllerAdvice
public class GlobalControllerExceptionAdvice {

    @ExceptionHandler(AException.class)
    @ResponseBody
    public String dealAException(HttpServletRequest request, AException ex){
        System.out.println("********************* : " + ex.getMessage());
        return ex.getMessage();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String dealException(HttpServletRequest request, Exception ex){
        System.out.println("+++++++++++++++++++++++++ : " + ex.getMessage());
        return ex.getMessage();
    }
}
