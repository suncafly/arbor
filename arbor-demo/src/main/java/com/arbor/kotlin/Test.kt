package com.arbor.kotlin

import com.arbor.demo.Student
import java.math.BigDecimal

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

    fun method3(){
        val users = listOf(User1(1,"a", 1), User1(2, "b", 2))

        val students = listOf(Student1(3, "c"), Student1(1,"a"), Student1(2, "b"))

        val usersMap = users.associateBy { it.id }

//        val userids = users.map { it.id }

        students.forEach {
            val user = usersMap[it.id]?:return@forEach
            if(user.id == 1L){
                return@forEach
            }
        }

        val specialUser = users.toList()

        val a = BigDecimal(110)
        val b = a.multiply(BigDecimal(8)).divide(BigDecimal.TEN, 3, BigDecimal.ROUND_HALF_UP)
        println(b)
    }



}

fun main(args: Array<String>) {
     Test().method3()
}

class User1 constructor(id:Long, name:String, age:Int){

    val id = id
    val name = name
    val age = age
    override fun toString(): String {
        return "User(id=$id, name='$name', age=$age)"
    }

}
class Student1 constructor(id:Long, name:String){
    val id = id
    val name = name
    override fun toString(): String {
        return "Student(id=$id, name='$name')"
    }
}