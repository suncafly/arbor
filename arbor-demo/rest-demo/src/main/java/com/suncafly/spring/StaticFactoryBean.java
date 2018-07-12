package com.suncafly.spring;

import com.suncafly.spring.ioc.bean.Dog;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 10:54 AM
 */
public class StaticFactoryBean {

    public static Dog createDog(){
        return new Dog("lx", 10);
    }
}
