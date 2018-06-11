package com.arbor.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-07 10:06 AM
 */
public class Test {

    public static void main(String[] args)throws Exception {
        DarkVO s = new DarkVO("lifang", 1);
        Dark s2 = s;
        System.out.println(((DarkVO) s2).getAge());
        ObjectMapper o = new  ObjectMapper();
        String str1 = o.writeValueAsString(s2);
        String str2 = o.writeValueAsString(s);
        System.out.println(str1);
        System.out.println(str2);
    }


    public static List<DarkVO> show(){
        List<DarkVO> darkVOS = new ArrayList<>();
        darkVOS.add(new DarkVO("lifang", 1));
        return darkVOS;
    }
}
