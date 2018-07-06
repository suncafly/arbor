package com.arbor.kotlin

/**
 * ${TODO}
 * @author LiFang
 * @create 2018-07-03 4:32 PM
 */
class Test {
    fun method1(status: Int, desc: String): String {
        return when (status) {
            1 -> "true"
            else -> {
                if (desc == "aa") return "aa"
                "false"
            }
        }
    }

    fun method2():Boolean{
        return true
    }
}

fun main(args: Array<String>) {
    val result = Test().method1(2, "aa")
    print(result)
}