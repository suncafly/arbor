package com.suncafly.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-12 9:23 AM
 */
@Configuration
public class Config {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod", name = "cat")
    public Cat createCat(){
        return new Cat();
    }
}
