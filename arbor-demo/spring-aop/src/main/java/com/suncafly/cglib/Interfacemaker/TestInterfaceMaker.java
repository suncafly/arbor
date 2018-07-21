package com.suncafly.cglib.Interfacemaker;

import com.suncafly.cglib.TargetObject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InterfaceMaker;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 5:30 PM
 */
public class TestInterfaceMaker {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceMaker interfaceMaker = new InterfaceMaker();
        //抽取某个类的方法生成接口方法
        interfaceMaker.add(TargetObject.class);
        Class<?> targetInterface = interfaceMaker.create();
//        for (Method method : targetInterface.getMethods()) {
//            System.out.println(method.getName());
//        }
        //接口代理并设置代理接口方法拦截
        Object object = Enhancer.create(Object.class, new Class[]{targetInterface},
                (MethodInterceptor) (obj, method, args1, methodProxy) -> {
                    if (method.getName().equals("method1")) {
                        System.out.println("filter method1 ");
                    }
                    if (method.getName().equals("method2")) {
                        System.out.println("filter method2 ");
                    }
                    if (method.getName().equals("method3")) {
                        System.out.println("filter method3 ");
                        return (Object) 1;
                    }
                    return "default";
                });

        Method method3 = object.getClass().getMethod("method3", new Class[]{int.class});
        Object i = method3.invoke(object, new Object[]{33});
        System.out.println(i);
//        Method method1 = object.getClass().getMethod("method1", new Class[]{String.class});
//        System.out.println(method1.invoke(object, new Object[]{"sdfs"}));
    }
}
