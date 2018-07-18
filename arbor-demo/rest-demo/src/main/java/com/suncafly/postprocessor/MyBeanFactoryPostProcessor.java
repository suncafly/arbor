package com.suncafly.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-13 8:56 AM
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("=====MyBeanFactoryPostProcessor postProcessBeanFactory====" + beanFactory.getBeanDefinitionNames());
    }
}
