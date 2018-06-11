package com.arbor.kotlin

/**
 * ${TODO}
 * @author LiFang
 * @create 2018-05-18 3:17 PM
 */


class MyClass {
    val classParameter = "class"
    object InnerObject {
        //val innerParameter = this.classParameter //error: 1,this refers to InnerObject 2,classParameter cannot be reached
        val innerParameter = "inner"
        fun innerFunction(parameter:String) {
            println("Out object function result: $parameter.")
        }
    }

}