package com.kotlin.leran.design.singleton

/**
 * Desc           :  单列模式四（懒汉模式 + 双重锁）
 * Author         :  Jetictors
 * Time           :  2019-12-16  18:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class FourthInstance private constructor(){

    companion object{

        private var sInstance : FourthInstance? = null

        fun getInstance() = sInstance ?: synchronized(this){
            sInstance ?: FourthInstance().also { sInstance = it }
        }

    }

    /**
     * 测试函数
     */
    fun testInstance(){
        println("${javaClass.simpleName}初始化成功，并调用了测试函数")
    }
}