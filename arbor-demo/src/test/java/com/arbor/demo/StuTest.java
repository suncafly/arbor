package com.arbor.demo;

import com.arbor.ApplicationTest;
import org.springframework.context.ApplicationContext;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-02 10:38 PM
 */

public class StuTest extends ApplicationTest {


    public void testShow() {
        System.out.println("this is show()");
        Stu stu = new Stu(1, "lifang");
        System.out.println(stu.getName());
    }


}
