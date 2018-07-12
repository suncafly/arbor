package com.suncafly.spring;

import com.suncafly.spring.ioc.bean.Arabus;
import org.springframework.context.annotation.Bean;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 11:18 AM
 */

public class ArabusConfig {


    @Bean("arabus")
    public Arabus createArabus(){
        return new Arabus();
    }

}
