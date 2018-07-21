package com.suncafly.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 11:37 AM
 */
public class CarInvocationHandler implements InvocationHandler {
    private Car car;

    public CarInvocationHandler(Car car){
        this.car = car;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("CarInvocationHandler invoke");
        return method.invoke(car, args);
    }
}
