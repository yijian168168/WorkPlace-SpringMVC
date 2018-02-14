package com.spring.demo.exception.exceptionResolver;

import com.spring.demo.exception.exception.AException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义统一异常管理
 *
 * @author ZhangQingrong
 * @date 2018/2/5 15:43
 */
@Component
public class LocalHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if (ex instanceof AException){
            System.out.println("*******************" + ex.getMessage());
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("SUCCESS");

        return modelAndView;
    }
}
