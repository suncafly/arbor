package com.suncafly.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-02 10:54 AM
 */
//@Component
public class MyExceptionResolver implements HandlerExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(MyExceptionResolver.class);


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("MyExceptionResolver");
        ModelAndView m = new ModelAndView();
        Map<String, Object> result = new HashMap<>();
        //可以自由处理各种异常逻辑
        if (ex instanceof ValidateException) {
            List<ObjectError> list = ((ValidateException) ex).getErrors();

            list.forEach(a->
                result.put(((FieldError)a).getField(), a.getDefaultMessage())
            );
        }
        m.addAllObjects(result);
        return m;
    }

}