package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    Kotlin属性/字段详解
 * author :  Jetictors
 * time :    2018/1/29  1:01
 * version : v1.0.1
 */
 
class Mime{
    val id : String = "123"
    var name : String? = "kotlin"
    var age : Int? = 22
    var sex : String? = "男"
    var weight : Float = 120.3f
    val s : Int by lazy { 10 }

    var test1 : String = ""
        get() = "123"
        set(value){field = value}

    val test2 : String
        get() = "123"

    private val size = 0
    val isEmpty : Boolean
        get() = this.size == 0

    val num = 2
        get() = if (field > 5) 10 else 0

    var str1 = "demo1"
        get() = field
        set(value){
            field = if (value.isNotEmpty()) value else "null"
        }

    var str2 = ""
        get() = "随意怎么修改都不会改变"
        set(value){
            field = if (value.isNotEmpty()) value else "null"
        }

    var str = "kotlin"
        private set

}

class FieldDemo {

    fun test(){
        val mime = Mime()
        println("id = ${mime.id} \t name = ${mime.name} \t age = ${mime.age} \t sex = ${mime.sex} \t weight = ${mime.weight}")

        println("isEmpty = ${mime.isEmpty}")

        println("num = ${mime.num}")

        println("str = ${mime.str1}")
        mime.str1 = ""
        println("str = ${mime.str1}")
        mime.str1 = "kotlin"
        println("str = ${mime.str1}")

        println("str = ${mime.str2}")
        mime.str2 = ""
        println("str = ${mime.str2}")
        mime.str2 = "kotlin"
        println("str = ${mime.str2}")
    }

}