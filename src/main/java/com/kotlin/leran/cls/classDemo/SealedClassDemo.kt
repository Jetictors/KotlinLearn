package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    密封类详解
 * author :  Jetictors
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

/**
 * 测试密封类其子类的扩展函数
 */
fun  SealedExpr.Add.add(num1 : Int, num2 : Int) : Int{
    return num1 + num2
}

class SealedClassDemo{

    fun test(){
        val mPerson1 = SealedExpr.Person("name1",22)
        println(mPerson1)

        val mPerson2 = SealedExpr.Person("name2",23)
        println(mPerson2)

        println(mPerson1.hashCode())
        println(mPerson2.hashCode())

        eval(SealedExpr)

        println(SealedExpr.Add.add(1,2))
    }

}

 
