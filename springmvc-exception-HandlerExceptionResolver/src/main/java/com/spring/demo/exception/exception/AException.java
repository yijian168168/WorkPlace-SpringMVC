package com.spring.demo.exception.exception;

/**
 * 自定义异常A
 *
 * @author ZhangQingrong
 * @date 2018/2/3 17:42
 */
public class AException extends RuntimeException {

    public AException(String message) {
        super(message);
    }
}
