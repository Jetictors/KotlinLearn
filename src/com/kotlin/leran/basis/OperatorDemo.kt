package com.kotlin.leran.basis

/**
 * 描述 ：    操作符重载详解
 * author :  Jetictors
 * time :    2018/1/3  23:21
 * version : v1.0.1
 */

fun main(args: Array<String>) {
//    unitaryOperator()
//    unitaryCommonOperator()
//    binaryOperator()
    compareOperator()
//    testRangTo()
//    testIn()
//    testIs()
}

/**
 * 类型判断
 */
fun testIs() {
    val a = 0
}

/**
 * 包含操作符 in
 */
fun testIn() {
    val str = "kotlin"
    val result1 = "o" in str
    val result2 = str.contains("o")
    println("$result1 \t $result2")
}


/**
 * 区间操作符
 */
fun testRangTo() {

    /*
        操作符为(..)，其有两个操作数，且都是整型
     */
    val a = 1
    val b = 5

    // 操作符实现
    val s = 3 in a .. b     // true,因为3在区间[1,5]之内
    println("s = $s")
    for (index in a .. b){
        print("index = $index \t")
    }

    println()

    // 操作符重载方式实现
    val t = 3 in a.rangeTo(b)
    println("t = $t")
    for (index in a.rangeTo(b)){
        print("index = $index \t")
    }
    println()
}

/**
 * 比较运算符
 */
fun compareOperator() {
    /*
        > 、< 、>= 、<=
     */
    val a = 12
    val b = 5

    // 操作符实现
    println("a > b = ${a > b}")
    println("a < b = ${a < b}")
    println("a >= b = ${a >= b}")
    println("a <= b = ${a <= b}")

    // 操作符重载方式实现
    println("a.compareTo(b) > 0 = ${a.compareTo(b) > 0}")
    println("a.compareTo(b) < 0 = ${a.compareTo(b) < 0}")
    println("a.compareTo(b) >=  0 = ${a.compareTo(b) >= 0}")
    println("a.compareTo(b) <= 0 = ${a.compareTo(b) <= 0}")
}

/**
 * 二元操作
 */
fun binaryOperator() {
    basicBinaryOperator()
    commonBinaryOperator()
    seniorBinaryOperator()
}

/**
 * 对一个集合使用plus()和plusAssign()
 */
fun seniorBinaryOperator() {
    var arrA = arrayListOf<String>("1","2","3","4")
    var arrB = arrayListOf<String>("1","2","3","4")

    arrA.plusAssign(arrB)

    for (a in arrA){
        print("$a \t")
    }
}

/**
 * 复合的二元操作
 */
fun commonBinaryOperator() {
    var a = 10
    var b = 2
    var c = "Kotlin"

    // 主要演示字符串的+=
    c += a
    print("c = $c \t" )

    a += b
    print("a = $a \t")

    a = 10
    a -= b
    print("a = $a \t")

    a = 10
    a *= b
    print("a = $a \t")

    a = 10
    a /= b
    print("a = $a \t")

    a = 10
    a %= b
    println("a = $a \t")

    // 操作符重载方式实现
    a = 10
    c = "Kotlin"
    c = c.plus(a)
    print("c = $c \t")

    a = 10
    a = a.plus(b)
    print("a = $a \t")

    a = 10
    a = a.minus(b)
    print("a = $a \t")

    a = 10
    a = a.times(b)
    print("a = $a \t")

    a = 10
    a = a.div(b)
    print("a = $a \t")

    a = 10
    a = a.rem(b)
    println("a = $a \t")
}

/**
 * 简单的二元操作
 */
fun basicBinaryOperator(){
    val a = 10
    val b = 2
    val c = "2"
    val d = "Kotlin"

    // 操作符实现
    println("a + d = " + a + d)
    println("c + d = " + c + d)
    println("a + b = ${a + b} \t a - b = ${a - b} \t a * b = ${a * b} \t a / b = ${a / b} \t a % b = ${a % b}")

    // 操作符重载实现
    println("a + b = ${a.plus(b)} \t a - b = ${a.minus(b)} \t a * b = ${a.times(b)} \t a / b = ${a.div(b)} \t a % b = ${a.rem(b)} \t a .. d = ${a.rangeTo(b)}")
    // println(a.plus(d))  错误：因为第一个操作数`a`限制了其plus()方法的参数，
    // println(d.plus(a))  正确：因为plus()方法的参数为超（Any）类型
}

/**
 * 一元操作
 */
private fun unitaryOperator() {

    /*
        简单的一元操作:有三种一元操作
        1. `+` 表示正数的意思，其操作数为数值型
        2. `-` 表示负数的意思，其操作数为数值型
        3. `!` 表示取反的意思，其操作数为boolean类型
     */

    var a = 1
    var b = -2
    var c = true
    var d = false

    // 操作符实现
    println("+a = ${+a}\t -a = ${-a}\t !c = ${!c}")
    println("+b = ${+b}\t -b = ${-b}\t !d = ${!d}")

    // 操作符重载方式实现
    println("+a = ${a.unaryPlus()}\t -a = ${a.unaryMinus()}\t !c = ${c.not()}")
    println("+b = ${b.unaryPlus()}\t -b = ${b.unaryMinus()}\t !d = ${d.not()}")
}

/**
 * 复杂的一元元操作
 */
fun unitaryCommonOperator() {
    /*
        复杂的一元操作:有4种一元操作
        1. `a++` ：后缀自增
        2. `a--` : 后缀自减
        1. `++a` ：前缀自增
        2. `--a` : 前缀自减
     */
    var a = 10
    var b = 10
    var c = 10
    var d = 10

    // Java实现
    println("a++ = ${a++} \t b-- = ${b--} \t ++c = ${++c} \t --d = ${--d}")

    a = 10
    b = 10
    c = 10
    d = 10

    // 操作符重载方式实现
    a.also { a.inc() }
    b.also { b.dec() }
    c.inc().also { c = it }
    d.dec().also { d = it }
    println("a = $a \t b = $b \t c = $c \t d = $d")

}
 
