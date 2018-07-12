package com.suncafly.spring.ioc.bean;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 11:17 AM
 */
public class Arabus {

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Arabus{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
