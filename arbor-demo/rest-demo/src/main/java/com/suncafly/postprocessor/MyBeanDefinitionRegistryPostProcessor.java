package com.suncafly.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-13 8:59 AM
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("=== MyBeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry===" + registry);
        BeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(Dog.class);
        ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
        constructorArgumentValues.addIndexedArgumentValue(0, "name");
        ((AnnotatedGenericBeanDefinition) beanDefinition).setConstructorArgumentValues(constructorArgumentValues);
        registry.registerBeanDefinition("dog", beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        RootBeanDefinition dbf = (RootBeanDefinition)beanFactory.getBeanDefinition("cat");
        if(dbf != null){
            dbf.getResolvedAutowireMode();
        }
        System.out.println("===MyBeanDefinitionRegistryPostProcessor postProcessBeanFactory===" + beanFactory);
    }
}
