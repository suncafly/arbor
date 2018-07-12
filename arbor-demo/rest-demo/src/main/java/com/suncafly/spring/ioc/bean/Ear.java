package com.suncafly.spring.ioc.bean;

import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 11:40 AM
 */
@Component
public class Ear {

    private String name = "aa";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Ear{" +
                "name='" + name + '\'' +
                '}';
    }
}
