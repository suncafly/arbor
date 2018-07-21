package com.suncafly.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.io.IOException;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 2:54 PM
 */
public class TestCglib {

    public static void main(String args[]) throws IOException {
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
//        enhancer.setCallback(new TargetInterceptor());
        Callback targetInterceptor = new TargetInterceptor();
        Callback noopCb = NoOp.INSTANCE;
        Callback fixedValue = new TargetResultFixed();
        Callback[] cbArray = new Callback[]{targetInterceptor, noopCb, fixedValue};
        enhancer.setCallbacks(cbArray);
        CallbackFilter callbackFilter = new TargetMethodCallbackFilter();
        enhancer.setCallbackFilter(callbackFilter);
        TargetObject targetObject = (TargetObject) enhancer.create();
        System.out.println(targetObject.method1(1 + ""));
        System.out.println(targetObject.method2(1));
        System.out.println(targetObject.method3(1));
    }
}
