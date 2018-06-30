package com.suncafly.controller;

import com.suncafly.dto.User;
import com.suncafly.dto.UserQueryCondition;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-30 6:14 PM
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<User> query(UserQueryCondition condition, Pageable pageable) {
        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());
        List<User> data = new ArrayList<>();
        data.add(new User());
        data.add(new User());
        data.add(new User());
        return data;
    }

    @GetMapping("/person")
    public List<Person> personList(){
        return personRepository.findAll();
    }

}
