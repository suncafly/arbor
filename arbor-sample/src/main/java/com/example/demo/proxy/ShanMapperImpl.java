package com.example.demo.proxy;

import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 9:35 AM
 */
@Component
public class ShanMapperImpl implements SMapper {
    @Override
    public void save(Schedule schedule) {
        System.out.println("this is shan");
    }
}
