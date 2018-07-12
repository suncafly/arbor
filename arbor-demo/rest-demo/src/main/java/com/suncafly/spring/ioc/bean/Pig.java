package com.suncafly.spring.ioc.bean;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 10:58 AM
 */
public class Pig {

    private String name;
    private int age;


    public Pig(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
