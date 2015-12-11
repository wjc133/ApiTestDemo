package com.elite.api.common.exception;

/**
 * Created by wjc133
 * Date: 2015/12/11
 * Time: 16:21
 */
public class ApiException extends Exception {
    public ApiException() {
        super();
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }
}
