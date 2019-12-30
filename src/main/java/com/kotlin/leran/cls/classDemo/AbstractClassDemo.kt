package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    抽象类详解
 * author :  Jetictors
 * time :    2017/12/31  22:37
 * version : v1.0.1
 */
open class Base{
    open fun initTest(){}
}

abstract class Language : Base(){

    // 自身的属性
    val TAG = this.javaClass.simpleName

    // 自身的函数
    fun test(){
        // exp
    }

    // 抽象属性
    abstract var name : String

    // 覆写父类的方法
    abstract override fun initTest()

    abstract class Name(){}
}

/**
 * 抽象类Language的实现类TestLanguageA
 */
class TestLanguageA : Language(){

    override var name: String
        get() = "Kotlin"
        set(value){}

    override fun initTest() {
        println("我是$name")
    }
}

/**
 * 抽象类Language的实现类TestLanguageB
 */
class TestLanguageB : Language(){
    override var name: String
        get() = "Java"
        set(value) {}

    override fun initTest() {
        println("我是$name")
    }

}

class AbstarctClassDemo {

    fun test(){
        // val mLanauage = Lanauage()  是错误的，因为抽象类不能直接被实例化
        val mLanauage : Language = TestLanguageB()

        val mTestA = TestLanguageA()
        val mTestB = TestLanguageB()

        println(mTestA.name)
        mTestA.initTest()

        println(mTestB.name)
        mTestB.initTest()
    }
}
