package com.springmvc.interceptor.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过实现 HandlerInterceptor 接口实现拦截器功能
 *
 * Created by ZhangQingrong on 2017/6/9.
 */
public class HandlerInterceptorDemo implements HandlerInterceptor {

    /**
     * 该方法将在请求处理之前进行调用
     * 该方法的返回值是布尔值Boolean类型的，
     * 当它返回为false 时，表示请求结束，后续的Interceptor 和Controller 都不会再执行；
     * 当返回值为true 时就会继续调用下一个Interceptor 的preHandle 方法，
     * 如果已经是最后一个Interceptor 的时候就会是调用当前请求的Controller 方法
     * */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("HandlerInterceptorDemo ... preHandle");
        return true;
    }

    /**
     * 在当前请求进行处理之后，也就是Controller 方法调用之后执行
     * 但是它会在DispatcherServlet 进行视图返回渲染之前被调用，所以我们可以在这个方法中对Controller 处理之后的ModelAndView 对象进行操作
     *
     * */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("HandlerInterceptorDemo ... postHandle");
    }

    /**
     * 该方法将在整个请求结束之后，也就是在DispatcherServlet 渲染了对应的视图之后执行。
     * 这个方法的主要作用是用于进行资源清理工作的。
     * */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("HandlerInterceptorDemo ... afterCompletion");
    }
}
