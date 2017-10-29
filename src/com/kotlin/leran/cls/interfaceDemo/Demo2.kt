package com.kotlin.leran.cls.interfaceDemo

/**
 * 描述 ：    接口的方法与属性使用
 * anthor :  Jetictors
 * time :    2017/10/29  16:57
 * version : v1.0.1
 */

fun main(args: Array<String>) {
    var demo = Demo2()

    demo.fun1()
    demo.fun2(5)
    println(demo.fun3(10))
    println(demo.fun4())

    //可以不重写该方法直接调用
    demo.fun5()
}

interface Demo2Interface{

    /**
     * 定义一个无参数无返回值的方法
     */
    fun fun1()

    /**
     * 定义一个有参数的方法
     */
    fun fun2(num: Int)

    /**
     * 定义一个有参数有返回值的方法
     */
    fun fun3(num: Int) : Int

    // 下面的两个方法是有结构体， 故可以不重写

    /**
     * 定义一个无参数有返回值的方法
     */
    fun fun4() : String{
        return "fun4"
    }

    /**
     * 定义一个无结构体函数，大括号是可以省略的
     */
    fun fun5(){
        // 如果函数中不存在表达式，大括号可以省略。
        // 如fun1一样
    }
}

class Demo2 : Demo2Interface{

    override fun fun1() {
        println("我是fun1()方法")
    }

    override fun fun2(num: Int) {
        println("我是fun2()方法，我的参数是$num")
    }

    override fun fun3(num: Int): Int {
        println("我是fun3()方法，我的参数是$num，并且返回一个Int类型的值")
        return num + 3
    }

    override fun fun4(): String {
        println("我是fun4()方法，并且返回一个String类型的值")

        /*
            接口中的fun4()方法默认返回”fun4“字符串.
            可以用super.fun4()返回默认值
            也可以不用super关键字，自己返回一个字符串
        */
        return super.fun4()
    }

    /*
         接口中的fun5()带有结构体，故而可以不用重写，
         fun4()同样
    */
//    override fun fun5() {
//        super.fun5()
//    }
}
