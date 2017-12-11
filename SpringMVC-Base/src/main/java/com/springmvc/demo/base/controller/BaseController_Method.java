package com.springmvc.demo.base.controller;

import org.springframework.aop.target.ThreadLocalTargetSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringMVC 基础功能点测试
 *
 * Created by Lenovo-PC-QR on 2016/9/22.
 */
@Controller
@RequestMapping("/baseController_Method")
public class BaseController_Method {


    /**
     * 测试ResuestMapping的method属性,限定POST请求
     */
    @RequestMapping(value = "/postMethod", method = RequestMethod.POST)
    public String postMethod() {
        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName() + " : " + Thread.currentThread().getStackTrace()[0].getMethodName() +  "接收到请求");
        return "BaseController_Method";
    }

    /**
     * 测试ResuestMapping的method属性,限定GET请求
     */
    @RequestMapping(value = "/getMethod", method = RequestMethod.GET)
    public String getMethod() {
        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName() + " : " + Thread.currentThread().getStackTrace()[0].getMethodName() +  "接收到请求");
        return "BaseController_Method";
    }

    /**
     * 测试ResuestMapping的method属性,限定DELETE请求
     */
    @RequestMapping(value = "/deleteMethod", method = RequestMethod.DELETE)
    public String deleteMethod(){
        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName() + " : " + Thread.currentThread().getStackTrace()[0].getMethodName() +  "接收到请求");
        return "BaseController_Method";
    }

}
