package com.suncafly.exception;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-01 9:52 PM
 */

public class ExceptionWithExceptionHandler extends RuntimeException {

    private String name;

    public ExceptionWithExceptionHandler(String name, String message){
        super("ExceptionWithExceptionHandler:" + message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
