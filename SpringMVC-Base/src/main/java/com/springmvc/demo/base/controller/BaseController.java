package com.springmvc.demo.base.controller;

import com.springmvc.demo.base.controller.vo.OrderCreateReqVo;
import com.springmvc.demo.base.controller.vo.OrderCreateRespVo;
import com.springmvc.demo.base.controller.vo.TestVo;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * SpringMVC 基础功能点测试
 * <p>
 * Created by Lenovo-PC-QR on 2016/9/22.
 */
@Controller
@RequestMapping("/baseController")
public class BaseController {

    /**
     * SpringMvc第一次请求,测试ResuestMapping的value属性
     */
    @RequestMapping("/method")
    @ResponseBody
    public String method(HttpServletRequest httpServletRequest) {

        System.out.println(httpServletRequest.getHeader("Content-Type"));
        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName() + " : " + Thread.currentThread().getStackTrace()[0].getMethodName() + "接收到请求");

        return "BaseController";
    }

    @RequestMapping("/timeoutTest")
    public String timeoutTest() {

        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName() + " : " + Thread.currentThread().getStackTrace()[0].getMethodName() + "接收到请求");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "BaseController";
    }

    /**
     * 创建订单
     */
    @ResponseBody
    @RequestMapping(value = "/orderCreate", headers = {"content-type=application/xml"}, method = RequestMethod.POST)
    public OrderCreateRespVo orderCreate(@RequestBody OrderCreateReqVo orderCreateReqVo) {
        System.out.println(orderCreateReqVo);
        OrderCreateRespVo orderCreateRespVo = new OrderCreateRespVo();
        orderCreateRespVo.setMerchant_no("8888");
        return orderCreateRespVo;
    }

    /**
     * SpringMvc第一次请求,测试ResuestMapping的value属性
     */
    @RequestMapping("/method2")
    @ResponseBody
    public TestVo method2(HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest.getHeader("Content-Type"));
        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName() + " : " + Thread.currentThread().getStackTrace()[0].getMethodName() + "接收到请求");
        TestVo testVo = new TestVo();
        testVo.setName("test");
        return testVo;
    }

    /**
     * SpringMvc第一次请求,测试ResuestMapping的value属性
     */
    @ResponseBody
    @RequestMapping(value = "/method3",produces = MediaType.APPLICATION_JSON_VALUE)
    public String method3(@RequestBody TestVo testVo, HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest.getHeader("Content-Type"));
        System.out.println(testVo);
        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName() + " : " + Thread.currentThread().getStackTrace()[0].getMethodName() + "接收到请求");
//        return testVo;
        return "test";
    }
}
