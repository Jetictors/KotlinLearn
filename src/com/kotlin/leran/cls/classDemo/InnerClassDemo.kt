package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    内部类
 * anthor :  Jetictors
 * time :    2017/12/13  0:43
 * version : v1.0.1
 */
class Other{    // 外部类
    val numOther = 1
    lateinit var listener : OnClickListener

    class Nested {  // 嵌套类
        fun init(){
            println("init")
        }
    }

    fun partMethod(){
        var name : String = "partMethod"

        class Part{
            var numPart : Int = 2

            fun test(){
                name = "test"
                numPart = 5
                println("我是局部类中的方法")
            }
        }

        val part = Part()
        println("name = $name \t numPart = " + part.numPart + "\t numOther = $numOther")
        part.test()
        println("name = $name \t numPart = " + part.numPart + "\t numOther = $numOther")
    }

    inner class InnerClass{
        val name = "InnerClass"
        fun init(){
            println("我是内部类")
        }
    }

    fun setOnClickListener(listener : OnClickListener){
        this.listener = listener
    }

    fun setOnClickListener2(listener: OnClickListener) : OnClickListener{
        this.listener = listener
        listener.onItemClick("sssss")
        return listener
    }

    fun testListener(){
        listener.onItemClick("我是匿名内部类的测试方法")
    }

    fun testListener2(){
        listener.onItemClick("sss")
    }
}

interface OnClickListener{
    fun onItemClick(str : String)
}

fun main(args: Array<String>) {

    // 测试嵌套类
    Other.Nested().init()       // 调用格式为：外部类.嵌套类().嵌套类方法/属性

    // 测试内部类
    Other().InnerClass().init() // 调用格式为：外部类().内部类().内部类方法/属性

    // 测试局部类
    Other().partMethod()

    // 测试匿名内部类
    val other = Other()
    other.setOnClickListener(object : OnClickListener{
        override fun onItemClick(str: String) {
            // todo
            println(str)
        }
    })
}