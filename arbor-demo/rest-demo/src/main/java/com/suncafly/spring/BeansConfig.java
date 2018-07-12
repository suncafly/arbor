package com.suncafly.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.PostConstruct;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 9:23 AM
 */
@Configuration
//@ImportResource("bean.xml")
@Import(ArabusConfig.class)
public class BeansConfig {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public UserFactoryBean createPerson(){
        return new UserFactoryBean();
    }


    @PostConstruct
    public void show(){
        Object o = applicationContext.getBean("createPerson");
        System.out.println("#######");
        System.out.println(o);
        System.out.println("#######");
    }
}
