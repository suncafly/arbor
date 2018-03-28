package com.arbor.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by apple on 28/03/2018.
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private Map<String, People> peoples;

    @RequestMapping("show")
    public Map<String, People> show(){
        System.out.println("------------");
        return peoples;
    }
}
