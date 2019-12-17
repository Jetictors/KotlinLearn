package com.kotlin.leran.design.singleton

/**
 * Desc           :  单列模式七（静态内部类）
 * Author         :  Jetictors
 * Time           :  2019-12-16  18:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
enum class SeventhInstance{

    INSTANCE;

    /**
     * 测试函数
     */
    fun testInstance(){
        println("${javaClass.simpleName}初始化成功，并调用了测试函数")
    }

}