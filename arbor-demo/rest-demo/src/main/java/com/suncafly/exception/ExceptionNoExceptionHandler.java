package com.suncafly.exception;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-02 9:51 PM
 */
public class ExceptionNoExceptionHandler extends RuntimeException {
    private String name;

    public ExceptionNoExceptionHandler(String name, String message){
        super("ExceptionNoExceptionHandler: " + message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
