package com.suncafly.config;

import com.suncafly.exception.MyExceptionResolver;
import com.suncafly.filter.SpecialFitler;
import com.suncafly.interceptor.TimeInterceptor;
import org.jsondoc.core.annotation.ApiAuthBasicUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
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

//    @Autowired
//    private MyExceptionResolver myExceptionResolver;

    /**
     * 注入第三方过滤器
     * @return
     */
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

//    @Override
//    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
//        super.configureAsyncSupport(configurer);
//    }

    //    @Override
//    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
//        exceptionResolvers.add(myExceptionResolver);
//    }
}
