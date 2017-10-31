package com.kotlin.leran.cls.classDemo


/**
 * 描述 ：    枚举类
 * anthor :  Jetictors
 * time :    2017/10/31  23:45
 * version : v1.0.1
 */
fun main(args: Array<String>) {
    println("name = " + Color.RED.name + "\tordinal = " + Color.RED.ordinal)
    println("name = " + Color.WHITE.name + "\tordinal = " + Color.WHITE.ordinal)
    println("name = " + Color.BLACK.name + "\tordinal = " + Color.BLACK.ordinal)
    println("name = " + Color.GREEN.name + "\tordinal = " + Color.GREEN.ordinal)

    println(enumValues<Color>().joinToString { it.name })
    println(enumValueOf<Color>("RED"))

    println(Color.valueOf("RED"))
    println(Color.values()[0])
    println(Color.values()[1])
    println(Color.values()[2])
    println(Color.values()[3])
}

enum class Color(var argb : Int){
     RED(0xFF0000),
     WHITE(0xFFFFFF),
     BLACK(0x000000),
     GREEN(0x00FF00)
}

/**
 * 例：关于一个网络请求结果的枚举类
 */
enum class State{
    /*
         NORMAL : 正常
         NO_DATA : 数据为空
         NO_INTERNET : 网络未连接
         ERROR : 错误
         OTHER : 其他
     */

    NORMAL,NO_DATA,NO_INTERNET,ERROR,OTHER
}

/**
 * 关于枚举常量匿名函数的枚举类
 */
enum class ConsoleColor(var argb : Int){
    RED(0xFF0000){
        override fun print() {
            println("我是枚举常量 RED ")
        }
    },
    WHITE(0xFFFFFF){
        override fun print() {
            println("我是枚举常量 WHITE ")
        }
    },
    BLACK(0x000000){
        override fun print() {
            println("我是枚举常量 BLACK ")
        }
    },
    GREEN(0x00FF00){
        override fun print() {
            println("我是枚举常量 GREEN ")
        }
    };

    abstract fun print()
}
