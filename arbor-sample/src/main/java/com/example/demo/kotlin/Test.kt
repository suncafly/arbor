package com.example.demo.kotlin

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-10 1:03 PM
 */
class Test(name: String) {

    init {
        println(name)
    }

    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            Test("lifang")
        }
    }
}
