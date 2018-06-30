package com.security.test

/**
 * ${TODO}
 * @author LiFang
 * @create 2018-06-29 9:18 AM
 */
class InitOrderDemo(var name: String, var desc: String ?= null) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

    val parameterName = name.toUpperCase()

    fun showParameterName(){
        println(parameterName)
    }
}

fun main(args: Array<String>) {
    val initOrderDemo = InitOrderDemo(name = "hello", desc = "this is initOrderDemo")
    initOrderDemo.showParameterName()
}


