package com.example.demo.proxy;

import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 9:34 AM
 */
@Component
public class FanMapperImpl implements FMapper {
    @Override
    public void save(Schedule schedule) {
        System.out.println("this is fan");
    }
}
