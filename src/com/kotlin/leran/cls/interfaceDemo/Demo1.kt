package com.kotlin.leran.cls.interfaceDemo

/**
 * 描述 ：    接口的声明
 * anthor :  Jetictors
 * time :    2017/10/29  16:36
 * version : v1.0.1
 */
fun main(args: Array<String>) {

    // 类的初始化
    var demo = Demo1()

    demo.fun1()
}

/**
 * 我定义的接口
 */
internal interface Demo1Interface{

    // 定义的方法
    fun fun1()
}

/**
 * 接口的实现类
 */
class Demo1 : Demo1Interface{
    override fun fun1() {
        println("我是接口中的fun1方法")
    }
}
 
