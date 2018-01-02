package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    数据类
 * anthor :  Jetictors
 * time :    2017/12/13  0:42
 * version : v1.0.1
 */
data class Person(var param1: String = "param1",
                  var param2: String = "param2",
                  var param3 : String,
                  var param4 : Long,
                  var param5 : Int = 2,
                  var param6 : String,
                  var param7 : Float = 3.14f,
                  var param8 : Int,
                  var param9 : String){
    // exp
}

data class User(val name : String, val pwd : String)

/**
 * @param
 */
fun main(args: Array<String>) {

    val mUser = User("kotlin","123456")
    println(mUser)
    val mNewUser = mUser.copy(name = "new Kotlin")
    println(mNewUser)

    val (name,pwd) = mUser
    println("name = $name\tpwd = $pwd")

    val pair = Pair(1,2)        // 实例
    val triple = Triple(1,2,3)  // 实例
    println("$pair \t $triple") // 打印：即调用了各自的toString()方法
    println(pair.toList())      // 转换成List集合
    println(triple.toList())    // 转换成List集合
    println(pair.to(3))         // Pair类特有: 其作用是把参数Pair类中的第二个参数替

}