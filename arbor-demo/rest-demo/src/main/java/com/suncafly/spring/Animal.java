package com.suncafly.spring;

import com.suncafly.spring.ioc.bean.Dog;
import com.suncafly.spring.ioc.bean.Ear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 11:36 AM
 */
@Component
public class Animal {

    private Ear ear;
//    private Dog dog;

    public Animal(Ear ear){
        this.ear = ear;
    }

//    @Autowired
//    public Animal(Ear ear, Dog dog){
//        this.ear =ear;
//        this.dog = dog;
//    }



    public void show(){
        System.out.println(ear);
    }

}
