package com.example.demo.kotlin

import org.springframework.stereotype.Component
import java.util.*

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-09 7:56 PM
 */
@Component
class CImpl : C, D(){

    override fun show() {
        e!!.print()
        date = Date()
        println(date.toString())
        println("this is C1")
    }
}
