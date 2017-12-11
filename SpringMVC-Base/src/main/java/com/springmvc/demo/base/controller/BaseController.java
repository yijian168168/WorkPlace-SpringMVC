package com.springmvc.demo.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMVC 基础功能点测试
 *
 * Created by Lenovo-PC-QR on 2016/9/22.
 */
@Controller
@RequestMapping("/baseController")
public class BaseController {

    /**
     * SpringMvc第一次请求,测试ResuestMapping的value属性
     */
    @RequestMapping("/method")
    public String method() {

        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName() + " : " + Thread.currentThread().getStackTrace()[0].getMethodName() +  "接收到请求");

        return "BaseController";
    }

    @RequestMapping("/timeoutTest")
    public String timeoutTest() {

        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName() + " : " + Thread.currentThread().getStackTrace()[0].getMethodName() +  "接收到请求");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "BaseController";
    }
}
