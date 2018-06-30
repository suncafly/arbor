package com.arbor;

import com.arbor.swagger2.Person;
import com.arbor.swagger2.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-30 9:14 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void show() {
        List<Person> list = personRepository.findAll();
        System.out.println("#############################");
        System.out.println(list);
        System.out.println("#############################");
    }
}
