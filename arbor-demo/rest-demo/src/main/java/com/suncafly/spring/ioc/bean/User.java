package com.suncafly.spring.ioc.bean;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 10:46 AM
 */
public class User {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
