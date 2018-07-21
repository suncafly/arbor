package com.suncafly.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 2:50 PM
 */

public class TargetInterceptor implements MethodInterceptor {

    /**
     * 重写方法拦截在方法前和方法后加入业务
     * Object obj为目标对象
     * Method method为目标方法
     * Object[] params 为参数，
     * MethodProxy proxy CGlib方法代理对象
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] params,
                            MethodProxy proxy) throws Throwable {
        System.out.println("before");
        Object result = proxy.invokeSuper(obj, params);
//        TargetObject targetObject = (TargetObject)obj;
//        System.out.println(targetObject.method4());
//        System.out.println(result);
        System.out.println("after");
        return result;
    }


}
