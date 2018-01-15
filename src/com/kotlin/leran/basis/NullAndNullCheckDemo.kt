package com.kotlin.leran.basis

/**
 * 描述 ：    Kotlin可空类型、与空安全 详解
 * anthor :  Jetictors
 * time :    2018/1/14  15:47
 * version : v1.0.1
 */

fun main(args: Array<String>) {
//    funNull()
//    funNullCheck()
//    println(funNullMethod())
//    testBuilder()
//    operatorLet()
//    operatorEvils1()
//    operatorEvils2()
    operatorEvils3()
}

fun operatorEvils3() {

//    // 正常转换
//    val num1 : Int = "123".toInt()
//    // 会抛出ClassCastException异常
//    val num2 : Int = "123" as Int
//
//    println("nun1 = $num1 \t num2 = $num2")

    // 正常转换
    val a = 10
    val num3 : Int? = a as? Int
    // null
    val num4 : Int? = "123" as? Int

    println("nun3 = $num3 \t num4 = $num4")
}

/**
 * !! 操作符用法
 */
fun operatorEvils2() {
    val testStr : String? = null

    println(testStr!!.length)
}

/**
 * ?: 操作符用法
 */
fun operatorEvils1() {
    val testStr : String? = null

    var length = 0

    // 例： 当testStr不为空时，输出其长度，反之输出-1

    // 传统写法
    length = if (testStr != null) testStr.length else -1

    // ?: 写法
    length = testStr?.length ?: -1

    println(length)
}

/**
 * let{ } 函数的用法
 */
fun operatorLet() {
    // let函数是一个高阶函数

    // 例： 排除掉数组中的空元素
    val arrTest : Array<Int?> = arrayOf(1,2,null,3,null,5,6,null)

    // 传统写法
    for (index in arrTest) {
        if (index == null){
            continue
        }
        println("index => $index")
    }

    // let写法
    for (index in arrTest) {
        index?.let { println("index => $it") }
    }

}

/**
 * 测试使用符号 ?. 链式调用方法
 */
fun testBuilder() {
    val builder1 : Test.Builder? = Test.Builder().setName("Lily")?.setSex("女")?.setAge(10)
    val builder2 : Test.Builder? = Test.Builder().setName("Tom")?.setSex(null)?.setAge(10)
    println(builder1.toString())
    println(builder2.toString())

    val testStr : String? = null
    val result = testStr?.length?.plus(5)?.minus(10)
    println(result)
}

/**
 * 当函数有返回值的情况下使用可空类型，其方法的返回值类型同样要加上?符号
 */
fun funNullMethod() : Int? {
    val str : String? = "123456"
    return str?.let { str.length }
}

/**
 * 判断可空类型的两种方式
 */
fun funNullCheck() {

    var str : String? = "123456"
    str = null

    // 1. if...else...判断

    if (str == null){
        println("变量str为空")
    }else{
        println("str.length => ${str.length}")
    }

    // 2. 使用符号`?.`判断 , 可以方便的调用变量的属性、方法等
    println(str?.length)   // 当变量str为null时，会返回空(null)

}

fun funNull() {

    // 定义一个不可为空的变量，用var修饰的变量可以被重新赋值，用val修饰的变量则不能，但是不能赋值为null
    var a : Int = 12
    val b : Int = 13

    a = 20
    // a = null 不能复制为null
    // b = 20   不能被重新赋值

    if(a == null){
        // 这样的判断毫无意义，因为变量a永远不可能null
    }

    /*
        定义可空类型的变量,即变量可以被赋值为null
        定义格式为：修饰符 变量名 ： 类型? = 值
    */
    var nullA : Int? = 12
    val nullB : Int? = 13

    nullA = null

    if(nullA == null){
        println("nullA = $nullA")
    }
}

class Test{

    class Builder{
        private var name : String? = "Tom"
        private var age : Int? = 0
        private var sex : String? = "男"

        fun setName(name : String) : Builder?{
            this.name = name
            return this
        }

        fun setAge(age : Int) : Builder?{
            this.age = age
            return this
        }

        fun setSex(sex: String?) : Builder?{
            this.sex = sex
            return this
        }

        override fun toString(): String {
            return "Builder(name=$name, age=$age, sex=$sex)"
        }
    }
}

 
