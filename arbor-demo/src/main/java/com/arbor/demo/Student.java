package com.arbor.demo;

import org.springframework.stereotype.Component;

/**
 * Created by apple on 28/03/2018.
 */
@Component
public class Student implements People {
    @Override
    public void show() {
        System.out.println("this is a student");
    }
}
