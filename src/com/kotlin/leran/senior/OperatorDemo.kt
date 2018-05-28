package com.kotlin.leran.senior

/**
 * 描述 ：    操作符重载详解
 * anthor :  Jetictors
 * time :    2018/1/3  23:21
 * version : v1.0.1
 */

fun main(args: Array<String>) {
//    unitaryOperator()
    unitaryCommonOperator()
//    binaryOperator()
//    compareOperator()
}

/**
 * 比较运算符
 */
fun compareOperator() {
    /*
        > 、< 、>= 、<= 、== 、!=
     */
    val a = 12
    val b = 12L
    val c = b.toInt()

    println("a > b => ${a > b} \t a.compareTo(b) > 0 => ${a.compareTo(b) > 0}")
    println("a < b => ${a < b} \t a.compareTo(b) < 0 => ${a.compareTo(b) < 0}")
    println("a >= b => ${a >= b} \t a.compareTo(b) >=  0 => ${a.compareTo(b) >= 0}")
    println("a <= b => ${a <= b} \t a.compareTo(b) <= 0 => ${a.compareTo(b) <= 0}")

    println("a == c => ${a == c} \t a === c => ${a === c}")
    
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
 * 对一个集合使用“+=”和'-='
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

    a += b
    print("a = $a \t")
    // 主要演示字符串的+=
    c += a
    print("c = $c \t")

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

    // Kotlin版本
    a = 10
    a = a.plus(b)
    print("a = $a \t")

    a = 10
    c = c.plus(a)
    print("c = $c \t" )

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
    print("a = $a \t")
}

/**
 * 简单的二元操作
 */
fun basicBinaryOperator(){
    val a = 10
    val b = 2
    val c = "2"
    val d = "Kotlin"

    // Java实现
    println("a + d = " + a + d)
    println("c + d = " + c + d)
    println("a + b = ${a + b} \t a - b = ${a - b} \t a * b = ${a * b} \t a / b = ${a / b} \t a % b = ${a % b}")

    // Kotlin实现
    println("a .. b = ${a .. b}")
    // println("a + d = ${a + d}") 错误：字符串模板限制只能为数值型
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

    // Java实现
    println("+a = ${+a}\t -a = ${-a}\t !c = ${!c}")
    println("+b = ${+b}\t -b = ${-b}\t !d = ${!d}")

    // Kotlin实现，值得注意的是Kotlin同样可以实现上面的写法
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
    //  Kotlin实现

    a.also { a.dec() }
    b.dec().also { b = it }
    println("a = $a \t b = $b" )

//    println("a.inc() = ${a.inc()} \t b.dec() = ${b.dec()} \t ++c = ${c.inc()} \t --d = ${d.dec()}")
}

 
