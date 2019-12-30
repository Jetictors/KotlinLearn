package com.kotlin.leran.function

import java.math.BigDecimal

/**
 * Desc           :  中缀函数实例
 * Author         :  Jetictors
 * Time           :  2019/9/17 14:53
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

/**
 * 为Int定义一个加法的中缀函数
 * [num]
 */
infix fun Int.add(num : Int) : Int{
    return this + num
}

/**
 * 为Int定义一个减法的中缀函数
 * [num]
 */
infix fun Int.sub(num : Int) : Int{
    return this - num
}

/**
 * 为Int定义一个乘法的中缀函数
 * [num]
 */
infix fun Int.mul(num : Int) : Int{
    return this * num
}

/**
 * 为Int定义一个除法的中缀函数
 * [num]
 */
infix fun Int.div(num : Int) : String{

    val result = if (num == 0){
        0.0
    }else{
        this / num.toDouble()
    }

    return BigDecimal(result).stripTrailingZeros().toPlainString()
}

class InfixFunDemo{

    infix fun testInFix(fix : String){
        println("a => $fix")
    }



    fun test(){
        println("add => ${3 add 3}")
        println("sub => ${3 sub 3}")
        println("mul => ${3 mul 3}")
        println("div => ${3 div 3}")
        println("div => ${3 div 0}")
    }

}
