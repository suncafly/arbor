package com.example.demo.kotlin

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.stereotype.Component

import java.util.Date

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-09 8:01 PM
 */
@Component
open class D(

        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        var date: Date? = null
){
        @Autowired
        var e: E? = null
}
