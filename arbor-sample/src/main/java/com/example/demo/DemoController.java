package com.example.demo;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by apple on 28/03/2018.
 * Spring 获取同一接口的实现类集合
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private List<People> peoples;

    @Autowired
    private ObjectMapper objectMapper;

    @PostConstruct
    public void check(){
//        DeserializationConfig config = objectMapper.getDeserializationConfig();
    }

}
