package com.suncafly.exception;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-01 9:52 PM
 */

public class UserControllerException extends RuntimeException {

    private String name;

    public UserControllerException(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
