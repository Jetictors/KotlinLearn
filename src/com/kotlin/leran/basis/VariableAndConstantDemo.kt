package com.kotlin.leran.basis

/**
 * 描述 :     Kotlin语法之变量和常量的使用
 * author :  Jetictors
 * time :    2017/9/1  01:30
 * version : 1.0.1
 */

class VariableAndConstantDemo{

    /**
     * 基础变量的定义及用法
     */
    private fun basisVariable() {
        //立即初始化
        var varA: Int = 10

        //推导出类型
        var varB = 5

        //没有初始化的时候，必须声明类型
        var varC: Float
        varC = 12.3f
        varC += 1

        println("varA => $varA \t varB => $varB \t varC => $varC")

        //立即初始化
        val valA: Int = 100

        //推导出类型
        val valB = 50

        //没有初始化的时候，必须声明类型
        val valC: Int
        valC = 1
        // val_c += 1 因为c是常量，所以这句代码是会报错的

        println("valA => $valA \t valB => $valB \t valC => $valC")
    }

    /**
     * 在类中，变量的定义及使用
     */
    private fun classVariable() {

        class Test1{

            // 定义属性, 再类中一定要初始化
            // var/val varA : Int   这样会报错，因为必须初始化，再函数以及顶层声明的时候没有此限制
            var varA = 0
            val valA = 0

            // 初始化
            init {
                varA = 10
                // valA = 0 为val类型不能更改。

                println("varA => $varA \t valA => $valA")
            }
        }

        Test1()

        class Test2{

            // 声明可空变量

            var varA : Int? = 0
            val valA : Int? = null

            init {
                varA = 10
                // val_a = 0 为val类型不能更改。

                println("varA => $varA \t valA => $valA")
            }
        }

        Test2()
    }

    fun test(){
        basisVariable()
        classVariable()
    }
}


