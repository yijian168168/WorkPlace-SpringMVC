package com.spring.demo.exception.controller;

import com.spring.demo.exception.exception.AException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常测试
 *
 * @author ZhangQingrong
 * @date 2018/2/3 17:39
 */
@Controller
public class ExceptionTestController {

    @RequestMapping("testSUCCESS")
    @ResponseBody
    public String testSUCCESS(){
        return "SUCCESS";
    }

    @RequestMapping("testAException")
    @ResponseBody
    public String testAException(){
//        return "SUCCESS";
        throw new AException("AException");
    }

    @RequestMapping("testException")
    @ResponseBody
    public String testException(){
//        return "SUCCESS";
        throw new RuntimeException("Exception");
    }
}
