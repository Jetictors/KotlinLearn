package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    密封类子类的扩展功能展示
 * anthor :  Jetictors
 * time :    2017/12/31  3:12
 * version : v1.0.1
 */
fun  <T>SealedExpr.Add.add(num1 : T, num2 : T) : Int{
    return 100
}

fun main(args: Array<String>) {
    println(SealedExpr.Add.add(1,2))
}
