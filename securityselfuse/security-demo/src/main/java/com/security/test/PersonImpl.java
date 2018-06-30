package com.security.test;

import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-28 2:33 PM
 */
@Component
public class PersonImpl implements Person{
    @Override
    public void show() {
        System.out.println("this is  show method");
    }

}
