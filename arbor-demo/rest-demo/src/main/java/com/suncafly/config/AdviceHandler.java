package com.suncafly.config;

import com.suncafly.exception.UserControllerException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-01 9:51 PM
 */
@ControllerAdvice
public class AdviceHandler {

    @ExceptionHandler(UserControllerException.class)
    public  Map<String, Object> UserControllerException(UserControllerException ex){
        Map<String, Object> map = new HashMap<>();
        map.put("name", ex.getName());
        map.put("exception", ex.getMessage());
        return map;
    }
}
