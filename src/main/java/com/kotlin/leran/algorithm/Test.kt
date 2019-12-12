package com.kotlin.leran.algorithm

/**
 * Desc           :  算法学习例子编写
 * Author         :  Jetictors
 * Time           :  2019/11/21 10:11
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class Test{

    fun test1(){

        var y : Int
        var z : Int

        for (x in 1 .. 9){
            y = 20 - 2 * x
            z = 30 - x - y
            if (3 * x + 2 * y + z == 50){
                println("x = $x \t y = $y \t z = $z")
            }
        }

    }

    fun test2(num : Int){

        if (num <= 0) return

        val startTime = System.currentTimeMillis()
        var sum = 0

        for (i in 1 .. num){
            sum += i
        }
        println("执行时间 ： ${System.currentTimeMillis() - startTime} \n 执行结果 ： $sum")
    }

    fun test3(num : Int){

        if (num <= 0) return

        val startTime = System.currentTimeMillis()

        val sum = (num + 1) * num / 2

        println("执行时间 ： ${System.currentTimeMillis() - startTime} \n 执行结果 ： $sum")
    }

    fun test4(count : Int){

        if (count == 0) return

        var sum = 0

        for (index in 1 .. count){
            val num =if (index % 2 == 0) 1 else -1

            sum += num
        }

        println("执行结果为： $sum")
    }

    fun test5(count : Int){

        if (count == 0) return

        val sum = if (count % 2 == 0) 0 else -1

        println("执行结果为： $sum")
    }

}
