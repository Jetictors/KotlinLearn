package com.kotlin.leran.basis

/**
 * 描述 ：    常量的使用
 * author :  Jetictors
 * time :    2018/5/4  23:37
 * version : v1.0.1
 */

// 1. 顶层声明
const val NUM_A : String = "顶层声明"

class Constant {

    // 2. 在object修饰的类中
    object TestConst{
        const val NUM_B = "object修饰的类中"
    }

    // 3. 伴生对象对象中
    class TestClass{
        companion object {
            const val NUM_C = "伴生对象中声明"
        }
    }

    fun test(){
        println("numA = $NUM_A")
        println("numB = ${TestConst.NUM_B}")
        println("numC = ${TestClass.NUM_C}")
    }

}






