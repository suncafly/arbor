package com.arbor;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by apple on 28/03/2018.
 */
@SpringBootApplication
@EnableJSONDoc
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
