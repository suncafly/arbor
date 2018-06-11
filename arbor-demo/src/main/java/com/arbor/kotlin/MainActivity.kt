package com.arbor.kotlin

/**
 * ${TODO}
 * @author LiFang
 * @create 2018-05-18 2:59 PM
 */
object  MainActivity {
    @JvmStatic
    fun main(args: Array<String>) {
//        var bean = MyBean()
//        bean.testcallback1 { m ->
//            println(m)
//        }
//        val result = bean.testcallback2(1, 2, { value1, value2 -> value1 + value2 })
//        println(result)

//       MyObject.outFunction("aaaa")
        val array = IntArray(10) { it }
        val oae: Map<Int, List<Int>> = array.groupBy { it and 1 }
        oae.forEach { key, value -> println("$key -> $value") }
    }
}