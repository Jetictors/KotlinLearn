package com.kotlin.leran.basis

/**
 * 描述 :     Kotlin语法之变量和常量的使用
 * anthor :  Jetictors
 * time :    2017/9/1  01:30
 * version : 1.0.1
 */
fun main(args: Array<String>) {
    basisVariable()
    classVariable()
}

/**
 * 在类中，变量的定义及使用
 */
fun classVariable() {
    class Test1{

        // 定义属性
        var var_a : Int = 0
        val val_a : Int = 0

        // 初始化
        init {
            var_a = 10
            // val_a = 0 为val类型不能更改。

            println("var_a => $var_a \t val_a => $val_a")
        }
    }

    Test1()

    class Test2{

        // 声明可空变量

        var var_a : Int? = 0
        val val_a : Int? = null

        init {
            var_a = 10
            // val_a = 0 为val类型不能更改。

            println("var_a => $var_a \t val_a => $val_a")
        }
    }

    Test2()
}

/**
 * 基础变量的定义及用法
 */
fun basisVariable() {
    //立即初始化
    var var_a: Int = 10

    //推导出类型
    var var_b = 5

    //没有初始化的时候，必须声明类型
    var var_c: Float
    var_c = 12.3f
    var_c += 1

    println("var_a => $var_a \t var_b => $var_b \t var_a => $var_c")

    //立即初始化
    val val_a: Int = 100

    //推导出类型
    val val_b = 50

    //没有初始化的时候，必须声明类型
    val val_c: Int
    val_c = 1
    // val_c += 1 因为c是常量，所以这句代码是会报错的

    println("val_a => $val_a \t val_b => $val_b \t val_c => $val_c")
}


