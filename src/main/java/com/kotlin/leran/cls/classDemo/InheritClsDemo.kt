package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    继承类详解
 * author :  Jetictors
 * time :    2018/1/22  23:14
 * version : v1.0.1
 */

/**
 * 定义继承类的关键字为`open`
 */
open class Demo{

    open var num = 3

    open fun foo() = "foo"

    open fun bar() = "bar"

    open fun test(){}

    open val valStr = "我是用val修饰的属性"
}

class DemoTest : Demo(){

    fun foo(str: String) : String{
        return str
    }

    override fun foo(): String {
        return super.foo()
    }

    override var num: Int = 10

//    override val valStr: String
//        get() = super.valStr
//
//    override var valStr: String = ""
//        get() = super.valStr
//
//    override val valStr: String = ""

    override var valStr: String = "abc"
        get() = super.valStr
        set(value){field = value}
}

class DemoTest2(override var num: Int, override val valStr: String) : Demo()

open class A{
    open fun test1(){ println("基类A中的函数test1()") }

    open fun test2(){println("基类A中的函数test2()")}
}

interface B{
    fun test1(){ println("接口类B中的函数test1()") }

    fun test2(){println("接口类B中的函数test2()")}
}

class C : A(),B{
    override fun test1() {
        super<A>.test1()
        super<B>.test1()
    }

    override fun test2() {
        super<A>.test2()
        super<B>.test2()
    }
}

class InheritClsDemo{

    fun test(){
        println(DemoTest().num)
        println(DemoTest().foo())
        println(DemoTest().bar())
        println(DemoTest().foo("foo的重载函数"))

        println(DemoTest().num)

        println(DemoTest().valStr)

        val demo = DemoTest()
        demo.valStr = "1212121212"
        println(demo.valStr)

        val demo2 = DemoTest2(1,"构造函数中重写")
        println("num = ${demo2.num} \t valStr = ${demo2.valStr}")
    }

}