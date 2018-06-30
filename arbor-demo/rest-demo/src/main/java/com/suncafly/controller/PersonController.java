package com.suncafly.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.suncafly.dto.Person;
import com.suncafly.dto.PersonQueryCondition;
import com.suncafly.repository.PersonRepository;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-30 6:14 PM
 */
@RestController
@RequestMapping("/user")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> findPageByCondition(Person person, Pageable pageable) {
        System.out.println(ReflectionToStringBuilder.toString(person, ToStringStyle.MULTI_LINE_STYLE));
        Page<Person> page = personRepository.findAll(Example.of(person), pageable);
        List<Person> list = page.getContent();
        return list;
    }

    @GetMapping("/{id}")
    public Person findOne(@PathVariable("id") Long id) {
        return personRepository.findOne(id);
    }


    @PostMapping
    public Person create(@RequestBody Person person) {
        return personRepository.saveAndFlush(person);
    }

    @PutMapping("/{id}")
    public Person update(@PathVariable("id") Long id, @RequestBody Person person){
        person.setId(id);
        return personRepository.saveAndFlush(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        personRepository.delete(id);
    }

}
