package com.suncafly.javaproxy;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 11:28 AM
 */
public class Demo {

    public static void main(String[] args)  {
        Volkswagen volkswagen = new Volkswagen();

        CarInvocationHandler carInvocationHandler = new CarInvocationHandler(volkswagen);
        Car car = (Car)Proxy.newProxyInstance(volkswagen.getClass().getClassLoader(),
                new Class[] { Car.class } , carInvocationHandler);
        System.out.println(car.desc() + "; price:" + new BigDecimal(car.price()));
//        JdkProxySourceClass.writeClassToDisk("/Users/apple/suncafly/arbor/arbor-demo/" +
//                "spring-aop/src/main/java/com/suncafly/javaproxy/demo/Source.class");

//        $proxy1 proxy1 = new $proxy1(carInvocationHandler);
//        System.out.println(proxy1.desc() + "; price:" + new BigDecimal(proxy1.price()));
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
    }
}

