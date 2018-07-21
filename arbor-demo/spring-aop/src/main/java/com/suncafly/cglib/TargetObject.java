package com.suncafly.cglib;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 2:48 PM
 */
public class TargetObject {

    public final  String method4(){
        return "method4";
    }

    public String method1(String paramName) {
        return paramName;
    }

    public int method2(int count) {
        return count;
    }

    public int method3(int count) {
        return count;
    }



    @Override
    public String toString() {
        return "TargetObject []" + getClass();
    }
}
