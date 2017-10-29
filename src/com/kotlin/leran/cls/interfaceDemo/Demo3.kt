package com.kotlin.leran.cls.interfaceDemo

/**
 * 描述 ：    皆空中的属性使用
 * anthor :  Jetictors
 * time :    2017/10/29  20:32
 * version : v1.0.1
 */
fun main(args: Array<String>) {
    var demo = Demo3(1,2)
    println(demo.sum())

    println(demo.result())

    // 在这里也可以改变接口属性的值
    demo.num4 = 10
    println(demo.result())
}

interface Demo3Interface{

    val num1: Int

    val num2 : Int

    // 声明比那俩和提供默认值
    // 注意： val num3: Int = 3  这种方式不提供，为直接报错的
    val num3: Int
    get() = 3

    val num4: Int
}

class Demo3(override val num1: Int, override val num2: Int) : Demo3Interface{

    // 提供访问器实现
    override val num3: Int
        get() = super.num3

    // 手动赋值
    override var num4: Int = 4

    fun sum() : Int{
        return num1 + num2
    }

    fun result() : Int{
        return num3 + num4
    }
}
