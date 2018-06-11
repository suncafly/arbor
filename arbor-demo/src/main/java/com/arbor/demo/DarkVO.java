package com.arbor.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-07 10:07 AM
 */
public class DarkVO extends Dark {

    public DarkVO(String name, int age){
        super(name);
        this.age = age;
    }

    @JsonIgnore
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
