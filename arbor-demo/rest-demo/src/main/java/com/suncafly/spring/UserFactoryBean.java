package com.suncafly.spring;

import com.suncafly.dto.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-11 9:15 AM
 */
public class UserFactoryBean implements FactoryBean<Person> {

    @Override
    public Person getObject() {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
