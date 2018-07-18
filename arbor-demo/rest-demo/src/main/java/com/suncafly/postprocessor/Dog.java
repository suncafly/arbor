package com.suncafly.postprocessor;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-13 8:59 AM
 */
public class Dog {


    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
