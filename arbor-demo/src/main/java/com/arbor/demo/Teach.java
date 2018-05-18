package com.arbor.demo;

import org.springframework.stereotype.Component;

/**
 * Created by apple on 28/03/2018.
 */
@Component("teach")
public class Teach implements People {

    public void show() {
        System.out.println("this is a teach");
    }
}
