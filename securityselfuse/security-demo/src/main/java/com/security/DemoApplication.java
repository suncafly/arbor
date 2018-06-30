package com.security;

import com.security.test.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-24 9:08 PM
 */
@SpringBootApplication
@RestController
public class DemoApplication {

    @Resource
    private Person person;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello spring security";
    }

    @PostConstruct
    public void test(){
        person.show();
    }
}
