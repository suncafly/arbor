package com.arbor.kotlin

/**
 * ${TODO}
 * @author LiFang
 * @create 2018-05-18 9:39 AM
 */
object Demo {

    open class A(x: Int) {
        open val y: Int = x
    }

    interface B {
        fun show()
    }

    val ab: B = object : A(1), B {

        override val y = 15

        override fun show() {
            print("this is show method")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        ab.show()
    }
}
