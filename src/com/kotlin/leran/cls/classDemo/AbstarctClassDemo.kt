package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    抽象类详解
 * anthor :  Jetictors
 * time :    2017/12/31  22:37
 * version : v1.0.1
 */
open class Base{
    open fun init(){}
}

abstract class Lanauage : Base(){
    val TAG = this.javaClass.simpleName  // 自身的属性

    // 自身的函数
    fun test() : Unit{
        // exp
    }
    abstract var name : String           // 抽象属性
    abstract override fun init()         // 覆写父类的方法

    abstract class Name(){}
}

/**
 * 抽象类Lanauage的实现类TestAbstarctA
 */
class TestAbstarctA : Lanauage(){

    override var name: String
        get() = "Kotlin"
        set(value) {}

    override fun init() {
        println("我是$name")
    }
}

/**
 * 抽象类Lanauage的实现类TestAbstarctB
 */
class TestAbstarctB : Lanauage(){
    override var name: String
        get() = "Java"
        set(value) {}

    override fun init() {
        println("我是$name")
    }

}

fun main(args: Array<String>) {

    // val mLanauage = Lanauage()  是错误的，因为抽象类不能直接被实例化
    val mLanauage : Lanauage = TestAbstarctB()

    val mTestAbstarctA = TestAbstarctA()
    val mTestAbstarctB = TestAbstarctB()

    println(mTestAbstarctA.name)
    mTestAbstarctA.init()

    println(mTestAbstarctB.name)
    mTestAbstarctB.init()
}
