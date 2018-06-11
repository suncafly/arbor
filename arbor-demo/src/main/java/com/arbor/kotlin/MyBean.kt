package com.arbor.kotlin

/**
 * ${TODO}
 * @author LiFang
 * @create 2018-05-18 2:58 PM
 */
class MyBean {

    fun testcallback1(callback: (String) -> Unit) {
        callback.invoke("这是回调的内容")
    }

    fun testcallback2(value1: Int, value2: Int, callback: (Int, Int) -> Int): Int {
        var result = callback.invoke(value1, value2)
        return result * 3
    }


}