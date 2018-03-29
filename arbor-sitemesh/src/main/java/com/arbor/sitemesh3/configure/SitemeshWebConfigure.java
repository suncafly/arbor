package com.arbor.sitemesh3.configure;

import com.arbor.sitemesh3.filter.Meshsite3Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SitemeshWebConfigure extends WebMvcConfigurerAdapter {

    @Autowired
    private  Meshsite3Filter siteMeshFilter;

    @Bean
    public FilterRegistrationBean siteMeshFilter() {
        FilterRegistrationBean fitler = new FilterRegistrationBean();
        fitler.setFilter(siteMeshFilter);
        return fitler;
    }

    @Bean
    @ConditionalOnMissingBean(Meshsite3Filter.class)
    public Meshsite3Filter webSiteMeshFilter(){
        return new Meshsite3Filter();
    }

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return filter;
    }



}
