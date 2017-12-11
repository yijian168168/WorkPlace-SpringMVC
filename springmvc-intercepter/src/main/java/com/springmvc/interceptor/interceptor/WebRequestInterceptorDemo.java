package com.springmvc.interceptor.interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * 通过实现 WebRequestInterceptor 接口实现拦截器功能
 * 在WebRequestInterceptor中对WebRequest进行的所有操作都将同步到HttpServletRequest中，然后在当前请求中一直传递
 * Created by ZhangQingrong on 2017/6/9.
 */
public class WebRequestInterceptorDemo implements WebRequestInterceptor {

    /**
     * 该方法将在请求处理之前进行调用，也就是说会在Controller方法调用之前被调用。
     * 这个方法跟HandlerInterceptor中的preHandle是不同的，主要区别在于该方法的返回值是void，也就是没有返回值，
     * 所以我们一般主要用它来进行资源的准备工作
     */
    public void preHandle(WebRequest request) throws Exception {
        //这个是放到request范围内的，所以只能在当前请求中的request中获取到
        request.setAttribute("request", "request", WebRequest.SCOPE_REQUEST);
        //这个是放到session范围内的，如果环境允许的话它只能在局部的隔离的会话中访问，否则就是在普通的当前会话中可以访问
        request.setAttribute("session", "session", WebRequest.SCOPE_SESSION);
        //如果环境允许的话，它能在全局共享的会话中访问，否则就是在普通的当前会话中访问
        request.setAttribute("globalSession", "globalSession", WebRequest.SCOPE_GLOBAL_SESSION);
    }

    /**
     * 该方法将在请求处理之后，也就是在Controller方法调用之后被调用，
     * 但是会在视图返回被渲染之前被调用，所以可以在这个方法里面通过改变数据模型ModelMap来改变数据的展示
     * ModelMap就是Controller处理之后返回的Model对象，我们可以通过改变它的属性来改变返回的Model模型
     */
    public void postHandle(WebRequest request, ModelMap model) throws Exception {
        for (String key : model.keySet()) {
            System.out.println(key + "-------------------------" + model.get(key));
        }
        model.put("name3", "value3");
        model.put("name1", "name1");

    }

    /**
     * 该方法会在整个请求处理完成，也就是在视图返回并被渲染之后执行。所以在该方法中可以进行资源的释放操作。
     * Exception参数表示的是当前请求的异常对象，如果在Controller中抛出的异常已经被Spring的异常处理器给处理了的话，那么这个异常对象就是是null
     */
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {

    }
}
