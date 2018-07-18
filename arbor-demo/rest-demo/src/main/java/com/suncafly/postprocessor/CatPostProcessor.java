package com.suncafly.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-12 9:42 AM
 */
@Component
public class CatPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat) {
            System.out.println("==cat postProcessBeforeInitialization  " + bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat) {
            System.out.println("==cat postProcessAfterInitialization  " + bean);
        }
        return bean;
    }


}
