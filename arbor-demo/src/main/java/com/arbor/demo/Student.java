package com.arbor.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 28/03/2018.
 */
@Component("student")
@Data
public class Student implements People {

    String name = "sun";

    public void show() {
        System.out.println("this is a student");
    }
}
