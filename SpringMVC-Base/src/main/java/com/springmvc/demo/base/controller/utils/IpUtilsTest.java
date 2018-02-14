package com.springmvc.demo.base.controller.utils;

import com.alibaba.druid.util.DruidWebUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ZhangQingrong
 * @date 2018/2/12 10:07
 */
public class IpUtilsTest {

    public static void main(String[] args) {

    }

    public void getIp(HttpServletRequest servletRequest){
        String remoteAddr = DruidWebUtils.getRemoteAddr(servletRequest);
        System.out.println(remoteAddr);
    }
}
