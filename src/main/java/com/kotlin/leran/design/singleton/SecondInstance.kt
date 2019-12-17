package com.kotlin.leran.design.singleton

/**
 * Desc           :  单列模式二（饿汉模式）
 * Author         :  Jetictors
 * Time           :  2019-12-16  18:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class SecondInstance private constructor(){

    companion object{
        // 直接初始化
        val sInstance: SecondInstance = SecondInstance()
    }

    /**
     * 测试函数
     */
    fun testInstance(){
        println("${javaClass.simpleName}初始化成功，并调用了测试函数")
    }

}

