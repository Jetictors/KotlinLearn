package com.kotlin.leran.design.singleton

/**
 * Desc           :  kotlin提供的单列模式(即 饿汉式单列)
 * Author         :  Jetictors
 * Time           :  2019-12-16  18:07
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

object KotlinInstance{

    /**
     * 测试函数
     */
    fun testInstance(){
        println("${javaClass.simpleName}初始化成功，并调用了测试函数")
    }

}