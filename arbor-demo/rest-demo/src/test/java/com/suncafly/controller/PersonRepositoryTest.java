package com.suncafly.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Autowired
    private PersonRepository personRepository;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac)
                .build();
    }

    @Test
    public void show() {
        List<Person> list = personRepository.findAll();
        System.out.println("#############################");
        System.out.println(list);
        System.out.println("#############################");
    }


    @Test
    public void personList() throws Exception {
        String result = mockMvc.perform(
                get("/user/person").contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk()).andExpect(jsonPath("$.length()").value(2))
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }

    @Test
    public void whenQuerySuccess() throws Exception {
        String result = mockMvc.perform(
                get("/user")
                        .param("name", "jojo")
                        .param("age", "18")
                        .param("otherInfo", "aaa")
                        .param("size", "15")
                        .param("page", "3")
                        .param("sort", "age,desc")
                        .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk()).andExpect(jsonPath("$.length()").value(3))
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }

}
