package com.arbor.swagger2;

import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public List<Person> query() {
        List<Person> personList = personService.loadAll();
        return personList;
    }

    @PostMapping("/")
    public boolean create(@RequestBody Person person) {
        return personService.create(person);
    }


    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id){
        return personService.deleteById(id);
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable("id") Long id, @RequestBody Person person){
        person.setId(id);
        return personService.update(person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") Long id){
        return personService.findById(id);
    }


}
