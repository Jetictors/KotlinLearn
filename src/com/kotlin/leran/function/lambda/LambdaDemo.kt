package com.kotlin.leran.function.lambda


/**
 * 描述 ：    Lambda表达式详解
 * anthor :  Jetictors
 * time :    2018/3/21  23:50
 * version : v1.0.1
 */

fun main(args: Array<String>) {

    fun test(a : Int , b : (num1 : Int , num2 : Int) -> Int) : Int{
        return a + b.invoke(5,3)
    }

    println(test(10,{ num1: Int, num2: Int ->  num1 + num2}))

    val arr = arrayOf(1,3,5,7,9)

    println(arr.filter { it < 2 }.component1())

    fun test1(num1 : Int, bool : (Int) -> Boolean) : Int{
       return if (bool(num1)){ num1 } else 0
    }

    println(test1(10,{it > 5}))
    println(test1(4,{it > 5}))

    val test1 = fun(x : Int , y : Int) = x + y
    val test2 = fun(x : Int , y : Int) : Int = x + y
    val test3 = fun(x : Int , y : Int) : Int{
        return x + y
    }

    println(test1(3,5))
    println(test2(4,6))
    println(test3(5,7))

    fun test(b : Int): () -> Int{
        var a = 3
        return fun() : Int{
            a++
            return a + b

        }
    }

    val t = test(3)
    println(t())
    println(t())
    println(t())

    var sum : Int = 0
    arr.filter { it < 7  }.forEach { sum += it }

    println(sum)

    val iop = fun Int.( other : Int) : Int = this + other
    println(2.iop(3))

}