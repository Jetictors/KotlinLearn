package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    类的声明
 * anthor :  Jetictors
 * time :    2017/10/29  23:39
 * version : v1.0.1
 */

fun main(args: Array<String>) {
    var test = Test()
    var test1 = Test(1,2)
    var test2 = Test(4,5,6)
}

//class Test(num : Int){}

// 因为是默认的可见性修饰符且不存在任何的注释符， 故而主构造函数constructor关键字可以省略
//class Test(num: Int){
//
//}

//class Test constructor(num : Int){
//
//}

//class Test constructor(num: Int){
//
//    init {
//        println("num = $num")
//    }
//
//    constructor(num : Int, num2: Int) : this(num) {
//        println(num + num2)
//    }
//}

class Test constructor(num1: Int = 10 , num2: Int = 20){

    init {
        println("num1 = $num1\t num2 = $num2")
    }

    constructor(num1 : Int = 1, num2 : Int = 2, num3 : Int = 3) : this(num1 , num2){
        println("num1 = $num1\t num2 = $num2 \t num3 = $num3")
    }
}

//class Test (var num : Int){
//    init {
//        num = 5
//        println("num = $num")
//    }
//}

// 类似下面两种情况的，都必须存在constructor关键字，并且在修饰符或者注释符后面。
//class Test private constructor(num: Int){
//
//}

//class Test @Inject constructor(num: Int){
//
//}
