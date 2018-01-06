package com.kotlin.leran.senior

/**
 * 描述 ：    操作符重载详解
 * anthor :  Jetictors
 * time :    2018/1/3  23:21
 * version : v1.0.1
 */

fun main(args: Array<String>) {
    unitaryOperator()
    binaryOperator()
}

/**
 * 二元操作
 */
fun binaryOperator() {
    /*
        二元操作：即指两个操作数的情况，
     */
}

/**
 * 一元操作
 */
private fun unitaryOperator() {

    /*
        一元操作:即指一个操作数的情况，有三种一元操作
        1. `+` 表示正数的意思，其操作数为数值型
        2. `-` 表示负数的意思，其操作数为数值型
        3. `!` 表示取反的意思，其操作数为boolean类型
     */

    var a = 1
    var b = -2
    var c = true
    var d = false

    // Java实现
    println("+a = ${+a}\t -a = ${-a}\t !c = ${!c}")
    println("+b = ${+b}\t -b = ${-b}\t !d = ${!d}")

    // Kotlin实现，值得注意的是Kotlin同样可以实现上面的写法
    println("+a = ${a.unaryPlus()}\t -a = ${a.unaryMinus()}\t !c = ${c.not()}")
    println("+b = ${b.unaryPlus()}\t -b = ${b.unaryMinus()}\t !d = ${d.not()}")
}
 
