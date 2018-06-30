package com.arbor.demo

import java.util.ArrayList

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-07 10:12 AM
 */
object Test1 {

    @JvmStatic
    fun main(args: Array<String>) {
        val page = Page<Dark>()
        page.list = show()
    }

    fun show():List<DarkVO>{
        val darkVOS = ArrayList<DarkVO>()
        darkVOS.add(DarkVO("lifang", 1))
        return  darkVOS
    }
}
