package com.suncafly.interceptor;

import com.suncafly.exception.ExceptionNoExceptionHandler;
import com.suncafly.exception.ValidateException;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器的使用(需要注册）
 * @see com.suncafly.config.AppConfig
 * @author LiFang
 * @create 2018-07-01 9:42 PM
 */
@Component
public class TimeInterceptor implements HandlerInterceptor {
    /**
     * 返回true 继续执行用户的api
     * 返回false 不在执行用户的api
     * @param request
     * @param response
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("TimeInterceptor preHandle method");
        HandlerMethod method = (HandlerMethod)o;
        System.out.println(method.getBean().getClass().getName());
        System.out.println(method.getMethod().getName());
        return true;
    }

    /**
     * 无异常时调用
     * @param request
     * @param response
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("TimeInterceptor postHandle method");
    }

    /**
     * 有无异常均调用
     * 当@ExceptionHandler(ExceptionWithExceptionHandler.class)
     * 在抛出ExceptionWithExceptionHandler异常时捕获不到
     * ExceptionNoExceptionHandler异常没有被特殊处理
     * @param request
     * @param response
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
        System.out.println("TimeInterceptor afterCompletion method");
        System.out.println("ex is " + e);
        if(e instanceof ExceptionNoExceptionHandler) {
            System.out.println(" this is ValidateException");
            throw  e;
        }

    }
}
