package com.example.demo.kotlin

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import javax.annotation.PostConstruct

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-10 10:59 AM
 */
@Component
open class F {

    @Autowired
    private lateinit var c: C



    @PostConstruct
    fun test() {

        c.show()
    }

}
