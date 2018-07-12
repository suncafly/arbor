package com.suncafly.spring;

import com.suncafly.spring.ioc.bean.Pig;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 10:57 AM
 */
public class DynamicFactoryBean {

    public Pig create(){
        return new Pig("small pig", 2);
    }
}
