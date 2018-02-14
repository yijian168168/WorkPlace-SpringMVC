package com.spring.demo.exception.exception;

/**
 * 自定义异常B
 *
 * @author ZhangQingrong
 * @date 2018/2/3 17:42
 */
public class BException extends RuntimeException {
    public BException(String message) {
        super(message);
    }
}
