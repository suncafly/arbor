package com.suncafly.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sound.midi.Soundbank;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-12 9:20 AM
 */

public class Cat implements InitializingBean , DisposableBean, ApplicationContextAware {

    private  ApplicationContext applicationContext;

    @Autowired
    private Dog dog;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("==cat afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("==cat destroy");
    }

    public void initMethod(){
        System.out.println("==cat initMethod");
        System.out.println(dog);
    }

    public void destroyMethod(){
        System.out.println("==cat destroyMethod");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("==cat setApplicationContext");
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void postConstructMethod(){
        System.out.println("###cat postConstructMethod");
    }

    @PreDestroy
    public void  preDestroyMethod(){
        System.out.println("###cat preDestroyMethod");
    }





    public void show(){
        System.out.println("###" + applicationContext);
    }
}
