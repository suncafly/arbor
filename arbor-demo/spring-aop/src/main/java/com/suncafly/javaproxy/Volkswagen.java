package com.suncafly.javaproxy;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 11:31 AM
 */
public class Volkswagen implements Car {
    @Override
    public String desc() {
        return "i 'm Volkswagen";
    }

    @Override
    public Double price() {
        return 28000000d;
    }
}
