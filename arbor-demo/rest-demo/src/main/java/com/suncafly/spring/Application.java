package com.suncafly.spring;

import com.suncafly.spring.ioc.bean.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import sun.security.krb5.internal.EncAPRepPart;

import java.nio.file.FileSystem;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-10 9:20 AM
 */
public class Application {


    public static void main(String[] args) {
        //基于配置文件的依赖注入
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        User user = (User)applicationContext.getBean("user");
//        Dog dog = (Dog)applicationContext.getBean("dog");
//        Pig pig = (Pig)applicationContext.getBean("pig");
//        System.out.println(user);
//        System.out.println(dog);
//        System.out.println(pig);
//        applicationContext.close();

//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
//        annotationConfigApplicationContext.scan("com.suncafly.spring");
//        Fish fish = (Fish) annotationConfigApplicationContext.getBean("fish");
//        User user = (User) annotationConfigApplicationContext.getBean("user");
//        Arabus arabus = (Arabus) annotationConfigApplicationContext.getBean("arabus");
//        Ear ear = (Ear) annotationConfigApplicationContext.getBean("ear");
//        Animal animal = (Animal) annotationConfigApplicationContext.getBean("animal");
//        System.out.println(fish);
//        System.out.println(user);
//        System.out.println(arabus);
//        System.out.println(ear);
//        animal.show();
//        annotationConfigApplicationContext.close();
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("AAA");
        if(fileSystemXmlApplicationContext instanceof DefaultResourceLoader){
            System.out.println("$$");
        }
    }
}
