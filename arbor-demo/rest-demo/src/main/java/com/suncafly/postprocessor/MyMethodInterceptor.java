package com.suncafly.postprocessor;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-14 10:00 PM
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("目标方法前:" + method+"\n");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("目标方法后:" + method+"\n");
        return object;
    }
}
