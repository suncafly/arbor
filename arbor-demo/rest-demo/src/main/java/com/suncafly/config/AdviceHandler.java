package com.suncafly.config;

import com.suncafly.exception.ExceptionWithExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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

    @ExceptionHandler(ExceptionWithExceptionHandler.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public  Map<String, Object> UserControllerException(ExceptionWithExceptionHandler ex){
        Map<String, Object> map = new HashMap<>();
        map.put("name", ex.getName());
        map.put("exception", ex.getMessage());
        return map;
    }

}
