package com.suncafly.config;

import com.suncafly.filter.SpecialFitler;
import com.suncafly.interceptor.TimeInterceptor;
import org.jsondoc.core.annotation.ApiAuthBasicUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-01 9:29 PM
 */
@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private  TimeInterceptor timeInterceptor;


    @Bean
    public FilterRegistrationBean specialFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        SpecialFitler specialFitler = new SpecialFitler();
        registrationBean.setFilter(specialFitler);
        List<String> urls = new ArrayList<>();
        urls.add("/*");
        registrationBean.setUrlPatterns(urls);
        return registrationBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timeInterceptor);
    }
}
