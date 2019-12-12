package com.kotlin.leran.cls.classDemo

/**
 * Desc           :  接口使用
 * Author         :  Jetictors
 * Time           :  2019/9/16 16:46
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

/**
 * 接口声明
 */
interface Demo1Interface{
    // 定义的方法
    fun fun1()
}

/**
 * 接口的实现类
 */
class Demo1 : Demo1Interface {
    override fun fun1() {
        println("我是接口中的fun1方法")
    }
}

/**
 * 接口的方法使用
 */
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

/**
 * 接口中的属性使用
 */
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

/**
 *  接口的冲突问题解决
 */
interface Demo4InterfaceOne{
    fun fun1(){
        println("我是Demo4InterfaceOne中的fun1()")
    }

    fun fun2(){
        println("我是Demo4InterfaceOne中的fun2()")
    }
}

interface Demo4InterfaceTwo{
    fun fun1(){
        println("我是Demo4InterfaceTwo中的fun1()")
    }

    fun fun2(){
        println("我是Demo4InterfaceTwo中的fun2()")
    }
}

class Demo4 : Demo4InterfaceOne,Demo4InterfaceTwo{

    override fun fun1() {
        super<Demo4InterfaceOne>.fun1()
        super<Demo4InterfaceTwo>.fun1()
    }

    override fun fun2() {
        super<Demo4InterfaceOne>.fun2()
        super<Demo4InterfaceTwo>.fun2()
    }

}

class InterfaeDemo{

    fun test(){
        val demo1 = Demo1()
        demo1.fun1()

        val demo2 = Demo2()
        demo2.fun1()
        demo2.fun2(5)
        println(demo2.fun3(10))
        println(demo2.fun4())

        //可以不重写该方法直接调用
        demo2.fun5()

        val demo = Demo3(1,2)
        println(demo.sum())

        println(demo.result())

        // 在这里也可以改变接口属性的值
        demo.num4 = 10
        println(demo.result())

        val demo4 = Demo4()
        demo4.fun1()
        demo4.fun2()
    }

}
