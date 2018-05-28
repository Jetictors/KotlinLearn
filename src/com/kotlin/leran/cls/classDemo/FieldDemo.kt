package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    Kotlin属性/字段详解
 * anthor :  Jetictors
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

     var b : Boolean? = null

}

fun main(args: Array<String>) {
    val mime = Mime()
    println("id = ${mime.id} \t name = ${mime.name} \t age = ${mime.age} \t sex = ${mime.sex} \t weight = ${mime.weight}")

    val s by lazy { null }
}