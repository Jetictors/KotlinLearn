package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    密封类详解
 * anthor :  Jetictors
 * time :    2017/12/31  0:39
 * version : v1.0.1
 */
sealed class SealedExpr{
    data class Person(val name : String, val age : Int) : SealedExpr()
    object Add : SealedExpr()
    companion object Minus : SealedExpr()
}

object NotANumber : SealedExpr()

fun eval(expr: SealedExpr) = when(expr){
    is SealedExpr.Add -> println("is Add")
    is SealedExpr.Minus -> println("is Minus")
    is SealedExpr.Person -> println(SealedExpr.Person("Koltin",22))
    NotANumber -> TODO()
}

fun main(args: Array<String>) {
    val mPerson1 = SealedExpr.Person("name1",22)
    println(mPerson1)

    val mPerson2 = SealedExpr.Person("name2",23)
    println(mPerson2)

    println(mPerson1.hashCode())
    println(mPerson2.hashCode())

    eval(SealedExpr)
}


 
