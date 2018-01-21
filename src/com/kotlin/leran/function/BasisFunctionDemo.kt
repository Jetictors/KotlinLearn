package com.kotlin.leran.function


/**
 * 描述 ：    Kotlin语法之基本函数使用
 * anthor :  Jetictors
 * time :    2017/10/9  22:59
 * version : 1.0.1
 */
fun main(args: Array<String>) {

    // 函数的使用
    funBasis()



    funArgs(2,10f)

    defArgs()
    defArgs(1,10f,true)

    B().foo()

    println(test1())
    println(test2(2))
    println(test3(2f))
}

/**
 * 函数的定义
 */
fun funBasis() {
    println("我是函数funBasis")
}

fun unitFun() : Unit{
    println("我是返回值为Unit的函数，Unit可省略")

    // return Unit 可省略
    // 或者 return  可省略
}


/**
 * 具有默认参数的函数
 */
fun defArgs(numA : Int  = 1, numB : Float = 2f, numC : Boolean = false){
    println("numA  =  $numA \t numB = $numB \t numC = $numC")
}

/**
 * 具有参数的函数定义
 */
fun funArgs(numA : Int, numB : Float){
    println("numA = $numA \t numB = $numB")
}

// 无参数的情况
fun test1() = 2

// 有参数的情况
fun test2(num : Int) = num * 2      // 自动推断为：返回类型为Int

// 或者
fun test3(x : Float, y : Int = 2) = x * y  // 和默认参数一起使用，返回值为Int型

/**
 * 命名参数的函数
 */
fun callFun(str : String,
            isTrue : Boolean = false,
            numA : Int = 2,
            numB: Float = 2.0f,
            numC : Int = 2){}

fun varargFun(numA: Int, vararg str : String){

    // 遍历
    for (s in str) {

    }

    // 获取元素
//    str[index]
//    str.component1() ... str.component5()

    // 或者其高阶函数用法
//    str.map {  }
//    str.filter {  }
//    str.sortBy {  }

}

open class A{
    open fun foo(i : Int = 10){}
}

class B : A(){
    override fun foo(i: Int) {
        super.foo(i)
        println(i)
    }
}









