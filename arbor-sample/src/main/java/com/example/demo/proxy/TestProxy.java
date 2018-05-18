package com.example.demo.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 9:36 AM
 */
@Component
public class TestProxy {

//    @Autowired
//    private PManager pManager;

    @Autowired
    private FManager fManager;


    @PostConstruct
    public void build(){
        Schedule schedule = new Schedule();
//        schedule.setType("shanMapperImpl");
        fManager.save(schedule);
    }
}
