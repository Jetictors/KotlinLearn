package com.kotlin.leran.day01

/**
 * 描述 :     Kotlin语法之变量和常量的使用
 * anthor :  Jetictors
 * time :    2017/9/1  01:30
 * version : 1.0.1
 */
fun main(args: Array<String>) {
    variableExample()
    constantExample()
}

/**
 * 变量的定义
 * 关键字: var
 */
fun variableExample(){
    //立即初始化
    var a: Int = 10

    //推导出类型
    var b = 5

    //没有初始化的时候，必须声明类型
    var c: Float
    c = 12.3f
    c += 1

    println("a => $a   b => $b   c => $c")
}

/**
 * 常量的定义
 * 关键字: val
 */
fun constantExample(){
    //立即初始化
    val NUM_A: Int = 100

    //推导出类型
    val NUM_B = 50

    //没有初始化的时候，必须声明类型
    val NUM_C: Int
    NUM_C = 1
    // c += 1 因为c是常量，所以这句代码是会报错的

    println("NUM_A => $NUM_A   NUM_B => $NUM_B   NUM_C => $NUM_C")
}